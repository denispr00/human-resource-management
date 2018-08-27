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


CREATE TABLE authority (
  id int NOT NULL,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE user_authority (
  user_id int NOT NULL,
  authority_id int NOT NULL,
  CONSTRAINT FK859n2jvi8ivhui0rl0esws6o FOREIGN KEY (user_id) REFERENCES user (id),
  CONSTRAINT FKa68196081fvovjhkek5m97n3y FOREIGN KEY (authority_id) REFERENCES authority (id)
);

INSERT INTO USER (ID, USERNAME, PASSWORD, first_name, last_name, EMAIL, ENABLED) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1);
INSERT INTO USER (ID, USERNAME, PASSWORD, first_name, last_name, EMAIL, ENABLED) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1);
INSERT INTO USER (ID, USERNAME, PASSWORD, first_name, last_name, EMAIL, ENABLED) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0);

 
INSERT INTO AUTHORITY (ID, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO AUTHORITY (ID, NAME) VALUES (2, 'ROLE_ADMIN');
 
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (1, 2);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (2, 1);
INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_ID) VALUES (3, 1);
