import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { KeycloakService } from 'keycloak-angular';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

    constructor(private http: HttpClient, private keycloakAngular: KeycloakService) {
    }

    public getToken(){
        return this.keycloakAngular.getKeycloakInstance().token;
    }

    public getUserName(){
        return this.keycloakAngular.getKeycloakInstance().profile.username;
    }

    public getIdUsuario(){
        return this.keycloakAngular.getKeycloakInstance().subject;
    }


    logout() {
        this.keycloakAngular.logout(window.location.origin);
        /** Este codigo es para consumir el servicio manualmente que expone keycloak para cerrar sesion**/
        // let headers = new HttpHeaders();
        // this.http.post<any>(environment.keycloakUrl+'/admin/realms/'+environment.keycloakRealm+'/users/'+this.getIdUsuario()+'/logout/' ,{headers: headers,observe: 'response'})
        // .subscribe(
        //     response => {
        //         alert("se cerro la session con exito!");
        //         // this.spinnerService.hide();
        //         window.location.href=environment.keycloakUrl;
        //     },
        //     error=>{
        //         alert("fallo el cierre de session:"+JSON.stringify(error));
        //         // this.spinnerService.hide();
        //         console.log("Error al intentar cerrar sesion"+JSON.stringify(error));
        //         // window.location.href=environment.redirectUriLogout;
        //     }
        // );
    }

}
