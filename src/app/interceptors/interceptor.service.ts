import { Injectable } from '@angular/core';
import { HttpInterceptor, HttpEvent, HttpHandler, HttpRequest, HttpHeaders, HttpErrorResponse} from '@angular/common/http';
import { Observable, throwError} from 'rxjs';
import { catchError, retry } from 'rxjs/operators';
import { AuthService } from 'src/services/auth.service';

@Injectable({providedIn: 'root'})
export class InterceptorService implements HttpInterceptor {

  constructor(private authService:AuthService){
  }

  intercept(req: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
      let token:string = "Bearer "+this.authService.getToken();
      const headers = new HttpHeaders({
        'Authorization': token,
        'Access-Control-Allow-Origin': "*",
        'Access-Control-Allow-Methods': "POST, PUT, OPTIONS, DELETE, GET",
        'Access-Control-Allow-Headers': 'Origin, X-Requested-With, Content-Type, Accept',
        'Access-Control-Allow-Credentials': 'true',
        'Accept': 'application/json'
      });
      const reqClone = req.clone({
        headers
      });
        return next.handle(reqClone) .pipe(
          retry(1),
          catchError((error: HttpErrorResponse) => {
            let errorMessage = '';
            if (error.error instanceof ErrorEvent) {
              // client-side error
              errorMessage = `Error: ${error.error.message}`;
            } else {
              // server-side error
              errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
            }
            console.log(errorMessage);
            return throwError(errorMessage);
          })
        )
  }
}
