import { Component, OnInit } from '@angular/core';
import { ModalContentComponent } from '../shared/modal-content/modal-content.component';
import { MatDialog } from '@angular/material';

@Component({
  selector: 'app-home-contigencia',
  templateUrl: './home-contigencia.component.html',
  styleUrls: ['./home-contigencia.component.css']
})
export class HomeContigenciaComponent implements OnInit {

  ageCalc;
  diferencia;
  showAge;


  constructor(public dialog: MatDialog) {

    let dialogRef = this.dialog.open(ModalContentComponent, {
      width: '300px',
      data: {ageCalc: this.ageCalc},
      disableClose: true
  });

    dialogRef.afterClosed().subscribe(result => {   
      this.ageCalc = result.ageCalc;
      this.ageCalculator();         
    })

   }

  ngOnInit() {
  }

  ageCalculator() {
    if (this.ageCalc) {      

      var showAge;

      const convertAge = this.ageCalc.getTime();
      const timeDiff = Date.now() - convertAge;      
      showAge = Number(((timeDiff / (1000 * 60 * 60 * 24 * 365.25)).toFixed(2)));
      this.diferencia = Math.round((75 - showAge) * 12);
      this.showAge = Math.round(showAge);

    }

  }

}
