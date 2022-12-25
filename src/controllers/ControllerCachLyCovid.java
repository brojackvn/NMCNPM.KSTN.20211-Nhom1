package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public boolean insertCachLyCovid(ModelCachLyCovid modelCachLyCovid) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `cach_ly_covid`(`CMND`, `noiCachLy`, `thoiGianBatDau`, mucDoCachLy, diaDiemDaDiQua, nguoiTao, soLanTest ) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);) {
            pstm.setString(1, modelCachLyCovid.getCMND());
            pstm.setString(2, modelCachLyCovid.getNoiCachLy());
            pstm.setString(3, modelCachLyCovid.getThoiGianBatDau());
            pstm.setString(4, modelCachLyCovid.getMucDoCachLy());
            pstm.setString(5, modelCachLyCovid.getDiaDiemDaDiQua());
            pstm.setString(6, modelCachLyCovid.getNguoiTao());
            pstm.setInt(7, modelCachLyCovid.getSoLanTest());

            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }

    public boolean checkCMND(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM cach_ly_covid";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {

                if (rs.getString("CMND").equals(CMND)) {

                    return true;
                }

            }
            return false;
        }
    }

    public void updateKhaiBaoCovid(ModelCachLyCovid ModelCachLyCovid) throws SQLException, ClassNotFoundException {

        String sql = "Update cach_ly_covid SET CMND=?, noiCachLy=?, thoiGianBatDau=?, mucDoCachLy=?, diaDiemDaDiQua=?, nguoiTao=?, soLanTest=? where CMND=?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, ModelCachLyCovid.getCMND());
            pstmt.setString(2, ModelCachLyCovid.getNoiCachLy());
            pstmt.setString(3, ModelCachLyCovid.getThoiGianBatDau());
            pstmt.setString(4, ModelCachLyCovid.getMucDoCachLy());
            pstmt.setString(5, ModelCachLyCovid.getDiaDiemDaDiQua());
            pstmt.setString(6, ModelCachLyCovid.getNguoiTao());
            pstmt.setInt(7, ModelCachLyCovid.getSoLanTest());
            pstmt.setString(8, ModelCachLyCovid.getCMND());

            pstmt.execute();

        }
    }
}
