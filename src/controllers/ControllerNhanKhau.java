package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelNhanKhau;

public class ControllerNhanKhau {
    public ArrayList<ModelNhanKhau> selectDanhMucNhanKhau () throws SQLException, ClassNotFoundException{
        ArrayList<ModelNhanKhau> resultList = new ArrayList<ModelNhanKhau>();

        String sql = "SELECT * FROM nhan_khau";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ModelNhanKhau newMTT = new ModelNhanKhau(rs.getString(2), rs.getString(4), rs.getInt(5), rs.getString(17),rs.getString(6), rs.getString(14), rs.getString(13));
                resultList.add(newMTT);
            }
            return resultList;
        }
        }
}
