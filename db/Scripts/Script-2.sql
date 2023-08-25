--DROP SEQUENCE student_idx_seq;
CREATE SEQUENCE student_idx_seq; 

--DROP TABLE student;

CREATE TABLE student(
	idx NUMBER PRIMARY KEY,
	first_name varchar2(100) NOT NULL,
	last_name varchar2(100) NOT NULL,
	section varchar2(100) NOT NULL
);

SELECT * FROM student; 
