-- 06_loop_exit_when.sql
-- LOOP with EXIT WHEN to print even numbers from 2 to 10

SET SERVEROUTPUT ON;

DECLARE
   num NUMBER := 2;
BEGIN
   LOOP
      EXIT WHEN num > 10;
      DBMS_OUTPUT.PUT_LINE('Even Number: ' || num);
      num := num + 2;
   END LOOP;
END;
/