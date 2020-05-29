import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

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
import { ModalContentComponent } from './components/shared/modal-content/modal-content.component';
import { HomeContigenciaComponent } from './components/home-contigencia/home-contigencia.component';
import { EncabezadoComponent } from './components/shared/encabezado/encabezado.component';
import { MenuComponent } from './components/shared/menu/menu.component';
import { PieComponent } from './components/shared/pie/pie.component';
import { InfoAdicionalComponent } from './components/shared/info-adicional/info-adicional.component';
import { CalculadoraComponent } from './components/shared/calculadora/calculadora.component';
import { PrintComponent } from './components/shared/print/print.component';


@NgModule({
  declarations: [
    AppComponent,
    AyudaComponent,
    EditInputComponent,
    AutofocusDirective,
    ModalContentComponent,
    HomeContigenciaComponent,
    EncabezadoComponent,
    MenuComponent,
    PieComponent,
    InfoAdicionalComponent,
    CalculadoraComponent,
    PrintComponent
  ],
  entryComponents: [ModalContentComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot( ROUTES, { useHash: true } ),
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
