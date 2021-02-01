
create table logins (
    userId INT PRIMARY KEY AUTO_INCREMENT,
	userName VARCHAR(50),
	userPassword VARCHAR(50),
	isStaff BOOLEAN,
	staffId INT,
	studentId INT
);

insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('AdrienB', '3LpxYLs', 0, 1, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('MichealL', 'o4xx4cW', 1, 2, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('EvelinD', 'VjpcQIkw7', 1, 3, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('RurikT', 'gGAExXMTE', 1, 4, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('JacquieC', 'ErZ0JA', 0, 5, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('TreyE', 'qM186R', 0, 6, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('AllixH', 'eJDSYNddnMQ', 1, 7, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('GunterV', 'EcdUZKFdSh', 0, 8, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('SiouxC', 'gGmhnpqkJh', 0, 9, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('IsraelM', 'mLnRqiltzLOa', 1, 10, 0);
insert into logins (userName, userPassword, isStaff, staffId, studentId) values ('GunjanP', 'test', 0, 101, 0);



insert into login (USER_ID,IS_STAFF,STAFF_ID,STUDENT_ID,USER_NAME,USER_PASSWORD) values (1,1,1,0,'gunjan','werewr');
