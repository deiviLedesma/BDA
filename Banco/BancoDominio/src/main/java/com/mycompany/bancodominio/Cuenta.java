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

    private String numeroCuenta;
    private LocalDate fechaA;
    private double saldo;

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public LocalDate getFechaA() {
        return fechaA;
    }

    public void setFechaA(LocalDate fechaA) {
        this.fechaA = fechaA;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
