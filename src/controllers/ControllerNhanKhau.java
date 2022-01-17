package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelNhanKhau;

public class ControllerNhanKhau {
    public ArrayList<ModelNhanKhau> selectDanhMucNhanKhau() throws SQLException, ClassNotFoundException {
        ArrayList<ModelNhanKhau> resultList = new ArrayList<ModelNhanKhau>();
        String sql = "SELECT * FROM nhan_khau";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ModelNhanKhau newMTT = new ModelNhanKhau(rs.getString(2), rs.getString(4), rs.getInt(5), rs.getString(17), rs.getString(6), rs.getString(14), rs.getString(13));
                resultList.add(newMTT);
            }
            return resultList;
        }
    }

    public ArrayList<ModelNhanKhau> selectDanhMucNhanKhau(String MaSHK) throws SQLException, ClassNotFoundException {
        ArrayList<ModelNhanKhau> resultList = new ArrayList<ModelNhanKhau>();
        String sql = "SELECT * FROM nhan_khau WHERE soHoKhau = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, MaSHK);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ModelNhanKhau newMTT = new ModelNhanKhau(rs.getString("CMND"), rs.getString("hoVaTen"), rs.getString("ngaySinh"), rs.getInt("gioiTinh"), rs.getString("quanHeChuHo"));
                resultList.add(newMTT);
            }
            return resultList;
        }
    }
    
    public ModelNhanKhau TraCuuNhanKhau(String CMND) throws SQLException, ClassNotFoundException{
        String sql = "Select * from nhan_khau where CMND = ?";
        ModelNhanKhau NhanKhau = new ModelNhanKhau();
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            pstmt.setString(1, CMND);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                NhanKhau.setTonGiao(rs.getString("tonGiao"));
                NhanKhau.setSoHoKhau(rs.getString("soHoKhau"));
                NhanKhau.setHoVaTen(rs.getString("hoVaTen"));
                NhanKhau.setTenGoiKhac(rs.getString("tenGoiKhac"));
                NhanKhau.setNgaySinh(rs.getString("ngaySinh"));
                NhanKhau.setGioiTinh(rs.getInt("gioiTinh"));
                NhanKhau.setDanToc(rs.getString("danToc"));
                NhanKhau.setNoiSinh(rs.getString("noiSinh"));
                NhanKhau.setQueQuan(rs.getString("queQuan"));
                NhanKhau.setQuocTich(rs.getString("quocTich"));
                NhanKhau.setCMND(rs.getString("CMND"));
                NhanKhau.setNoiOHienTai(rs.getString("noiOHienTai"));
                NhanKhau.setTrinhDoHocVan(rs.getString("trinhDoHocVan"));
                NhanKhau.setTrinhDoChuyenMon(rs.getString("trinhDoChuyenMon"));
                NhanKhau.setNgheNghiepHienTai(rs.getString("ngheNghiepHienTai"));
                NhanKhau.setGhiChu(rs.getString("ghiChu"));
                NhanKhau.setLiDoXoaDKThuongTru(rs.getString("liDoXoaDKThuongTru"));
                NhanKhau.setQuanHeChuHo(rs.getString("quanHeChuHo"));
                NhanKhau.setNguoiTao(rs.getString("nguoiTao"));
            }
            return NhanKhau;
        }
    }
    
    public boolean checkCMNDIsExist(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM nhan_khau";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                if (rs.getString("CMND").equals(CMND)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean insert(ModelNhanKhau nhanKhau) throws SQLException, ClassNotFoundException {
        String sql
                = "INSERT INTO `nhan_khau`(`soHoKhau`, `hoVaTen`, `tenGoiKhac`, `ngaySinh`, `gioiTinh`, `danToc`, `noiSinh`, `queQuan`, "
                + "`tonGiao`, `quocTich`, `CMND`, `noiOHienTai`, `trinhDoHocVan`, `trinhDoChuyenMon`, `ngheNghiepHienTai`, `ghiChu`, `quanHeChuHo`)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1, nhanKhau.getSoHoKhau());
            pstm.setString(2, nhanKhau.getHoVaTen());
            pstm.setString(3, nhanKhau.getTenGoiKhac());
            pstm.setString(4, nhanKhau.getNgaySinh());
            pstm.setInt(5, nhanKhau.getGioiTinh());
            pstm.setString(6, nhanKhau.getDanToc());
            pstm.setString(7, nhanKhau.getNoiSinh());
            pstm.setString(8, nhanKhau.getQueQuan());
            pstm.setString(9, nhanKhau.getTonGiao());
            pstm.setString(10, nhanKhau.getQuocTich());
            pstm.setString(11, nhanKhau.getCMND());
            pstm.setString(12, nhanKhau.getNoiOHienTai());
            pstm.setString(13, nhanKhau.getTrinhDoHocVan());
            pstm.setString(14, nhanKhau.getTrinhDoChuyenMon());
            pstm.setString(15, nhanKhau.getNgheNghiepHienTai());
            pstm.setString(16, nhanKhau.getGhiChu());
            pstm.setString(17, nhanKhau.getQuanHeChuHo());
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }

     public boolean update(ModelNhanKhau nhanKhau) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE `nhan_khau` SET "
                + "`soHoKhau`=?,"
                + "`hoVaTen`=?,"
                + "`tenGoiKhac`=?,"
                + "`ngaySinh`=?,"
                + "`gioiTinh`=?,"
                + "`danToc`=?,"
                + "`noiSinh`=?,"
                + "`queQuan`=?,"
                + "`tonGiao`=?,"
                + "`quocTich`=?,"
                + "`noiOHienTai`=?,"
                + "`trinhDoHocVan`=?,"
                + "`trinhDoChuyenMon`=?,"
                + "`ngheNghiepHienTai`=?,"
                + "`ghiChu`=?,"
