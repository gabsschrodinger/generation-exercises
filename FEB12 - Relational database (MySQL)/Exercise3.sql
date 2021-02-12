CREATE DATABASE db_school;

USE db_school;

CREATE TABLE tb_students (
	id BIGINT(6) AUTO_INCREMENT,
    student_name VARCHAR(100) NOT NULL,
    age INT(3) NOT NULL,
    grades FLOAT(3, 1) NOT NULL,
    course VARCHAR(100) NOT NULL,
    gender ENUM("female", "male") NOT NULL,
    
    PRIMARY KEY (id)
);

INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Simone de Beauvoir", 21, 9.5, "Literature", "female");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Aristotle", 18, 8.9, "Philosophy", "male");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("René Descartes", 25, 10, "Mathematics", "male");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Alan Turing", 20, 9.0, "Computer Science", "male");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Marie Curie", 22, 9.8, "Chemistry", "female");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Isaac Newton", 30, 7.0, "Physics", "male");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Clarice Lispector", 23, 10, "Literature", "female");
INSERT INTO db_school.tb_students(student_name, age, grades, course, gender) VALUES ("Immanuel Kant", 19, 7.8, "Philosophy", "male");

SELECT * FROM db_school.tb_students WHERE grades > 7;

SELECT * FROM db_school.tb_students WHERE grades > 7;

UPDATE tb_students
SET student_name = "Ada Lovelace", age = 27, grades = 8.5, course = "Computer Science", gender = "female"
WHERE id = 2;