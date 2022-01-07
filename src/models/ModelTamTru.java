package models;

import views.swing.table.EventAction;

public class ModelTamTru {
    private String hoVaTen;
    private String ngaySinh;
    private String CMND;
    private String diaChiThuongTru;
    private String noiDen;
    private String ngayCap;
    private String nguoiTao;
    private String lyDo;
    private String thoiHan;
    private String DiaChiTamTru;
    
    public ModelTamTru() {
    }

    public ModelTamTru(String hoVaTen, String diaChiTamTru, String lyDo){
        this.hoVaTen = hoVaTen;
        this.DiaChiTamTru = diaChiTamTru;
        this.lyDo = lyDo;
    }

    //object to row table value
    public Object[] toRowTableTamTru() {
//        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
        return new Object[]{hoVaTen, DiaChiTamTru, lyDo};
    } 

    public Object[] toRowTable() {
//        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
        return new Object[]{hoVaTen, DiaChiTamTru, lyDo};
    } 

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getDiaChiThuongTru() {
        return diaChiThuongTru;
    }

    public void setDiaChiThuongTru(String diaChiThuongTru) {
        this.diaChiThuongTru = diaChiThuongTru;
    }

    public String getNoiDen() {
        return noiDen;
    }

    public void setNoiDen(String noiDen) {
        this.noiDen = noiDen;
    }

    public String getNgayCap() {
        return ngayCap;
    }

    public void setNgayCap(String ngayCap) {
        this.ngayCap = ngayCap;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }  

    public String getDiaChiTamTru() {
        return DiaChiTamTru;
    }

    public void setDiaChiTamTru(String DiaChiTamTru) {
        this.DiaChiTamTru = DiaChiTamTru;
    }  
}
