CREATE DATABASE db_ecommerce;

USE db_ecommerce;

CREATE TABLE tb_products (
	id BIGINT(6) AUTO_INCREMENT,
    product_name VARCHAR(100) NOT NULL,
    brand VARCHAR(100) NOT NULL,
    price FLOAT(7, 2) NOT NULL,
    cost FLOAT(7, 2) NOT NULL,
    available_units INT(5) NOT NULL,
    
    PRIMARY KEY (id)
);

INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("T-Shirt", "Nicke", 199.99, 90.50, 3);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("Sneakers", "Badidas", 260.50, 120.80, 15);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("T-Shirt", "Avan", 20.30, 10, 56);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("Dress", "Badidas", 150.00, 82.20, 29);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("Sunglasses", "Chilirices", 520.00, 300.50, 19);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("Sneakers", "Nicke", 280.30, 150.4, 5);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("Jeans", "Ferragoma", 480.40, 310.50, 2);
INSERT INTO db_ecommerce.tb_products(product_name, brand, price, cost, available_units) VALUES ("Boots", "Avan", 79.00, 25.50, 500);

SELECT * FROM db_ecommerce.tb_products WHERE price > 500;

SELECT * FROM db_ecommerce.tb_products WHERE price < 500;

UPDATE tb_products
SET price = 250.00
WHERE id = 1;