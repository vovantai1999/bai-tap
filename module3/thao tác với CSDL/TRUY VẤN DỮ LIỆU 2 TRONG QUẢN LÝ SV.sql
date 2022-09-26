USE QuanLyBanHang;
-- thêm dữ liệu vào bảng Customer
INSERT INTO Customer VALUES (1, 'MINH QUAN', 10);
INSERT INTO Customer VALUES(2, 'NGOC OANH',20);	
INSERT INTO Customer VALUES(3, 'HONG HA',50);	

-- thêm dữ liệu vào bảng Orrder
INSERT INTO Orrder VALUES  (1,1, '2021-12-3',  2000);
INSERT INTO Orrder VALUES  (2,2, '2006-11-4',  2022);
INSERT INTO Orrder VALUES  (3,1, '2021-12-3',  2000);

-- thêm dữ liệu vào bảng Product
INSERT INTO Product
VALUES (1, 'MAY GIAT',3),
		(2, 'TU LANH',5),
		(3, 'DIEU HOA',7),
		(4, 'MAY QUAT',1),
		(5, 'BEP DIEN',2);
        
-- thêm dữ liệu vào bbangr OrderDetail
INSERT INTO OrderDetail 
VALUES (1,1,3),
		(1,3,7),
		(1,4,2),
		(2,1,1),
		(3,1,8),
		(2,5,4),
		(2,3,3);

		
		
