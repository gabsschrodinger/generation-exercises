CREATE DATABASE db_cool_pizzas;

USE db_cool_pizzas;

CREATE TABLE tb_category (
	category_id BIGINT(6) AUTO_INCREMENT,
	category_name VARCHAR(100) NOT NULL,
    size_price FLOAT(7, 2) DEFAULT 0,
    slices_number INT(3) NOT NULL,
    
    PRIMARY KEY (category_id)
);

CREATE TABLE tb_pizza (
	pizza_id BIGINT(6) AUTO_INCREMENT,
    pizza_flavor VARCHAR(100) NOT NULL,
    flavor_price FLOAT(7, 2) NOT NULL,
    category_id BIGINT(6),
    olive BOOLEAN,
    take_out BOOLEAN,
    stuffed_edge BOOLEAN,
    
    PRIMARY KEY (pizza_id),
    FOREIGN KEY (category_id) REFERENCES tb_category(category_id)
);

INSERT INTO tb_category(category_name, size_price, slices_number) VALUES ("individual", 5.00, 1);
INSERT INTO tb_category(category_name, size_price, slices_number) VALUES ("small", 10.00, 4);
INSERT INTO tb_category(category_name, size_price, slices_number) VALUES ("regular", 17.00, 8);
INSERT INTO tb_category(category_name, size_price, slices_number) VALUES ("large", 28.00, 12);
INSERT INTO tb_category(category_name, size_price, slices_number) VALUES ("gigantic", 40.00, 22);

INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("margherita", 4.00, 3, 0, 0, 1);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("pepperoni", 4.00, 2, 1, 1, 0);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("mozzarella", 2.50, 2, 1, 0, 1);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("neapolitan", 6.00, 4, 0, 0, 0);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("margherita", 4.00, 1, 1, 0, 1);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("chicken", 6.50, 5, 1, 0, 1);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("mushroom and bacon", 8.00, 3, 0, 1, 0);
INSERT INTO tb_pizza(pizza_flavor, flavor_price, category_id, olive, take_out, stuffed_edge) VALUES ("vegan", 3.50, 3, 0, 0, 0);

SELECT tb_pizza.pizza_flavor, tb_category.category_name, (tb_pizza.flavor_price + tb_category.size_price) AS price
FROM tb_pizza
INNER JOIN tb_category
ON tb_pizza.category_id = tb_category.category_id
WHERE tb_pizza.flavor_price + tb_category.size_price > 45;

SELECT tb_pizza.pizza_flavor, tb_category.category_name, (tb_pizza.flavor_price + tb_category.size_price) AS price
FROM tb_pizza
INNER JOIN tb_category
ON tb_pizza.category_id = tb_category.category_id
WHERE tb_pizza.flavor_price + tb_category.size_price BETWEEN 29 AND 60;

SELECT tb_pizza.pizza_flavor, tb_category.category_name, (tb_pizza.flavor_price + tb_category.size_price) AS price
FROM tb_pizza
INNER JOIN tb_category
ON tb_pizza.category_id = tb_category.category_id
WHERE tb_pizza.pizza_flavor LIKE "c%%";

SELECT tb_pizza.pizza_flavor, tb_category.category_name, (tb_pizza.flavor_price + tb_category.size_price) AS price
FROM tb_pizza
INNER JOIN tb_category
ON tb_pizza.category_id = tb_category.category_id;

SELECT tb_pizza.pizza_flavor, tb_category.category_name, (tb_pizza.flavor_price + tb_category.size_price) AS price
FROM tb_pizza
INNER JOIN tb_category
ON tb_pizza.category_id = tb_category.category_id
WHERE tb_category.category_id = 3;