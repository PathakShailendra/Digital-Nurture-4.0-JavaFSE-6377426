-- 03_case_statement.sql
-- CASE statement to print day of the week

SET SERVEROUTPUT ON;

DECLARE
   day_number NUMBER := 3;
BEGIN
   CASE day_number
      WHEN 1 THEN DBMS_OUTPUT.PUT_LINE('Monday');
      WHEN 2 THEN DBMS_OUTPUT.PUT_LINE('Tuesday');
      WHEN 3 THEN DBMS_OUTPUT.PUT_LINE('Wednesday');
      WHEN 4 THEN DBMS_OUTPUT.PUT_LINE('Thursday');
      WHEN 5 THEN DBMS_OUTPUT.PUT_LINE('Friday');
      WHEN 6 THEN DBMS_OUTPUT.PUT_LINE('Saturday');
      WHEN 7 THEN DBMS_OUTPUT.PUT_LINE('Sunday');
      ELSE DBMS_OUTPUT.PUT_LINE('Invalid Day');
   END CASE;
END;
/