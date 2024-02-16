/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONEXION;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author SDavidLedesma
 */
public class Conexion {

    String url = "jdbc:mysql://localhost:3306/banco";
    private static String DRIVER = "com.mysql.jdbc.Driver";
    String usuario = "root";
    String contra = "Inunanash1";

    Connection conexion = null;

    public Conexion() {
    }

// método oara realizar la conexion con la BD regresa ek objeto conexion
    public Connection crearConexion() {
        //
        try {
            //Cargar todos los drives de forma dinamica
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Establecemos la conexion
            conexion = DriverManager.getConnection(url, usuario, contra);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexion fallida:" + e);
        }
        return conexion;
    }

    //metodo para cerrar la conexion
    public void cerrarConexion() throws SQLException {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                JOptionPane.showMessageDialog(null, "Conexion Cerrada");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
