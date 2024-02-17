/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

import java.time.LocalDate;

/**
 *
 * @author SDavidLedesma
 */
public class Cuenta {

    // clase pojo
    private int idCuenta;
    private String numeroCuenta;
    private String fechaA;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(int idCuenta, String numeroCuenta, String fechaA, double saldo) {
        this.idCuenta = idCuenta;
        this.numeroCuenta = numeroCuenta;
        this.fechaA = fechaA;
        this.saldo = saldo;
    }

    public Cuenta(String numeroCuenta, String fechaA, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.fechaA = fechaA;
        this.saldo = saldo;
    }

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

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", fechaA=" + fechaA + ", saldo=" + saldo + '}';
    }

}
