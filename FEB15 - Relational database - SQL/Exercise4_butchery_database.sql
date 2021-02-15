CREATE DATABASE db_meat_town;

USE db_meat_town;

CREATE TABLE tb_category (
	category_id BIGINT(6) AUTO_INCREMENT,
    meat_type VARCHAR(100) NOT NULL,
    animal_part VARCHAR(100) DEFAULT "whole",
    butchery_section INT(3) NOT NULL,
    
    PRIMARY KEY (category_id)
);

CREATE TABLE tb_product (
	product_id BIGINT(6) AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    category_id BIGINT(6),
    product_weight_grams BIGINT(7) NOT NULL,
    product_price FLOAT(7, 2) NOT NULL,
    product_cost FLOAT(7, 2) NOT NULL,
    expiration_date DATE NOT NULL,
    
    PRIMARY KEY (product_id),
    FOREIGN KEY (category_id) REFERENCES tb_category(category_id)
);

INSERT INTO tb_category(meat_type, animal_part, butchery_section)
VALUES
	("beef", "ribs", 4),
    ("chicken", "wings", 2),
    ("fish", "whole", 7),
    ("chicken", "breast", 2),
    ("beef", "whole", 5);
    
INSERT INTO tb_product(product_name, category_id, product_weight_grams, product_price, product_cost, expiration_date)
VALUES
	("chicken wings", 2, 400, 28.00, 25.00, "2021-02-27"),
    ("tilapia fillet", 3, 250, 15.00, 12.00, "2021-02-22"),
    ("chicken fillet", 4, 500, 10.00, 8.00, "2021-02-20"),
    ("salmon fillet", 3, 1800, 120.00, 100.00, "2021-02-19"),
    ("beef ribs", 1, 500, 30.00, 27.00, "2021-02-28"),
    ("codfish fillet", 3, 800, 39.00, 35.00, "2021-02-27"),
    ("beef liver", 5, 300, 13.90, 12.60, "2021-02-22"),
    ("ground beef", 5, 250, 12.00, 10.90, "2021-02-25");
    
SELECT tb_product.product_name, tb_product.product_weight_grams, tb_product.product_price, tb_category.butchery_section
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.product_price > 50;

SELECT tb_product.product_name, tb_product.product_weight_grams, tb_product.product_price, tb_category.butchery_section
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.product_price BETWEEN 3 AND 60;

SELECT tb_product.product_name, tb_product.product_weight_grams, tb_product.product_price, tb_category.butchery_section
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.product_name LIKE "c%";

SELECT tb_product.product_name, tb_product.product_weight_grams, tb_product.product_price, tb_category.butchery_section
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id;

SELECT tb_product.product_name, tb_product.product_weight_grams, tb_product.product_price, tb_category.butchery_section
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.category_id = 3;