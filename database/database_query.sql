
CREATE DATABASE employee_management_system;
USE employee_management_system;
CREATE TABLE department(
department_id INT PRIMARY KEY,
department_name VARCHAR(50) UNIQUE NOT NULL
);
CREATE TABLE employee(
employee_id INT PRIMARY KEY auto_increment,
employee_name varchar(100) NOT NULL,
employee_salary DECIMAL(10,2) ,
employee_department_id INT ,
FOREIGN KEY(employee_department_id) REFERENCES department(department_id),
employee_date_of_joining DATE,
employee_email VARCHAR(100) UNIQUE NOT NULL,
employee_phone_number VARCHAR(15), 
employee_designation VARCHAR(100)
);
SELECT * FROM employee;
SELECT * FROM department;
INSERT INTO department
(department_id,department_name)
VALUES
(1,"Engineering"),
(2,"Human Resources"),
(3,"Finance"), 
(4,"Marketing"),
(5,"Operations");

INSERT INTO employee
(employee_id,employee_name,employee_salary,employee_department_id,employee_date_of_joining,employee_email,employee_phone_number,employee_designation)
VALUES
(NULL,"Rahul Sharma",65000.00,1,'2024-06-15',"rahul.sharma@company.com",9876543210,"Software Engineer"),
(NULL,"Priya Singh",72000.00,1,'2023-08-21',"priya.singh@company.com",9876543211,"Senior Software Engineer"),
(NULL,"Amit Verma",55000.00,2,'2025-01-10',"amit.verma@company.com",9876543212,"HR Executive"),
(NULL,"Neha Gupta",68000.00,3,'2024-03-18',"neha.gupta@company.com",9876543213,"Financial Analyst"),
(NULL,"Arjun Mehta",60000.00,4,'2024-11-05',"arjun.mehta@company.com",9876543214,"Marketing Executive"),
(NULL,"Sneha Kapoor",75000.00,1,'2022-07-25',"sneha.kapoor@company.com",9876543215,"Backend Developer"),
(NULL,"Rohan Malhotra",52000.00,5,'2025-02-12',"rohan.malhotra@company.com",9876543216,"Operations Executive"),
(NULL,"Ananya Joshi",58000.00,2,'2023-09-14',"ananya.joshi@company.com",9876543217,"HR Specialist"),
(NULL,"Karan Bhatia",85000.00,1,'2021-05-30',"karan.bhatia@company.com",9876543218,"Technical Lead"),
(NULL,"Simran Kaur",62000.00,4,'2024-12-02',"simran.kaur@company.com",9876543219,"Marketing Manager");n 
