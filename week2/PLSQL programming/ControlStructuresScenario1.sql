-- Step 1: Create customer table
CREATE TABLE customer (
    customer_id NUMBER PRIMARY KEY,
    name        VARCHAR2(100),
    dob         DATE -- we'll calculate age using this
);

-- Step 2: Create loans table
CREATE TABLE loans (
    loan_id      NUMBER PRIMARY KEY,
    customer_id  NUMBER,
    interest_rate NUMBER,
    FOREIGN KEY (customer_id) REFERENCES customer(customer_id)
);

-- Step 3: Insert sample customer data
INSERT INTO customer VALUES (1, 'Harsh', TO_DATE('2002-05-15', 'YYYY-MM-DD'));
INSERT INTO customer VALUES (2, 'Ramesh', TO_DATE('1955-03-10', 'YYYY-MM-DD'));
INSERT INTO customer VALUES (3, 'Sita', TO_DATE('1940-07-20', 'YYYY-MM-DD'));
INSERT INTO customer VALUES (4, 'Meena', TO_DATE('1985-11-05', 'YYYY-MM-DD'));

-- Step 4: Insert sample loans data
INSERT INTO loans VALUES (101, 1, 12.5);
INSERT INTO loans VALUES (102, 2, 11.0);
INSERT INTO loans VALUES (103, 3, 13.5);
INSERT INTO loans VALUES (104, 4, 9.0);

-- Step 5: Commit data
COMMIT;

-- Step 6: Now apply discount using a simple FOR loop and JOIN logic
BEGIN
  FOR rec IN (
    SELECT c.customer_id, l.loan_id
    FROM customer c
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

-- Step 7: See final result
SELECT 
  c.name,
  c.customer_id,
  l.loan_id,
  l.interest_rate
FROM customer c
JOIN loans l ON c.customer_id = l.customer_id;