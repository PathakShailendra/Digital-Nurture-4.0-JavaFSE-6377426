-- Step 1: Create customer table
CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,
    name          VARCHAR2(100),
    email         VARCHAR2(100)
);

-- Step 2: Create loans table
CREATE TABLE loans (
    loan_id        NUMBER PRIMARY KEY,
    customer_id    NUMBER,
    interest_rate  NUMBER,
    loan_end_date  DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

-- Step 3: Insert customer data
INSERT INTO customers VALUES (1, 'Harsh', 'harsh@email.com');
INSERT INTO customers VALUES (2, 'Ramesh', 'ramesh@email.com');
INSERT INTO customers VALUES (3, 'Sita',  'sita@email.com');

-- Step 4: Insert loan data
-- 2 due soon, 1 not due
INSERT INTO loans VALUES (201, 1, 10.0, TO_DATE('01-JUL-2025', 'DD-MON-YYYY'));
INSERT INTO loans VALUES (202, 2, 11.5, TO_DATE('10-JUL-2025', 'DD-MON-YYYY'));-- due ✅
INSERT INTO loans VALUES (203, 3, 12.0, SYSDATE + 45);  -- not due ❌

-- Step 5: Commit data
COMMIT;

-- Step 6: PL/SQL block using your exact structured logic
DECLARE
  reminder_count NUMBER := 0;
BEGIN
  FOR rec IN (
    SELECT 
      c.name,
      c.customer_id,
      c.email,
      l.loan_id,
      l.loan_end_date
    FROM loans l
    JOIN customers c ON l.customer_id = c.customer_id
    WHERE l.loan_end_date BETWEEN TRUNC(SYSDATE) AND TRUNC(SYSDATE) + 30
  )
  LOOP
    dbms_output.put_line(
      'Reminder sent to: ' || rec.name || 
      ' (' || rec.email || '), Loan ID: ' || rec.loan_id || 
      ', due on ' || TO_CHAR(rec.loan_end_date, 'DD-Mon-YYYY')
    );

    reminder_count := reminder_count + 1;
  END LOOP;

  dbms_output.put_line('--- Total reminders sent: ' || reminder_count || ' ---');
END;
/


-- Optional: SELECT to verify matching loans
SELECT 
  c.name,
  c.email,
  l.loan_id,
  TO_CHAR(l.loan_end_date, 'DD-Mon-YYYY') AS due_date
FROM loans l
JOIN customers c ON l.customer_id = c.customer_id
WHERE l.loan_end_date BETWEEN SYSDATE AND SYSDATE + 30;