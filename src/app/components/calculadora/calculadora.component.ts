import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { ResponseCalculoCuotas } from 'src/models/ResponseCalculoCuotas';
import { Cuota } from 'src/models/cuota';
import { Constants } from 'src/utils/constants';
import { Aliado } from 'src/models/Aliado';
import { UsuarioService } from 'src/services/usuario.service';
import { CalculoCuotaService } from 'src/services/calculo-cuota.service';
import { RequestCalculoCuota } from 'src/models/request-calculo-cuota';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.scss']
})
export class CalculadoraComponent implements OnInit {
  public dataResponse: ResponseCalculoCuotas = new ResponseCalculoCuotas();
  public dataRequest: RequestCalculoCuota = new RequestCalculoCuota();
  public cuotasInput: Cuota[] = [];
  public cuotasRadio: Cuota[] = [];
  public aliado: Aliado;
  public showErrorDescuento = false;
  public showDetails = false;
  public showDetailsOne = true;
  public nominalMesVencido: string;
  public minCuotaInicial = 10;
  public maxCuotaInicial = 70;


  @Input() public diferencia: number;
  @Input() public showAge: number;
  @Input() public showInputs: boolean;
  @Input() public intereses: boolean;

  @Output() public outputOnPrint = new EventEmitter<void>();
  @Output() public outputOpenSolicitud = new EventEmitter<void>();
  @Output() public enableStarRequest = new EventEmitter<boolean>();
  constructor(private usuarioService: UsuarioService,
              public calculoService: CalculoCuotaService) {
  }

  ngOnInit() {
    localStorage.clear();
    this.cargarAlidadoId();
    this.getCuotasRadio();
    this.getCuotasInput();
    this.dataRequest.gaesInteres = this.intereses;
  }

  cargarAlidadoId() {
    this.consultarAliado();
    if (typeof(Storage) !== undefined) {
      if (localStorage.getItem(Constants.ALIADO) == null || localStorage.getItem(Constants.ALIADO) === undefined) {
        // LocalStorage disponible
        localStorage.setItem(Constants.ALIADO, JSON.stringify(this.aliado));
      } else {
        this.aliado = JSON.parse(localStorage.getItem(Constants.ALIADO));
      }
    }
  }

  consultarAliado = () => {
    this.usuarioService.consultarAliado().subscribe(
      aliado => {
        this.aliado = aliado;
        this.dataRequest.aliadoId = this.aliado.idAliado;
      }, (err) => {
        console.error('Error al consultar el aliado del usuario', err);
      }
    );
  }

  public getCuotasInput() {
    this.calculoService.getCuotas()
        .then(cuotasInput => {
          this.cuotasInput = cuotasInput;
        }).catch(console.error);
  }

  public getCuotasRadio() {
    this.calculoService.getCuotasRadio()
        .then(cuotasRadio => {
          this.cuotasRadio = cuotasRadio;
        }).catch(console.error);
  }

  saveMonto(value: number) {
    this.dataRequest.valorSolicitado = Number(value);
    this.calcularCuota();
  }

  saveCuota(cuota: number) {
    this.dataRequest.cantidadCuotas = Number(cuota);
    this.calcularCuota();
  }

  calcularCuota() {
    this.dataRequest.porcentajeCuotaInicial = this.showInputs ? this.dataRequest.porcentajeCuotaInicial : 10;
    console.log(this.dataRequest);
    this.calculoService.calcularCuotas(this.dataRequest)
      .subscribe(calculo => {
        this.dataResponse = calculo;
        this.enableStarRequest.emit(true);
        this.nominalMesVencido = (this.dataResponse.nominalMesVencido * 100).toString().substr(0, 3);
        console.log(calculo);
      },
      () => {
        this.enableStarRequest.emit(false);
        console.log('Error consumiendo el servicio de calcular cuotas!!');
      }
    );
  }

  calcularDescuento(descuento?: boolean) {
    if (this.dataRequest.porcentajeCuotaInicial >= this.minCuotaInicial
       && this.dataRequest.porcentajeCuotaInicial <= this.maxCuotaInicial) {
          this.showInputs = descuento;
          this.showErrorDescuento = false;
          this.calcularCuota();
       } else {
          this.showErrorDescuento = true;
       }
  }

  details() {
    this.showDetails = !this.showDetails;
  }

  public onPrint() {
    this.outputOnPrint.emit();
  }

  public openSolicitud() {
    this.outputOpenSolicitud.emit();
  }

  public getDataResponse() {
    return this.dataResponse;
  }

  public getDataRequest() {
    return this.dataRequest;
  }

}
