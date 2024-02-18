/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CONEXION;

import com.mycompany.bancodominio.Cliente;
import java.sql.Connection;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SDavidLedesma
 */
public class PruebaConexion {

    private static final Logger LOG = Logger.getLogger(PruebaConexion.class.getName());

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion con = new Conexion();
        //creamos los datos de acceso a la base de datos
        String cadenaConexion = "jdbc:mysql://localhost/banco";
        String usuario = "root";
        String contra = "Inunanash1";

//        Cliente cliente = new Cliente("David", "Ledesma", "Sanchez");
        try {
            Connection c = con.crearConexion();

            Statement statement = c.createStatement();
            /*
            String codigoSQL = String.format("INSERT INTO CLIENTE (nombre, apellidoPaterno, apellidoMaterno)"
                    + "VALUES ('%s', '%s', '%s')",
                    cliente.getNombre(),
                    cliente.getApellidoP(),
                    cliente.getApellidoM()
            );


            //Ejecutando la consulta
            int cantidad = statement.executeUpdate(codigoSQL);
            if (cantidad > 0) {
                JOptionPane.showMessageDialog(null, "Se ha guardado");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha guardado");
            }
            con.cerrarConexion();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "consulta fallida");
        }
             */

        } catch (Exception e) {

        }

    }
}
