-- CREATE employees TABLE AND SAMPLE DATA
CREATE TABLE employees (
    emp_id       NUMBER PRIMARY KEY,
    name         VARCHAR2(100),
    department   VARCHAR2(50),
    salary       NUMBER(10, 2)
);

INSERT INTO employees VALUES (1, 'Alice',   'HR',      50000);
INSERT INTO employees VALUES (2, 'Bob',     'Finance', 60000);
INSERT INTO employees VALUES (3, 'Charlie', 'HR',      55000);
INSERT INTO employees VALUES (4, 'David',   'IT',      70000);

COMMIT;

-- PROCEDURE: UpdateEmployeeBonus
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  dept_name IN VARCHAR2,
  bonus_pct IN NUMBER
) IS
BEGIN
  FOR rec IN (
    SELECT emp_id, salary FROM employees WHERE department = dept_name
  ) LOOP
    UPDATE employees
    SET salary = salary + (salary * bonus_pct / 100)
    WHERE emp_id = rec.emp_id;

    DBMS_OUTPUT.PUT_LINE('Bonus applied to Employee ID: ' || rec.emp_id);
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('--- Bonus Updated for Department: ' || dept_name || ' ---');
END;
/

-- CALL PROCEDURE
BEGIN
  UpdateEmployeeBonus('HR', 10);
END;
/

-- VERIFY
SELECT * FROM employees;
