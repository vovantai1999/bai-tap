
USE QuanLySinhVien;
SELECT * FROM Student
WHERE ClassID = 1;

-- hiển thị tất cả sinh viên tên 'HUNG'
SELECT * FROM Student  WHERE StudentName = 'HUNG';

-- hiển thị tất cả sinh viên địa chỉ 'HA TINH'
SELECT * FROM Student 
WHERE Adress = 'HA TINH';

-- hiển thị tất cả sinh viên có ClassID = 1
SELECT * FROM Student
WHERE ClassID = 1;

-- hiển thị tất cả sinh viên có tên bắt đầu bằng chữ 'H'
SELECT * FROM Student
WHERE StudentName LIKE 'H%';

-- hiển thị thông tin lớp học có thời gian bắt đầu tuừ tháng '12'
SELECT * FROM student s INNER JOIN class c ON s.classID = c.classID  WHERE c.startDate like "%-12-%";

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.


-- Thay đổi mã lớp của sinh viên tên 'HUNG' LÀ '2'
UPDATE Student SET ClassID = 2 WHERE StudentName = 'HUNG';

-- hiển thị thông tin: StudentName, SubName, Mark
-- dữ liệu sắp xếp theo Mark giảm dần, nếu trùng sắp xếp tăng dần
 SELECT  Student.StudentName as "HỌ TÊN", Subject.SubName as "MÔN HỌC", Mark.Mark as "ĐIỂM"
 FROM Student, Subject, Mark
 ORDER BY Mark DESC, StudentName ASC ;
 
 


