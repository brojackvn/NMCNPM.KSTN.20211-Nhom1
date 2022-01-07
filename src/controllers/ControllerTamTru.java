/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelTamTru;

/**
 *
 * @author HO ANH
 */

public class ControllerTamTru{

    //insert tam tru
    public boolean insert(ModelTamTru objectTamTru) throws SQLException, ClassNotFoundException{
        String sql = "Insert into `tam_tru` (`hoVaTen`, `ngaySinh`, `CMND`, `diaChiThuongTru`,`noiDen`, `ngayCap`, `nguoiTao`, `lyDo`, `thoiHan`, `DiaChiTamTru`) VALUES (?,?,?,?,?,?,?,?,?,?)";
        try(
            Connection connection = ConnectDatabase.openConnection();
            PreparedStatement pstm = connection.prepareStatement(sql);
        ){
            pstm.setString(1, objectTamTru.getHoVaTen());
            pstm.setString(2, objectTamTru.getNgaySinh());
            pstm.setString(3, objectTamTru.getCMND());
            pstm.setString(4, objectTamTru.getDiaChiThuongTru());
            pstm.setString(5, objectTamTru.getNoiDen());
            pstm.setString(6, objectTamTru.getNgayCap());
            pstm.setString(7, objectTamTru.getNguoiTao());
            pstm.setString(8, objectTamTru.getLyDo());
            pstm.setString(9, objectTamTru.getThoiHan());
            pstm.setString(10, objectTamTru.getDiaChiTamTru());
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }

    //return all row from table tamtru
    public ArrayList<ModelTamTru> selectDanhMucTamTru () throws SQLException, ClassNotFoundException{
        ArrayList<ModelTamTru> resultList = new ArrayList<ModelTamTru>();

        String sql = "SELECT * FROM tam_tru";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ModelTamTru newMTT = new ModelTamTru(rs.getString(2), rs.getString(11), rs.getString(9));
                resultList.add(newMTT);
            }
            
            return resultList;
        }
    }
    
}
