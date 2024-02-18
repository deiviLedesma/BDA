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

    // clase pojo
    private int idTransferencia;
    private String fechaT;
    private double monto;
    private int idCuentaRecibe, idCuentaEnvia;

    public TransferenciaForm() {
    }

    public TransferenciaForm(int idTransferencia, String fechaT, double monto, int idCuentaRecibe, int idCuentaEnvia) {
        this.idTransferencia = idTransferencia;
        this.fechaT = fechaT;
        this.monto = monto;
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
    }

    public TransferenciaForm(String fechaT, double monto, int idCuentaRecibe, int idCuentaEnvia) {
        this.fechaT = fechaT;
        this.monto = monto;
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getIdCuentaRecibe() {
        return idCuentaRecibe;
    }

    public void setIdCuentaRecibe(int idCuentaRecibe) {
        this.idCuentaRecibe = idCuentaRecibe;
    }

    public int getIdCuentaEnvia() {
        return idCuentaEnvia;
    }

    public void setIdCuentaEnvia(int idCuentaEnvia) {
        this.idCuentaEnvia = idCuentaEnvia;
    }

    @Override
    public String toString() {
        return "TransferenciaForm{" + "idTransferencia=" + idTransferencia + ", fechaT=" + fechaT + ", monto=" + monto + ", idCuentaRecibe=" + idCuentaRecibe + ", idCuentaEnvia=" + idCuentaEnvia + '}';
    }

    
    
}
