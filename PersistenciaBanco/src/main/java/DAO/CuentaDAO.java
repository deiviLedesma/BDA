/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import ClasesPOJO.Cuenta;
import Conexion.Conexion;
import Persistencia.PersistenciaException;
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
public class CuentaDAO implements ICuentaDAO {

    final String cadenaConexion = "jdbc:mysql://localhost:3306/banco";
    final String usuario = "root";
    final String contra = "Inunanash1";
    Conexion conexionBD = new Conexion(cadenaConexion, usuario, contra);
    private static final Logger LOG = Logger.getLogger(CuentaDAO.class.getName());

    public CuentaDAO() {

    }

    @Override
    public List<Cuenta> consultarCuentasCliente(int id) throws PersistenciaException {
        String sentenciaSQL = "SELECT * FROM CUENTA WHERE idCliente=?;";
        List<Cuenta> lista = new ArrayList<>();

        try (Connection conexion = this.conexionBD.crearConexion(); PreparedStatement comandoSQL = conexion.prepareStatement(sentenciaSQL, Statement.RETURN_GENERATED_KEYS)) {

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            while (res.next()) {
                int idcliente = res.getInt("idCliente");
                int idcuenta = res.getInt("idCuenta");
                int numerocuenta = res.getInt("numeroCuenta");
                String fechaApertura = res.getString("fechaApertura");
                float saldo = res.getFloat("saldo");
                String estado = res.getString("estado");
                Cuenta c = new Cuenta(idcuenta, numerocuenta, idcliente, fechaApertura, saldo, estado);
                lista.add(c);
            }

            LOG.log(Level.INFO, "Se consultaron {0}", lista.size());

            return lista;
        } catch (SQLException e) {
            LOG.log(Level.SEVERE, sentenciaSQL, e);
            throw new PersistenciaException("No se pudieron las cuentas");
        }
    }

    @Override
    public Cuenta consultarCuentaIdCliente(int id) throws PersistenciaException {
        String sentencia = "SELECT * FROM CUENTA WHERE idCliente= ?";

        try (Connection conexion = this.conexionBD.crearConexion()) {
            PreparedStatement comandoSQL = conexion.prepareCall(sentencia);

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            res.next();
            int idcliente = res.getInt("idCliente");
            int idcuenta = res.getInt("idCuenta");
            int numerocuenta = res.getInt("numeroCuenta");
            String fechaApertura = res.getString("fechaApertura");
            float saldo = res.getFloat("saldo");
            String estado = res.getString("estado");
            Cuenta c = new Cuenta(idcuenta, numerocuenta, idcliente, fechaApertura, saldo, estado);

            return c;
        } catch (Exception e) {
            LOG.log(Level.SEVERE, sentencia, e);
            throw new PersistenciaException("No se pudo encontrar la cuenta");

        }
    }

    @Override
    public Cuenta consultarCuentaIdCuenta(int id) throws PersistenciaException {
        String sentencia = "SELECT * FROM CUENTAS WHERE idcuenta= ?;";

        try (Connection conexion = this.conexionBD.crearConexion()) {
            PreparedStatement comandoSQL = conexion.prepareCall(sentencia);

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            res.next();
            int idcliente = res.getInt("idcliente");
            int idcuenta = res.getInt("idcuenta");
            int numerocuenta = res.getInt("numeroCuenta");
            String fechaApertura = res.getString("fechaApertura");
            float saldo = res.getFloat("saldo");
            String estado = res.getString("estado");
            Cuenta c = new Cuenta(idcuenta, numerocuenta, idcliente, fechaApertura, saldo, estado);

            return c;
        } catch (Exception e) {
            LOG.log(Level.SEVERE, sentencia, e);
            throw new PersistenciaException("No se pudo encontrar la cuenta");

        }
    }

    @Override
    public Cuenta consultarCuentaNumCuenta(int id) throws PersistenciaException {
        String sentencia = "SELECT * FROM CUENTA WHERE numeroCuenta= ?;";

        try (Connection conexion = this.conexionBD.crearConexion()) {
            PreparedStatement comandoSQL = conexion.prepareCall(sentencia);

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            res.next();
            int idcliente = res.getInt("idCliente");
            int idcuenta = res.getInt("idCuenta");
            int numerocuenta = res.getInt("numeroCuenta");
            String fechaApertura = res.getString("fechaApertura");
            float saldo = res.getFloat("saldo");
            String estado = res.getString("estado");
            Cuenta c = new Cuenta(idcuenta, numerocuenta, idcliente, fechaApertura, saldo, estado);

            return c;
        } catch (Exception e) {
            LOG.log(Level.SEVERE, sentencia, e);
            throw new PersistenciaException("No se pudo encontrar la cuenta");

        }
    }

    @Override
    public int consultarNumCuentaIdCuenta(int id) throws PersistenciaException {
        String sentencia = "SELECT * FROM CUENTA WHERE idCuenta= ?;";

        try (Connection conexion = this.conexionBD.crearConexion()) {
            PreparedStatement comandoSQL = conexion.prepareCall(sentencia);

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            res.next();
            return res.getInt("numeroCuenta");
        } catch (Exception e) {
            LOG.log(Level.SEVERE, sentencia, e);
            throw new PersistenciaException("No se pudo encontrar la cuenta");

        }
    }

    @Override
    public int consultarClienteIdCuenta(int id) throws PersistenciaException {
        String sentencia = "SELECT * FROM CLIENTE WHERE idCliente= ?;";

        try (Connection conexion = this.conexionBD.crearConexion()) {
            PreparedStatement comandoSQL = conexion.prepareCall(sentencia);

            comandoSQL.setInt(1, id);

            ResultSet res = comandoSQL.executeQuery();
            res.next();
            return res.getInt("idcliente");
        } catch (Exception e) {
            LOG.log(Level.SEVERE, sentencia, e);
            throw new PersistenciaException("No se pudo encontrar la cuenta");

        }
    }

}
