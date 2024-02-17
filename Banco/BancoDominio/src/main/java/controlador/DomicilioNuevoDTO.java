/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author SDavidLedesma
 */
public class DomicilioNuevoDTO {

    // atributos de la clase
    private int idDomicilio;
    private String calle;
    private int numero;
    private String colonia;

    // constructor vacio para instanciar de ser necesario
    public DomicilioNuevoDTO() {
    }

    // constructor con los atributos en clase
    public DomicilioNuevoDTO(int idDomicilio, String calle, int numero, String colonia) {
        this.idDomicilio = idDomicilio;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    public DomicilioNuevoDTO(String calle, int numero, String colonia) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
    }

    // metodos get y set para establecer un valor y devoler un valor
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
}
