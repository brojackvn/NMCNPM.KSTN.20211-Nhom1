/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import models.ModelCachLyCovid;

/**
 *
 * @author HO ANH
 */
public class ControllerCachLyCovid {

    /**
     *
     * @param modelCachLyCovid
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean insertCachLyCovid(ModelCachLyCovid modelCachLyCovid) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO `cach_ly_covid`(`CMND`, `noiCachLy`, `thoiGianBatDau`, mucDoCachLy, diaDiemDaDiQua, nguoiTao, soLanTest ) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);
        ) {
            pstm.setString(1,modelCachLyCovid.getCMND());
            pstm.setString(2, modelCachLyCovid.getNoiCachLy());
            pstm.setString(3, modelCachLyCovid.getThoiGianBatDau());
            pstm.setString(4, modelCachLyCovid.getMucDoCachLy());
            pstm.setString(5, modelCachLyCovid.getDiaDiemDaDiQua());
            pstm.setString(6, modelCachLyCovid.getNguoiTao());
            pstm.setInt(7, modelCachLyCovid.getSoLanTest());
           
            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
    
}
