CREATE TABLE `class_types` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

 

insert into class_types (id, name)
values (1, 'home');

insert into class_types (id, name)
values (2, 'pack');



CREATE TABLE `class` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `class_type_id` bigint(20) unsigned NOT NULL,
  `name_animal` varchar(255) DEFAULT NULL,
  `team_id` bigint(20) unsigned NOT NULL,
  UNIQUE KEY `id` (`id`),
  KEY `team_id` (`team_id`),
  KEY `class_type_id` (`class_type_id`),
  CONSTRAINT `class_ibfk_1` FOREIGN KEY (`class_type_id`) REFERENCES `class_types` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `teams` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `class_id` bigint(20) unsigned NOT NULL,
  `team` text DEFAULT NULL,
  UNIQUE KEY `id` (`id`),
  CONSTRAINT `teams_ibfk_1` FOREIGN KEY (`class_id`) REFERENCES `class` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE table  `animals` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) DEFAULT NULL COMMENT 'кличка животного или указать not_name',
  PRIMARY KEY (`id`),
  KEY `animals_name_idx` (`name_animal`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='юзеры';

CREATE TABLE    `profiles`  (
  `animal_id` bigint(20) unsigned NOT NULL,
  `class_id` bigint(20) unsigned NOT NULL,
  `gender` char(1) DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `created_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `house_id` bigint(20) unsigned NOT NULL,
  `is_active` bit(1) DEFAULT b'1',
  `leave_at` datetime ,
  UNIQUE KEY `animal_id` (`animal_id`),
  CONSTRAINT `profiles_ibfk_1` FOREIGN KEY (`animal_id`) REFERENCES `animals` (`id`) ON DELETE RESTRICT ON UPDATE cascade,
  CONSTRAINT `profiles_ibfk_2` FOREIGN KEY (`class_id`) REFERENCES `class` (`id`) ON DELETE RESTRICT ON UPDATE cascade,
  CONSTRAINT `profiles_ibfk_3` FOREIGN KEY (`house_id`) REFERENCES `houses` (`id`) 
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO animals (id,name_animal)
VALUES (01, 'Riky');

INSERT INTO teams (id,class_id,team)
VALUES (1,1, 'лаять');

INSERT INTO teams (id,class_id,team)
VALUES (2,1, 'охранать');

INSERT INTO teams (id,class_id,team)
VALUES (3,1, 'не лаять');

INSERT INTO class  (id,class_type_id , name_animal)
VALUES (1, 1, 'dog' );

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (1, 1, 'm', '2015-11-01',  NOW(), 1, 1 );

INSERT INTO class  (class_type_id , name_animal)
VALUES ( 1, 'cat' );

INSERT INTO teams (class_id,team)
VALUES (101, 'мурлыкать');

INSERT INTO teams (class_id,team)
VALUES (101, 'кушать');

INSERT INTO animals (name)
VALUES ('Киса');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (101, 101, 'f', '2022-01-20',  NOW(), 2, 1 );

INSERT INTO animals (name)
VALUES ('Мурлыка');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (102, 101, 'm', '2022-07-13',  NOW(), 2, 1 );

INSERT INTO class  (class_type_id , name_animal)
VALUES ( 2, 'donkey' );

INSERT INTO teams (class_id,team)
VALUES (102, 'перевозить');

INSERT INTO teams (id,class_id,team)
VALUES (4, 102, 'кушать');

INSERT INTO animals (name)
VALUES ('Упрямец');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (103, 102, 'm', '2020-06-23',  NOW(), 2, 1 );

INSERT INTO class  (class_type_id , name_animal)
VALUES ( 2, 'camel' );

INSERT INTO teams (class_id,team)
VALUES (103, 'перевозить');

INSERT INTO teams (class_id,team)
VALUES ( 103, 'кушать');

INSERT INTO animals (name)
VALUES ('Горбик');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (104, 103, 'm', '2019-06-01',  NOW(), 2, 1 );

INSERT INTO animals (name)
VALUES ('Вера');

INSERT INTO class  (class_type_id , name_animal)
VALUES ( 2, 'horse' );

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (105, 103, 'f', '2019-12-01',  NOW(), 2, 1 );

INSERT INTO teams (class_id,team)
VALUES (104, 'перевозить');

INSERT INTO teams (class_id,team)
VALUES ( 104, 'кушать');

INSERT INTO animals (name)
VALUES ('Вини');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (106, 104, 'm', '2018-11-21',  NOW(), 2, 1 );

INSERT INTO animals (name)
VALUES ('Лалита');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (107, 104, 'f', '2010-07-07',  NOW(), 2, 1 );

INSERT INTO animals (name)
VALUES ('Красавчик');

INSERT INTO profiles (animal_id,class_id ,gender,birthday,created_at,house_id ,is_active)
VALUES (108, 104, 'm', '2015-08-11',  NOW(), 2, 1 );

CREATE TABLE `houses` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `name_house` varchar(100) DEFAULT NULL,
 UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO houses  (name_house)
VALUES (  'будка');

INSERT INTO houses  (name_house)
VALUES (  'сарай_1');

INSERT INTO houses  (name_house)
VALUES (  'сарай_2');

INSERT INTO houses  (name_house)
VALUES (  'сарай_3');

update profiles set 
is_active = 0,
leave_at = now()
where  class_id = 103 ;

update profiles set 
house_id = 4
where  class_id = 104 OR class_id = 102 ;

CREATE  table  young_animals  (
	SELECT 
	animal_id , 
	class_id ,
	gender ,
	house_id ,
	birthday ,
	is_active ,
	(YEAR(CURRENT_DATE)-YEAR(birthday))-(RIGHT(CURRENT_DATE,5)<RIGHT(birthday ,5)
  		) AS `age`  	
	FROM profiles  
	WHERE ( (birthday + INTERVAL 3 YEAR) > NOW() or (birthday + INTERVAL 1 YEAR) > NOW()) 
			AND is_active = 1
	);

update profiles  set 
house_id = 3
WHERE ( (birthday + INTERVAL 3 YEAR) > NOW() or (birthday + INTERVAL 1 YEAR) > NOW()) 
	  ;
	
CREATE  table  horce_donkey  (
	SELECT * 	
	FROM profiles  
	WHERE ( house_id = 4) 
			AND is_active = 1
	);
	  

CREATE  table  all_animals_is_active
	(select  distinct p.animal_id  ,p.class_id ,p. gender, p.house_id, p.birthday ,
	(YEAR(CURRENT_DATE)-YEAR(p.birthday))-(RIGHT(CURRENT_DATE,5)<RIGHT(p.birthday ,5)) AS `age`
	FROM profiles p  
		  JOIN horce_donkey hd ON p.is_active  = hd.is_active  
		  join young_animals ya on p.is_active  = ya.is_active 
  
		  );












