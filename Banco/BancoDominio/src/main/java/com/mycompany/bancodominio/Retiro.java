/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

/**
 *
 * @author SDavidLedesma
 */
public class Retiro {
        
   //clase pojo
    private int idRetiro;
    private double cantidad;
    private String fecha;
    private int idCuenta;

    public Retiro() {
    }

    public Retiro(int idRetiro, double cantidad, String fecha, int idCuenta) {
        this.idRetiro = idRetiro;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idCuenta = idCuenta;
    }

    public Retiro(double cantidad, String fecha, int idCuenta) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idCuenta = idCuenta;
    }

    public int getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(int idRetiro) {
        this.idRetiro = idRetiro;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    @Override
    public String toString() {
        return "Retiro{" + "idRetiro=" + idRetiro + ", cantidad=" + cantidad + ", fecha=" + fecha + ", idCuenta=" + idCuenta + '}';
    }
    
    
    
}
