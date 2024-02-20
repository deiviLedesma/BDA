/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import ClasesDTO.ClienteDTO;
import ClasesDTO.TransferenciaDTO;
import ClasesPOJO.Cuenta;
import ClasesPOJO.Retiro;
import ClasesPOJO.Transferencia;
import DAO.ClienteDAO;
import DAO.CuentaDAO;
import DAO.RetiroDAO;
import DAO.TransferenciaDAO;
import Excepciones.ControlException;
import Persistencia.PersistenciaException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;
import java.util.List;
import java.util.Random;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author SDavidLedesma
 */
public class Control implements IControl {

    
    @Override
    public int comprobarSesion(ClienteDTO cliente) throws ControlException {
        int idCuenta = -1;
        try {
            ClienteDAO c = new ClienteDAO();
            idCuenta = c.SesionCliente(cliente);
            return idCuenta;
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontro la cuenta");
        }
    }

    public List<Cuenta> consultarCuentasCliente(int id) throws ControlException {
        try {
            CuentaDAO c = new CuentaDAO();
            return c.consultarCuentasCliente(id);
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontraron cuentas");
        }
    }

    public void transferir(TransferenciaDTO transferencia) throws ControlException {
        if (transferencia.getMonto() <= 0 || transferencia.getIdCuentaEnvia() == 0 || transferencia.getIdCuentaRecibe() == 0) {
            throw new ControlException("Datos incompletos");
        } else {
            try {

                TransferenciaDAO t = new TransferenciaDAO();
                CuentaDAO c = new CuentaDAO();
                Transferencia transferenciaNueva = new Transferencia(
                        transferencia.getIdCuentaEnvia(),
                        transferencia.getIdCuentaRecibe(),
                        c.consultarNumCuentaIdCuenta(transferencia.getIdCuentaEnvia()),
                        c.consultarNumCuentaIdCuenta(transferencia.getIdCuentaRecibe()),
                        transferencia.getMonto());
                t.agregarTransferencia(transferenciaNueva);
            } catch (PersistenciaException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public int numCuenta(int id) throws ControlException {
        int numEnvia = -1;
        try {
            CuentaDAO c = new CuentaDAO();
            numEnvia = c.consultarCuentaIdCuenta(id).getNumCuenta();
            return numEnvia;
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontro la cuenta");
        }
    }

    @Override
    public int idCuenta(int id) throws ControlException {
        int idCuenta = -1;
        try {
            CuentaDAO c = new CuentaDAO();
            idCuenta = c.consultarCuentaNumCuenta(id).getIdCuenta();
            return idCuenta;
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontro la cuenta");
        }
    }

    @Override
    public int idCliente(int id) throws ControlException {
        int idCliente = -1;
        try {
            CuentaDAO c = new CuentaDAO();
            idCliente = c.consultarClienteIdCuenta(id);
            return idCliente;
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontro la cuenta");
        }
    }

    public List<Transferencia> consultarTransferencias(int id) throws ControlException {
        try {
            TransferenciaDAO t = new TransferenciaDAO();
            return t.consultarTransferencias(id);
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontraron cuentas");
        }
    }

    public List<Transferencia> consultarTransferenciasPorPeriodo(String desde, String hasta) throws ControlException {
        try {
            TransferenciaDAO t = new TransferenciaDAO();
            return t.consultarTransferenciasPeriodo(desde, hasta);
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontraron cuentas");
        }
    }

    public List<Retiro> consultarRetirosCliente(int id) throws ControlException {
        try {
            RetiroDAO r = new RetiroDAO();
            return r.consultarRetirosCliente(id);
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontraron cuentas");
        }
    }

    public List<Retiro> consultarRetirosPorPeriodo(String desde, String hasta) throws ControlException {
        try {
            RetiroDAO r = new RetiroDAO();
            return r.consultarRetirosPorPeriodo(desde, hasta);
        } catch (PersistenciaException e) {
            throw new ControlException("No se encontraron cuentas");
        }
    }

    public void generarRetiro(int id, float monto) throws ControlException {
        if (monto <= 0) {
            throw new ControlException("Monto inválido");
        } else {
            try {

                RetiroDAO r = new RetiroDAO();
                Retiro retiro = new Retiro(this.generarFolio(), id, monto, generarContrasenia());
                r.agregarRetiro(retiro);
            } catch (PersistenciaException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    public void cobrarRetiro(int id, String contra) throws ControlException {
        try {
            RetiroDAO r = new RetiroDAO();
            r.cobrarRetiro(id, contra);
        } catch (PersistenciaException e) {
            System.out.println(e.getMessage());
        }

    }

    public String generarContrasenia() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        StringBuilder contrasenia = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int indice = random.nextInt(caracteres.length());
            contrasenia.append(caracteres.charAt(indice));
        }
        return contrasenia.toString();
    }

    public int generarFolio() {
        Random random = new Random();
        return 1000 + random.nextInt(9000);
    }

    public static String cipher(String contrasenia) {
        byte[] salt = new byte[16];
        new Random().nextBytes(salt);

        PBEKeySpec spec = new PBEKeySpec(contrasenia.toCharArray(), salt, 2048, 512);

        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            byte[] encrypted = skf.generateSecret(spec).getEncoded();
            String pass64 = Base64.getEncoder().encodeToString(encrypted);
            String salt64 = Base64.getEncoder().encodeToString(salt);
            return salt64.concat("$".concat(pass64));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            System.err.println("Error al encriptar contrasenia");
            return null;
        } finally {
            spec.clearPassword();
        }
    }

    public static boolean compare(String pass, String userPass) {
        String[] splitPass = userPass.split("\\$");
        byte[] salt = Base64.getDecoder().decode(splitPass[0]);

        PBEKeySpec spec = new PBEKeySpec(pass.toCharArray(), salt, 2048, 512);

        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
            byte[] encrypted = skf.generateSecret(spec).getEncoded();
            String pass64 = Base64.getEncoder().encodeToString(encrypted);

            if (pass64.equals(splitPass[1])) {
                return true;
            }
            return false;
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            System.err.println("Error al encriptar la contraseña");
            return false;
        } finally {
            spec.clearPassword();
        }

    }

  
   

}
