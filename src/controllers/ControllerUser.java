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
import models.ModelUser;

/**
 *
 * @author HO ANH
 */
public class ControllerUser {
    public ModelUser findAllByusername(String username) throws SQLException, ClassNotFoundException {
        ModelUser userModel = new ModelUser();
        String sql = "SELECT * FROM users";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
      
                
                if(rs.getString("username").equals(username)){
                    userModel.setChucVu(rs.getString("chucVu"));
                    userModel.setHoVaTen(rs.getString("hoVaTen"));
                    userModel.setPassword(rs.getString("password"));
                    userModel.setUsername(rs.getString("username"));
                return userModel;
                }
              
                
            }
            return null;
        }
    }
}
