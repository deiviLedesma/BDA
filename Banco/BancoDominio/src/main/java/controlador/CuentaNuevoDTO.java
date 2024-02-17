/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author SDavidLedesma
 */
public class CuentaNuevoDTO {

    // atributos para la clase
    private int idCuenta;
    private String numeroCuenta;
    private String fechaA;
    private double saldo;

    // constructor vacio 
    public CuentaNuevoDTO() {
    }

    // constructor con los atributos de la clase
    public CuentaNuevoDTO(int idCuenta, String numeroCuenta, String fechaA, double saldo) {
        this.idCuenta = idCuenta;
        this.numeroCuenta = numeroCuenta;
        this.fechaA = fechaA;
        this.saldo = saldo;
    }

    public CuentaNuevoDTO(String numeroCuenta, String fechaA, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fechaA = fechaA;
        this.saldo = saldo;
    }

    // metodos get y set para establecer un valor y devolver un valor
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getFechaA() {
        return fechaA;
    }

    public void setFechaA(String fechaA) {
        this.fechaA = fechaA;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
