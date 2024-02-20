/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import ClasesDTO.ClienteDTO;
import ClasesPOJO.Cliente;
import Persistencia.PersistenciaException;

/**
 *
 * @author SDavidLedesma
 */
public interface IClienteDAO {

    public Cliente agregarCliente(Cliente cliente) throws PersistenciaException;

    public int SesionCliente(ClienteDTO cliente) throws PersistenciaException;
}
