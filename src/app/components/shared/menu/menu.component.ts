import { Component, OnInit } from '@angular/core';
import { constantes } from 'src/app/constantes/constantes';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  const = constantes;

  constructor() { }

  ngOnInit() {
  }

}
