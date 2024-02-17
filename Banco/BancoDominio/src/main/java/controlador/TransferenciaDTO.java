/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author SDavidLedesma
 */
public class TransferenciaDTO {

    // atributos de clase
    private int idTransferencia;
    private String fechaT;
    private double monto;
    private int idCuentaRecibe, idCuentaEnvia;

    // constructor vacio para poder instanciarlo de manera necesaria
    public TransferenciaDTO() {
    }

    public TransferenciaDTO(int idTransferencia, String fechaT, double monto, int idCuentaRecibe, int idCuentaEnvia) {
        this.idTransferencia = idTransferencia;
        this.fechaT = fechaT;
        this.monto = monto;
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
    }

    public TransferenciaDTO(String fechaT, double monto, int idCuentaRecibe, int idCuentaEnvia) {
        this.fechaT = fechaT;
        this.monto = monto;
        this.idCuentaRecibe = idCuentaRecibe;
        this.idCuentaEnvia = idCuentaEnvia;
    }
    // metodos get y set para establecer un valor y devolver un valor

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public String getFechaT() {
        return fechaT;
    }

    public void setFechaT(String fechaT) {
        this.fechaT = fechaT;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
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
}
