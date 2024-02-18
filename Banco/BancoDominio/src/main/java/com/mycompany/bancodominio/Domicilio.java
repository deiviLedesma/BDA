/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodominio;

/**
 *
 * @author SDavidLedesma
 */
public class Domicilio {

    // clase pojo
    private int idDomicilio;
    private String calle;
    private int numero;
    private String colonia;

    public Domicilio() {
    }

    public Domicilio(int idDomicilio, String calle, int numero, String colonia) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }
    
    
    public Domicilio(String calle, int numero, String colonia) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String colonia() {
        return colonia;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;

    }

    @Override
    public String toString() {
        return "Domicilio{" + "idDomicilio=" + idDomicilio + ", calle=" + calle + ", numero=" + numero + ", colonia=" + colonia + '}';
    }
    
    
}
