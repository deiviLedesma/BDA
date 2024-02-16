/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import CONEXION.IConexionBD;
import java.util.logging.Logger;

/**
 *
 * @author SDavidLedesma
 */
public class ClienteDAO implements IClienteDAO {

    IConexionBD cbd;
    private static final Logger LOG = Logger.getLogger(ClienteDAO.class.getName());

    public ClienteDAO(IConexionBD cbd) {
        this.cbd = cbd;
    }

    String sentenciaSQL = "INSERT INTO CLIENTE (nombre, apellidoPaterno, apellidoMaterno, edad VALUES (?,?,?,?)";

}
