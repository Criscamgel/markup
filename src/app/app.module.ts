import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';

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
import { MatDialogModule } from '@angular/material';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AyudaComponent,
    EditInputComponent,
    AutofocusDirective
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot( ROUTES, { useHash:true } ),
    BrowserAnimationsModule,
    MatDialogModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
