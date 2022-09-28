USE QuanLySinhVien;
-- Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi
SELECT Address, COUNT(StudentId) AS 'SỐ LƯỢNG HỌC VIÊN' FROM Student GROUP BY Address;

-- tính điểm trung bình các môn học của sinh viên sử dụng hàm AVG.
SELECT S.StudentId, S.StudentName, AVG(Mark) FROM Student S JOIN Mark M ON S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;

-- hiển thị điểm trung bình các môn học của mỗi học viên.
-- hiển thị điểm trung bình các môn học lớn hơn 15.
SELECT S.StudentId, S.StudentName, AVG(Mark) FROM Student S JOIN Mark M ON S.StudentId = M.StudentId
group by S.StudentId, S.StudentName;
SELECT S.StudentId, S.StudentName, AVG(Mark) FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
-- Hiển thị danh sách điểm trung bình của các học viên
SELECT S.StudentId, S.StudentName, AVG(Mark) FROM Student S join Mark M on S.StudentId = M.StudentId
GROUP BY S.StudentId, S.StudentName;
SELECT S.StudentId, S.StudentName, AVG(Mark) FROM Student S join Mark M on S.StudentId = M.StudentId GROUP BY S.StudentId, S.StudentName
HAVING AVG(Mark) >= ALL (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId);

-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
USE quanlysinhvien;
SELECT MAX(Credit) FROM subject;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT * FROM subject 
WHERE subID = (
SELECT subID FROM mark 
WHERE mark = (SELECT MAX(mark) FROM mark)
);

 -- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần.
 SELECT *, AVG(m.mark) FROM student s 
INNER JOIN mark m ON s.studentID = m.studentID
GROUP BY s.studentID
ORDER BY AVG(m.mark) DESC;
