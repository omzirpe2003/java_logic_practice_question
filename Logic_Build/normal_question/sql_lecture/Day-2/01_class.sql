 


-- JOIN  :- Wen Digream  
-- LEFT JOIN 
-- RIGHT JOIN 
-- INNER JOIN   :- Command Part(DATA) of 2 Table
-- FULL OUTER JOIN


CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    branch VARCHAR(50)
);



-- CASCADE :- altomatic delete has ref/id in another table 
-- SET NULL :- Automatic null where has ref
-- SET RESTRICT :- He can not delete the data

CREATE TABLE internships (
    internships_id SERIAL PRIMARY KEY,
    company_name VARCHAR(100),
    role VARCHAR(50),
    stipend INT,
    status VARCHAR(20) CHECK(
        status IN( 'Selected', 'Pending', 'Rejected')
    ),
    student_id INT REFERENCES students(student_id) ON DELETE SET NULL
    
);


INSERT INTO students (name, email, branch) VALUES 
('Rahul', 'rahul@gmail.com', 'Computer Science'),
('Sneha', 'sneha@yahoo.com', 'Information Tech'),
('Amit', 'amit@hotmail.com', 'Electronics'),
('Priya', 'priya@gmail.com', 'Mechanical'), -- Priya is focusing on higher studies, no internships.
('Rohan', 'rohan@outlook.com', 'Civil'); -- Rohan is working on a startup, no internships.

-- Inserting Internships
INSERT INTO internships (student_id, company_name, role, stipend, status) VALUES 
(1, 'Google', 'Software Engineering Intern', 100000, 'Selected'), -- Rahul got selected!
(1, 'Microsoft', 'SDE Intern', 85000, 'Selected'), -- Rahul is killing it
(2, 'Amazon', 'Data Analyst Intern', 60000, 'Pending'), -- Sneha is waiting
(3, 'TCS', 'System Engineer Intern', 20000, 'Selected'), -- Amit got an offer
(5, 'OpenAI', 'AI Researcher', 150000, 'Selected'); -- Student ID 99 does not exist (Orphan Record) -> Would be BLOCKED by Foreign Key Constraint


SELECT * FROM internships;
