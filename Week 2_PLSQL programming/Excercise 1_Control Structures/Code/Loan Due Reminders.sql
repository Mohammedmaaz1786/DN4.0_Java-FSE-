CREATE TABLE LoanReminders (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    ReminderMessage VARCHAR(255)
);

DELIMITER $$

DROP PROCEDURE IF EXISTS SendLoanReminders$$

CREATE PROCEDURE SendLoanReminders()
BEGIN
    DECLARE done INT DEFAULT FALSE;
    DECLARE cName VARCHAR(100);
    DECLARE lID INT;
    DECLARE due DATE;

   
    DECLARE cur CURSOR FOR 
        SELECT c.Name, l.LoanID, l.DueDate
        FROM loans l
        JOIN customers c ON l.CustomerID = c.CustomerID
        WHERE l.DueDate BETWEEN CURDATE() AND CURDATE() + INTERVAL 30 DAY;

    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    OPEN cur;

    read_loop: LOOP
        FETCH cur INTO cName, lID, due;
        IF done THEN
            LEAVE read_loop;
        END IF;

        INSERT INTO LoanReminders (ReminderMessage)
        VALUES (CONCAT('Reminder: ', cName, ', your loan ID ', lID, ' is due on ', due));
    END LOOP;

    CLOSE cur;
END$$

DELIMITER ;


CALL SendLoanReminders();


SELECT * FROM LoanReminders;
