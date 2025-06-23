--------------------------------------------------------------------------------
-- Exercise 3: Stored Procedures in PL/SQL
--------------------------------------------------------------------------------

-- Optional: Drop procedure if it exists (helps during repeated testing)
BEGIN
   EXECUTE IMMEDIATE 'DROP PROCEDURE calc_bonus';
EXCEPTION
   WHEN OTHERS THEN
      NULL; -- Ignore if procedure doesn't exist
END;
/

--------------------------------------------------------------------------------
-- Step 1: Creating the Stored Procedure
--------------------------------------------------------------------------------

-- Procedure: calc_bonus
-- Purpose: Accept employee name and base salary, then calculate bonus and total salary
-- Params: 
--   p_emp_name IN VARCHAR2
--   p_base_salary IN NUMBER
--   p_total_salary OUT NUMBER

CREATE OR REPLACE PROCEDURE calc_bonus (
   p_emp_name      IN  VARCHAR2,
   p_base_salary   IN  NUMBER,
   p_total_salary  OUT NUMBER
) AS
   v_bonus NUMBER;
BEGIN
   v_bonus := p_base_salary * 0.2;  -- 20% bonus
   p_total_salary := p_base_salary + v_bonus;

   DBMS_OUTPUT.PUT_LINE('Employee: ' || p_emp_name);
   DBMS_OUTPUT.PUT_LINE('Base Salary: ' || p_base_salary);
   DBMS_OUTPUT.PUT_LINE('Bonus: ' || v_bonus);
   DBMS_OUTPUT.PUT_LINE('Total Salary: ' || p_total_salary);
END;
/

--------------------------------------------------------------------------------
-- Step 2: Calling the Procedure using an Anonymous Block
--------------------------------------------------------------------------------

SET SERVEROUTPUT ON;

DECLARE
   emp_name VARCHAR2(50) := 'Harsh Kumar';
   base_sal NUMBER := 50000;
   final_sal NUMBER;
BEGIN
   -- Call the stored procedure
   calc_bonus(emp_name, base_sal, final_sal);

   -- Output from OUT parameter
   DBMS_OUTPUT.PUT_LINE('Returned Total Salary (from OUT param): ' || final_sal);
END;
/

--------------------------------------------------------------------------------
-- End of Exercise 3: Stored Procedures
--------------------------------------------------------------------------------