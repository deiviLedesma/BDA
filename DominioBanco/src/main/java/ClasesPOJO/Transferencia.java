/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPOJO;

/**
 *
 * @author SDavidLedesma
 */
public class Transferencia {

    private int idTransferencia;
    private int idCuentaRecibe;
    private int idCuentaEnvia;
    private int numCuentaRecibe;
    private int numCuentaEnvia;
    private float cantidad;
    private String fecha;

    public Transferencia() {
    }

    public Transferencia(int idCuentaRecibe, int idCuentaEnvia, int numCuentaRecibe, int numCuentaEnvia, float cantidad) {
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
        this.numCuentaRecibe = numCuentaRecibe;
        this.numCuentaEnvia = numCuentaEnvia;
        this.cantidad = cantidad;
    }

    public Transferencia(int idCuentaRecibe, int idCuentaEnvia, int numCuentaRecibe, int numCuentaEnvia, float cantidad, String fecha) {
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
        this.numCuentaRecibe = numCuentaRecibe;
        this.numCuentaEnvia = numCuentaEnvia;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    
    public Transferencia(int idTransferencia, int idCuentaRecibe, int idCuentaEnvia, int numCuentaRecibe, int numCuentaEnvia, float cantidad, String fecha) {
        this.idTransferencia = idTransferencia;
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
        this.numCuentaRecibe = numCuentaRecibe;
        this.numCuentaEnvia = numCuentaEnvia;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public int getIdCuentaRecibe() {
        return idCuentaRecibe;
    }

    public void setIdCuentaRecibe(int idCuentaRecibe) {
        this.idCuentaRecibe = idCuentaRecibe;
    }

    public int getIdCuentaEnvia() {
        return idCuentaEnvia;
    }

    public void setIdCuentaEnvia(int idCuentaEnvia) {
        this.idCuentaEnvia = idCuentaEnvia;
    }

    public int getNumCuentaRecibe() {
        return numCuentaRecibe;
    }

    public void setNumCuentaRecibe(int numCuentaRecibe) {
        this.numCuentaRecibe = numCuentaRecibe;
    }

    public int getNumCuentaEnvia() {
        return numCuentaEnvia;
    }

    public void setNumCuentaEnvia(int numCuentaEnvia) {
        this.numCuentaEnvia = numCuentaEnvia;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "idTransferencia=" + idTransferencia + ", idCuentaRecibe=" + idCuentaRecibe + ", idCuentaEnvia=" + idCuentaEnvia + ", numCuentaRecibe=" + numCuentaRecibe + ", numCuentaEnvia=" + numCuentaEnvia + ", cantidad=" + cantidad + ", fecha=" + fecha + '}';
    }
    
    
    
}
