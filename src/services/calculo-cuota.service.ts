import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable, Subscriber } from 'rxjs';
import { environment } from 'src/environments/environment';
import { ResponseCalculoCuotas } from 'src/models/ResponseCalculoCuotas';
import { Cuota } from 'src/models/cuota';

@Injectable({
  providedIn: 'root'
})
export class CalculoCuotaService {
  public cuotas: Cuota[] = [
    {id: 'basica', tittle: 'Gama Básica', value: 4818000, isChecked: false},
    {id: 'confort', tittle: 'Gama Confort', value: 9730000, isChecked: false},
    {id: 'advance', tittle: 'Gama Advance', value: 12100000, isChecked: false},
    {id: 'premium', tittle: 'Gama Premium', value: 19600000, isChecked: false}
  ];
  constructor(private http: HttpClient) { }

    public calcularCuotas(cantidadCuotas: number, valorSolicitado: number, descuento: number,
                          aliadoId: number): Observable<ResponseCalculoCuotas> {
      const request: object = {
        cantidadCuotas,
       valorSolicitado,
        descuento,
        aliadoId
      };
      return this.http.post<ResponseCalculoCuotas>(`${environment.backBdUrl}/calculoCuotas`, request);
    }

    public getCuotas(): Promise<Cuota[]> {
      return new Promise((resolve, reject) => {
        resolve(this.cuotas);
        reject('No se pudo cargar las cuotas');
      });
    }

}
