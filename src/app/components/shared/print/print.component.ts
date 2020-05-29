import { Component, OnInit } from '@angular/core';
import { registerLocaleData } from '@angular/common';
import es from '@angular/common/locales/es';
import { CalculadoraService } from 'src/app/services/calculadora.service';
import { constantes } from 'src/app/constantes/constantes';

@Component({
  selector: 'app-print',
  templateUrl: './print.component.html',
  styleUrls: ['./print.component.css']
})
export class PrintComponent implements OnInit {

  const = constantes;

  constructor(public calculadoraServicio: CalculadoraService) { }

  ngOnInit() {
    registerLocaleData( es );
  }

}
