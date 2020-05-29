import { Component, OnInit } from '@angular/core';
import { CalculadoraService } from 'src/app/services/calculadora.service';

@Component({
  selector: 'app-encabezado',
  templateUrl: './encabezado.component.html',
  styleUrls: ['./encabezado.component.css']
})
export class EncabezadoComponent implements OnInit {

  constructor(public calculadoraServicio: CalculadoraService) { }

  ngOnInit() {
  }

}
