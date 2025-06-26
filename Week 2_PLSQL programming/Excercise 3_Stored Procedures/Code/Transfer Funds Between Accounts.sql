DELIMITER $$

DROP PROCEDURE IF EXISTS TransferFunds$$

CREATE PROCEDURE TransferFunds(
    IN fromAccount INT,
    IN toAccount INT,
    IN amount DECIMAL(10,2)
)
BEGIN
    DECLARE fromBalance DECIMAL(10,2);

    -- Get balance of source
    SELECT Balance INTO fromBalance
    FROM Accounts
    WHERE AccountID = fromAccount;

    -- Check if enough funds
    IF fromBalance >= amount THEN
        -- Deduct from source
        UPDATE Accounts
        SET Balance = Balance - amount
        WHERE AccountID = fromAccount;

        -- Add to destination
        UPDATE Accounts
        SET Balance = Balance + amount
        WHERE AccountID = toAccount;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Insufficient balance for transfer';
    END IF;
END$$

DELIMITER ;

-- Transfer ₹4000 from Acc 1 to Acc 2
CALL TransferFunds(1, 2, 4000);
