import { Component, OnInit, Input } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Constants } from '../../../utils/constants';
import { ResponseCalculoCuotas } from 'src/models/ResponseCalculoCuotas';
import { RequestCalculoCuota } from 'src/models/request-calculo-cuota';

@Component({
  selector: 'app-solicitud-modal',
  templateUrl: './solicitud-modal.component.html',
  styleUrls: ['./solicitud-modal.component.css']
})
export class SolicitudModalComponent implements OnInit {
  public form: FormGroup;
  public tipos: any;
  public ocupaciones: any;
  public calculoCuota: ResponseCalculoCuotas = new ResponseCalculoCuotas();
  public dataRequest: RequestCalculoCuota = new RequestCalculoCuota();

  public dias: number[] = [];
  public meses: number[] = [];
  public years: number[] = [];
  private currentDate = new Date();


  @Input() public inputCalculoCuota: ResponseCalculoCuotas;
  @Input() public inputDataRequest: RequestCalculoCuota;

  constructor() {
    this.initializerForm();
    this.fillDate();
  }

  private fillDate() {
    for (let i = 1; i <= 31; i++) {
      this.dias.push(i);
      if ( i <= 12) {
        this.meses.push(i);
      }
    }

    const yearToday = this.currentDate.getFullYear();
    const yearMin = yearToday - 18;
    const yearMax = yearToday - 75;
    for ( let i = yearMin; i >= yearMax; i--) {
      this.years.push(i);
    }

  }

  private initializerForm() {
    this.form = new FormGroup({
      nombre: new FormControl('', Validators.required),
      tipoIdetificacion: new FormControl('', Validators.required),
      numeroIdentificacion: new FormControl('', [Validators.required,
                                                 Validators.pattern(Constants.PATTER_NUMBER)]),
      email: new FormControl('', [Validators.required,
                                  Validators.email]),
      celular: new FormControl('', [Validators.required,
                                    Validators.minLength(10),
                                    Validators.maxLength(10)]),
      fechaNacimiento: new FormGroup({
        dia: new FormControl('', Validators.required),
        mes: new FormControl('', Validators.required),
        year: new FormControl('', Validators.required)
      }),
      actividadEco: new FormControl('', Validators.required),
      ingresos: new FormControl('', [Validators.required,
                                     Validators.pattern(Constants.PATTER_NUMBER)])
    });
  }

  ngOnInit() {
    this.tipos = Constants.tiposIdentificacion;
    this.ocupaciones = Constants.ocupacion;
    this.calculoCuota = this.inputCalculoCuota;
    this.dataRequest = this.inputDataRequest;
  }

  public setCalculoCuota( calculoCuota: ResponseCalculoCuotas) {
    this.calculoCuota = calculoCuota;
  }

  public markFormGroupTouched(formGroup: FormGroup) {
    (Object as any).values(formGroup.controls).forEach(control => {
      control.markAsTouched();
      if (control.controls) {
        this.markFormGroupTouched(control);
      }
    });
  }



}
