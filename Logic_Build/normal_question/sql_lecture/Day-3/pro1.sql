-- Section A: SELECT Basics

-- 1. Show all columns and all rows from the employees table.
-- Expected: 40 row(s)
    SELECT * FROM employees;
    SELECT COUNT(*) FROM employees; 

-- 2. Show only emp_name, department and salary for everyone.
-- Expected: 40 row(s)
    SELECT emp_name, department, salary from employees;

-- 3. List every unique department.
-- Expected: 6 row(s)
    SELECT DISTINCT department from employees;

-- Section B: WHERE, Operators, Patterns
-- 4. Find all employees in the 'Engineering' department.
-- Expected: 12 row(s)
    SELECT * FROM employees WHERE department ='Engineering';

-- 5. Find employees with a salary above 80000.
-- Expected: 15 row(s)
    SELECT * FROM employees WHERE salary > 80000;
    SELECT COUNT(*) FROM employees WHERE salary > 80000;

-- 6. Find Engineering employees who are based in 'Bangalore'.
-- Expected: 2 row(s)
    SELECT * FROM employees WHERE department = 'Engineering' AND city ='Bangalore';

-- 7. Find employees who work in 'Sales' or 'Marketing'.
-- Expected: 13 row(s)
    SELECT * FROM employees WHERE department IN ('Sales','Marketing');


-- 8. Find employees who are NOT based in 'Pune' (use <>).
-- Expected: 31 row(s)
    SELECT * FROM employees where city NOT IN ('Pune');
    SELECT * FROM employees WHERE city <> 'Pune';


-- 9. Find employees based in Pune, Mumbai or Delhi (use IN).
-- Expected: 26 row(s)
    SELECT * FROM employees WHERE city IN ('Pune', 'Mumbai', 'Delhi');
    SELECT COUNT(*) FROM employees WHERE city IN ('Pune', 'Mumbai', 'Delhi');

-- 10. Find employees who are NOT in the HR or Finance departments (use NOT IN).
-- Expected: 31 row(s)
    SELECT * FROM employees WHERE department NOT IN ('HR','Finance');

-- 11. Find employees whose salary is between 50000 and 90000 (inclusive).
-- Expected: 15 row(s)
    SELECT emp_name, salary 
    FROM employees 
    WHERE salary BETWEEN '50000' AND '90000';

-- 12. Find employees whose experience_years is NOT between 2 and 8.
-- Expected: 16 row(s)
    SELECT emp_name 
    FROM employees WHERE experience_years NOT BETWEEN 2 AND 8;

-- 13. Find employees whose name starts with 'S'.
-- Expected: 5 row(s)
    SELECT emp_name FROM employees WHERE emp_name LIKE 'S%';

-- 14. Find employees whose name has 'an' anywhere in it.
-- Expected: 12 row(s)
    SELECT emp_name FROM employees WHERE emp_name LIKE '%an%';

-- 15. Find employees whose name has 'a' as the second letter.
-- Expected: 14 row(s)
    SELECT emp_name FROM employees WHERE emp_name LIKE '_a%';

-- 16. Find all remote employees (is_remote is true).
-- Expected: 10 row(s)
    SELECT emp_name FROM employees WHERE is_remote =TRUE;

-- 17. Find remote employees from either Engineering OR Support (watch the parentheses).
-- Expected: 6 row(s)
    SELECT emp_name , department FROM employees WHERE is_remote=true AND department IN('Engineering','Support')

-- 18. Find employees who joined on or after 2021-01-01.
-- Expected: 18 row(s)
    SELECT *
    FROM employees
    WHERE joining_date >= '2021-01-01';
-- 19. Find Engineering employees with salary above 80000 and performance_rating of 4 or more.
-- Expected: 6 row(s)
    SELECT emp_name from employees 
    WHERE department = 'Engineering' AND salary >80000 AND performance_rating >=4 ;

-- Section C: NULL, ORDER BY, LIMIT and OFFSET
-- 20. Find employees who have no bonus (bonus is NULL).
-- Expected: 9 row(s)
    SELECT * FROM employees WHERE bonus IS NULL;

-- 21. Find employees who have a bonus (not NULL) and work in Mumbai.
-- Expected: 7 row(s)
    SELECT * FROM employees WHERE bonus IS NOT NULL AND city = 'Mumbai';

