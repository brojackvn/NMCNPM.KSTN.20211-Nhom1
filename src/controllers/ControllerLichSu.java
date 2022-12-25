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
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                ModelLichSu lichSu = new ModelLichSu(rs.getString("ngayThayDoi"), rs.getString("nguoiThayDoi"), rs.getString("loaiThayDoi"), rs.getString("chucVu"));
                resultList.add(lichSu);
            }
            System.out.println(resultList.size());
            return resultList;
        }
    }

    public boolean insertLichSu(ModelLichSu modelLichSu) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `lich_su`(ngayThayDoi, nguoiThayDoi, loaiThayDoi, chucVu) VALUES (?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);) {
            pstm.setString(1, modelLichSu.getNgayThayDoi());
            pstm.setString(2, modelLichSu.getNguoiThayDoi());
            pstm.setString(3, modelLichSu.getLoaiThayDoi());
            pstm.setString(4, modelLichSu.getChucVu());

            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }
}
