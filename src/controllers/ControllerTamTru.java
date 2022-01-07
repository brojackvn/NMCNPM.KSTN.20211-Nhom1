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
public class ControllerTamTru {
    public boolean insertTamTru(ModelTamTru modelTamTru) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO `tam_tru`(`hoVaTen`, `ngaySinh`, `CMND`, diaChiThuongTru, ngayCap, nguoiTao, lyDo, thoiHan, diaChiTamTru ) VALUES (?,?,?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1,modelTamTru.getHoVaTen());
            pstm.setString(2, modelTamTru.getNgaySinh());
            pstm.setString(3, modelTamTru.getCMND());
            pstm.setString(4, modelTamTru.getDiaChiThuongTru());
            pstm.setString(5, modelTamTru.getNgayCap());
            pstm.setString(6, modelTamTru.getNguoiTao());
            pstm.setString(7, modelTamTru.getLyDo());
            pstm.setString(8, modelTamTru.getThoiHan());
            pstm.setString(9, modelTamTru.getDiaChiTamTru());
           
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
