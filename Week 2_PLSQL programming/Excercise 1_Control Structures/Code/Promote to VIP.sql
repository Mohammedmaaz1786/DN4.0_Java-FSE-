DELIMITER $$

CREATE PROCEDURE PromoteVIPCustomers()
BEGIN
    UPDATE customers
    SET IsVIP = TRUE
    WHERE Balance > 10000;
END$$

DELIMITER ;


CALL PromoteVIPCustomers();
