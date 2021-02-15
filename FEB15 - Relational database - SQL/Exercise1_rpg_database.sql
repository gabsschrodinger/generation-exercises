CREATE DATABASE db_generation_online_game;

USE db_generation_online_game;

CREATE TABLE tb_class (
	class_id BIGINT(6) AUTO_INCREMENT,
    class_name VARCHAR(100) NOT NULL,
    signature_skill VARCHAR(100) DEFAULT "none",
    damage_type ENUM("physical", "magical") NOT NULL,
    
    PRIMARY KEY (class_id)
);

CREATE TABLE tb_character (
	character_id BIGINT(6) AUTO_INCREMENT,
    character_name VARCHAR(100) NOT NULL,
    class_id BIGINT(6),
    attack_power BIGINT(10) DEFAULT 0,
    defense BIGINT(10) DEFAULT 0,
    agility BIGINT(10) DEFAULT 0,
    character_level BIGINT(10) DEFAULT 1,
    
    PRIMARY KEY (character_id),
    FOREIGN KEY (class_id) REFERENCES tb_class(class_id)
);

INSERT INTO db_generation_online_game.tb_class(class_name, signature_skill, damage_type) VALUES ("warrior", "sword slam", "physical");
INSERT INTO db_generation_online_game.tb_class(class_name, signature_skill, damage_type) VALUES ("mage", "fire ball", "magical");
INSERT INTO db_generation_online_game.tb_class(class_name, signature_skill, damage_type) VALUES ("rogue", "camouflage", "physical");
INSERT INTO db_generation_online_game.tb_class(class_name, signature_skill, damage_type) VALUES ("healer", "full heal", "magical");
INSERT INTO db_generation_online_game.tb_class(class_name, signature_skill, damage_type) VALUES ("hunter", "bear trap", "physical");

INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character001", 1, 2000, 5000, 500, 43);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character002", 5, 6000, 1500, 3500, 45);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character003", 4, 1000, 4000, 2500, 36);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character004", 4, 850, 3760, 2300, 32);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character005", 2, 8500, 800, 500, 43);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character006", 3, 3500, 800, 6000, 41);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character007", 1, 1800, 4700, 450, 41);
INSERT INTO db_generation_online_game.tb_character(character_name, class_id, attack_power, defense, agility, character_level) VALUES ("character008", 2, 9000, 900, 600, 47);

SELECT tb_character.character_name, tb_class.class_name, tb_character.attack_power
FROM tb_character
INNER JOIN tb_class
ON tb_character.class_id = tb_class.class_id
WHERE attack_power > 2000;

SELECT tb_character.character_name, tb_class.class_name, tb_character.defense
FROM tb_character
INNER JOIN tb_class
ON tb_character.class_id = tb_class.class_id
WHERE defense BETWEEN 1000 AND 2000;

SELECT tb_character.character_name, tb_class.class_name
FROM tb_character
INNER JOIN tb_class
ON tb_character.class_id = tb_class.class_id
WHERE character_name LIKE "C%";

SELECT tb_character.character_name, tb_class.class_name, tb_character.attack_power, tb_character.defense
FROM tb_character
INNER JOIN tb_class
ON tb_character.class_id = tb_class.class_id;

SELECT tb_character.character_name, tb_class.class_name, tb_character.attack_power, tb_character.defense
FROM tb_character
INNER JOIN tb_class
ON tb_character.class_id = tb_class.class_id
WHERE tb_character.class_id = 1;