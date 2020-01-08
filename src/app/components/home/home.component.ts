import { Component, OnInit } from '@angular/core';
import { disableDebugTools } from '@angular/platform-browser';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent{

  cuotas = 0;
  tasa = 0.0000000000001;
  valorSolicitado = 0;
  vlrSolSinCi = 0;
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
  vlrDto;
  pDto = 0;
  minDes = 0;
  maxDes = 10;
  descuentoSlide = 0;
  montoTotal;
  cuotaInicial = 0;

  /* Valores */

  vlrUno = 4818000;
  vlrDos = 9730000;
  vlrTres = 12100000;
  vlrCuatro = 19600000;

  checkUno = false;
  checkDos = false;
  checkTres = false;
  checkCuatro = false;
  showDetails = false;
  showDetailsOne = true;
  showDetailsTwo = false;


  vlrCuotaSs = 0;
  seguroCta = 0;
  seguroTotal = 0;

  linka(){
    window.location.href = 'https://apps.datacredito.com.co/raw/user-account/login/web/index';
      
  }

  saveMonto(val){
    this.valorSolicitado = val;    
    this.changeButtonCliente(this.cuotas);  
  }

  descuento(val){    

    var dto = 0;
    this.pDto = Number(val.srcElement.value);    
    /* Preservando valor sin cuota Inicial */
    this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

    dto = Math.round(this.vlrSolSinCi * (this.pDto / 100));    
    this.vlrDto = this.vlrSolSinCi - dto; 
    this.vlrSolSinCi = this.vlrDto;
    this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / this.cuotas);
  }

  detailsTwo(){
    this.showDetailsTwo = !this.showDetailsTwo;
    this.showDetailsOne = !this.showDetailsOne;
  }

  changeButtonCliente(val){    
    
    if(val !== undefined){

      if(val.value !== undefined){
      var cuota = Number(val.value);
      }else{
        var cuota = Number(val);
      }
    
    }

    switch (cuota) {
      case 6:                   

          this.tasa = 0;
          this.nmv = 0;    

          this.cuotaInicial = this.valorSolicitado * 0.10;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);
          break;

       case 12:
          this.tasa = 0;
          this.nmv = 0;     

          this.cuotaInicial = this.valorSolicitado * 0.10;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);
       
       break;

       case 18:
          this.tasa = 0;
          this.nmv = 0;     

          this.cuotaInicial = this.valorSolicitado * 0.10;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);

       break;

       case 24:
          this.tasa = 0;
          this.nmv = 0;     

          this.cuotaInicial = this.valorSolicitado * 0.10;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);

       break;

       case 36:

          var nmv;
          /* var seguroTotal = 0.0000000000001; */
          var vlrActual;
          var vlrCuota;

          this.tasa = 0.0604;
          nmv = Math.pow((1 + this.tasa),(1/12))-1;
         
          this.descuentoSlide = 0;
          this.vlrDto = 0;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

          /* Aplicando Dto */

          /* if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          } */

          /* -- */

          var vlrPartuno = vlrActual * nmv;
          var vlrPartdos = Math.pow((1 + nmv), - cuota)
          vlrPartdos = 1 - vlrPartdos;
          vlrCuota = vlrPartuno / vlrPartdos;
          vlrCuota = Math.round(vlrCuota);

          /* Valor Cuota sin seguro */

          this.vlrCuotaSs = vlrCuota;  

          /* var vlrPartunoSeg = seguroTotal * nmv;      
          var vlrPartdosSeg = Math.pow((1 + nmv), - cuota)
          vlrPartdosSeg = 1 - vlrPartdosSeg;
          var seguroCta = vlrPartunoSeg / vlrPartdosSeg;
          seguroCta = Math.round(seguroCta); */

          /* Seguro de la cuota */

          /* this.seguroCta = seguroCta;
          this.vlrCuota = Math.round(vlrCuota + seguroCta); */
          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);

          this.nmv = 0.643;
          this.tasa = 7.99;

       break;
    
      default:
        break;
    }
  }
  

  changeButton(val){
    let cuota = Number(val.value);
    let nmv = Math.pow((1 + this.tasa),(1/12))-1;
    let seguro;    
    
    
    switch (cuota) {
      case 6:

          /* Anticipo */
          /* Vaciando Anticipo */
          var valorSolicitado = Math.round(this.valorSolicitado)
          var cuotaInicial = Math.round(valorSolicitado * 0.10)
          this.cuotaInicial = cuotaInicial;
          valorSolicitado = Math.round(valorSolicitado) - cuotaInicial;
          seguro = (1200 / 1000000) * valorSolicitado;
          this.vlrSolSinCi = valorSolicitado;
                  
          var vlrCuota;
          /* var vlrDescuento = Math.round(this.valorSolicitado * this.descuento); */
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
          /* var sumandoFin = this.vlrSolSinCi + seguroTotal + this.cuatroMil; */
          let nmvUno = Math.pow((1 + this.tasa), (1/12)) - 1;          
          let potencia = 1 - (Math.pow(1 + nmvUno, - cuota));
          let numerador = this.vlrCuotaCliente * potencia;
          let resultado = numerador / nmvUno;
          this.costoInterez = (this.vlrSolSinCi + this.seguroTotal + this.cuatroMil) - resultado;
          this.dtoFinancia = Number((this.costoInterez / this.vlrSolSinCi * 100).toFixed(2));
          this.costoGaes = Number((this.costoInterez / this.valorSolicitado * 100).toFixed(2));
          this.costoTotalGaes = Number(this.costoGaes) + 10;
                              
        break;

      case 12:
        
          /* Anticipo */
          /* Vaciando Anticipo */
          var valorSolicitado = Math.round(this.valorSolicitado)
          var cuotaInicial = Math.round(valorSolicitado * 0.10)
          this.cuotaInicial = cuotaInicial;
          valorSolicitado = Math.round(valorSolicitado) - cuotaInicial;
          seguro = (1200 / 1000000) * valorSolicitado;
          this.vlrSolSinCi = valorSolicitado;
                  
          var vlrCuota;
          /* var vlrDescuento = Math.round(this.valorSolicitado * this.descuento); */
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
                     
             
        break;

      case 18:
        
          /* Anticipo */
          /* Vaciando Anticipo */
          var valorSolicitado = Math.round(this.valorSolicitado)
          var cuotaInicial = Math.round(valorSolicitado * 0.10)
          this.cuotaInicial = cuotaInicial;
          valorSolicitado = Math.round(valorSolicitado) - cuotaInicial;
          seguro = (1200 / 1000000) * valorSolicitado;
          this.vlrSolSinCi = valorSolicitado;
                  
          var vlrCuota;
          /* var vlrDescuento = Math.round(this.valorSolicitado * this.descuento); */
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
             
        break;

      case 24:
        
          /* Anticipo */
          /* Vaciando Anticipo */
          var valorSolicitado = Math.round(this.valorSolicitado)
          var cuotaInicial = Math.round(valorSolicitado * 0.10)
          this.cuotaInicial = cuotaInicial;
          valorSolicitado = Math.round(valorSolicitado) - cuotaInicial;
          seguro = (1200 / 1000000) * valorSolicitado;
          this.vlrSolSinCi = valorSolicitado;
                  
          var vlrCuota;
          /* var vlrDescuento = Math.round(this.valorSolicitado * this.descuento); */
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
             
        break;

      case 36:

          /* Anticipo */
          /* Vaciando Anticipo */
          var valorSolicitado = Math.round(this.valorSolicitado)
          var cuotaInicial = Math.round(valorSolicitado * 0.10)
          this.cuotaInicial = cuotaInicial;
          valorSolicitado = Math.round(valorSolicitado) - cuotaInicial;
          seguro = (1200 / 1000000) * valorSolicitado;
          this.vlrSolSinCi = valorSolicitado;
                  
          var vlrCuota;
          /* var vlrDescuento = Math.round(this.valorSolicitado * this.descuento); */
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

        break;
    
      default:
        break;
    }
  }

  details(){
    this.showDetails = !this.showDetails;
    
  }
  

  onPrint(){
    window.print();
  }

}
