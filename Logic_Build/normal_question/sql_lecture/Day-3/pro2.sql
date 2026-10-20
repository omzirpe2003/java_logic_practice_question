CREATE TABLE departments (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(50),
    city VARCHAR(50)
);

DROP TABLE IF EXISTS employees;
CREATE TABLE employees (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id)
        REFERENCES departments(department_id)
);

INSERT INTO departments
    (department_id, department_name, city)
VALUES
    (1, 'Engineering', 'Bangalore'),
    (2, 'HR', 'Pune'),
    (3, 'Sales', 'Mumbai'),
    (4, 'Marketing', 'Delhi'),
    (5, 'Finance', 'Hyderabad'),
    (6, 'Support', 'Chennai');


INSERT INTO employees
    (emp_id, emp_name, salary, department_id)
VALUES
    (101, 'Amit', 80000, 1),
    (102, 'Sneha', 90000, 1),
    (103, 'Rahul', 60000, 2),
    (104, 'Priya', 70000, 2),
    (105, 'Karan', 75000, 3),
    (106, 'Neha', 85000, 3),
    (107, 'Rohit', 55000, NULL),
    (108, 'Anjali', 95000, 1);



-- INNER JOIN

-- Display each employee's name and their department name.
    
    SELECT emp_name, department_name 
    FROM employees
    JOIN departments
    ON employees.department_id = departments.department_id;


-- Display employee names, salaries, and department cities.
    SELECT emp_name, salary, department_name
    FROM employees 
    JOIN departments
    ON  employees.department_id=departments.department_id;

-- Display all employees who work in the Engineering department.
    SELECT emp_name FROM employees
    INNER JOIN departments
    ON employees.department_id = departments.department_id
    WHERE departments.department_name='Engineering';

-- Display employees who work in departments located in Pune.
    SELECT emp_name , department_name FROM employees
    INNER JOIN departments
    ON employees.department_id=departments.department_id
    WHERE departments.city= 'Pune';

-- Display employee names, department names, and salaries in descending order of salary.
    SELECT emp_name, department_name, salary FROM employees
    INNER JOIN departments
    ON employees.department_id=departments.department_id
    ORDER BY salary DESC;

-- Display employees earning more than ₹75,000 along with their department names.
    SELECT emp_name, salary, department_name from employees
    INNER JOIN departments
    ON employees.department_id=departments.department_id
    WHERE salary > 75000;

-- Count the number of employees in each department that has employees.
    SELECT COUNT(*), department_name FROM employees
    INNER JOIN departments
    ON employees.department_id=departments.department_id
    GROUP BY departments.department_name;

-- Find the average salary of each department and sort the results from highest to lowest average salary.
    SELECT ROUND(AVG(salary),2) ,department_name FROM employees
    INNER JOIN departments
    ON employees.department_id=departments.department_id
    GROUP BY departments.department_name
    ORDER BY AVG(salary) DESC;


-- LEFT JOIN


-- Display all employees and their department names, including employees who are not assigned to any department.
    SELECT emp_name , department_name FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id;

-- Find employees who are not assigned to any department.
    SELECT emp_name , department_name FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id
    WHERE department_name IS NULL;

-- Display all employees with their department cities, including employees without a matching department.
    SELECT emp_name , department_name FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id;

-- Display all employee names and department names, sorted alphabetically by employee name.
    SELECT emp_name , department_name FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id
--    WHERE department_name IS NOT NULL
    ORDER BY emp_name ASC;

-- Display every department and its employee count, including departments with zero employees.
    SELECT  COUNT(emp_name), department_name FROM departments
    LEFT JOIN employees
    ON employees.department_id=departments.department_id
    GROUP BY department_name;

-- Display all departments and their employees, including departments that have no employees.
    SELECT department_name , count(emp_name) FROM departments
    LEFT JOIN employees
    ON employees.department_id=departments.department_id
    GROUP BY department_name;


-- Display employees earning more than ₹80,000, including employees who have no department assigned.
    SELECT emp_name , salary ,department_name FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id
    WHERE salary > 80000;

-- Display all employees with their department names. If a department is missing, display Not Assigned.
     SELECT emp_name , salary ,COALESCE(department_name,'Not Assigned') FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id
    


-- RIGHT JOIN

-- Display all departments and their employee names, including departments with no employees.
    SELECT department_name, emp_name FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id

-- Find departments that do not have any employees.
    SELECT department_name, emp_name FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    WHERE emp_name IS NULL;

-- Count employees in every department, including departments with zero employees.
    SELECT COUNT(emp_name), department_name FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    GROUP BY department_name;

-- Display every department's name, city, and employee names, sorted by department name.
    SELECT department_name, emp_name, city FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    ORDER BY department_name;

-- Calculate the total salary for each department, including departments with no employees.
    SELECT department_name, COALESCE(ROUND(SUM(salary),2),0) FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    GROUP BY department_name;

-- Display all departments located in Delhi or Hyderabad, including departments without employees.
    SELECT department_name, emp_name, city FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    WHERE city in('Delhi','Hyderabad');


-- Mixed JOIN Challenges


-- Find departments that have at least two employees.
    SELECT department_name ,COUNT(emp_name) FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    GROUP BY department_name
    HAVING COUNT(emp_name) >= 2;

-- Find the highest salary in each department, including departments with no employees.
    SELECT department_name, MAX(salary)  FROM employees
    RIGHT JOIN departments
    ON employees.department_id=departments.department_id
    GROUP BY department_name
    ORDER BY MAX(salary) DESC;
    
    

-- Display all employees with their department names and cities. If department details are missing, display Not Assigned for the department and Unknown for the city.
    SELECT emp_name, COALESCE(department_name,'Not Assigned for the department'), COALESCE(city, 'Unknown') FROM employees
    LEFT JOIN departments
    ON employees.department_id=departments.department_id;




-- Additional Practice

-- Display employees who work in the same city as their department.

-- Find the department with the highest number of employees.

-- Find the department with the highest total salary.

-- Display departments whose average employee salary is greater than ₹75,000.

-- Display all employees and departments, then sort employees by department name and salary in descending order.

