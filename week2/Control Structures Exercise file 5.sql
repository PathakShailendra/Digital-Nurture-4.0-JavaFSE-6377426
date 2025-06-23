-- 05_while_loop.sql
-- WHILE loop to print countdown from 5 to 1

SET SERVEROUTPUT ON;

DECLARE
   counter NUMBER := 5;
BEGIN
   WHILE counter >= 1 LOOP
      DBMS_OUTPUT.PUT_LINE('WHILE Loop Countdown: ' || counter);
      counter := counter - 1;
   END LOOP;
END;
/