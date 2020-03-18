export class ResponseCalculoCuotas{
    valorCuotaConSeguro:number;
    valorCuotaSinSeguro:number;
    valorTotalSeguro: number;
    montoTotalFinanciamiento: number;
    valorConDescuento: number;
    cuotaMensualSinInicial: number;
    cuotaInicial: number;
    valorSinCuotaInicial:number;
    cuatroxMil:number;
    costoInteres:number;
    descuentoFinanciacion:number;
    costoGaes:number;
    costoTotalGaes:number;
    valorSinCuotaInicialNiDescuento: number;

    constructor(){
        this.valorCuotaConSeguro = 0;
        this.valorCuotaSinSeguro = 0;
        this.valorTotalSeguro = 0;
        this.montoTotalFinanciamiento = 0;
        this.valorConDescuento = 0;
        this.cuotaMensualSinInicial = 0;
        this.cuotaInicial = 0;
        this.valorSinCuotaInicial = 0;
        this.cuatroxMil = 0;
        this.costoInteres = 0;
        this.descuentoFinanciacion = 0;
        this.costoGaes = 0;
        this.costoTotalGaes = 0;
        this.valorSinCuotaInicialNiDescuento = 0;
    }
}
