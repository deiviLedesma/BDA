/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPOJO;

/**
 *
 * @author SDavidLedesma
 */
public class Domicilio {

    private int idCliente;
    private String calle;
    private String numero;
    private String colonia;

    public Domicilio() {
    }

    public Domicilio(int idCliente, String calle, String numero, String colonia) {
        this.idCliente = idCliente;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

}
