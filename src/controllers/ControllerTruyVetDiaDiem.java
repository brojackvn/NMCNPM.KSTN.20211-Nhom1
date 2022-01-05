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
import models.ModelTruyVetTiepXuc;

/**
 *
 * @author huutu
 */
public class ControllerTruyVetDiaDiem {
     
     
     public String findNguoiByDiaDiem(String diaDiem) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM khai_bao_covid";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
             
                if(rs.getString("diaDiemDaDiQua").contains(diaDiem)){
                System.out.print(rs.getString("CMND"));
                return rs.getString("CMND");
                }
              
                
            }
            return null;
        }
    }
    
}
