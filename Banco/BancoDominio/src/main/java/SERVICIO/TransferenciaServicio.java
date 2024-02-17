/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SERVICIO;

import DAO.TransferenciaDAO;
import VALIDACIONES.Validaciones;
import com.mycompany.bancodominio.TransferenciaForm;
import controlador.TransferenciaDTO;

/**
 *
 * @author SDavidLedesma
 */
public class TransferenciaServicio {

    /*public boolean realizarTransferencia(TransferenciaForm transferenciaForm) {
        // Validaciones
        if (!Validaciones.validarMonto(transferenciaForm.getMonto())) {
            return false; // Monto no válido
        }

   /*     // Convertir formulario a DTO
        TransferenciaDTO transferenciaDTO = new TransferenciaDTO();
        transferenciaDTO.setCuentaOrigen(transferenciaForm.getCuentaOrigen());
        transferenciaDTO.setCuentaDestino(transferenciaForm.getCuentaDestino());
        transferenciaDTO.setMonto(transferenciaForm.getMonto());

        // Realizar transferencia a través del DAO
        TransferenciaDAO transferenciaDAO = new TransferenciaDAO();
        return transferenciaDAO.realizarTransferencia(transferenciaDTO);
    }*/
}
