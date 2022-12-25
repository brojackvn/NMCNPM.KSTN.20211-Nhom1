package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.ModelKhaiTu;

/**
 *
 * @author huutu
 */
public class ControllerDangNhap {

    public String getPassWordFromUserName(String username) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM users";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                if (rs.getString("username").equals(username)) {
                    return rs.getString("password");
                }
            }
            return null;
        }
    }

    public boolean checkUserName(String username) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM users";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                if (rs.getString("username").equals(username)) {
                    return true;
                }
            }
            return false;
        }
    }
}
