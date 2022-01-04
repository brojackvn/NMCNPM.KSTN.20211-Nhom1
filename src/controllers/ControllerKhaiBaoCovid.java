/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ModelKhaiBaoCovid;

/**
 *
 * @author HO ANH
 */
public class ControllerKhaiBaoCovid {
    
    public boolean insertKhaiBaoCovid(ModelKhaiBaoCovid ModelKhaiBaoCovid) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO `khai_bao_covid`(`CMND`, `soMuiTiem`, `tinhTrangSucKhoe`, `nguoiTao`, lanTestGanNhat, diaDiemDaDiQua, laFMAY ) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1,ModelKhaiBaoCovid.getCMND());
            pstm.setInt(2, ModelKhaiBaoCovid.getSoMuiTiem());
            pstm.setString(3, ModelKhaiBaoCovid.getTinhTrangSucKhoe());
            pstm.setString(4, ModelKhaiBaoCovid.getNguoiTao());
            pstm.setString(5, ModelKhaiBaoCovid.getlanTestGanNhat());
           
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
    
}
