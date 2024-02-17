/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

/**
 *
 * @author SDavidLedesma
 */
public class TransferenciaForm {

    private String cuentaOrigen;
    private String cuentaDestino;
    private double monto;

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

      @Override
    public String toString() {
        return "TransferenciaForm{" + "cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino + ", monto=" + monto + '}';
    }
    
}
