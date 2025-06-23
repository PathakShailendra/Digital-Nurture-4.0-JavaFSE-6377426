-- 01_if_then_else.sql
-- Simple IF-THEN-ELSE to check voting eligibility

SET SERVEROUTPUT ON;

DECLARE
   age NUMBER := 20;
BEGIN
   IF age >= 18 THEN
      DBMS_OUTPUT.PUT_LINE('Eligible for Voting');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Not Eligible for Voting');
   END IF;
END;
/