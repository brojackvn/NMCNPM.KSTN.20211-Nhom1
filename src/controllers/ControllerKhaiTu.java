/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ModelKhaiTu;

/**
 *
 * @author HO ANH
 */
public class ControllerKhaiTu {
    public boolean insertKhaiTu(ModelKhaiTu modelKhaiTu) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO `khai_tu`(`soHoKhau`, `hoVaTenNguoiKhai`, `CMNDNguoiMat`, ngayMat, lyDo, nguoiTao, ngayKhai ) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1,modelKhaiTu.getSoHoKhau());
            pstm.setString(2, modelKhaiTu.getHoVaTenNguoiKhai());
            pstm.setString(3, modelKhaiTu.getCMNDNguoiMat());
            pstm.setString(4, modelKhaiTu.getNgayMat());
            pstm.setString(5, modelKhaiTu.getLyDo());
            pstm.setString(6, modelKhaiTu.getNguoiTao());
            pstm.setString(7, modelKhaiTu.getNgayKhai());
           
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
}
