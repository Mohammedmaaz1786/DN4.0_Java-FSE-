DELIMITER $$

DROP PROCEDURE IF EXISTS UpdateEmployeeBonus$$

CREATE PROCEDURE UpdateEmployeeBonus(
    IN deptName VARCHAR(50),
    IN bonusPercent DECIMAL(5,2)
)
BEGIN
    UPDATE Employees
    SET Salary = Salary + (Salary * (bonusPercent / 100))
    WHERE Department = deptName;
END$$

DELIMITER ;


CALL UpdateEmployeeBonus('IT', 10);
