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
public class Cliente {

    private int clienteID;
    private String nombre, apellidoP, apellidoM;
    private String calle, numero, colonia;
    private LocalDate fechaN;
    private int edad;

    public Cliente() {
    }

    public Cliente(String nombre, String apellidoP, String apellidoM) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
    }

    
    
    public Cliente(String nombre, String apellidoP, String apellidoM, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
    }

    
    public Cliente(String nombre, String apellidoP, String apellidoM, String calle, String numero, String colonia, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.edad = edad;
    }

    
    public Cliente(String nombre, String apellidoP, String apellidoM, String calle, String numero, String colonia, LocalDate fechaN, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.fechaN = fechaN;
        this.edad = edad;
    }

    public Cliente(int clienteID, String nombre, String apellidoP, String apellidoM, String calle, String numero, String colonia, LocalDate fechaN, int edad) {
        this.clienteID = clienteID;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.fechaN = fechaN;
        this.edad = edad;
    }

    public int getClienteID() {
        return clienteID;
    }

    public void setClienteID(int clienteID) {
        this.clienteID = clienteID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
