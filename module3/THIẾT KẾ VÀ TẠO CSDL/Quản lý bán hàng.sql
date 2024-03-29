CREATE DATABASE QuanLyBanHang;
USE QuanLyBanHang;

CREATE TABLE Customer(
cID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cName VARCHAR(30) NOT NULL,
cAge INT NOT NULL
);

CREATE TABLE orrder(
oID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
cID INT NOT NULL,
oDate DATETIME NOT NULL,
oTotalPrice DOUBLE NOT NULL,
FOREIGN KEY(cID) REFERENCES Customer(cID)
);

CREATE TABLE OrderDetail(
oID INT NOT NULL,
pID INT NOT NULL,
odQTY VARCHAR(45),
FOREIGN KEY (oID) REFERENCES orrder(oID),
FOREIGN KEY (pID) REFERENCES Product(pID)
);

CREATE TABLE Product(
pID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
pName VARCHAR(30) NOT NULL,
pPrice DOUBLE NOT NULL
);
