use hrm;

drop table employee;

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

select * from employee;

delete from employee where id = 1;