-- 22. Find employees who have not been reviewed yet (performance_rating is NULL).
-- Expected: 4 row(s)
    SELECT * FROM employees WHERE performance_rating IS NULL;

-- 23. Find the top-level managers (manager_name is NULL).
-- Expected: 6 row(s)
    SELECT * FROM employees WHERE manager_name IS NULL;


-- 24. Show emp_name and salary, highest salary first.
-- Expected: 40 row(s)
    SELECT emp_name, salary FROM employees ORDER BY salary DESC;

-- 25. Sort by department A-Z, then by salary highest first inside each department.
-- Expected: 40 row(s)
    SELECT department, salary FROM employees ORDER BY department ASC, salary DESC;

-- 26. Show the 5 highest-paid employees (name and salary).
-- Expected: 5 row(s)
    SELECT 
    emp_name, salary 
    FROM employees
    ORDER BY salary DESC LIMIT 5;


-- 27. Show the 5 most recent joiners (name and joining_date).
-- Expected: 5 row(s)
    SELECT emp_name, joining_date from employees ORDER BY joining_date DESC LIMIT 5;

-- 28. Pagination: page size 5, show page 3 of employees sorted by salary highest first.
-- Expected: 5 row(s)
    SELECT * FROM employees ORDER BY salary DESC LIMIT 5 OFFSET 10;

    
-- 29. Who is the single highest-paid employee in 'Pune'? (WHERE + ORDER BY + LIMIT)
-- Expected: 1 row(s)
    SELECT emp_name, salary FROM employees WHERE city = 'Pune' ORDER BY salary DESC LIMIT 1;


-- Section D: Calculations and Expressions
-- 30. Show emp_name and annual_salary (monthly salary x 12).
-- Expected: 40 row(s)
    SELECT 
    emp_name,
    salary * 12 as annual_salary 
    FROM employees;

-- 31. Show emp_name, salary and new_salary after a 10% hike, highest new_salary first.
-- Expected: 40 row(s)
    SELECT 
        emp_name,
        salary * 0.10 as hike_amount,
        salary * 1.10 as new_salary
        FROM employees
    ORDER BY new_salary DESC;


-- 32. Show emp_name and total_comp = salary + bonus. What do you see for employees with a NULL bonus, and why?
-- Expected: 40 row(s)
    SELECT 
        emp_name,
        salary+ bonus as total_comp
        FROM employees
        WHERE bonus IS NOT NULL;

-- 33. Find employees whose annual salary is more than 15 lakh (1500000), without using a column alias in WHERE.
-- Expected: 5 row(s)
    SELECT 
    emp_name,
    (salary * 12) as annual_sal 
    FROM employees
    WHERE salary * 12 >1500000;

-- 34. Show emp_name and salary_per_day (salary divided by 30), 2 decimals, highest first.
-- Expected: 40 row(s)
    SELECT 
        emp_name,
        ROUND((salary / 30),2) as salary_per_day
    FROM employees
    ORDER BY salary_per_day DESC;

-- Section E: Aggregates, GROUP BY, HAVING
-- 35. How many employees are there in total?
-- Expected: 1 row(s)
    SELECT COUNT(*) as total_emp from employees;

-- 36. Show COUNT(*) and COUNT(bonus) side by side. Why are they different?
-- Expected: 1 row(s)
    SELECT COUNT(*) as total_emp, COUNT(bonus) as bouns from employees;

-- 37. What is the total monthly payroll (sum of all salaries)?
-- Expected: 1 row(s)
    SELECT SUM(salary) from employees;

-- 38. Show the average, minimum and maximum salary in one query.
-- Expected: 1 row(s)
    SELECT 
        AVG(salary) as avg_sal, 
        MIN(salary) as min_sal, 
        MAX(salary) as max_sal 
    from employees;

-- 39. Show the number of employees per department, highest first.
-- Expected: 6 row(s)
    SELECT COUNT(department),department as total_dep_num FROM employees GROUP BY department ORDER BY total_dep_num DESC;
    SELECT count(*) as total_emp, department FROM employees GROUP BY department ORDER BY total_emp DESC;

