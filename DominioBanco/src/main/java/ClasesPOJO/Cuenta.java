/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPOJO;

/**
 *
 * @author SDavidLedesma
 */
public class Cuenta {

    private int idCuenta;
    private int numCuenta;
    private int idCliente; // hace referencia a la llave foranea en la base de datos
    private String fechaApertura;
    private float saldo;
    private String estado;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, int idCliente, String fechaApertura, float saldo, String estado) {
        this.numCuenta = numCuenta;
        this.idCliente = idCliente;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.estado = estado;
    }

    
    public Cuenta(int idCuenta, int numCuenta, int idCliente, String fechaApertura, float saldo, String estado) {
        this.idCuenta = idCuenta;
        this.numCuenta = numCuenta;
        this.idCliente = idCliente;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.estado = estado;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "idCuenta=" + idCuenta + ", numCuenta=" + numCuenta + ", idCliente=" + idCliente + ", fechaApertura=" + fechaApertura + ", saldo=" + saldo + ", estado=" + estado + '}';
    }
    
    
    
}
