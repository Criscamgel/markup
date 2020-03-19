import { Constants } from '../utils/constants';
export class RequestCalculoCuota {
    aliado: string;
    cantidadCuotas: number;
    valorSolicitado: number;
    descuento: number;
    gaesInteres: boolean;
    porcentajeCuotaInicial: number;

    constructor() {
        this.aliado = Constants.NOMBRE_ALIADO;
        this.cantidadCuotas = 0;
        this.valorSolicitado = 0;
        this.descuento = 0;
        this.gaesInteres = false;
        this.porcentajeCuotaInicial = 10;
    }
}
