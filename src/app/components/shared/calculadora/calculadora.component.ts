import { Component, OnInit } from '@angular/core';
import { constantes } from 'src/app/constantes/constantes';
import { CalculadoraService } from 'src/app/services/calculadora.service';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent implements OnInit {

  const = constantes;
  valorSolicitado: number = 0;
  periodo: number = 6;
  grupoFormulario: FormGroup;
  porcentajeCuotaInicial: number = 10;
  descuento: number = 0;

  productos = [
      {
          nombre: 'Gama Básica',
          valor: 4818000
      },
      {
          nombre: 'Gama Confort',
          valor: 9730000
      },
      {
          nombre: 'Gama Advance',
          valor: 12100000
      },
      {
          nombre: 'Gama Premium',
          valor: 19600000
      }
    ];

  constructor(public calculadoraServicio: CalculadoraService, public formBuilder: FormBuilder) {
    this.informacionObservable();
  }

  ngOnInit() {
  }

  informacionObservable() {

    this.grupoFormulario = this.formBuilder.group({
      porcentajeCuotaInicial: [10],
      descuento : [0]
    });

    this.grupoFormulario.controls['descuento'].valueChanges.subscribe(value => {
      this.descuento = value;
      this.guardarDescuento();
    });
    this.grupoFormulario.controls['porcentajeCuotaInicial'].valueChanges.subscribe(value => {
      this.porcentajeCuotaInicial = value;
      this.guardarCuotaInicial();
    });
  }

  guardarMonto(value, i) {
        
        if (value !== this.productos[i].valor) {
        this.productos[i].valor = value;
        this.valorSolicitado = this.productos[i].valor;
        this.calcularCuota();
      } else {
        this.valorSolicitado = this.productos[i].valor;
        this.calcularCuota();
      }
        
      }

  guardarPeriodo(value) {
    this.periodo = Number(value);
    this.calcularCuota();
  }

  guardarCuotaInicial() {
    if (this.porcentajeCuotaInicial !== null && this.porcentajeCuotaInicial > this.const.ctaminDes || this.porcentajeCuotaInicial < this.const.ctamaxDes) {
      this.calcularCuota();
    }
  }

  guardarDescuento() {
    if (this.descuento !== null && this.descuento < this.const.maxDes || this.descuento > this.const.minDes) {
      this.calcularCuota();
    }
  }

  calcularCuota() {
    this.calculadoraServicio.calcularCuota(this.valorSolicitado, this.periodo, this.descuento, this.porcentajeCuotaInicial);
  }

  imprimir() {
    window.print();
  }

  iniciarSolicitud() {
    window.location.href = this.const.experian;
  }
}


