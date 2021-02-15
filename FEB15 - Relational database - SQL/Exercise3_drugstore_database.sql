CREATE DATABASE db_good_drugstore;

USE db_good_drugstore;

CREATE TABLE tb_category (
	category_id BIGINT(6) AUTO_INCREMENT,
    category_name VARCHAR(100) NOT NULL,
    drugstore_section INT(3) NOT NULL,
    prescription_needed BOOLEAN,
    
    PRIMARY KEY (category_id)
);

CREATE TABLE tb_product (
	product_id BIGINT(6) AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    category_id BIGINT(6),
    product_price FLOAT(7, 2) NOT NULL,
    product_cost FLOAT(7, 2) NOT NULL,
    product_brand VARCHAR(100) NOT NULL,
    product_supplier VARCHAR(100) NOT NULL,
    
    PRIMARY KEY (product_id),
    FOREIGN KEY (category_id) REFERENCES tb_category(category_id)
);

INSERT INTO tb_category(category_name, drugstore_section, prescription_needed)
VALUES
	("controlled medicines", 1, 1),
    ("other medicines", 2, 0),
    ("vitamin supplements", 3, 0),
    ("food", 4, 0),
    ("hygiene", 5, 0);

INSERT INTO tb_product(product_name, category_id, product_price, product_cost, product_brand, product_supplier)
VALUES
	("ABC shampoo", 5, 7.00, 6.10, "ABC", "supplier1"),
    ("123 toothpaste", 5, 5.00, 4.00, "123", "supplier50"),
    ("redstrip medicine", 1, 55.00, 44.00, "laboratory1", "laboratory1"),
    ("flu medicine", 2, 23.00, 21.50, "laboratory1", "laboratory1"),
    ("protein bar", 4, 7.00, 5.50, "laboratory2", "supplier50"),
    ("pain medicine", 2, 28.50, 25.00, "laboratory3", "supplier1"),
    ("deodorant", 5, 13.00, 7.00, "rezona", "rezona"),
    ("vitamin C pills", 3, 25.90, 25.00, "laboratory2", "supplier50");

SELECT tb_product.product_name, tb_product.product_brand, tb_product.product_price, tb_category.drugstore_section, tb_category.prescription_needed
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.product_price > 50;

SELECT tb_product.product_name, tb_product.product_brand, tb_product.product_price, tb_category.drugstore_section, tb_category.prescription_needed
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.product_price BETWEEN 3 AND 60;

SELECT tb_product.product_name, tb_product.product_brand, tb_product.product_price, tb_category.drugstore_section, tb_category.prescription_needed
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.product_name LIKE "b%";

SELECT tb_product.product_name, tb_product.product_brand, tb_product.product_price, tb_category.drugstore_section, tb_category.prescription_needed
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id;

SELECT tb_product.product_name, tb_product.product_brand, tb_product.product_price, tb_category.drugstore_section, tb_category.prescription_needed
FROM tb_product
INNER JOIN tb_category
ON tb_product.category_id = tb_category.category_id
WHERE tb_product.category_id = 5;