package com.example.calculadora.dto;

public class CalculadoraRequestDTO {
    private Integer aliadoId;
    private int cantidadCuotas;
    private double valorSolicitado;
    private boolean epsPrepagada;
    private int descuento;

    public Integer getAliadoId() {
        return aliadoId;
    }

    public void setAliadoId(Integer aliadoId) {
        this.aliadoId = aliadoId;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public boolean isEpsPrepagada() {
        return epsPrepagada;
    }

    public void setEpsPrepagada(boolean epsPrepagada) {
        this.epsPrepagada = epsPrepagada;
    }

    public int getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(int cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