//                + "`liDoXoaDKThuongTru`='[value-17]',"
                + "`quanHeChuHo`=?"
                + "WHERE `CMND`=?";
//                + "`nguoiTao`='[value-19]' WHERE 1";
        String sql2 = "SELECT ghiChu FROM nhan_khau";    
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
                PreparedStatement pstm2 = con.prepareStatement(sql2);
        ) {
            pstm.setString(1, nhanKhau.getSoHoKhau());
            pstm.setString(2, nhanKhau.getHoVaTen());
            pstm.setString(3, nhanKhau.getTenGoiKhac());
            pstm.setString(4, nhanKhau.getNgaySinh());
            pstm.setInt(5, nhanKhau.getGioiTinh());
            pstm.setString(6, nhanKhau.getDanToc());
            pstm.setString(7, nhanKhau.getNoiSinh());
            pstm.setString(8, nhanKhau.getQueQuan());
            pstm.setString(9, nhanKhau.getTonGiao());
            pstm.setString(10, nhanKhau.getQuocTich());
            pstm.setString(11, nhanKhau.getNoiOHienTai());
            pstm.setString(12, nhanKhau.getTrinhDoHocVan());
            pstm.setString(13, nhanKhau.getTrinhDoChuyenMon());
            pstm.setString(14, nhanKhau.getNgheNghiepHienTai());
            
            ResultSet rs = pstm2.executeQuery();
            String ghiChu = nhanKhau.getGhiChu();
            if (rs.next()) {
                ghiChu = rs.getString("ghiChu") + "; " + ghiChu;
            }
            pstm.setString(15, ghiChu);

//            pstm.setString(17, nhanKhau.getLiDoXoaDKThuongTru());
            pstm.setString(16, nhanKhau.getQuanHeChuHo());
            pstm.setString(17, nhanKhau.getCMND());
//            pstm.setString(19, nhanKhau.getNguoiTao());
            return pstm.executeUpdate() > 0 ? true:false;
        }
    }
    
    public static boolean checkMaSHKCMND(String maSHK, String CMND) throws ClassNotFoundException, SQLException {
        String sql = "SELECT soHoKhau FROM nhan_khau WHERE CMND = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, CMND);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                if (rs.getString("soHoKhau").equals(maSHK)) return true; 
                else return false;
            } else {
                return false;
            }
        }
    }
    
    public boolean delete(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM `nhan_khau` WHERE CMND = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, CMND);

            return pstmt.executeUpdate() > 0 ? true:false;
        }
    }
    
    public String get_NoiThuongTru(String SoHoKhau) throws SQLException, ClassNotFoundException{
        String sql = "select * FROM `ho_khau` WHERE soHoKhau = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, SoHoKhau);
            ResultSet rs = pstmt.executeQuery();
            
            String result = new String();
            if(rs.next()) {result = rs.getString("diaChi");}
            return result;
        }
    }            
    public boolean updateQHCH(String CMND, String quanHeChuHo) throws ClassNotFoundException, SQLException {
        String sql = "UPDATE `nhan_khau` SET `quanHeChuHo`= ? WHERE `CMND` = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
        ) {
            pstm.setString(1, quanHeChuHo);
            pstm.setString(2, CMND);
            return pstm.executeUpdate() > 0 ? true:false;
        }
    }
    
    public boolean updateQHCKandSHK(String CMND, String quanHeChuHo, String SHK) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE `nhan_khau` SET `soHoKhau`=?, `quanHeChuHo`=? WHERE `CMND` = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstm = con.prepareStatement(sql);
        ) {
            pstm.setString(1, SHK);
            pstm.setString(2, quanHeChuHo);
            pstm.setString(3, CMND);
    
            return pstm.executeUpdate() > 0 ? true:false;
        }
    }
 
    public String gethoVaTenFromCMND(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM nhan_khau WHERE CMND = ?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, CMND);
            ResultSet rs = pstmt.executeQuery();
            rs.next();
            return rs.getString("hoVaTen");
        }
    }
}
