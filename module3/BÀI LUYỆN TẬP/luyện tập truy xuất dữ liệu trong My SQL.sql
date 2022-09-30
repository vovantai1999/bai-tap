use BaiTapVeNha;
select * FROM SanPham;

-- CÂU 4. In ra danh sách các sản phẩm (MASP,TENSP) do “Trung Quốc” sản xuất có giá từ 20.000 đến 30.000.
SELECT MaSP,TenSP FROM SanPham WHERE NuocSX = 'Trung Quoc' AND (Gia >= 20000 AND Gia <= 300000);

-- IN RA DANH SÁCH  NƯỚC SX LÀ VIỆT NAM HOẶC TRUNG QUỐC.
SELECT NuocSX FROM SanPham WHERE NuocSX = 'Trung Quoc' OR NuocSX = 'Viet Nam' group by NuocSX;

# từ khóa distint : loại bỏ các giá trị trùng lặp sử dụng sau từ khóa SELECT.

-- CÂU 8: In ra danh sách các khách hàng (MAKH, HOTEN) đã mua hàng trong ngày 1/1/2007
SELECT kh.MaKH, kh.HoTen FROM khachhang kh inner join hoadon hd on kh.MaKH = hd.MaKH
WHERE hd.NgayMuaHang = '2007-01-01';
-- IN DANH SÁCH SẢN PHẨM  MÀ KHÁCH HÀNG ĐÃ MUA CỦA NGÀY 1/1/2007 
SELECT kh.MaKH, kh.HoTen, sp.TenSP, sp.Gia
FROM khachhang kh inner join hoadon hd on kh.MaKH = hd.MaKH JOIN cthd ct on ct.SoHD = hd.SoHoaDon JOIN sanpham sp on sp.MaSP = ct.Masp
WHERE hd.NgayMuaHang = '2007-01-01';

-- CÂU 9:In ra danh sách các sản phẩm (MASP,TENSP) được KH có tên “Nguyễn Văn A” mua trong háng 10/2006.
SELECT kh.MaKH, kh.HoTen, sp.TenSP, sp.Gia
FROM khachhang kh INNER JOIN  hoadon hd on kh.MaKH = hd.MaKH
JOIN cthd ct on ct.SoHD = hd.SoHoaDon JOIN sanpham sp ON sp.MaSP = ct.MaSP
WHERE hd.NgayMuaHang = '2007-01-01';

-- CÂU 20 Trị giá trung bình của tất cả các hóa đơn được bán ra trong năm 2006 là bao nhiêu?
SELECT AVG (trigia) FROM HoaDon WHERE NgayMuaHang LIKE '2006-%-%';
-- LÀM TRÒN CHỮ SỐ THẬP PHÂN 
SELECT round (AVG(trigia)) FROM HoaDon WHERE NgayMuaHang LIKE '2006-%-%';

-- câu 26:In ra danh sách các sản phẩm (MASP, TENSP) do “Trung Quốc” sản xuất có giá bằng 1 trong 3 mức Giá thấp nhất (của tất cả các sản phẩm).
SELECT MaSP,TenSP FROM SanPham WHERE NuocSX = 'Trung Quoc'  ORDER BY GIA LIMIT 0,3


 







