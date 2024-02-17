

package com.mycompany.bancodominio;

/**
*
* @author SDavidLedes,a
*/

public class RetiroSinCuenta {

  private int idRetiro;
  private String fechaExpiracion;
  private String folio;
  private String contrasenia;
  private double saldo;
  private int idCuenta;

  public RetiroSinCuenta() {
    }

    public RetiroSinCuenta(int idRetiro, String fechaExpiracion, String folio, String contrasenia, double saldo, int idCuenta) {
        this.idRetiro = idRetiro;
        this.fechaExpiracion = fechaExpiracion;
        this.folio = folio;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
        this.idCuenta = idCuenta;
    }

    public RetiroSinCuenta(String fechaExpiracion, String folio, String contrasenia, double saldo, int idCuenta) {
        this.fechaExpiracion = fechaExpiracion;
        this.folio = folio;
        this.contrasenia = contrasenia;
        this.saldo = saldo;
        this.idCuenta = idCuenta;
    }

    public int getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(int idRetiro) {
        this.idRetiro = idRetiro;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
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

    
}
