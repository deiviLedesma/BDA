/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import controlador.TransferenciaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 *
 * @author SDavidLedesma
 */
public class TransferenciaDAO {

    private Connection conexion;

    public TransferenciaDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public TransferenciaDAO() {

    }

    /* public boolean realizarTransferencia(TransferenciaDTO transferenciaDTO) {
        try {
            // Iniciar una transacción
            conexion.setAutoCommit(false);

            // Verificar que las cuentas existan y tengan suficiente saldo
            if (verificarSaldoSuficiente(transferenciaDTO.getIdCuentaRecibe(), transferenciaDTO.getMonto())) {

                // Actualizar saldo en la cuenta de origen
                actualizarSaldo(transferenciaDTO.getIdCuentaEnvia() -transferenciaDTO.getMonto());

                // Actualizar saldo en la cuenta de destino
                actualizarSaldo(transferenciaDTO.getIdCuentaRecibe(), transferenciaDTO.getMonto());

                // Registrar la transacción en la base de datos
                registrarTransfenrecia(transferenciaDTO);

                // Confirmar la transacción
                conexion.commit();

                return true; // Éxito
            } else {
                // Rollback si no hay saldo suficiente
                conexion.rollback();
                return false; // Saldo insuficiente
            }
        } catch (SQLException e) {
            // Manejar excepciones SQL, realizar rollback y log de errores
            try {
                conexion.rollback();
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
            e.printStackTrace();
            return false; // Error durante la transacción
        } finally {
            // Restaurar el modo de autocommit después de la transacción
            try {
                conexion.setAutoCommit(true);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean verificarSaldoSuficiente(String numeroCuenta, double monto) throws SQLException {

        String consultaSaldo = "SELECT saldo FROM cuentas WHERE numero_cuenta = ?";

        try (PreparedStatement statement = conexion.prepareStatement(consultaSaldo)) {
            statement.setString(1, numeroCuenta);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    double saldoActual = resultSet.getDouble("saldo");
                    return saldoActual >= monto;
                }
            }
        }

        return false; // En caso de error o si no se encuentra la cuenta
    }

    public boolean actualizarSaldo(String numeroCuenta, double monto) throws SQLException {
        // SQL para actualizar el saldo en la base de datos
        String sql = "UPDATE CUENTA SET saldo = saldo + ? WHERE idCuenta = ?";

        try (PreparedStatement pst = conexion.prepareStatement(sql)) {
            //Establece los parámetros en la consulta preparada
            pst.setDouble(1, monto);
            pst.setString(2, numeroCuenta);

            // Ejecuta la actualizacion
            pst.executeUpdate();
        }
        return false; // En caso de error

    }

    private void registrarTransfenrecia(TransferenciaDTO transferenciaDTO) throws SQLException {

        String sql = "INSERT INTO TRANSFERENCIA (idCuentaEnvia, idCuentaRecibe, Monto, FechaTransferencia) VALUES (?, ?, ?, ?)";

        try (PreparedStatement stm = conexion.prepareStatement(sql)) {
            stm.setString(1, transferenciaDTO.getCuentaOrigen());
            stm.setString(2, transferenciaDTO.getCuentaDestino());
            stm.setDouble(3, transferenciaDTO.getMonto());
            stm.setTimestamp(4, new Timestamp(System.currentTimeMillis()));

            stm.executeUpdate();
        }
    }
     */
}
