DELIMITER //

CREATE TRIGGER tr_audit_transferencia
AFTER INSERT ON TRANSFERENCIA
FOR EACH ROW
BEGIN
    INSERT INTO AUDITORIA_TRANSFERENCIA (IdCuentaRecibe, IdCuentaEnvia, Monto, Fecha)
    VALUES (NEW.IdCuentaRecibe, NEW.IdCuentaEnvia, NEW.Monto, NEW.FechaTransferencia);
END;

//

DELIMITER ;

DELIMITER //
CREATE PROCEDURE realizar_transferencia(IN p_cuenta_envia INT, IN p_cuenta_recibe INT, IN p_monto DECIMAL(10,2))
BEGIN
    DECLARE saldo_envia DECIMAL(10,2);
    DECLARE saldo_recibe DECIMAL(10,2);

    -- Obtener saldos actuales
    SELECT Saldo INTO saldo_envia FROM CUENTA WHERE idCuenta = p_cuenta_envia;
    SELECT Saldo INTO saldo_recibe FROM CUENTA WHERE idCuenta = p_cuenta_recibe;

    -- Verificar saldo suficiente
    IF saldo_envia >= p_monto THEN
        -- Actualizar saldos
        UPDATE CUENTA SET Saldo = saldo_envia - p_monto WHERE idCuenta = p_cuenta_envia;
        UPDATE CUENTA SET Saldo = saldo_recibe + p_monto WHERE idCuenta = p_cuenta_recibe;

        -- Registrar la transferencia
        INSERT INTO TRANSFERENCIA (FechaTransferencia, Monto, IdCuentaRecibe, IdCuentaEnvia)
        VALUES (CURDATE(), p_monto, p_cuenta_recibe, p_cuenta_envia);

        -- Commit de la transacción
        COMMIT;
    ELSE
        -- Rollback si el saldo es insuficiente
        ROLLBACK;
    END IF;
END;
//
DELIMITER ;

START TRANSACTION;
CALL realizar_transferencia(1, 2, 100.00); -- Ejemplo de llamada al stored procedure
COMMIT;

