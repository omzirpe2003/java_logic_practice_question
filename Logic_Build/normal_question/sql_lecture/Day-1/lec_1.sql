
-- SERIAL ::- AUTOINCREMENT INTEGER
-- PRIMARY KEY ::- Unique AND not-null
-- VARCHAR( (NUMBER)-BYTES ) ::- To Store string {max value is 1MB} 
-- CHECK() ::- Validation on Column 


-- CREATE TABLE "Students" (
--     student_id SERIAL PRIMARY KEY,
    
--     first_name VARCHAR(50) NOT NULL,   -- My First name should have 50 letters
--     last_name VARCHAR(50),     -- (50*8 bits) -> My Last name should have 50 letters
    
--     email VARCHAR(322) UNIQUE NOT NULL,
--     phone_number VARCHAR(10) UNIQUE NOT NULL,    -- 4000 vs 10 bytes
--     country_code VARCHAR(4),

--     age INT CHECK ( age>12 ),
--     current_status VARCHAR(20)  DEFAULT 'active' CHECK (current_status IN ('active','dropped_out','graduated')),
    
--     masterji_handel VARCHAR(50) UNIQUE,    --username
--     has_join_masterji BOOLEAN DEFAULT FALSE,

--     current_score INT DEFAULT 0 CHECK(current_score>=0  AND current_score <=100),
--     enrollment_date DATE DEFAULT CURRENT_DATE       -- 2026-04-30 FORMAT

-- );


-- ALTER -> ADD or REMOVE
-- COLUM addling


ALTER TABLE  "Students"
ADD COLUMN batch_name VARCHAR(50) DEFAULT 'Web Deb 2026'

-- DDL :- Data Defination Language {create, alter}


