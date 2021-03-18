REM   Script: Activity_5
REM   UPDATE

SELECT * FROM salesman;

UPDATE SALESMAN SET GRADE = 200 WHERE salesman_city = 'ROME';

UPDATE SALESMAN SET GRADE = 300 WHERE salesman_name = 'James Hoog';

UPDATE SALESMAN SET salesman_name = 'Pierre' WHERE salesman_id = 5006; 
