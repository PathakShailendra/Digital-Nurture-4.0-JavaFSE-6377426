-- 02_nested_if.sql
-- Nested IF to assign grades based on marks

SET SERVEROUTPUT ON;

DECLARE
   marks NUMBER := 78;
BEGIN
   IF marks >= 90 THEN
      DBMS_OUTPUT.PUT_LINE('Grade: A+');
   ELSIF marks >= 75 THEN
      DBMS_OUTPUT.PUT_LINE('Grade: A');
   ELSIF marks >= 60 THEN
      DBMS_OUTPUT.PUT_LINE('Grade: B');
   ELSE
      DBMS_OUTPUT.PUT_LINE('Grade: C');
   END IF;
END;
/