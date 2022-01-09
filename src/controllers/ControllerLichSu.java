
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import models.ModelLichSu;

public class ControllerLichSu {
    public static ArrayList<ModelLichSu> selectDanhMucLichSu() throws SQLException, ClassNotFoundException {
        ArrayList<ModelLichSu> resultList = new ArrayList<ModelLichSu>();
        String sql = "SELECT * FROM lich_su";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ModelLichSu lichSu = new ModelLichSu(rs.getString("ngayThayDoi"), rs.getString("nguoiThayDoi"), rs.getString("loaiThayDoi"), rs.getString("chucVu"));
                resultList.add(lichSu);
            }
            System.out.println(resultList.size());
            return resultList;
        }
    }
}
