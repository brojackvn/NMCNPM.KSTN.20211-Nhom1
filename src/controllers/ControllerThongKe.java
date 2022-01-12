package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author huutu
 */
public class ControllerThongKe {
    public int thongKeNam () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getInt("gioiTinh")==1){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeNu () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getInt("gioiTinh")==0){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeKhongMuiTiem () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM khai_bao_covid";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getInt("soMuiTiem")==0){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeMotMuiTiem () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM khai_bao_covid";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getInt("soMuiTiem")==1){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeHaiMuiTiem () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM khai_bao_covid";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getInt("soMuiTiem")==2){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeTuoiViThanhNien () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String[] t = rs.getString("ngaySinh").split("/");
                if (2022-Integer.parseInt(t[2])<=18){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeTuoiTrungNien () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String[] t = rs.getString("ngaySinh").split("/");
                if (2022-Integer.parseInt(t[2])<60 && 2022-Integer.parseInt(t[2])>=18){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
      public int thongKeTuoiGia () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                String[] t = rs.getString("ngaySinh").split("/");
                if (2022-Integer.parseInt(t[2])>=60){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeF0 () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM cach_ly_covid";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getString("mucDoCachLy").equals("F0")){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeF1 () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM cach_ly_covid";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getString("mucDoCachLy").equals("F1")){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     public int thongKeF2 () throws SQLException, ClassNotFoundException{
        int res = 0;

        String sql = "SELECT * FROM cach_ly_covid";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                if (rs.getString("mucDoCachLy").equals("F2")){
                    res = res + 1;
                }
            }
            
            return res;
        }
    }
     
     
}
