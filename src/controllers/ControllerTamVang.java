/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ModelTamVang;

/**
 *
 * @author HO ANH
 */
public class ControllerTamVang {
    public boolean insertTamVang(ModelTamVang modelTamVang) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO `tam_vang`(`CMND`, `noiTamTru`, `tuNgay`, denNgay, lyDo, nguoiTao) VALUES (?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1,modelTamVang.getCMND());
            pstm.setString(2, modelTamVang.getNoiTamTru());
            pstm.setString(3, modelTamVang.getngayBatDau());
            pstm.setString(4, modelTamVang.getngayKetThuc());
            pstm.setString(5, modelTamVang.getLyDo());
            pstm.setString(6, modelTamVang.getNguoiTao());
           
           
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
}
