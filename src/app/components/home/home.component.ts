import { Component, OnInit } from '@angular/core';
import { disableDebugTools } from '@angular/platform-browser';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent{

  cuotas;
  tasa = 0.0000000000001;
  valorSolicitado = 0;
  vlrSolSinCi;
  vlrCuota;
  cuatroMil = 0;

  inCuatroSeg = 0;

  vlrCuotaCliente;

  /* descuento; */
  vlrDto;
  minDes = 0;
  maxDes = 10;
  descuentoSlide = 0;
  montoTotal;
  cuotaInicial;

  /* Valores */

  vlrUno = 4818000;
  vlrDos = 9730000;
  vlrTres = 12100000;
  vlrCuatro = 19600000;

  checkUno = false;
  checkDos = false;
  checkTres = false;
  checkCuatro = false;


  vlrCuotaSs = 0;
  seguroCta = 0;
  seguroTotal = 0;

  linka(){
    window.location.href = 'https://apps.datacredito.com.co/raw/user-account/login/web/index';
      
  }

  saveMonto(val){
    this.valorSolicitado = val;    
  }

  descuento(val){
    var dto = 0;
    /* Preservando valor sin cuota Inicial */
    this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;
    /*  */  
    dto = Math.round(this.vlrSolSinCi * (Number(val.srcElement.value) / 100));    
    this.vlrDto = this.vlrSolSinCi - dto;
    this.changeButtonCliente(Number(this.cuotas));
      
  }

  changeButtonCliente(val){
    
    if(val.value !== undefined){
    var cuota = Number(val.value);
    }else{
      var cuota = Number(val);
    }
    switch (cuota) {
      case 6:

          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

          /* Aplicando Dto */

          if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          }

          /* -- */
          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);



       break;

       case 12:
          
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

          /* Aplicando Dto */

          if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          }

          /* -- */

          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);
       
       break;

       case 18:
         
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

          /* Aplicando Dto */

          if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          }

          /* -- */

          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);

       break;

       case 24:
         
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

          /* Aplicando Dto */

          if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          }

          /* -- */

          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);

       break;

       case 36:
         
          this.descuentoSlide = 0;
          this.vlrDto = 0;
          this.vlrSolSinCi = this.valorSolicitado - this.cuotaInicial;

          /* Aplicando Dto */

          if(this.vlrDto !== 0 && this.vlrDto !== undefined){
            this.vlrSolSinCi = this.vlrDto;  
          }

          /* -- */

          this.vlrCuotaCliente =  Math.round(this.vlrSolSinCi / cuota);

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
          var sumandoFin = this.vlrSolSinCi + seguroTotal + this.cuatroMil;
          console.log("sumandoFin", sumandoFin);          

          this.inCuatroSeg = (this.vlrSolSinCi * (1 - (Math.pow((1 + nmv), -cuota))) / nmv)
          console.log("this.inCuatroSeg", this.inCuatroSeg);
          




          /* var inCuatroSegNum;
          var inCuatroSegDos;

          inCuatroSegNum = Math.round(Math.pow(1 + nmv, -cuota))
          console.log("vlrCuota", this.vlrCuota);          
          inCuatroSegNum = (1 - inCuatroSegNum) * this.vlrCuota;
          console.log("inCuatroSegNum", inCuatroSegNum);
          this.inCuatroSeg = inCuatroSegNum / nmv;
          console.log("inCuatroSeg", this.inCuatroSeg);

          debugger;
          inCuatroSegDos = this.vlrSolSinCi + seguroTotal + this.cuatroMil;
          console.log("inCuatroSegDos", inCuatroSegDos);
                    

          this.inCuatroSeg = inCuatroSegDos - this.inCuatroSeg;
          console.log("inCuatroSeg - Final", this.inCuatroSeg);
           */
                              
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
  

  onPrint(){
    window.print();
  }

}
