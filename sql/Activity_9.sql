--Activity_9

--Create the SALESMAN table

CREATE TABLE SALESMAN( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commission int 
);

DESCRIBE  SALESMAN;

INSERT ALL 
    INTO SALESMAN Values (5001, 'James Hoog', 'New York', 15) 
    INTO SALESMAN Values (5002, 'Nail Knite', 'Paris', 13) 
    INTO SALESMAN Values (5005, 'Pit Alex', 'London', 11) 
    INTO SALESMAN Values (5006, 'McLyon', 'Paris', 14) 
    INTO SALESMAN Values (5007, 'Paul Adam', 'Rome', 13)     
    INTO SALESMAN Values (5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;


--Create the ORDERS table
create table orders( 
    order_no int primary key, 
    purchase_amount float, 
    order_date date, 
    customer_id int, 
    salesman_id int)
    ;
    
DESCRIBE ORDERS;

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;


-- Create the customers table
create table customers (
    customer_id int primary key,
    customer_name varchar(32),
    city varchar(20),
    grade int,
    salesman_id int);

DESCRIBE customers;

-- Insert values into it
INSERT ALL
INTO CUSTOMERS VALUES (3002, 'Nick Rimando', 'New York', 100, 5001)
INTO CUSTOMERS VALUES (3007, 'Brad Davis', 'New York', 200, 5001)
INTO CUSTOMERS VALUES (3005, 'Graham Zusi', 'California', 200, 5002)
INTO CUSTOMERS VALUES (3008, 'Julian Green', 'London', 300, 5002)
INTO CUSTOMERS VALUES (3004, 'Fabian Johnson', 'Paris', 300, 5006)
INTO CUSTOMERS VALUES (3009, 'Geoff Cameron', 'Berlin', 100, 5003)
INTO CUSTOMERS VALUES (3003, 'Jozy Altidor', 'Moscow', 200, 5007)
INTO CUSTOMERS VALUES (3001, 'Brad Guzan', 'London', 300, 5005)
SELECT 1 FROM DUAL;



--Write an SQL statement to know which salesman are working for which customer.
SELECT SALESMAN_NAME, CUSTOMER_NAME
FROM SALESMAN INNER JOIN CUSTOMERS
ON SALESMAN.SALESMAN_ID = CUSTOMERS.SALESMAN_ID;

--Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman.

SELECT CUSTOMER_ID, CUSTOMER_NAME FROM CUSTOMERS
INNER JOIN SALESMAN ON SALESMAN.SALESMAN_ID = CUSTOMERS.SALESMAN_ID
WHERE grade < 300
order by CUSTOMER_ID;

--Write an SQL statement to find the list of customers who appointed a salesman for their jobs who gets a commission from the company is more than 12%.
1. SELECT CUSTOMER_NAME FROM CUSTOMERS
WHERE SALESMAN_ID IN (SELECT SALESMAN_ID FROM SALESMAN WHERE commission > 12);

2. SELECT a.customer_name AS "Customer Name", a.city, b.name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id 
WHERE b.commission>12;

--Write an SQL statement to find the details of a order i.e. order number, order date, amount of order, which customer gives the order and which salesman works for that customer and commission rate he gets for an order.

SELECT order_no, purchase_amount, order_date, CUSTOMER_NAME, SALESMAN_NAME, COMMISSION
FROM ORDERS 
INNER JOIN CUSTOMERS ON ORDERS.customer_id = CUSTOMERS.customer_id
INNER JOIN SALESMAN ON ORDERS.SALESMAN_ID = CUSTOMERS.SALESMAN_ID;
