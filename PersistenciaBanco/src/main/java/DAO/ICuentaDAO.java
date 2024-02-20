/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import ClasesPOJO.Cuenta;
import Persistencia.PersistenciaException;
import java.util.List;

/**
 *
 * @author SDavidLedesma
 */
public interface ICuentaDAO {

    public List<Cuenta> consultarCuentasCliente(int id) throws PersistenciaException;

    public Cuenta consultarCuentaIdCliente(int id) throws PersistenciaException;

    public Cuenta consultarCuentaIdCuenta(int id) throws PersistenciaException;

    public Cuenta consultarCuentaNumCuenta(int id) throws PersistenciaException;

    public int consultarNumCuentaIdCuenta(int id) throws PersistenciaException;

    public int consultarClienteIdCuenta(int id) throws PersistenciaException;
}
