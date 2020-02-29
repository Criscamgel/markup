import { BrowserModule } from '@angular/platform-browser';
import { NgModule, APP_INITIALIZER } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeConInteresComponent } from './components/home-con-interes/home-con-interes.component';

/* Forms */
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { AyudaComponent } from './components/ayuda/ayuda.component'

/* Routes */
import { RouterModule } from '@angular/router';
import { ROUTES } from './app.routes';
import { EditInputComponent } from './components/edit-input/edit-input.component';

import { AutofocusDirective } from './autofocus.directive';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

/* Angular Material */
import { MaterialModule } from './material/material.module';
import { ModalContentComponent } from './components/modal-content/modal-content.component';
import { HomeSinInteresComponent } from './components/home-sin-interes/home-sin-interes.component';

import { KeycloakAngularModule, KeycloakService } from 'keycloak-angular';
import { initializer } from 'src/utils/app-init';
import { HttpClientModule } from '@angular/common/http';
import { CalculadoraComponent } from './components/calculadora/calculadora.component';
import { ProcessRequestComponent } from './components/process-request/process-request.component';
import { SolicitudModalComponent } from './components/solicitud-modal/solicitud-modal.component';
import { ModalComponent } from './components/modal/modal.component';
import { BirthdayPipe } from '../pipes/birthday.pipe';
import { PanelExpansionComponent } from './components/panel-expansion/panel-expansion.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeConInteresComponent,
    AyudaComponent,
    EditInputComponent,
    AutofocusDirective,
    ModalContentComponent,
    HomeSinInteresComponent,
    CalculadoraComponent,
    ProcessRequestComponent,
    SolicitudModalComponent,
    ModalComponent,
    BirthdayPipe,
    PanelExpansionComponent
  ],
  entryComponents: [ModalContentComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot( ROUTES, { useHash:true } ),
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule,
    KeycloakAngularModule
  ],
  providers: [
    {
      provide: APP_INITIALIZER,
      useFactory: initializer,
      multi: true,
      deps: [KeycloakService]
    }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
