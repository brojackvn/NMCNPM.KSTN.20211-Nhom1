package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControllerNhanKhau {
       public boolean checkCMNDIsExist(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM nhan_khau";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
      
                
                if(rs.getString("CMND").equals(CMND)){
             
                return true;
                }
              
                
            }
            return false;
        }
    }
}
