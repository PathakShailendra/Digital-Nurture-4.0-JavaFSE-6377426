-- 04_for_loop.sql
-- FOR loop to print numbers 1 to 5

SET SERVEROUTPUT ON;

BEGIN
   FOR i IN 1..5 LOOP
      DBMS_OUTPUT.PUT_LINE('FOR Loop Value: ' || i);
   END LOOP;
END;
/