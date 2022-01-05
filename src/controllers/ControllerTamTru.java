/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
            pstm.setString(9, modelTamTru.getDiaChuTamTru());
           
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }

    public void insertKhaiBaoCovid(ModelTamTru x) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
