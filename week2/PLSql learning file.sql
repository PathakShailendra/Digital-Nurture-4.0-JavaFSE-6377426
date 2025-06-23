--------------------------------------------------------------------------------
-- PL/SQL Learning File
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
-- 1. PL/SQL Block Structure
--------------------------------------------------------------------------------
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello, this is your first PL/SQL block!');
END;
/

--------------------------------------------------------------------------------
-- 2. Declaring Variables & Assigning Values
--------------------------------------------------------------------------------
DECLARE
   emp_name VARCHAR2(50);
   emp_salary NUMBER := 30000;
BEGIN
   emp_name := 'Harsh';
   DBMS_OUTPUT.PUT_LINE('Employee Name: ' || emp_name);
   DBMS_OUTPUT.PUT_LINE('Salary: ' || emp_salary);
END;
/

--------------------------------------------------------------------------------
-- 3. IF-THEN-ELSE Condition
--------------------------------------------------------------------------------
DECLARE
   marks NUMBER := 85;
BEGIN
   IF marks >= 60 THEN
      DBMS_OUTPUT.PUT_LINE('Result: First Division');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Result: Second Division');
   END IF;
END;
/

--------------------------------------------------------------------------------
-- 4. CASE Statement
--------------------------------------------------------------------------------
DECLARE
   grade CHAR := 'B';
BEGIN
   CASE grade
      WHEN 'A' THEN DBMS_OUTPUT.PUT_LINE('Excellent');
      WHEN 'B' THEN DBMS_OUTPUT.PUT_LINE('Good');
      WHEN 'C' THEN DBMS_OUTPUT.PUT_LINE('Fair');
      ELSE DBMS_OUTPUT.PUT_LINE('Needs Improvement');
   END CASE;
END;
/

--------------------------------------------------------------------------------
-- 5. FOR Loop
--------------------------------------------------------------------------------
BEGIN
   FOR i IN 1..5 LOOP
      DBMS_OUTPUT.PUT_LINE('Count: ' || i);
   END LOOP;
END;
/

--------------------------------------------------------------------------------
-- 6. WHILE Loop
--------------------------------------------------------------------------------
DECLARE
   i NUMBER := 1;
BEGIN
   WHILE i <= 5 LOOP
      DBMS_OUTPUT.PUT_LINE('WHILE Loop Value: ' || i);
      i := i + 1;
   END LOOP;
END;
/

--------------------------------------------------------------------------------
-- 7. Basic Exception Handling (Divide by Zero)
--------------------------------------------------------------------------------
DECLARE
   num NUMBER := 10;
   denom NUMBER := 0;
   result NUMBER;
BEGIN
   result := num / denom;
   DBMS_OUTPUT.PUT_LINE('Result: ' || result);
EXCEPTION
   WHEN ZERO_DIVIDE THEN
      DBMS_OUTPUT.PUT_LINE('Error: Cannot divide by zero');
END;
/

--------------------------------------------------------------------------------
-- 8. User-Defined Exception
--------------------------------------------------------------------------------
DECLARE
   salary NUMBER := -5000;
   ex_negative_salary EXCEPTION;
BEGIN
   IF salary < 0 THEN
      RAISE ex_negative_salary;
   END IF;
   DBMS_OUTPUT.PUT_LINE('Salary is: ' || salary);
EXCEPTION
   WHEN ex_negative_salary THEN
      DBMS_OUTPUT.PUT_LINE('Error: Salary cannot be negative!');
END;
/

--------------------------------------------------------------------------------
-- 9. Cursor Example (Assumes table: employees)
--------------------------------------------------------------------------------
-- Uncomment this section only if you have a table named "employees"
-- CREATE TABLE employees (emp_id NUMBER, emp_name VARCHAR2(50));

DECLARE
   CURSOR emp_cursor IS SELECT emp_name FROM employees;
   name employees.emp_name%TYPE;
BEGIN
   OPEN emp_cursor;
   LOOP
      FETCH emp_cursor INTO name;
      EXIT WHEN emp_cursor%NOTFOUND;
      DBMS_OUTPUT.PUT_LINE('Employee: ' || name);
   END LOOP;
   CLOSE emp_cursor;
END;
/

--------------------------------------------------------------------------------
-- 10. Stored Procedure
--------------------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE greet_user(name IN VARCHAR2) IS
BEGIN
   DBMS_OUTPUT.PUT_LINE('Hello ' || name || ', welcome to PL/SQL!');
END;
/

-- Calling the procedure
BEGIN
   greet_user('Harsh');
END;
/

--------------------------------------------------------------------------------
-- 11. Function Example
--------------------------------------------------------------------------------
CREATE OR REPLACE FUNCTION get_square(n IN NUMBER) RETURN NUMBER IS
BEGIN
   RETURN n * n;
END;
/

-- Using the function
DECLARE
   result NUMBER;
BEGIN
   result := get_square(6);
   DBMS_OUTPUT.PUT_LINE('Square of 6 is: ' || result);
END;
/

--------------------------------------------------------------------------------
-- 12. Package Example
--------------------------------------------------------------------------------
-- Package Specification
CREATE OR REPLACE PACKAGE my_utils IS
   PROCEDURE say_hello;
   FUNCTION double_value(x NUMBER) RETURN NUMBER;
END;
/

-- Package Body
CREATE OR REPLACE PACKAGE BODY my_utils IS
   PROCEDURE say_hello IS
   BEGIN
      DBMS_OUTPUT.PUT_LINE('Hello from Package!');
   END;

   FUNCTION double_value(x NUMBER) RETURN NUMBER IS
   BEGIN
      RETURN x * 2;
   END;
END;
/

-- Using the package
BEGIN
   my_utils.say_hello;
   DBMS_OUTPUT.PUT_LINE('Double of 7 is: ' || my_utils.double_value(7));
END;
/

--------------------------------------------------------------------------------
-- 13. Trigger Example (AFTER INSERT on employees table)
--------------------------------------------------------------------------------
-- CREATE TABLE employees (emp_id NUMBER, emp_name VARCHAR2(50));

CREATE OR REPLACE TRIGGER trg_employee_insert
AFTER INSERT ON employees
FOR EACH ROW
BEGIN
   DBMS_OUTPUT.PUT_LINE('New Employee Added: ' || :NEW.emp_name);
END;
/

-- Example Insert to see the trigger run
INSERT INTO employees (emp_id, emp_name) VALUES (101, 'Harsh');
/

--------------------------------------------------------------------------------
-- End of PL/SQL Learning File
--------------------------------------------------------------------------------