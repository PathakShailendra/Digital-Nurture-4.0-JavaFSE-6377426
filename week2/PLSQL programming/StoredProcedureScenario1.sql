-- CREATE savings_accounts TABLE AND SAMPLE DATA
CREATE TABLE savings_accounts (
    account_id   NUMBER PRIMARY KEY,
    customer_id  NUMBER,
    balance      NUMBER(12, 2)
);

INSERT INTO savings_accounts VALUES (101, 1, 5000);
INSERT INTO savings_accounts VALUES (102, 2, 12000);
INSERT INTO savings_accounts VALUES (103, 3, 8000);

COMMIT;

-- PROCEDURE: ProcessMonthlyInterest
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR rec IN (SELECT account_id, balance FROM savings_accounts) LOOP
    UPDATE savings_accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_id = rec.account_id;

    DBMS_OUTPUT.PUT_LINE('Interest added to account: ' || rec.account_id);
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('--- Monthly Interest Processed ---');
END;
/

-- CALL PROCEDURE
BEGIN
  ProcessMonthlyInterest;
END;
/

-- VERIFY
SELECT * FROM savings_accounts;
