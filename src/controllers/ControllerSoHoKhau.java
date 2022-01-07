/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelSoHoKhau;
import models.ModelNhanKhau;

/**
 *
 * @author HO ANH
 */
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
                ModelSoHoKhau newMTT = new ModelSoHoKhau(rs.getString("hoVaTenChuHo"), rs.getString("ngayDangKi"), rs.getString("diaChi"));
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

}