-- 40. Show the average salary per department, rounded to 2 decimals, highest first.
-- Expected: 6 row(s)
    SELECT 
        ROUND(AVG(salary),2) as avg_sal,
        department 
        from employees 
        GROUP BY department 
    ORDER BY avg_sal DESC;

-- 41. Show the total payroll per city, highest first.
-- Expected: 5 row(s)
    SELECT 
        SUM(salary) as payroll, 
        city 
        FROM employees
        GROUP BY city
    ORDER BY payroll DESC;


-- 42. Show the headcount for every department + city combination, sorted by department then headcount (high to
-- low).
-- Expected: 26 row(s)
    SELECT 
    COUNT(*) as headcount,department, city 
    FROM employees 
    GROUP BY department,city 
    ORDER BY department ASC, headcount DESC;

-- 43. Show departments that have MORE than 5 employees.
-- Expected: 4 row(s)
    SELECT department, COUNT(*)as count_of_emp from employees GROUP BY department HAVING COUNT(*) > 5;

-- 44. Show departments whose average salary is above 70000.
-- Expected: 3 row(s)
    SELECT 
       ROUND( AVG(salary),2) as avg_sal,
        department 
        from employees
        GROUP BY department
    HAVING AVG(salary) > 70000;

-- 45. Show the average salary per department but only for remote employees.
-- Expected: 3 row(s)
    SELECT 
        ROUND(AVG(salary),2) as avg_sal, 
        department 
        FROM employees
        WHERE is_remote = true
    GROUP BY department;

        

-- 46. Show the highest salary per department, but only departments whose highest salary is above 100000.
-- Expected: 5 row(s)
    SELECT 
    MAX(salary) as max_sal,
    department 
    FROM employees
    GROUP BY department
HAVING MAX(salary) > 100000;

-- 47. Show the average performance_rating per department, only those above 3.5 (NULL ratings are ignored
-- automatically).
-- Expected: 5 row(s)
    SELECT 
    AVG(performance_rating),
    department 
    FROM employees
    GROUP BY department
HAVING AVG(performance_rating) > 3.5;


-- 48. Show how many employees are remote vs on-site (GROUP BY is_remote).
-- Expected: 2 row(s)
    SELECT COUNT(*), is_remote  
    FROM employees
    GROUP BY is_remote;

-- 49. Challenge: Excluding Support, which department has the highest total bonus paid? Return 1 row.
-- Expected: 1 row(s)
    SELECT 
    SUM(bonus)as total_bonus ,department 
    FROM employees
    WHERE department NOT IN ('Support')
    GROUP BY department
    ORDER BY total_bonus  DESC
    LIMIT 1;


-- Section F: INSERT, UPDATE, DELETE (run these in order, they change the data)
-- 50. Insert one new employee: name 'Ishaan Rao', email 'ishaan.rao@company.com', Engineering, 'Software
-- Engineer', Pune, salary 70000, bonus NULL, experience 2, rating NULL, not remote, joining 2024-07-01, manager
-- 'Rohit Mehta'.

-- 51. Insert 3 employees in ONE statement, giving only emp_name, email, department, city and salary. What values
-- do experience_years and is_remote get automatically?

-- 52. Give every Support employee a 10% salary raise.
-- 53. For the employee with emp_id = 1, change designation to 'Senior Software Engineer', salary to 90000 and set

-- is_remote to TRUE (one UPDATE).
-- 54. Give a flat 2000 bonus to every employee who currently has no bonus (bonus IS NULL).

-- 55. Delete all employees whose performance_rating is 1. Preview with SELECT first.
-- Section G: Tables, Constraints and ALTER (DDL)

-- 56. Create a new table called dept_budget with: dept_id (auto-increment primary key), dept_name (text up to 30,
-- unique, not null), budget_lakhs (NUMERIC(8,2), must be greater than 0), head_name (text up to 50, can be
-- NULL), created_on (DATE, defaults to today).

-- 57. Add a new column phone_number CHAR(10) with a UNIQUE constraint to the employees table.

-- 58. Add a CHECK constraint named chk_experience to employees so experience_years can never be negative.

-- 59. Now try to run an UPDATE that sets experience_years = -1 for emp_id 2. What happens and why?

-- 60. Drop the chk_experience constraint again