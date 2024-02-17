/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import CONEXION.ConexionBD;
import CONEXION.IConexionBD;
import DAO.ClienteDAO;
import DAO.IClienteDAO;
import EXCEPTION.PersistenciaException;
import com.mycompany.bancodominio.Cliente;
import com.mycompany.bancodominio.Cuenta;
import com.mycompany.bancodominio.Domicilio;
import controlador.ClienteNuevoDTO;
import controlador.CuentaNuevoDTO;
import controlador.DomicilioNuevoDTO;

/**
 *
 * @author SDavidLedesma
 */
public class ControladorPersistencia {

    // atributos para establecer la conexion
    String cadenaConexion = "jdbc:mysql://localhost/banco";
    String usuario = "root";
    String contrasenia = "Inunanash1";

    // establecemos la conexion
    IConexionBD conexionBD = new ConexionBD(cadenaConexion, usuario, contrasenia);
    IClienteDAO clienteDAO = new ClienteDAO(conexionBD);

    /**
     * Método para poder llamar la acción en nuestra clase controladorDominio,
     * donde tiene de parametro al cliente que se agrega en el
     * controladorDominio
     *
     * @param cliente
     * @return
     * @throws PersistenciaException
     */
    public Cliente agregarCliente(ClienteNuevoDTO cliente) throws PersistenciaException {
        Cliente clienteAgregado = this.agregarCliente(cliente);
        return clienteAgregado;
    }

    /**
     * Método para poder llamar la acción en nuestra clase controladorDominio,
     * donde tiene de parametro al domicilio que se agrega en el
     * controladorDominio
     *
     * @param domicilio
     * @return
     * @throws PersistenciaException
     */
    public Domicilio agregarDomicilio(DomicilioNuevoDTO domicilio) throws PersistenciaException {
        Domicilio domicilioAgregado = this.agregarDomicilio(domicilio);
        return domicilioAgregado;
    }

    /**
     * Método para poder llamar la acción en nuestra clase controladorDominio,
     * donde tiene de parametro la cuenta que se agrega en el controladorDominio
     *
     *
     * @param cuenta
     * @return
     * @throws PersistenciaException
     */
    public Cuenta agregarCuenta(CuentaNuevoDTO cuenta) throws PersistenciaException {
        Cuenta cuentaAgregada = this.agregarCuenta(cuenta);
        return cuentaAgregada;
    }

}
