-- CREATE accounts TABLE AND SAMPLE DATA
CREATE TABLE accounts (
    acc_no     NUMBER PRIMARY KEY,
    cust_id    NUMBER,
    balance    NUMBER(12, 2)
);

INSERT INTO accounts VALUES (201, 1, 10000);
INSERT INTO accounts VALUES (202, 2, 15000);

COMMIT;

-- PROCEDURE: TransferFunds
CREATE OR REPLACE PROCEDURE TransferFunds(
  source_acc IN NUMBER,
  target_acc IN NUMBER,
  amount     IN NUMBER
) IS
  source_balance NUMBER;
BEGIN
  SELECT balance INTO source_balance FROM accounts WHERE acc_no = source_acc;

  IF source_balance < amount THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient balance.');
  ELSE
    UPDATE accounts
    SET balance = balance - amount
    WHERE acc_no = source_acc;

    UPDATE accounts
    SET balance = balance + amount
    WHERE acc_no = target_acc;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || amount || ' from ' || source_acc || ' to ' || target_acc);
  END IF;
END;
/

-- CALL PROCEDURE
BEGIN
  TransferFunds(201, 202, 2000);
END;
/

-- VERIFY
SELECT * FROM accounts;
