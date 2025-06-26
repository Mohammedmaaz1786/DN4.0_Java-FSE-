DELIMITER $$

CREATE PROCEDURE ApplySeniorCitizenDiscount()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE cID INT;
    DECLARE affected_rows INT DEFAULT 0;

    DECLARE cur CURSOR FOR 
        SELECT CustomerID FROM customers WHERE Age > 60;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO cID;
        IF done THEN
            LEAVE read_loop;
        END IF;

        UPDATE loans
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = cID;

        SET affected_rows = affected_rows + ROW_COUNT();
    END LOOP;

    CLOSE cur;

    SELECT CONCAT('Total updated rows: ', affected_rows) AS Result;
END$$

DELIMITER ;

CALL ApplySeniorCitizenDiscount();
