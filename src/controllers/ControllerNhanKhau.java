package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelNhanKhau;

public class ControllerNhanKhau {
    public ArrayList<ModelNhanKhau> selectDanhMucNhanKhau () throws SQLException, ClassNotFoundException{
        ArrayList<ModelNhanKhau> resultList = new ArrayList<ModelNhanKhau>();

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
               ModelNhanKhau newMTT = new ModelNhanKhau(rs.getString("hoVaTen"), rs.getString("ngaySinh"), rs.getInt("gioiTinh"), rs.getString("ngheNghiepHienTai"),rs.getString("danToc"), rs.getString("noiOHienTai"), rs.getString("noiThuongTru"));

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
                NhanKhau.setSoHoKhau(rs.getString("soHoKhau"));
                NhanKhau.setHoVaTen(rs.getString("hoVaTen"));
                NhanKhau.setTenGoiKhac(rs.getString("tenGoiKhac"));
                NhanKhau.setNgaySinh(rs.getString("ngaySinh"));
                NhanKhau.setGioiTinh(rs.getInt("gioiTinh"));
                NhanKhau.setDanToc(rs.getString("danToc"));
                NhanKhau.setNoiSinh(rs.getString("noiSinh"));
                NhanKhau.setQueQuan(rs.getString("queQuan"));
                NhanKhau.setTonGiao(rs.getString("tonGiao"));
                NhanKhau.setQuocTich(rs.getString("quocTich"));
                NhanKhau.setCMND(rs.getString("CMND"));
                NhanKhau.setSoHoChieu(rs.getString("soHoChieu"));
                NhanKhau.setNoiThuongTru(rs.getString("noiThuongTru"));
                NhanKhau.setNoiOHienTai(rs.getString("noiOHienTai"));
                NhanKhau.setTrinhDoHocVan(rs.getString("trinhDoHocVan"));
                NhanKhau.setTrinhDoChuyenMon(rs.getString("trinhDoChuyenMon"));
                NhanKhau.setNgheNghiepHienTai(rs.getString("ngheNghiepHienTai"));
                NhanKhau.setNoiLamViec(rs.getString("noiLamViec"));
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
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
      
                
                if(rs.getString("CMND").equals(CMND)){
             
                return true;
                }
              
                
            }
            return false;
        }
    }
}
