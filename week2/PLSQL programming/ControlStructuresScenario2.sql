CREATE TABLE customers (
    customer_id   NUMBER PRIMARY KEY,
    name          VARCHAR2(100),
    email         VARCHAR2(100),
    dob           DATE,            -- For age calculation (Scenario 1)
    balance       NUMBER(10, 2),   -- For VIP check (Scenario 2)
    isVIP         CHAR(1) DEFAULT 'N' -- 'Y' for VIPs (Scenario 2)
);

CREATE TABLE loans (
    loan_id        NUMBER PRIMARY KEY,
    customer_id    NUMBER,
    interest_rate  NUMBER,
    loan_end_date  DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO customers VALUES (1, 'Harsh',  'harsh@email.com',  TO_DATE('2002-05-15', 'YYYY-MM-DD'),  5000,  'N');
INSERT INTO customers VALUES (2, 'Ramesh', 'ramesh@email.com', TO_DATE('1955-03-10', 'YYYY-MM-DD'), 12000,  'N');
INSERT INTO customers VALUES (3, 'Sita',   'sita@email.com',   TO_DATE('1940-07-20', 'YYYY-MM-DD'), 15000,  'N');
INSERT INTO customers VALUES (4, 'Meena',  'meena@email.com',  TO_DATE('1985-11-05', 'YYYY-MM-DD'),  8000,  'N');


INSERT INTO loans VALUES (201, 1, 10.0, TO_DATE('01-JUL-2025', 'DD-MON-YYYY')); -- due ✅
INSERT INTO loans VALUES (202, 2, 11.5, TO_DATE('10-JUL-2025', 'DD-MON-YYYY')); -- due ✅
INSERT INTO loans VALUES (203, 3, 12.0, SYSDATE + 45);  -- not due ❌
INSERT INTO loans VALUES (204, 4, 13.0, SYSDATE + 5);   -- due ✅


COMMIT;

BEGIN
  FOR rec IN (
    SELECT c.customer_id, l.loan_id
    FROM customers c
    JOIN loans l ON c.customer_id = l.customer_id
    WHERE TRUNC(MONTHS_BETWEEN(SYSDATE, c.dob) / 12) > 60
  )
  LOOP
    UPDATE loans
    SET interest_rate = interest_rate - 1
    WHERE loan_id = rec.loan_id;

    dbms_output.put_line('Discount applied to Customer ID: ' || rec.customer_id);
  END LOOP;

  dbms_output.put_line('--- Discount Applied for All Eligible Customers ---');
END;
/

BEGIN
  FOR rec IN (
    SELECT customer_id, balance 
    FROM customers 
    WHERE balance > 10000
  )
  LOOP
    UPDATE customers
    SET isVIP = 'Y'
    WHERE customer_id = rec.customer_id;

    dbms_output.put_line('Customer ID ' || rec.customer_id || ' promoted to VIP.');
  END LOOP;

  dbms_output.put_line('--- VIP Status Updated Successfully ---');
END;
/

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

SELECT 
  c.name,
  c.customer_id,
  l.loan_id,
  l.interest_rate
FROM customers c
JOIN loans l ON c.customer_id = l.customer_id;

SELECT 
  customer_id,
  name,
  balance,
  isVIP
FROM customers;

SELECT 
  c.name,
  c.email,
  l.loan_id,
  TO_CHAR(l.loan_end_date, 'DD-Mon-YYYY') AS due_date
FROM loans l
JOIN customers c ON l.customer_id = c.customer_id
WHERE l.loan_end_date BETWEEN SYSDATE AND SYSDATE + 30;