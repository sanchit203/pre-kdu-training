CREATE DATABASE IF NOT EXISTS employee;
USE employee;
/*Creating the department and employee table*/
CREATE TABLE IF NOT EXISTS department (
	department_id int,
    department_name varchar(255),
    PRIMARY KEY(department_id)
);
CREATE TABLE IF NOT EXISTS employee (
	employee_id int PRIMARY KEY,
    employee_name VARCHAR(255),
    salary INT,
	department_id INT,
    FOREIGN KEY(department_id) REFERENCES department(department_id)
);

/*Inserting some random elements to department and employee table */
INSERT INTO department(department_id, department_name) VALUES (1, 'Sales'), (2, 'Marketing'), (3, 'Engineering');
INSERT INTO employee(employee_id, employee_name, salary, department_id) VALUES (1, 'ab', 1000000, 3), (2, 'kij', 200000, 2), (3, 'abhg', 1000000, 2), (4, 'ab', 10000, 1), (5, 'gh', 100000, 2), (6, 'xy', 1000000, 3);

/*QUERY 1*/
SELECT e.employee_id, e.employee_name, d.department_name FROM employee AS e LEFT JOIN department AS d ON d.department_id = e.department_id;

/*QUERY 2*/
SELECT * FROM employee ORDER BY salary DESC;

/*QUERY 3*/
SELECT d.department_name, ROUND(AVG(e.salary), 0) AS Average_salary FROM employee AS e LEFT JOIN department AS d ON d.department_id = e.department_id GROUP BY d.department_name;