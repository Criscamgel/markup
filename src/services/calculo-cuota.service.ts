import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { ResponseCalculoCuotas } from 'src/models/ResponseCalculoCuotas';

@Injectable({
  providedIn: 'root'
})
export class CalculoCuotaService {

  constructor(private http: HttpClient) { }

    public calcularCuotas(cantidadCuotas: number, valorSolicitado: number, descuento: number,
      idAliado: number): Observable<ResponseCalculoCuotas>{
      let request: object = {
        "cantidadCuotas": cantidadCuotas,
        "valorSolicitado": valorSolicitado,
        "descuento": descuento,
        "aliadoId": idAliado
      };
      return this.http.post<ResponseCalculoCuotas>(environment.backBdUrl+'/calculoCuotas', request);
    }
}
