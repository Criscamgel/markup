import { Component } from '@angular/core';
import { MatDialog } from '@angular/material';
import { ModalContentComponent } from '../modal-content/modal-content.component'

@Component({
  selector: 'app-home-sin-interes',
  templateUrl: './home-sin-interes.component.html',
  styleUrls: ['./home-sin-interes.component.css']
})
export class HomeSinInteresComponent {

    cuotas = 0;
    tasa = 0.0000000000001;
    valorSolicitado = 0;
    valorSolicitadoDto = 0;
    vlrSolSinCi = 0;
    vlrSolConCiSinDto = 0;
    valorFinal = 0;
  
    /* Calculadora de Edad */
    ageCalc;
    showAge = 0;
    diferencia = 0;
  
    vlrCuota;
    cuatroMil = 0;
    nmv = 0;
    costoInterez = 0;
    dtoFinancia = 0;
    inCuatroSeg = 0;
    vlrCuotaCliente = 0;
    costoGaes = 0;
    costoTotalGaes = 0;
  
    /* descuento; */
    vlrDto = 0;
    /* pDto = 0; */
    minDes = 0;
    maxDes = 10;
    descuentoSlide = 0;
    montoTotal;
    cuotaInicial = 0;
  
    /* Cuota inicial Slide */
    ctainicialSlide = 10;
    ctaminDes = 0;
    ctamaxDes = 70;

    /* ShowInputs */
    showInputs = false;
  
    /* Valores */  
    vlrUno = 2634500;
    vlrDos = 4059000;
    vlrTres = 6825000;
    vlrCuatro = 8032500;
    vlrCinco = 10426500;
  
    checkUno = false;
    checkDos = false;
    checkTres = false;
    checkCuatro = false;
    checkCinco = false;
    showDetails = false;
    showDetailsOne = true;
    showDetailsTwo = false;
  
  
    vlrCuotaSs = 0;
    seguroCta = 0;
    seguroTotal = 0;
  
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
  
    linka() {
      window.location.href = 'https://apps.datacredito.com.co/raw/user-account/login/web/index';
  
    }
  
    saveMonto(val) {
      this.valorSolicitado = Number(val);
      this.ctainicialSlide = 10;
      this.descuentoSlide = 0;
      this.valorSolicitadoDto = 0;
  
      this.changeButtonCliente(this.cuotas);
      this.changeButton(this.cuotas);
    }
  
    descuento() {   
  
      let dto = 0;
  
      if (this.descuentoSlide !== 0) {
        this.valorSolicitadoDto = this.valorSolicitado;
        dto = 0;      
  
        dto = Math.round(this.valorSolicitadoDto * (this.descuentoSlide / 100));
        this.valorSolicitadoDto -= dto;
        this.vlrCuotaCliente = Math.round(this.valorSolicitadoDto / Number(this.cuotas));
        
  
        this.changeButtonCliente(this.cuotas);
        this.changeButton(this.cuotas);
  
  
      } else {
  
        this.valorSolicitadoDto = this.valorSolicitado;
        this.valorFinal = this.valorSolicitado;
        
        this.changeButtonCliente(this.cuotas);
        this.changeButton(this.cuotas);
      }
  
  
    }
  
    detailsTwo() {
      this.showDetailsTwo = !this.showDetailsTwo;
      this.showDetailsOne = !this.showDetailsOne;
    }
  
