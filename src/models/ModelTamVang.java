package models;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ModelTamVang {
    private String hoVaTen;
    private String CMND;
    private String noiTamTru;
    private String tuNgay;
    private String denNgay;
    private String lyDo;
    private String nguoiTao;

    public ModelTamVang() {
    }
    
    public ModelTamVang(String hoVaTen, String noiTamTru, String lyDo){
        this.hoVaTen = hoVaTen;
        this.noiTamTru = noiTamTru;
        this.lyDo = lyDo;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getNoiTamTru() {
        return noiTamTru;
    }

    public void setNoiTamTru(String noiTamTru) {
        this.noiTamTru = noiTamTru;
    }

    public String getTuNgay() {
        return tuNgay;
    }

    public void setTuNgay(String tuNgay) {
        this.tuNgay = tuNgay;
    }

    public String getDenNgay() {
        return denNgay;
    }

    public void setDenNgay(String denNgay) {
        this.denNgay = denNgay;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public Object[] toRowTableTamVang() {
//        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
        return new Object[]{hoVaTen, noiTamTru, lyDo};
    } 

    //get HoVaTen from CMND tam_vang
    public String getHoVaTen_fromCMND(String CMND) throws SQLException, ClassNotFoundException{
        String sql = "Select hoVaTen from nhan_khau where CMND = ?";
        String hoVaTen = null;
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            pstmt.setString(1, CMND);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                hoVaTen = rs.getString(1);
            }
        }
        return hoVaTen;
    }
}
