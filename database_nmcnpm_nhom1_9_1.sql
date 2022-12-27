-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th1 09, 2022 lúc 04:07 PM
-- Phiên bản máy phục vụ: 10.4.21-MariaDB
-- Phiên bản PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `database_nmcnpm_nhom1`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `cach_ly_covid`
--

CREATE TABLE `cach_ly_covid` (
  `id` int(11) NOT NULL,
  `CMND` varchar(15) NOT NULL,
  `noiCachLy` varchar(200) DEFAULT NULL,
  `thoiGianBatDau` varchar(15) DEFAULT NULL,
  `mucDoCachLy` varchar(20) DEFAULT NULL,
  `diaDiemDaDiQua` varchar(500) DEFAULT NULL,
  `nguoiTao` varchar(30) NOT NULL,
  `soLanTest` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `ho_khau`
--

CREATE TABLE `ho_khau` (
  `hoVaTenChuHo` varchar(30) NOT NULL,
  `soHoKhau` varchar(10) NOT NULL,
  `diaChi` varchar(500) NOT NULL,
  `ngayDangKi` varchar(15) NOT NULL,
  `nguoiTao` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `ho_khau`
--

INSERT INTO `ho_khau` (`hoVaTenChuHo`, `soHoKhau`, `diaChi`, `ngayDangKi`, `nguoiTao`) VALUES
('Nguyễn Minh Hải', '11', 'Bắc Lý - Đồng Hới - Quảng Bình', '1/9/2021', ''),
('Lương Ngọc Khánh', '12', 'Nam Lý - Đồng Hới - Quảng Bình', '9/1/2021', 'user');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khai_bao_covid`
--

CREATE TABLE `khai_bao_covid` (
  `id` int(11) NOT NULL,
  `CMND` varchar(15) NOT NULL,
  `soMuiTiem` int(11) DEFAULT NULL,
  `tinhTrangSucKhoe` varchar(200) DEFAULT NULL,
  `nguoiTao` varchar(30) NOT NULL,
  `lanTestGanNhat` varchar(15) CHARACTER SET utf8mb4 DEFAULT NULL,
  `ketQuaLanTestGanNhat` varchar(30) DEFAULT NULL,
  `diaDiemDaDiQua` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `khai_tu`
--

CREATE TABLE `khai_tu` (
  `soHoKhau` varchar(10) DEFAULT NULL,
  `hoVaTenNguoiKhai` varchar(50) DEFAULT NULL,
  `CMNDNguoiMat` varchar(15) NOT NULL,
  `ngayMat` varchar(15) DEFAULT NULL,
  `lyDo` varchar(200) DEFAULT NULL,
  `id` int(10) NOT NULL,
  `nguoiTao` varchar(30) NOT NULL,
  `ngayKhai` varchar(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `lich_su`
--

CREATE TABLE `lich_su` (
  `id` int(11) NOT NULL,
  `ngayThayDoi` varchar(60) NOT NULL,
  `nguoiThayDoi` varchar(30) NOT NULL,
  `chucVu` varchar(30) NOT NULL,
  `loaiThayDoi` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `lich_su`
--

INSERT INTO `lich_su` (`id`, `ngayThayDoi`, `nguoiThayDoi`, `chucVu`, `loaiThayDoi`) VALUES
(1, '21/1/2021', 'User', 'Tổ trưởng', 'đăng kí sổ hộ khẩu');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhan_khau`
--

CREATE TABLE `nhan_khau` (
  `soHoKhau` varchar(10) NOT NULL,
  `hoVaTen` varchar(30) NOT NULL,
  `tenGoiKhac` varchar(30) NOT NULL,
  `ngaySinh` varchar(15) NOT NULL,
  `gioiTinh` int(5) NOT NULL,
  `danToc` varchar(20) NOT NULL,
  `noiSinh` varchar(200) NOT NULL,
  `queQuan` varchar(200) NOT NULL,
  `tonGiao` varchar(30) NOT NULL,
  `quocTich` varchar(30) NOT NULL,
  `CMND` varchar(15) NOT NULL,
  `noiOHienTai` varchar(200) NOT NULL,
  `trinhDoHocVan` varchar(20) NOT NULL,
  `trinhDoChuyenMon` varchar(20) NOT NULL,
  `ngheNghiepHienTai` varchar(20) NOT NULL,
  `ghiChu` varchar(200) NOT NULL,
  `liDoXoaDKThuongTru` varchar(200) NOT NULL,
  `quanHeChuHo` varchar(10) NOT NULL,
  `nguoiTao` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `nhan_khau`
--

INSERT INTO `nhan_khau` (`soHoKhau`, `hoVaTen`, `tenGoiKhac`, `ngaySinh`, `gioiTinh`, `danToc`, `noiSinh`, `queQuan`, `tonGiao`, `quocTich`, `CMND`, `noiOHienTai`, `trinhDoHocVan`, `trinhDoChuyenMon`, `ngheNghiepHienTai`, `ghiChu`, `liDoXoaDKThuongTru`, `quanHeChuHo`, `nguoiTao`) VALUES
('12', 'Lương Ngọc Khánh', '', '04/12/1980', 1, 'Kinh', 'Quảng Bình', 'Quảng Bình', 'Không', 'Việt Nam', '012222223666', 'Quảng Bình', 'Đại học', '', 'Cán bộ', '; ', '', 'Bố', ''),
('11', 'Hồ Anh', '', '04/09/2001', 0, 'Kinh', 'Đồng Hới - Quảng Bình', 'An Ninh - Quảng Ninh - Quảng Bình', 'Không', 'Việt Nam', '012234456678', 'Bách Khoa - Hai Bà Trưng - Hà Nội', '12/12', '', 'Sinh viên', '; Xóa \"tên gọi khác\"; Chỉnh sửa \"Nơi ở hiện tại\"', '', 'Con', 'Hệ thống'),
('11', 'Nguyễn Minh Hải', '', '01/3/1999', 1, 'Kinh', 'Cầu Giấy - Hà Nội', 'Cầu Giấy - Hà Nội', 'Không', 'Việt Nam', '012345698745', 'Cầu Giấy - Hà Nội', '12/12', '', '', '', '', 'Con', ''),
('11', 'Nguyễn Thị Thu Thanh', '', '01/01/1991', 0, 'Kinh', 'Nam Lý - Đồng Hới - Quảng Binh', 'Nam Lý - Đồng Hới - Quảng Binh', 'Không', 'Việt Nam', '012547896321', 'Nam Lý - Đồng Hới - Quảng Binh', '9/12', '', '', '', '', 'Mẹ', ''),
('11', 'Nguyễn Minh Anh', '', '04/02/2003', 0, 'Kinh', 'Đồng Hới - Quảng Bình', 'Đồng Hới - Quảng Bình', 'Không', 'Việt Nam', '012563987412', 'Đồng Hới - Quảng Bình', '12/12', '', '', '', '', 'Con', ''),
('11', 'Nguyễn Hải', '', '04/02/2001', 0, 'Kinh', 'Quảng Trị', 'Quảng Trị', 'Không', 'Việt Nam', '0131321545665', 'Quảng Trị', '12/12', '', '', '', '', 'Cháu', ''),
('11', 'Khúc Nguyễn', '', '7/12/2001', 0, 'Kinh', 'Bình Định', 'Bình Định', 'Không', 'Việt Nam', '014222336665', 'Bình Định', '12/12', '', '', '', '', 'Cháu', ''),
('11', 'Khương Nguyễn', '', '01/4/2001', 1, 'Kinh', 'Quảng Nam', 'Quảng Nam', 'Không', 'Việt Nam', '0142365897', 'Quảng Nam', '12/12', '', '', '', '', 'Con', ''),
('11', 'Hoàng Long Anh', '', '04/8/1991', 1, 'Kinh', 'Bách Khoa - Hai Bà Trưng - Hà Nội', 'Bách Khoa - Hai Bà Trưng - Hà Nội', 'Không', 'Việt Nam', '014785236987', 'Bách Khoa - Hai Bà Trưng - Hà Nội', 'Đại học', '', '', '', '', 'Bố ', ''),
('11', 'Ngô Hữu Minh', '', '04/12/2001', 1, 'Kinh', 'Đà Nẵng', 'Đà Nẵng', 'Không', 'Việt Nam', '03332566694', 'Đà Nẵng', '12/12', '', '', '', '', 'Con', '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tam_tru`
--

CREATE TABLE `tam_tru` (
  `id` int(11) NOT NULL,
  `hoVaTen` varchar(30) DEFAULT NULL,
  `ngaySinh` varchar(15) DEFAULT NULL,
  `CMND` varchar(15) NOT NULL,
  `diaChiThuongTru` varchar(200) DEFAULT NULL,
  `ngayCap` varchar(15) DEFAULT NULL,
  `nguoiTao` varchar(30) NOT NULL,
  `lyDo` varchar(200) DEFAULT NULL,
  `thoiHan` varchar(50) DEFAULT NULL,
  `diaChiTamTru` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tam_tru`
--

INSERT INTO `tam_tru` (`id`, `hoVaTen`, `ngaySinh`, `CMND`, `diaChiThuongTru`, `ngayCap`, `nguoiTao`, `lyDo`, `thoiHan`, `diaChiTamTru`) VALUES
(1, 'Lê Minh', '05/6/1999', '01456977456', 'Đồng Hới - Quảng Bình', NULL, '', NULL, NULL, 'Hà Nội');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tam_vang`
--

CREATE TABLE `tam_vang` (
  `CMND` varchar(15) DEFAULT NULL,
  `noiTamTru` varchar(200) DEFAULT NULL,
  `tuNgay` varchar(15) DEFAULT NULL,
  `denNgay` varchar(15) DEFAULT NULL,
  `lyDo` varchar(200) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `nguoiTao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `tam_vang`
--

INSERT INTO `tam_vang` (`CMND`, `noiTamTru`, `tuNgay`, `denNgay`, `lyDo`, `id`, `nguoiTao`) VALUES
('012234456678', 'Bách Khoa - Hai Bà Trưng - Hà Nội', '11/11/2021', '11/12/2021', 'Công tác', 1, '');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `test_covid`
--

CREATE TABLE `test_covid` (
  `id` int(11) NOT NULL,
  `CMND` varchar(15) NOT NULL,
  `thoiDiemTest` varchar(15) NOT NULL,
  `hinhThucTest` varchar(20) NOT NULL,
  `ketQua` varchar(20) NOT NULL,
  `nguoiTao` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `chucVu` varchar(30) DEFAULT NULL,
  `hoVaTen` varchar(50) CHARACTER SET utf8mb4 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Đang đổ dữ liệu cho bảng `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `chucVu`, `hoVaTen`) VALUES
(1, 'test', '1', NULL, '');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `cach_ly_covid`
--
ALTER TABLE `cach_ly_covid`
  ADD PRIMARY KEY (`id`),
  ADD KEY `CMND` (`CMND`),
  ADD KEY `nguoiTao` (`nguoiTao`);

--
-- Chỉ mục cho bảng `ho_khau`
--
ALTER TABLE `ho_khau`
  ADD PRIMARY KEY (`soHoKhau`) USING BTREE,
  ADD KEY `nguoiTao` (`nguoiTao`) USING BTREE;

--
-- Chỉ mục cho bảng `khai_bao_covid`
--
ALTER TABLE `khai_bao_covid`
  ADD PRIMARY KEY (`id`),
  ADD KEY `CMND` (`CMND`),
  ADD KEY `nguoiTao` (`nguoiTao`);

--
-- Chỉ mục cho bảng `khai_tu`
--
ALTER TABLE `khai_tu`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idNguoiKhai` (`hoVaTenNguoiKhai`) USING BTREE,
  ADD KEY `nguoiTao` (`nguoiTao`) USING BTREE,
  ADD KEY `idNguoiChet` (`CMNDNguoiMat`) USING BTREE;

--
-- Chỉ mục cho bảng `lich_su`
--
ALTER TABLE `lich_su`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nguoiThayDoi` (`nguoiThayDoi`);

--
-- Chỉ mục cho bảng `nhan_khau`
--
ALTER TABLE `nhan_khau`
  ADD PRIMARY KEY (`CMND`),
  ADD KEY `nguoiTao` (`nguoiTao`),
  ADD KEY `soHoKhau` (`soHoKhau`) USING BTREE;

--
-- Chỉ mục cho bảng `tam_tru`
--
ALTER TABLE `tam_tru`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nguoiTao` (`nguoiTao`),
  ADD KEY `CMND` (`CMND`) USING BTREE;

--
-- Chỉ mục cho bảng `tam_vang`
--
ALTER TABLE `tam_vang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nguoiTao` (`nguoiTao`) USING BTREE,
  ADD KEY `CMND` (`CMND`) USING BTREE;

--
-- Chỉ mục cho bảng `test_covid`
--
ALTER TABLE `test_covid`
  ADD PRIMARY KEY (`id`),
  ADD KEY `CMND` (`CMND`),
  ADD KEY `nguoiTao` (`nguoiTao`);

--
-- Chỉ mục cho bảng `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`) USING BTREE;

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `cach_ly_covid`
--
ALTER TABLE `cach_ly_covid`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `khai_bao_covid`
--
ALTER TABLE `khai_bao_covid`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `khai_tu`
--
ALTER TABLE `khai_tu`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `lich_su`
--
ALTER TABLE `lich_su`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `tam_tru`
--
ALTER TABLE `tam_tru`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `tam_vang`
--
ALTER TABLE `tam_vang`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT cho bảng `test_covid`
--
ALTER TABLE `test_covid`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
