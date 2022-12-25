package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.ModelKhaiBaoCovid;

/**
 *
 * @author HO ANH
 */
public class ControllerKhaiBaoCovid {

    public void updateKhaiBaoCovid(ModelKhaiBaoCovid ModelKhaiBaoCovid) throws SQLException, ClassNotFoundException {

        String sql = "Update khai_bao_covid SET CMND=?, soMuiTiem=?, tinhTrangSucKhoe=?, nguoiTao=?, lanTestGanNhat=?, ketQuaLanTestGanNhat=?, diaDiemDaDiQua=? where CMND=?";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, ModelKhaiBaoCovid.getCMND());
            pstmt.setInt(2, ModelKhaiBaoCovid.getSoMuiTiem());
            pstmt.setString(3, ModelKhaiBaoCovid.getTinhTrangSucKhoe());
            pstmt.setString(5, ModelKhaiBaoCovid.getlanTestGanNhat());
            pstmt.setString(6, ModelKhaiBaoCovid.getKetQuaLanTestGanNhat());
            pstmt.setString(7, ModelKhaiBaoCovid.getDiaDiemDaDiQua());
            pstmt.setString(4, ModelKhaiBaoCovid.getNguoiTao());
            pstmt.setString(8, ModelKhaiBaoCovid.getCMND());
            System.out.println(ModelKhaiBaoCovid.getDiaDiemDaDiQua());
            pstmt.execute();

        }
    }

    public boolean insertKhaiBaoCovid(ModelKhaiBaoCovid ModelKhaiBaoCovid) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO `khai_bao_covid`(`CMND`, `soMuiTiem`, `tinhTrangSucKhoe`, lanTestGanNhat, ketQuaLanTestGanNhat, diaDiemDaDiQua, nguoiTao ) VALUES (?,?,?,?,?,?,?)";
        try (
                Connection connection = ConnectDatabase.openConnection();
                PreparedStatement pstm = connection.prepareStatement(sql);) {
            pstm.setString(1, ModelKhaiBaoCovid.getCMND());
            pstm.setInt(2, ModelKhaiBaoCovid.getSoMuiTiem());
            pstm.setString(3, ModelKhaiBaoCovid.getTinhTrangSucKhoe());
            pstm.setString(4, ModelKhaiBaoCovid.getlanTestGanNhat());
            pstm.setString(5, ModelKhaiBaoCovid.getKetQuaLanTestGanNhat());
            pstm.setString(6, ModelKhaiBaoCovid.getDiaDiemDaDiQua());
            pstm.setString(7, ModelKhaiBaoCovid.getNguoiTao());

            return (pstm.executeUpdate() > 0 ? true : false);
        }
    }

    public boolean checkCMND(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM khai_bao_covid";
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
}
