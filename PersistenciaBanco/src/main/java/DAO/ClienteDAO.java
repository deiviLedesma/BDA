/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ClasesDTO.ClienteDTO;
import ClasesPOJO.Cliente;
import Conexion.Conexion;
import Persistencia.PersistenciaException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SDavidLedesma
 */
public class ClienteDAO implements IClienteDAO {

    final String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    final String usuario = "root";
    final String contra = "Inunanash1";
    Conexion conexionBD = new Conexion(cadenaConexion, usuario, contra);
    private static final Logger LOG = Logger.getLogger(ClienteDAO.class.getName());

    public ClienteDAO() {

    }

    @Override
    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException {
        String sentenciaSQL = "INSERT INTO CLIENTE (nombre,apellidoPaterno,apellidoMaterno) VALUES(?,?,?)";

        try (Connection conexion = this.conexionBD.crearConexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS);) {

            comandoSQL.setString(1, cliente.getNombre());
            comandoSQL.setString(2, cliente.getApellidoP());
            comandoSQL.setString(3, cliente.getApellidoM());

            int resultado = comandoSQL.executeUpdate();

            LOG.log(Level.INFO, "se ha agregado (0)", resultado);

            ResultSet res = comandoSQL.getGeneratedKeys();

            res.next();

            Cliente clienteGuardado = new Cliente(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7));

            return clienteGuardado;

        } catch (SQLException e) {
            LOG.log(Level.SEVERE, "No se pudo agregar el cliente");
            throw new PersistenciaException("No se pudo agregar el cliente");
        }
    }

    @Override
    public int SesionCliente(ClienteDTO cliente) throws PersistenciaException {
        String sentencia = "SELECT * FROM CLIENTES WHERE nombreUsuario= ? and contrasena=?; ";

        try (Connection conexion = this.conexionBD.crearConexion()) {
            PreparedStatement comandoSQL = conexion.prepareCall(sentencia);

            comandoSQL.setString(1, cliente.getNombreUsuario());
            comandoSQL.setString(2, cliente.getContrasenia());
            ResultSet res = comandoSQL.executeQuery();
            res.next();
            return res.getInt("idcliente");
        } catch (Exception e) {
            LOG.log(Level.SEVERE, sentencia, e);
            throw new PersistenciaException("El nombre de usuario o contraseña son incorrectos.");

        }
    }

  
}
