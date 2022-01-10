package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelNhanKhau;
import models.ModelSoHoKhau;

public class ControllerSoHoKhau {
    public ArrayList<ModelSoHoKhau> selectDanhMucSoHoKhau () throws SQLException, ClassNotFoundException{
        ArrayList<ModelSoHoKhau> resultList = new ArrayList<ModelSoHoKhau>();

        String sql = "SELECT * FROM ho_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ModelSoHoKhau newMTT = new ModelSoHoKhau(rs.getString(1), rs.getString(3), rs.getString(4));
                resultList.add(newMTT);
            }
            return resultList;
        }
    }
    
    public ModelSoHoKhau TraCuuSHK(String SoSHK) throws SQLException, ClassNotFoundException{
        String sql = "Select * from ho_khau where soHoKhau = ?";
        ModelSoHoKhau newSHK = new ModelSoHoKhau();
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            pstmt.setString(1, SoSHK);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                newSHK.setHoVaTenChuHo(rs.getString("hoVaTenChuHo"));
                newSHK.setSoHoKhau(rs.getString("soHoKhau"));
                newSHK.setDiaChi(rs.getString("diaChi"));
                newSHK.setNgayDangKi(rs.getString("ngayDangKi"));
                newSHK.setNguoiTao(rs.getString("nguoiTao"));
            }
            return newSHK;
        }
    }
    
    public boolean checkMaSHKIsExist(String maSHK) throws SQLException, ClassNotFoundException {
        String sql = "SELECT soHoKhau FROM nhan_khau";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                if(rs.getString("soHoKhau").equals(maSHK)){
                    return true;
                } 
            }
            return false;
        }
    }
    
    public ArrayList<ModelNhanKhau> getListNhanKhau_fromSoSHK(String SoSHK) throws SQLException, ClassNotFoundException{
        String sql = "Select * from nhan_khau where soHoKhau = ?";
        ArrayList<ModelNhanKhau> resultList = new ArrayList<ModelNhanKhau>();
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            pstmt.setString(1, SoSHK);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ModelNhanKhau newMTT = new ModelNhanKhau(rs.getString("hoVaTen"), rs.getString("ngaySinh"), rs.getInt("gioiTinh"), rs.getString("quanHeChuHo"), rs.getString("noiOHienTai"));
                resultList.add(newMTT);
            }
            return resultList;
        }
    }
    
    public boolean insert(ModelSoHoKhau SHK) throws SQLException, ClassNotFoundException {
        String sql
                = "INSERT INTO `ho_khau`(`hoVaTenChuHo`, `soHoKhau`, `diaChi`, `ngayDangKi`, `nguoiTao`)"
                + "VALUES (?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1, SHK.getHoVaTenChuHo());
            pstm.setString(2, SHK.getSoHoKhau());
            pstm.setString(3, SHK.getDiaChi());
            pstm.setString(4, SHK.getNgayDangKi());
            pstm.setString(5, SHK.getNguoiTao());
            
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
}
