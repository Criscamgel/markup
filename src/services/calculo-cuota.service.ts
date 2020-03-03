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

  public cuotasRadio: Cuota[] = [
    {id: 'seis', tittle: '06', value: 6},
    {id: 'doce', tittle: '12', value: 12},
    {id: 'diesiocho', tittle: '18', value: 18},
    {id: 'veinticuatro', tittle: '24', value: 24},
    {id: 'treintaSeis', tittle: '36', value: 36},
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

    public getCuotasRadio(): Promise<Cuota[]> {
      return new Promise((resolve, reject) => {
        resolve(this.cuotasRadio);
        reject('No se pudo cargar las cuotas radio');
      });
    }

}
