/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


/**
 *
 * @author SDavidLedesma
 */
public class ClienteNuevoDTO {

    // atributos de la clase
    private int clienteID;
    private String nombre, apellidoP, apellidoM;
    private String calle, numero, colonia;
    private String fechaN;
    private int edad;

    // constructor vacio para poder instanciarlo de ser necesario
    public ClienteNuevoDTO() {
    }

    // Constructor para establecer los parametros con la informacion del cliente
     
    public ClienteNuevoDTO(int clienteID, String nombre, String apellidoP, String apellidoM, String calle, String numero, String colonia, String fechaN, int edad) {
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

    public ClienteNuevoDTO(String nombre, String apellidoP, String apellidoM, String calle, String numero, String colonia, String fechaN, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.fechaN = fechaN;
        this.edad = edad;
    }

    public ClienteNuevoDTO(String nombre, String apellidoP, String apellidoM, String fechaN, int edad) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.fechaN = fechaN;
        this.edad = edad;
    }

    // métodos get y set para establecer un valor y obtener un valor
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

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
