export class RequestCalculoCuota {

    aliadoId: number;
    cantidadCuotas: number;
    valorSolicitado: number;
    descuento: number;
    gaesInteres: boolean;
    porcentajeCuotaInicial: number;

    constructor() {
        this.aliadoId = 0;
        this.cantidadCuotas = 0;
        this.valorSolicitado = 0;
        this.descuento = 0;
        this.gaesInteres = false;
        this.porcentajeCuotaInicial = 10;
    }
}
