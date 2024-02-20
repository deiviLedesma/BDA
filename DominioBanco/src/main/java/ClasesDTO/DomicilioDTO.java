/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesDTO;

/**
 *
 * @author SDavidLedesma
 */
public class DomicilioDTO {

    private int idCliente;
    private String calle;
    private String colonia;
    private String numero;

    public DomicilioDTO() {
    }

    public DomicilioDTO(int idCliente, String calle, String colonia, String numero) {
        this.idCliente = idCliente;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public DomicilioDTO(String calle, String colonia, String numero) {
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}
