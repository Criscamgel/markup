export class RequestCalculoCuota {
    valorSolicitado: number;
    cuota: number;
    porcentajeDescuento: number;
    valorSolicitadoDescuento: number;
    descuentoMinimo: number;
    descuentoMaximo: number;
    constructor() {
        this.valorSolicitado = 0;
        this.porcentajeDescuento = 10;
        this.valorSolicitadoDescuento = 0;
        this.cuota = 0;
        this.descuentoMinimo = 0;
        this.descuentoMaximo = 70;
    }
}
