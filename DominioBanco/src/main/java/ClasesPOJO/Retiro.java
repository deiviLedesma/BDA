/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesPOJO;

/**
 *
 * @author SDavidLedesma
 */
public class Retiro {

    private int idRetiro;
    private int idCuenta; // hace referencia a la llave foranea en la base de datos
    private float monto;
    private String fechaInicio;
    private String fechaExpira;
    private String estado;
    private String contrasenia;

    public Retiro() {
    }

    public Retiro(int idRetiro, int idCuenta, float monto, String contrasenia) {
        this.idRetiro = idRetiro;
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.contrasenia = contrasenia;
    }

    public Retiro(int idRetiro, int idCuenta, float monto, String fechaInicio, String fechaExpira) {
        this.idRetiro = idRetiro;
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaExpira = fechaExpira;
    }

    public Retiro(int idRetiro, int idCuenta, float monto, String fechaInicio, String fechaExpira, String contrasenia) {
        this.idRetiro = idRetiro;
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaExpira = fechaExpira;
        this.contrasenia = contrasenia;
    }

    public Retiro(int idRetiro, int idCuenta, float monto, String fechaInicio, String fechaExpira, String estado, String contrasenia) {
        this.idRetiro = idRetiro;
        this.idCuenta = idCuenta;
        this.monto = monto;
        this.fechaInicio = fechaInicio;
        this.fechaExpira = fechaExpira;
        this.estado = estado;
        this.contrasenia = contrasenia;
    }

    public int getIdRetiro() {
        return idRetiro;
    }

    public void setIdRetiro(int idRetiro) {
        this.idRetiro = idRetiro;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaExpira() {
        return fechaExpira;
    }

    public void setFechaExpira(String fechaExpira) {
        this.fechaExpira = fechaExpira;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Retiro{" + "idRetiro=" + idRetiro + ", idCuenta=" + idCuenta + ", monto=" + monto + ", fechaInicio=" + fechaInicio + ", fechaExpira=" + fechaExpira + ", estado=" + estado + ", contrasenia=" + contrasenia + '}';
    }

}
