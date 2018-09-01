use hrm;
SET SQL_SAFE_UPDATES = 0;


select * from employee;

delete from employee;

select * from user;

insert into user (username,password) values ("user1","psw1");


select * from authority;

insert into authority(user_id,authority) values (1,"ROLE_ADMIN");

