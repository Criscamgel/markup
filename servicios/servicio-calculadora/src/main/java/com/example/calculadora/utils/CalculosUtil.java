package com.example.calculadora.utils;

public class CalculosUtil {

    public static double calculoNominalMesVendido(double tasa){
        return Math.pow((1 + tasa),(1.0/12.0))-1;
    }

    public static double calcularValorTotalSeguro(double valorSolicitado, double cantidadCuotas){
        return (1200.0 / 1000000.0  * valorSolicitado )*cantidadCuotas;
    }

    public static double calcularPago(double valorActual, double cantidadCuotas, double tasa){
        double nominalMesVencido = calculoNominalMesVendido(tasa);
        return Math.round( (valorActual * nominalMesVencido) / (1-(Math.pow((1 + nominalMesVencido), - cantidadCuotas))) );
    }

    public static double calcularCuatroxMil(double valorSinCuotaInicial, double valorSeguro){
        return Math.round( (valorSinCuotaInicial+valorSeguro) *0.004);
    }
    public static double calcularPagoCuatroxMil(double cuotaMensualSinInicial, double cantidadCuotas, double tasa){
        double nominalMesVencido = calculoNominalMesVendido(tasa);
        return Math.round( (cuotaMensualSinInicial*(1-(Math.pow((1 + nominalMesVencido), - cantidadCuotas)))) / nominalMesVencido );
    }
}
