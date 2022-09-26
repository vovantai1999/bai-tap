USE QuanLySinhVien;
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2,'A2', '2008-5-20',1);
INSERT INTO Class
VALUES (3,'B3', current_date,0);

INSERT INTO Student(StudentName, Address, Phone, Status, ClassID)
VALUES ( 'HUNG', 'HA NOI', '0988909678',	1,1);
INSERT INTO Student(StudentName, Address, Phone, Status, ClassID)
VALUES ( 'NAM', 'HA TINH', '0988907678',	1,2);
INSERT INTO Student(StudentName, Address, Phone, Status, ClassID)
VALUES ( 'TAI', 'HA NOI', '0988907678',	1,3);

INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);


INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);