



package com.mycompany.bancodominio;

/**
*
* @authorSDavidLedesma
*/

public class Domicilio {

  private int idDomicilio;
  private String calle;
  private int numero;
  private String colonia;

  public Domicilio(){
  }

  public Domicilio(String calle, int numero, String colonia){
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

  public void setNumero (int numero) {
      this.numero = numero;
  }

  public void setColonia (String colonia) {
      this. colonia = colonia;
  }
