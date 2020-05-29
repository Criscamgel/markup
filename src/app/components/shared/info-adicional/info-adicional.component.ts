import { Component, OnInit } from '@angular/core';
import { constantes } from 'src/app/constantes/constantes';

@Component({
  selector: 'app-info-adicional',
  templateUrl: './info-adicional.component.html',
  styleUrls: ['./info-adicional.component.css']
})
export class InfoAdicionalComponent implements OnInit {

  const = constantes;

  constructor() { }

  ngOnInit() {
  }

}
