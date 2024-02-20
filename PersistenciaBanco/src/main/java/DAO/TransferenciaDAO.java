/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ClasesPOJO.Transferencia;
import Conexion.Conexion;
import Persistencia.PersistenciaException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SDavidLedesma
 */
public class TransferenciaDAO implements ITransferenciaDAO {

    final String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    final String usuario = "root";
    final String contra = "Inunanash1";
    Conexion conexionBD = new Conexion(cadenaConexion, usuario, contra);
    private static final Logger LOG = Logger.getLogger(TransferenciaDAO.class.getName());

    public TransferenciaDAO() {
    }

    @Override
    public void agregarTransferencia(Transferencia transferencia) throws PersistenciaException {
        String sentenciaSQL = "{CALL transferencia_transaccion(?, ?, ?, ?, ?)}";

        try (Connection conexion = this.conexionBD.crearConexion(); CallableStatement comandoSQL = conexion.prepareCall(sentenciaSQL);) {
            System.out.println(transferencia);

            comandoSQL.setInt(1, transferencia.getIdCuentaEnvia());
            comandoSQL.setInt(2, transferencia.getIdCuentaRecibe());
            comandoSQL.setInt(3, transferencia.getNumCuentaEnvia());
            comandoSQL.setInt(4, transferencia.getNumCuentaRecibe());
            comandoSQL.setFloat(5, transferencia.getCantidad());

            int resultado = comandoSQL.executeUpdate();
            LOG.log(Level.INFO, "se ha agregado {0}", resultado);

        } catch (SQLException e) {
            LOG.log(Level.SEVERE, "No se pudo transferir");
            throw new PersistenciaException(e.getMessage());
        }

    }

    public List<Transferencia> consultarTransferencias(int id) throws PersistenciaException {
        String sentenciaSQL = "SELECT * FROM TRANSFERENCIAS WHERE IDCUENTAENVIA=?;";
        List<Transferencia> lista = new ArrayList<>();

        try (Connection conexion = this.conexionBD.crearConexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS)) {

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            while (res.next()) {
                int idcuentaEnvia = res.getInt("idcuentaenvia");
                int idcuentaRecibe = res.getInt("idcuentarecibe");
                int numerocuentaEnvia = res.getInt("numeroCuentaEnvia");
                int numerocuentaRecibe = res.getInt("numeroCuentaRecibe");
                float monto = res.getFloat("monto");
                String fecha = res.getString("fecha");
                Transferencia t = new Transferencia(idcuentaEnvia, idcuentaRecibe, numerocuentaEnvia, numerocuentaRecibe, monto, fecha);
                lista.add(t);
            }

            LOG.log(Level.INFO, "Se consultaron {0}", lista.size());

            return lista;
        } catch (SQLException e) {
            LOG.log(Level.SEVERE, sentenciaSQL, e);
            throw new PersistenciaException("No se pudieron consultar las transacciones");
        }
    }

    public List<Transferencia> consultarTransferenciasPeriodo(String desde, String hasta) throws PersistenciaException {
        String sentenciaSQL = "SELECT * FROM TRANSFERENCIAS WHERE fecha between ? and ?;";
        List<Transferencia> lista = new ArrayList<>();

        try (Connection conexion = this.conexionBD.crearConexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS)) {

            comandoSQL.setString(1, desde);
            comandoSQL.setString(2, hasta);
            System.out.println(desde);
            System.out.println(hasta);

            ResultSet res = comandoSQL.executeQuery();
            while (res.next()) {
                int idcuentaEnvia = res.getInt("idcuentaenvia");
                int idcuentaRecibe = res.getInt("idcuentarecibe");
                int numerocuentaEnvia = res.getInt("numeroCuentaEnvia");
                int numerocuentaRecibe = res.getInt("numeroCuentaRecibe");
                float monto = res.getFloat("monto");
                String fecha = res.getString("fecha");
                Transferencia t = new Transferencia(idcuentaEnvia, idcuentaRecibe, numerocuentaEnvia, numerocuentaRecibe, monto, fecha);
                lista.add(t);
            }

            LOG.log(Level.INFO, "Se consultaron {0}", lista.size());

            return lista;
        } catch (SQLException e) {
            LOG.log(Level.SEVERE, sentenciaSQL, e);
            throw new PersistenciaException("No se pudieron consultar las transacciones");
        }
    }
}
