/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author SDavidLedesma
 */
public class RetiroNuevoDTO {

    // atributos de clase
    private int idRetiro;
    private double cantidad;
    private String fecha;
    private int idCuenta;

    // constructor vacio para instanciar de ser necesario
    public RetiroNuevoDTO() {
    }

    // constructor con los parametros de clase
    public RetiroNuevoDTO(int idRetiro, double cantidad, String fecha, int idCuenta) {
        this.idRetiro = idRetiro;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idCuenta = idCuenta;
    }

    public RetiroNuevoDTO(double cantidad, String fecha, int idCuenta) {
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.idCuenta = idCuenta;
    }

    // metodos set y get que establece un valor y devuelve el valor
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
}
