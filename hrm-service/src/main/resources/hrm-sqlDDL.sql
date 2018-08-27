use hrml;
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

create table user (
id int not null auto_increment primary key,
username varchar(50) not null,
password varchar(50)
);


