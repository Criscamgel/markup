package com.example.calculadora.dto;

import java.math.BigDecimal;

public class CalculadoraResponseDTO {
    private double valorCuotaConSeguro;
    private double valorCuotaSinSeguro;
    private double valorTotalSeguro;
    private double costoMensualSeguro;
    private double montoTotalFinanciamiento;
    private double valorConDescuento;

    private double cuotaMensualSinInicial;
    private double cuotaInicial;
    private double valorSinCuotaInicial;
    private double cuatroxMil;
    private double costoInteres;
    private double descuentoFinanciacion;
    private double costoGaes;
    private double costoTotalGaes;
    private double valorSinCuotaInicialNiDescuento;

    public double getValorTotalSeguro() {
        return valorTotalSeguro;
    }

    public void setValorTotalSeguro(double valorTotalSeguro) {
        this.valorTotalSeguro = valorTotalSeguro;
    }

    public double getValorCuotaConSeguro() {
        return valorCuotaConSeguro;
    }

    public void setValorCuotaConSeguro(double valorCuotaConSeguro) {
        this.valorCuotaConSeguro = valorCuotaConSeguro;
    }

    public double getValorCuotaSinSeguro() {
        return valorCuotaSinSeguro;
    }

    public void setValorCuotaSinSeguro(double valorCuotaSinSeguro) {
        this.valorCuotaSinSeguro = valorCuotaSinSeguro;
    }

    public double getCostoMensualSeguro() {
        return costoMensualSeguro;
    }

    public void setCostoMensualSeguro(double costoMensualSeguro) {
        this.costoMensualSeguro = costoMensualSeguro;
    }

    public double getMontoTotalFinanciamiento() {
        return montoTotalFinanciamiento;
    }

    public void setMontoTotalFinanciamiento(double montoTotalFinanciamiento) {
        this.montoTotalFinanciamiento = montoTotalFinanciamiento;
    }

    public double getCuotaInicial() {
        return cuotaInicial;
    }

    public void setCuotaInicial(double cuotaInicial) {
        this.cuotaInicial = cuotaInicial;
    }

    public double getValorSinCuotaInicial() {
        return valorSinCuotaInicial;
    }

    public void setValorSinCuotaInicial(double valorSinCuotaInicial) {
        this.valorSinCuotaInicial = valorSinCuotaInicial;
    }

    public double getCuatroxMil() {
        return cuatroxMil;
    }

    public void setCuatroxMil(double cuatroxMil) {
        this.cuatroxMil = cuatroxMil;
    }

    public double getCostoInteres() {
        return costoInteres;
    }

    public void setCostoInteres(double costoInteres) {
        this.costoInteres = costoInteres;
    }

    public double getDescuentoFinanciacion() {
        return descuentoFinanciacion;
    }

    public void setDescuentoFinanciacion(BigDecimal descuentoFinanciacion) {
        this.descuentoFinanciacion = descuentoFinanciacion.doubleValue();
    }

    public double getCostoGaes() {
        return costoGaes;
    }

    public void setCostoGaes(BigDecimal costoGaes) {
        this.costoGaes = costoGaes.doubleValue();
    }

    public double getCostoTotalGaes() {
        return costoTotalGaes;
    }

    public void setCostoTotalGaes(double costoTotalGaes) {
        this.costoTotalGaes = costoTotalGaes;
    }

    public double getCuotaMensualSinInicial() {
        return cuotaMensualSinInicial;
    }

    public void setCuotaMensualSinInicial(double cuotaMensualSinInicial) {
        this.cuotaMensualSinInicial = cuotaMensualSinInicial;
    }

    public double getValorConDescuento() {
        return valorConDescuento;
    }

    public void setValorConDescuento(double valorConDescuento) {
        this.valorConDescuento = valorConDescuento;
    }

    public double getValorSinCuotaInicialNiDescuento() {
        return valorSinCuotaInicialNiDescuento;
    }

    public void setValorSinCuotaInicialNiDescuento(double valorSinCuotaInicialNiDescuento) {
        this.valorSinCuotaInicialNiDescuento = valorSinCuotaInicialNiDescuento;
    }
}
