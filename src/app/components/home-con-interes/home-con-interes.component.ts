import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material';
import { ModalContentComponent } from '../modal-content/modal-content.component';
import { ViewChild } from '@angular/core';
import { CalculadoraComponent } from '../calculadora/calculadora.component';

@Component({
  selector: 'app-home-con-interes',
  templateUrl: './home-con-interes.component.html',
  styleUrls: ['./home-con-interes.component.css']
})
export class HomeConInteresComponent {

  /* Calculadora de Edad */
  ageCalc: any;
  showAge = 0;
  diferencia = 0;

  /* Inputs Show */
  showInputs = false;

  public startRequest = false;
  public btnRequest = false;
  public showErrorRequest = false;
  public intereses = true;

  @ViewChild(CalculadoraComponent, {static: false}) calculadora: CalculadoraComponent;
  constructor(public dialog: MatDialog) {
    this.getEdad();
  }

  public getEdad() {
    const dialogRef = this.dialog.open(ModalContentComponent, {
      width: '300px',
      data: {ageCalc: this.ageCalc},
      disableClose: true
    });

    dialogRef.afterClosed().subscribe(result => {
      this.ageCalc = result.ageCalc;
      this.ageCalculator();
    });
  }

  public cancelRequest() {
    this.startRequest = false;
  }

  openSolicitud() {
    console.log(this.calculadora.dataResponse);
    if (this.btnRequest) {
      window.scroll(0, 0);
      this.startRequest = true;
    } else {
      this.showErrorRequest = true;
    }
  }

  onPrint() {
    window.print();
  }


  ageCalculator() {
    if (this.ageCalc) {
      let showAge;
      const convertAge = this.ageCalc.getTime();
      const timeDiff = Date.now() - convertAge;
      showAge = Number(((timeDiff / (1000 * 60 * 60 * 24 * 365.25)).toFixed(2)));
      this.diferencia = Math.round((75 - showAge) * 12);
      this.showAge = Math.round(showAge);
    }

  }

  magicClick() {
    this.showInputs = !this.showInputs;
    this.calculadora.calcularDescuento(this.showInputs);
  }

  public enableStartRequest($event: boolean) {
    this.btnRequest = $event;
  }
}
