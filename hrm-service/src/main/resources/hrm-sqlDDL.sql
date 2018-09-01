use hrm;
SET SQL_SAFE_UPDATES = 0;

drop table employee;
ALTER TABLE employee AUTO_INCREMENT = 1;


create table employee(
id MEDIUMINT  NOT NULL AUTO_INCREMENT,
  name varchar(50),
  address varchar(200),
  position varchar(50),
  department varchar(50),
  supervisorId MEDIUMINT ,
  qualificationId int,
  PRIMARY KEY (id)
);


CREATE TABLE user (
  id int primary key NOT NULL AUTO_INCREMENT,
  first_name varchar(255) NOT NULL,
  last_name varchar(255),
  password varchar(255) NOT NULL,
  username varchar(255) NOT NULL,
  email varchar(255),
  enabled boolean
);


INSERT INTO USER (ID, USERNAME, PASSWORD, first_name, last_name, EMAIL, ENABLED) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1);
INSERT INTO USER (ID, USERNAME, PASSWORD, first_name, last_name, EMAIL, ENABLED) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1);
INSERT INTO USER (ID, USERNAME, PASSWORD, first_name, last_name, EMAIL, ENABLED) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0);


drop TABLE authority;

CREATE TABLE authority (
  user_id int NOT NULL,
  authority varchar(15),
  CONSTRAINT fk_authority_user FOREIGN KEY (user_id) REFERENCES user (id)
);


insert into authority (user_id,authority) values (1,'ROLE_ADMIN');
