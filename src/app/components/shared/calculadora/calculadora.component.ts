import { Component, OnInit } from '@angular/core';
import { constantes } from 'src/app/constantes/constantes';
import { CalculadoraService } from 'src/app/services/calculadora.service';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.css']
})
export class CalculadoraComponent implements OnInit {

  const = constantes;
  valorSolicitado: number = 0;
  periodo: number = 0;
  descuento: number = 0;
  porcentajeCuotaInicial = 10;

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

  constructor(public calculadoraServicio: CalculadoraService) { }

  ngOnInit() {
  }

  guardarMonto(value) {
    this.valorSolicitado = Number(value);
    this.calcularCuota();
  }

  guardarPeriodo(value) {
    this.periodo = Number(value);
    this.calcularCuota();
  }

  guardarCuotaInicial() {
    if (this.porcentajeCuotaInicial !== null && this.porcentajeCuotaInicial > this.const.ctaminDes && this.porcentajeCuotaInicial < this.const.ctamaxDes) {
      this.calcularCuota();
    }
  }

  guardarDescuento() {
    if (this.descuento !== null && this.descuento < this.const.maxDes && this.descuento > this.const.minDes) {
      this.calcularCuota();
    }
  }

  calcularCuota() {
    console.log(this.descuento, this.porcentajeCuotaInicial);
    this.calculadoraServicio.calcularCuota(this.valorSolicitado, this.periodo, this.descuento, this.porcentajeCuotaInicial);
  }
}
