/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesDTO;

/**
 *
 * @author SDavidLedesma
 */
public class TransferenciaDTO {
    
    private int idCuentaEnvia;
    private int idCuentaRecibe;
    private float monto;

    public TransferenciaDTO() {
    }

    
    public TransferenciaDTO(int idCuentaEnvia, int idCuentaRecibe, float monto) {
        this.idCuentaEnvia = idCuentaEnvia;
        this.idCuentaRecibe = idCuentaRecibe;
        this.monto = monto;
    }

    public int getIdCuentaEnvia() {
        return idCuentaEnvia;
    }

    public void setIdCuentaEnvia(int idCuentaEnvia) {
        this.idCuentaEnvia = idCuentaEnvia;
    }

    public int getIdCuentaRecibe() {
        return idCuentaRecibe;
    }

    public void setIdCuentaRecibe(int idCuentaRecibe) {
        this.idCuentaRecibe = idCuentaRecibe;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
    
    
    
}
