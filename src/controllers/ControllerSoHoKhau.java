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
                ModelSoHoKhau newMTT = new ModelSoHoKhau(rs.getString(1), rs.getString(3), rs.getString(4));
                resultList.add(newMTT);
            }
            return resultList;
        }
        }

}
