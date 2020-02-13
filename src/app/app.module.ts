import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

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


@NgModule({
  declarations: [
    AppComponent,
    HomeConInteresComponent,
    AyudaComponent,
    EditInputComponent,
    AutofocusDirective,
    ModalContentComponent,
    HomeSinInteresComponent
  ],
  entryComponents: [ModalContentComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot( ROUTES, { useHash:true } ),
    BrowserAnimationsModule,
    MaterialModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
