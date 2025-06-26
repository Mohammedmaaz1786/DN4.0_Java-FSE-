DELIMITER $$

DROP PROCEDURE IF EXISTS ProcessMonthlyInterest$$

CREATE PROCEDURE ProcessMonthlyInterest()
BEGIN
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01);
END$$

DELIMITER ;

CALL ProcessMonthlyInterest();
