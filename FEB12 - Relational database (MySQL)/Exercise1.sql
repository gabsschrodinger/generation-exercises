CREATE DATABASE db_hr;

USE db_hr;

CREATE TABLE tb_employees (
	id BIGINT(6) AUTO_INCREMENT,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    age INT(3) NOT NULL,
    salary FLOAT(7, 2) NOT NULL,
    gender ENUM("female", "male") NOT NULL,
    job VARCHAR(40) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO tb_employees(first_name, last_name, age, salary, gender, job) VALUES ("Alan", "Turing", 49, 25000.00, "male", "Data Scientist");
INSERT INTO tb_employees(first_name, last_name, age, salary, gender, job) VALUES ("Ada", "Lovelace", 44, 25000.00, "female", "Data Scientist");
INSERT INTO tb_employees(first_name, last_name, age, salary, gender, job) VALUES ("Grace", "Hopper", 30, 15000.00, "female", "Machine Learning Engineer");
INSERT INTO tb_employees(first_name, last_name, age, salary, gender, job) VALUES ("Howard", "Aiken", 28, 15000.00, "male", "Machine Learning Engineer");
INSERT INTO tb_employees(first_name, last_name, age, salary, gender, job) VALUES ("Anita", "Borg", 21, 5000.00, "female", "Data Analyst");

SELECT * FROM db_hr.tb_employees WHERE salary > 2000;

SELECT * FROM db_hr.tb_employees WHERE salary < 2000;

UPDATE tb_employees
SET age = 50
WHERE id = 1;