    changeButtonCliente(val) {
  
      if (val !== undefined) {
  
        if (val.value !== undefined) {
          var cuota = Number(val.value);
        } else {
          var cuota = Number(val);
        }
  
      }
  
      switch (cuota) {
        case 6:
          this.tasa = 0;
          this.nmv = 0;
  
          if (this.valorSolicitadoDto === 0) {
            this.cuotaInicial = this.valorSolicitado * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          } else {
            this.cuotaInicial = this.valorSolicitadoDto * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitadoDto - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          }
  
          break;
  
        case 12:
          this.tasa = 0;
          this.nmv = 0;
  
          if (this.valorSolicitadoDto === 0) {
            this.cuotaInicial = this.valorSolicitado * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          } else {
            this.cuotaInicial = this.valorSolicitadoDto * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitadoDto - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          }
  
          break;
  
        case 18:
          this.tasa = 0;
          this.nmv = 0;
  
          if (this.valorSolicitadoDto === 0) {
            this.cuotaInicial = this.valorSolicitado * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          } else {
            this.cuotaInicial = this.valorSolicitadoDto * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitadoDto - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          }
  
          break;
  
        case 24:
          this.tasa = 0;
          this.nmv = 0;
  
          if (this.valorSolicitadoDto === 0) {
            this.cuotaInicial = this.valorSolicitado * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          } else {
            this.cuotaInicial = this.valorSolicitadoDto * (Number(this.ctainicialSlide) / 100);
            this.vlrSolSinCi = this.valorSolicitadoDto - this.cuotaInicial;
            this.vlrCuotaCliente = Math.round(this.vlrSolSinCi / cuota);
          }
  
          break;
  
        case 36:
  
          /* this.vlrDto = 0;
          this.cuotas = Number(this.cuotas); */
          /* var nmv;
          var vlrActual;
          var vlrCuota;
          
          this.tasa = 0.0604;
          nmv = Math.pow((1 + this.tasa),(1/12))-1;
          
          this.descuentoSlide = 0;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial; */
  
          /* var seguroTotal = 0.0000000000001; */
          /* Aplicando Dto */
  
          /* if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          } */
  
          /* -- */
  
          /* var vlrPartuno = vlrActual * nmv;
          var vlrPartdos = Math.pow((1 + nmv), - cuota)
          vlrPartdos = 1 - vlrPartdos;
          vlrCuota = vlrPartuno / vlrPartdos;
          vlrCuota = Math.round(vlrCuota); */
  
          /* Valor Cuota sin seguro */
  
          /* this.vlrCuotaSs = vlrCuota;   */
  
          /* var vlrPartunoSeg = seguroTotal * nmv;      
          var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
          vlrPartdosSeg = 1 - vlrPartdosSeg;
          var seguroCta = vlrPartunoSeg / vlrPartdosSeg;
          seguroCta = Math.round(seguroCta); */
  
          /* Seguro de la cuota */
  
          /* this.seguroCta = seguroCta;
          this.vlrCuota = Math.round(vlrCuota + seguroCta); */
          /* this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);
  
          this.nmv = 0.643;
          this.tasa = 7.99; */
  
          break;
  
        default:
          break;
      }
    }
  
  
    changeButton(val) {
  
      let cuota = 0;
      let nmv = Math.pow((1 + this.tasa), (1 / 12)) - 1;
      let seguro;
      var valorSolicitado = 0;
  
      if (val.value) {
        cuota = Number(val.value);
      } else {
        cuota = Number(val);
      }
  
      if (this.valorSolicitadoDto !== 0 && this.descuentoSlide !== 0) {
        valorSolicitado = this.valorSolicitadoDto;
      } else {
        valorSolicitado = this.valorSolicitado;
        /* this.valorSolicitadoDto = 0;   */
      }
  
  
      switch (cuota) {
        case 6:
  
          this.vlrSolSinCi = Math.round(valorSolicitado) - this.cuotaInicial;
          
          seguro = (1200 / 1000000) * this.vlrSolSinCi;
  
          var vlrCuota;
          var seguroTotal = Math.round(seguro * cuota);
          /* Seguro Total */
          this.seguroTotal = seguroTotal;
  
  
          var vlrActual = Math.round(valorSolicitado/*  - vlrDescuento */);
          var vlrPartuno = vlrActual * nmv;
          var vlrPartdos = Math.pow((1 + nmv), - cuota)
          vlrPartdos = 1 - vlrPartdos;
          vlrCuota = vlrPartuno / vlrPartdos;
          vlrCuota = Math.round(vlrCuota);
          /* Valor Cuota sin seguro */
          this.vlrCuotaSs = vlrCuota;
  
          var vlrPartunoSeg = seguroTotal * nmv;
          var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
          vlrPartdosSeg = 1 - vlrPartdosSeg;
          var seguroCta = (Math.round(vlrPartunoSeg) / vlrPartdosSeg);
          seguroCta = Math.round(seguroCta);
          /* Seguro de la cuota */
          this.seguroCta = seguroCta;
          this.vlrCuota = Math.round(vlrCuota + seguroCta);
          /* Monto total */
          this.montoTotal = Math.round(seguroTotal + vlrActual)
  
          /* Cuatro por Mil */
          this.cuatroMil = 0;
          this.cuatroMil = Math.round((this.vlrSolSinCi + seguroTotal) * 0.004)
  
          /* inCuatroSeg 
          Es la suma entre el costo del interes mas seguro mas 4 * 1000
          */
          this.inCuatroSeg = 0;
          this.tasa = 0.0000000000001;
          var nmvUno = Math.pow((1 + this.tasa), (1 / 12)) - 1;
          var potencia = 1 - (Math.pow(1 + nmvUno, - cuota));
          var numerador = this.vlrCuotaCliente * potencia;
          var resultado = numerador / nmvUno;
          this.costoInterez = (this.vlrSolSinCi + this.seguroTotal + this.cuatroMil) - resultado;
          this.costoInterez === 0 ? this.dtoFinancia = 0 : this.dtoFinancia = Number((this.costoInterez / this.vlrSolSinCi * 100).toFixed(2));
          this.costoInterez === 0 ? this.costoGaes = 0 : this.costoGaes = Number((this.costoInterez / this.valorSolicitado * 100).toFixed(2));
          this.costoInterez === 0 ? this.costoTotalGaes = 0 : this.costoTotalGaes = Number(this.costoGaes) + Number(this.ctainicialSlide);
  
          /* Evitando que se altere la cuota inicial con el descuento */
          this.cuotaInicial = valorSolicitado * (Number(this.ctainicialSlide) / 100)
          this.vlrSolConCiSinDto = valorSolicitado - this.cuotaInicial;        
  
          break;
  
        case 12:
  
          this.vlrSolSinCi = Math.round(valorSolicitado) - this.cuotaInicial;
          
          seguro = (1200 / 1000000) * this.vlrSolSinCi;
  
          var vlrCuota;
          var seguroTotal = Math.round(seguro * cuota);
          /* Seguro Total */
          this.seguroTotal = seguroTotal;
  
  
          var vlrActual = Math.round(valorSolicitado/*  - vlrDescuento */);
          var vlrPartuno = vlrActual * nmv;
          var vlrPartdos = Math.pow((1 + nmv), - cuota)
          vlrPartdos = 1 - vlrPartdos;
          vlrCuota = vlrPartuno / vlrPartdos;
          vlrCuota = Math.round(vlrCuota);
          /* Valor Cuota sin seguro */
          this.vlrCuotaSs = vlrCuota;
  
          var vlrPartunoSeg = seguroTotal * nmv;
          var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
          vlrPartdosSeg = 1 - vlrPartdosSeg;
          var seguroCta = (Math.round(vlrPartunoSeg) / vlrPartdosSeg);
          seguroCta = Math.round(seguroCta);
          /* Seguro de la cuota */
          this.seguroCta = seguroCta;
          this.vlrCuota = Math.round(vlrCuota + seguroCta);
          /* Monto total */
          this.montoTotal = Math.round(seguroTotal + vlrActual)
  
          /* Cuatro por Mil */
          this.cuatroMil = 0;
          this.cuatroMil = Math.round((this.vlrSolSinCi + seguroTotal) * 0.004)
  
          /* inCuatroSeg 
          Es la suma entre el costo del interes mas seguro mas 4 * 1000
          */
          this.inCuatroSeg = 0;
          this.tasa = 0.0000000000001;
          var nmvUno = Math.pow((1 + this.tasa), (1 / 12)) - 1;
          var potencia = 1 - (Math.pow(1 + nmvUno, - cuota));
          var numerador = this.vlrCuotaCliente * potencia;
          var resultado = numerador / nmvUno;
          this.costoInterez = (this.vlrSolSinCi + this.seguroTotal + this.cuatroMil) - resultado;
          this.costoInterez === 0 ? this.dtoFinancia = 0 : this.dtoFinancia = Number((this.costoInterez / this.vlrSolSinCi * 100).toFixed(2));
          this.costoInterez === 0 ? this.costoGaes = 0 : this.costoGaes = Number((this.costoInterez / this.valorSolicitado * 100).toFixed(2));
          this.costoInterez === 0 ? this.costoTotalGaes = 0 : this.costoTotalGaes = Number(this.costoGaes) + Number(this.ctainicialSlide);
  
          /* Evitando que se altere la cuota inicial con el descuento */
          this.cuotaInicial = valorSolicitado * (Number(this.ctainicialSlide) / 100)
          this.vlrSolConCiSinDto = valorSolicitado - this.cuotaInicial; 
  
          break;
  
  
        case 18:
  
            this.vlrSolSinCi = Math.round(valorSolicitado) - this.cuotaInicial;
          
            seguro = (1200 / 1000000) * this.vlrSolSinCi;
    
            var vlrCuota;
            var seguroTotal = Math.round(seguro * cuota);
            /* Seguro Total */
            this.seguroTotal = seguroTotal;
    
    
            var vlrActual = Math.round(valorSolicitado/*  - vlrDescuento */);
            var vlrPartuno = vlrActual * nmv;
            var vlrPartdos = Math.pow((1 + nmv), - cuota)
            vlrPartdos = 1 - vlrPartdos;
            vlrCuota = vlrPartuno / vlrPartdos;
            vlrCuota = Math.round(vlrCuota);
            /* Valor Cuota sin seguro */
            this.vlrCuotaSs = vlrCuota;
    
            var vlrPartunoSeg = seguroTotal * nmv;
            var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
            vlrPartdosSeg = 1 - vlrPartdosSeg;
            var seguroCta = (Math.round(vlrPartunoSeg) / vlrPartdosSeg);
            seguroCta = Math.round(seguroCta);
            /* Seguro de la cuota */
            this.seguroCta = seguroCta;
            this.vlrCuota = Math.round(vlrCuota + seguroCta);
            /* Monto total */
            this.montoTotal = Math.round(seguroTotal + vlrActual)
    
            /* Cuatro por Mil */
            this.cuatroMil = 0;
            this.cuatroMil = Math.round((this.vlrSolSinCi + seguroTotal) * 0.004)
    
            /* inCuatroSeg 
            Es la suma entre el costo del interes mas seguro mas 4 * 1000
            */
            this.inCuatroSeg = 0;
            this.tasa = 0.0000000000001;
            var nmvUno = Math.pow((1 + this.tasa), (1 / 12)) - 1;
            var potencia = 1 - (Math.pow(1 + nmvUno, - cuota));
            var numerador = this.vlrCuotaCliente * potencia;
            var resultado = numerador / nmvUno;
            this.costoInterez = (this.vlrSolSinCi + this.seguroTotal + this.cuatroMil) - resultado;
            this.costoInterez === 0 ? this.dtoFinancia = 0 : this.dtoFinancia = Number((this.costoInterez / this.vlrSolSinCi * 100).toFixed(2));
            this.costoInterez === 0 ? this.costoGaes = 0 : this.costoGaes = Number((this.costoInterez / this.valorSolicitado * 100).toFixed(2));
            this.costoInterez === 0 ? this.costoTotalGaes = 0 : this.costoTotalGaes = Number(this.costoGaes) + Number(this.ctainicialSlide);
    
            /* Evitando que se altere la cuota inicial con el descuento */
            this.cuotaInicial = valorSolicitado * (Number(this.ctainicialSlide) / 100)
            this.vlrSolConCiSinDto = valorSolicitado - this.cuotaInicial; 
  
          break;
  
        case 24:
  
            this.vlrSolSinCi = Math.round(valorSolicitado) - this.cuotaInicial;
          
            seguro = (1200 / 1000000) * this.vlrSolSinCi;
    
            var vlrCuota;
            var seguroTotal = Math.round(seguro * cuota);
            /* Seguro Total */
            this.seguroTotal = seguroTotal;
    
    
            var vlrActual = Math.round(valorSolicitado/*  - vlrDescuento */);
            var vlrPartuno = vlrActual * nmv;
            var vlrPartdos = Math.pow((1 + nmv), - cuota)
            vlrPartdos = 1 - vlrPartdos;
            vlrCuota = vlrPartuno / vlrPartdos;
            vlrCuota = Math.round(vlrCuota);
            /* Valor Cuota sin seguro */
            this.vlrCuotaSs = vlrCuota;
    
            var vlrPartunoSeg = seguroTotal * nmv;
            var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
            vlrPartdosSeg = 1 - vlrPartdosSeg;
            var seguroCta = (Math.round(vlrPartunoSeg) / vlrPartdosSeg);
            seguroCta = Math.round(seguroCta);
            /* Seguro de la cuota */
            this.seguroCta = seguroCta;
            this.vlrCuota = Math.round(vlrCuota + seguroCta);
            /* Monto total */
            this.montoTotal = Math.round(seguroTotal + vlrActual)
    
            /* Cuatro por Mil */
            this.cuatroMil = 0;
            this.cuatroMil = Math.round((this.vlrSolSinCi + seguroTotal) * 0.004)
    
            /* inCuatroSeg 
            Es la suma entre el costo del interes mas seguro mas 4 * 1000
            */
            this.inCuatroSeg = 0;
            this.tasa = 0.0000000000001;
            var nmvUno = Math.pow((1 + this.tasa), (1 / 12)) - 1;
            var potencia = 1 - (Math.pow(1 + nmvUno, - cuota));
            var numerador = this.vlrCuotaCliente * potencia;
            var resultado = numerador / nmvUno;
            this.costoInterez = (this.vlrSolSinCi + this.seguroTotal + this.cuatroMil) - resultado;
            this.costoInterez === 0 ? this.dtoFinancia = 0 : this.dtoFinancia = Number((this.costoInterez / this.vlrSolSinCi * 100).toFixed(2));
            this.costoInterez === 0 ? this.costoGaes = 0 : this.costoGaes = Number((this.costoInterez / this.valorSolicitado * 100).toFixed(2));
            this.costoInterez === 0 ? this.costoTotalGaes = 0 : this.costoTotalGaes = Number(this.costoGaes) + Number(this.ctainicialSlide);
    
            /* Evitando que se altere la cuota inicial con el descuento */
            this.cuotaInicial = valorSolicitado * (Number(this.ctainicialSlide) / 100)
            this.vlrSolConCiSinDto = valorSolicitado - this.cuotaInicial; 
  
          break;
  
        case 36:
  
            this.vlrSolSinCi = Math.round(valorSolicitado) - this.cuotaInicial;
          
            seguro = (1200 / 1000000) * this.vlrSolSinCi;
    
            var vlrCuota;
            var seguroTotal = Math.round(seguro * cuota);
            /* Seguro Total */
            this.seguroTotal = seguroTotal;
    
    
            var vlrActual = Math.round(valorSolicitado/*  - vlrDescuento */);
            var vlrPartuno = vlrActual * nmv;
            var vlrPartdos = Math.pow((1 + nmv), - cuota)
            vlrPartdos = 1 - vlrPartdos;
            vlrCuota = vlrPartuno / vlrPartdos;
            vlrCuota = Math.round(vlrCuota);
            /* Valor Cuota sin seguro */
            this.vlrCuotaSs = vlrCuota;
    
            var vlrPartunoSeg = seguroTotal * nmv;
            var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
            vlrPartdosSeg = 1 - vlrPartdosSeg;
            var seguroCta = (Math.round(vlrPartunoSeg) / vlrPartdosSeg);
            seguroCta = Math.round(seguroCta);
            /* Seguro de la cuota */
            this.seguroCta = seguroCta;
            this.vlrCuota = Math.round(vlrCuota + seguroCta);
            /* Monto total */
            this.montoTotal = Math.round(seguroTotal + vlrActual)
    
            /* Cuatro por Mil */
            this.cuatroMil = 0;
            this.cuatroMil = Math.round((this.vlrSolSinCi + seguroTotal) * 0.004)
    
            /* inCuatroSeg 
            Es la suma entre el costo del interes mas seguro mas 4 * 1000
            */
            this.inCuatroSeg = 0;
            this.tasa = 0.0000000000001;
            var nmvUno = Math.pow((1 + this.tasa), (1 / 12)) - 1;
            var potencia = 1 - (Math.pow(1 + nmvUno, - cuota));
            var numerador = this.vlrCuotaCliente * potencia;
            var resultado = numerador / nmvUno;
            this.costoInterez = (this.vlrSolSinCi + this.seguroTotal + this.cuatroMil) - resultado;
            this.costoInterez === 0 ? this.dtoFinancia = 0 : this.dtoFinancia = Number((this.costoInterez / this.vlrSolSinCi * 100).toFixed(2));
            this.costoInterez === 0 ? this.costoGaes = 0 : this.costoGaes = Number((this.costoInterez / this.valorSolicitado * 100).toFixed(2));
            this.costoInterez === 0 ? this.costoTotalGaes = 0 : this.costoTotalGaes = Number(this.costoGaes) + Number(this.ctainicialSlide);
    
            /* Evitando que se altere la cuota inicial con el descuento */
            this.cuotaInicial = valorSolicitado * (Number(this.ctainicialSlide) / 100)
            this.vlrSolConCiSinDto = valorSolicitado - this.cuotaInicial; 
  
          break;
  
        default:
          break;
      }
    }
  
    details() {
      this.showDetails = !this.showDetails;
  
    }
  
  
    onPrint() {
      window.print();
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

    magicClick(){
      this.showInputs = !this.showInputs;
    }
  
  }
