use  bms;
create table bms.user
(usr_id bigint(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
 usr_name varchar(20) not null,
 usr_addr varchar(20));
insert into bms.user
(usr_name, usr_addr)
values
('a', 'a@xyz'),
('b', 'b@xyz'),
('c', 'c@xyz');