create database gabriels;
use gabriels;
create table Users(userID int primary key auto_increment, username varchar(20), useraddress varchar(30), userphone varchar(25),usermail varchar(20),userimage longblob, dateupdated DATE);
insert into Users(username,useraddress,userphone,usermail,userimage,dateupdated)values ("user1","address 1","9856321470 , 1236547890","user1@gmail.com",load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employee1.png"),'2023-08-28');
insert into Users(username,useraddress,userphone,usermail,userimage,dateupdated)values ("user2","address 2","9654123785 , 9567841246","user2@gmail.com",load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employee2.jpg"),'2023-08-28');
insert into Users(username,useraddress,userphone,usermail,userimage,dateupdated)values ("user3","address 3","6346978548 , 3296547890","user3@gmail.com",load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employee1.png"),'2023-08-28');
insert into Users(username,useraddress,userphone,usermail,userimage,dateupdated)values ("user4","address 4","7548396015 , 6956547890","user4@gmail.com",load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employee2.jpg"),'2023-08-28');
insert into Users(username,useraddress,userphone,usermail,userimage,dateupdated)values ("user5","address 5","6985456902 , 7696547890","user5@gmail.com",load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employee1.png"),'2023-08-28');
insert into Users(username,useraddress,userphone,usermail,userimage,dateupdated)values ("user6","address 6","7865941235 , 6656547890","user6@gmail.com",load_file("C:/ProgramData/MySQL/MySQL Server 8.0/Uploads/employee2.jpg"),'2023-08-28');

insert into Users(username,useraddress,userphone,usermail,dateupdated)values ("user7","address 7","7865954697 , 6958547989","user7@gmail.com",'2023-08-28');

select * from Users;
describe Users;
drop table Users;

