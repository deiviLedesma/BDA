/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import ClasesPOJO.Transferencia;
import Persistencia.PersistenciaException;

/**
 *
 * @author SDavidLedesma
 */
public interface ITransferenciaDAO {

    public void agregarTransferencia(Transferencia transferencia) throws PersistenciaException;

}
