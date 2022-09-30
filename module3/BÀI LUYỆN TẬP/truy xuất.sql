--  câu 1 in ra danh sách các sản phẩm do trung quốc sản xuất.
SELECT MASP,TENSP FROM sanpham WHERE NuocSX ='Trung Quoc';

-- câu 2: In ra danh sách các sản phẩm (MASP, TENSP) có đơn vị tính là “cây”, ”quyển”.
SELECT MASP,TENSP FROM sanpham WHERE DVT = 'cây' OR DVT = 'quyển'; 

-- CÂU 3: In ra danh sách các sản phẩm (MASP,TENSP) có mã sản phẩm bắt đầu là “B” và kết thúc là “01”.
SELECT MASP, TENSP FROM sanpham WHERE MASP LIKE  'B%01';

-- câu 4 In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 20.000 đến 30.000.
SELECT MASP,TENSP FROM sanpham WHERE NuocSX ='Trung Quoc' and Gia >= 2000 and Gia <30000;

-- câu 5:In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” hoặc “Thái Lan” sản xuất có giá từ 20.000 đến 30.000.
SELECT MASP, TENSP FROM sanpham WHERE NuocSX ='Trung Quoc' OR 'Thai Lan' and Gia >= 20000 and Gia <30000;

-- câu 6: In ra các số hóa đơn, trị giá hóa đơn bán ra trong ngày 1/1/2007 và ngày 2/1/2007.
SELECT SoHoaDon,TriGia,NgayMuaHang FROM hoadon  WHERE NgayMuaHang = '2007-01-01' or NgayMuaHang = '2007-01-02';

-- câu 7: In ra các số hóa đơn, trị giá hóa đơn trong tháng 1/2007, sắp xếp theo ngày (tăng dần) và trị giá của óa đơn (giảm dần)
SELECT SoHoaDon,TriGia,NgayMuaHang FROM hoadon WHERE NgayMuaHang LIKE '2007-01%'
ORDER BY  NgayMuaHang ASC, TriGia DESC;

-- câu 8: In ra danh sách các khách hàng (MAKH, HOTEN) đã mua hàng trong ngày 1/1/2007
SELECT kh.MaKH, kh.HoTen, hd.NgayMuaHang FROM khachhang kh 
INNER JOIN hoadon hd on kh.MaKH = hd.MaKH
WHERE NgayMuaHang = '2007-01-01';

-- câu 9:In ra danh sách các sản phẩm (MASP,TENSP) được khách hàng có tên “Nguyễn Văn A” mua trong háng 10/2006.
SELECT sp.MaSP, sp.TenSP, kh.HoTen, hd.NgayMuaHang FROM sanpham sp
INNER JOIN cthd ct on sp.MaSP = ct.MaSP 
INNER JOIN hoadon hd on ct.SoHD = hd.SoHoaDon
INNER JOIN khachhang kh on hd.MaKH = kh.MaKH
WHERE kh.HoTen = 'Nguyen Van A' AND hd.NgayMuaHang LIKE '2006-10%';

-- câu 10  In ra số hóa đơn, trị giá các hóa đơn do nhân viên có tên “Nguyễn Văn B” lập trong ngày 10/10/2006.
SELECT hd.SoHoaDon, hd.TriGia, hd.NgayMuaHang, nv.HoTen FROM hoadon hd
INNER JOIN nhanvien nv ON hd.MaNV = nv.MaNV
WHERE nv.HoTen = 'Nguyen Van B' AND hd.NgayMuaHang LIKE '2006-10%';

-- câu 11: Tìm các số hóa đơn đã mua sản phẩm có mã số “BB01” hoặc “BB02”
SELECT hd.SoHoaDon, sp.MaSP FROM hoadon hd 
INNER JOIN cthd ct ON hd.SoHoaDon = ct.SoHD
INNER JOIN sanpham sp ON ct.MaSP = sp.MaSP
WHERE (sp.MaSP = 'BB01' OR sp.MaSP = 'BB02');

-- Câu 12: Tìm các số hóa đơn đã mua sản phẩm có mã số “BB01” hoặc “BB02”, mỗi sản phẩm mua với số ượng từ 10 đến 20.
SELECT hd.SoHoaDon, sp.MaSP, ct.SoLuong FROM hoadon hd 
INNER JOIN cthd ct ON hd.SoHoaDon = ct.SoHD
INNER JOIN sanpham sp ON ct.MaSP = sp.MaSP
WHERE (sp.MaSP = 'BB01' OR 'BB02') AND ct.SoLuong between 10 AND 20;

-- câu 13: Tìm các số hóa đơn mua cùng lúc 2 sản phẩm có mã số “BB01” và “BB02”, mỗi sản phẩm mua với số ượng từ 10 đến 20
SELECT hd.SoHoaDon, sp.MaSP, ct.SoLuong FROM hoadon hd 
INNER JOIN cthd ct ON hd.SoHoaDon = ct.SoHD
INNER JOIN sanpham sp ON ct.MaSP = sp.MaSP
WHERE sp.MaSP = 'BB01' AND 'BB02'
