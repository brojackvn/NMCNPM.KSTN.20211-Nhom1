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
import javax.swing.JOptionPane;
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
    public void updatePassword(String username,String oldPassword, String newPassword) throws SQLException, ClassNotFoundException {
     
        String sql = "Update users set password=? "
                    +"where password=? and username=?"
                ;
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            pstmt.setString(1, newPassword);
            pstmt.setString(2, oldPassword);
            pstmt.setString(3, username);
            pstmt.execute();
                }
              
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Mật khẩu hiện tại không đúng");
        }       
            }
     public boolean checkPasswordUsername(String username,String password) throws SQLException, ClassNotFoundException {
     
        String sql = "SELECT * from users"

                ;
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                
               if (rs.getString("username").equals(username) && rs.getString("password").equals(password))
               {
                   System.out.println("Đã vào checkpassword");
                   return true;
               }}

              
            }
            return false;
        }
     }
        
    

