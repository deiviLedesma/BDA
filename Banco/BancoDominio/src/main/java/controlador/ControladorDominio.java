/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

//import CONTROLADOR.ControladorPersistencia;
import CONTROLADOR.ControladorPersistencia;
import EXCEPTION.PersistenciaException;
import com.mycompany.bancodominio.Cliente;
import com.mycompany.bancodominio.Cuenta;
import com.mycompany.bancodominio.Domicilio;
import java.util.logging.Level;
import java.util.logging.Logger;

//import com.mycompany.bancodominio.Cliente;
/**
 *
 * @author SDavidLedesma
 */
public class ControladorDominio {

    ControladorPersistencia controlPersistencia = new ControladorPersistencia();

    /**
     * Método agregar cliente el cual recibe los parametros del cliente, para
     * poder crear este método debemos llamar al metodo previo en el controlador
     * de la persistencia en donde se establece la conexion
     *
     * @param nombre
     * @param apellidoP
     * @param apellidoM
     * @param fechaN
     * @param edad
     * @return
     * @throws DominioException
     */
    public Cliente agregarCliente(String nombre, String apellidoP, String apellidoM, String fechaN, int edad) throws DominioException {
        ClienteNuevoDTO clienteDTO = new ClienteNuevoDTO(nombre, apellidoP, apellidoM, fechaN, edad);
        Cliente clienteAgregado;
        try {
            clienteAgregado = this.controlPersistencia.agregarCliente(clienteDTO);
            return clienteAgregado;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ControladorDominio.class.getName()).log(Level.SEVERE, null, ex);
            throw new DominioException("No se agrego", ex);
        }
    }

    /**
     * Método agregar Domicilio el cual recibe los parametros del domicilio,
     * para poder crear este método debemos llamar al metodo previo en el
     * controlador de la persistencia en donde se establece la conexion
     *
     * @param calle
     * @param numero
     * @param colonia
     * @return
     * @throws DominioException
     */
    public Domicilio agregarDomicilio(String calle, int numero, String colonia) throws DominioException {
        DomicilioNuevoDTO domicilioDTO = new DomicilioNuevoDTO(calle, numero, colonia);
        Domicilio domicilioAgregado;
        try {
            domicilioAgregado = this.controlPersistencia.agregarDomicilio(domicilioDTO);
            return domicilioAgregado;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ControladorDominio.class.getName()).log(Level.SEVERE, null, ex);
            throw new DominioException("No se agrego", ex);
        }
    }

    /**
     * Método agregar cuenta el cual recibe los parametros del cuenta, para
     * poder crear este método debemos llamar al metodo previo en el controlador
     * de la persistencia en donde se establece la conexion
     *
     * @param numeroCuenta
     * @param fechaA
     * @param saldo
     * @return
     * @throws DominioException
     */
    public Cuenta agregarCuenta(String numeroCuenta, String fechaA, double saldo) throws DominioException {
        CuentaNuevoDTO cuentaDTO = new CuentaNuevoDTO(numeroCuenta, fechaA, saldo);
        Cuenta cuentaAgregada;
        try {
            cuentaAgregada = this.controlPersistencia.agregarCuenta(cuentaDTO);
            return cuentaAgregada;
        } catch (PersistenciaException ex) {
            Logger.getLogger(ControladorDominio.class.getName()).log(Level.SEVERE, null, ex);
            throw new DominioException("No se agrego", ex);
        }
    }
}
