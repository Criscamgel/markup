import { Injectable } from '@angular/core';
import { constantes } from 'src/app/constantes/constantes';
import { RespuestaCalculadora } from '../interfaces/respuesta-calculadora';

@Injectable({
  providedIn: 'root'
})
export class CalculadoraService {

  verInputs = false;
  verDetalles = false;
  const = constantes;
  respuesta: RespuestaCalculadora = {
    valorCuotaConSeguro: 0,
    valorCuotaSinSeguro: 0,
    valorTotalSeguro: 0,
    costoMensualSeguro: 0,
    montoTotalFinanciamiento: 0,
    valorConDescuento: 0,
    numeroCuotas: 0,
    montoSolicitado: 0,
    nominalMesVencido: 0,
    seguroCuota: 0,
    tasaEfectivaAnual: 0,
    periodoGracia: 0,
    cuatroPorMil: 0,
    costoDeInteres: 0,
    valorFuturo: 0,
    valorFuturoSeguro: 0,
    cuotaInicial: 0,
    valorDescuento: 0
  };

  constructor() { }

  mostrarInputs() {
    this.verInputs = !this.verInputs;
  }

  mostrarDetalles() {
    this.verDetalles = !this.verDetalles;
  }

  calcularCuota(valorSolicitado: number, periodo: number, descuento: number, porcentajeCuotaInicial: number) {
    this.respuesta.tasaEfectivaAnual = this.const.tasa;
    this.respuesta.periodoGracia = this.const.periodoGracia;
    this.respuesta.numeroCuotas = periodo;
    //Calculo Cuota Inicial
    this.respuesta.cuotaInicial = this.calculoPorcentaje(valorSolicitado, porcentajeCuotaInicial);
    valorSolicitado -= this.respuesta.cuotaInicial;
    this.respuesta.montoSolicitado = valorSolicitado;
    //Cálculo Descuento
    this.respuesta.valorDescuento = this.calculoPorcentaje(valorSolicitado, descuento);
    valorSolicitado -= this.respuesta.valorDescuento;
    this.respuesta.valorConDescuento = valorSolicitado;
    // Calculo Nominal Mes Vencido
    this.respuesta.nominalMesVencido = this.calculoNMV(this.respuesta.tasaEfectivaAnual);
    this.respuesta.valorTotalSeguro =  this.calcularTotalSeguro(valorSolicitado, periodo);
    this.respuesta.valorFuturoSeguro = this.calculoValorFuturo(this.respuesta.valorTotalSeguro, this.respuesta.nominalMesVencido, this.respuesta.periodoGracia);
    this.respuesta.montoTotalFinanciamiento = this.respuesta.valorTotalSeguro + valorSolicitado;
    // calculo Valor Futuro
    this.respuesta.valorFuturo = this.calculoValorFuturo(this.respuesta.montoTotalFinanciamiento, this.respuesta.nominalMesVencido, this.respuesta.periodoGracia);
    // Calculo Mensual cuota
    this.respuesta.costoMensualSeguro = this.functionPago(this.respuesta.nominalMesVencido, periodo - this.respuesta.periodoGracia, this.respuesta.valorFuturoSeguro);
    // calculo Mensual seguro
    this.respuesta.valorCuotaConSeguro = this.functionPago(this.respuesta.nominalMesVencido, periodo - this.respuesta.periodoGracia, this.respuesta.valorFuturo);
    this.respuesta.valorCuotaSinSeguro = this.respuesta.valorCuotaConSeguro - this.respuesta.costoMensualSeguro;
    // calculo Cuatro por mil
    this.respuesta.cuatroPorMil = this.calculoCuatroPormil(valorSolicitado, this.respuesta.valorTotalSeguro);
    // calculo Costo de Interes
    this.respuesta.costoDeInteres = this.respuesta.valorTotalSeguro + this.respuesta.cuatroPorMil + this.respuesta.montoSolicitado;
    this.respuesta.costoDeInteres = this.calculoCostoDeInteres(this.respuesta.nominalMesVencido, periodo - this.respuesta.periodoGracia, this.respuesta.valorCuotaSinSeguro);
    this.respuesta.costoDeInteres -= this.respuesta.costoDeInteres;
    return this.respuesta;
  }

  public functionPago(nmv: number, cuotas: number, valor: number) {
    const parteUno = valor * nmv;
    const parteDos = 1 - Math.pow((1 + nmv), (- (cuotas)));
    return Math.round(parteUno / parteDos);
  }

  public calcularTotalSeguro( valor: number, cuotas: number) {
    return Math.round(this.const.constanteSeguro * valor * cuotas);
  }

  public calculoNMV(tasa: number) {
    return Number(Math.pow((1 + tasa), (1 / 12)) - 1);
  }

  public calculoValorFuturo(monto: number, nmv: number, cuotas: number) {
    return monto * Math.pow(1 + nmv, cuotas);
  }

  public calculoCuatroPormil(monto: number, totalSeguro: number) {
    return Math.round((monto + totalSeguro) * this.const.constanteCuatroPorMil);
  }

  public calculoCostoDeInteres(nmv: number, cuota: number, valorCuotaSinSeguro: number) {
    const costoDeInteres = 1 - Math.pow((1 + nmv), - (cuota));
    return (costoDeInteres * valorCuotaSinSeguro) / nmv;
  }

  calculoPorcentaje(valor: number, porcentaje: number) {
    return valor * (porcentaje / 100);
  }
}
