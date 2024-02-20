/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Control;

import ClasesDTO.ClienteDTO;
import ClasesDTO.TransferenciaDTO;
import Excepciones.ControlException;

/**
 *
 * @author SDavidLedesma
 */
public interface IControl {

    public int comprobarSesion(ClienteDTO cliente) throws ControlException;

    public void transferir(TransferenciaDTO transferencia) throws ControlException;

    public int numCuenta(int id) throws ControlException;

    public int idCuenta(int id) throws ControlException;

    public int idCliente(int id) throws ControlException;
}
