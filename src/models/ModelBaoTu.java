package models;

public class ModelBaoTu {
    private String soHoKhau;
    private String CMND;
    private String ngayKhai;
    private String ngayMat;
    private String nguoiKhai;
    private String nguoiTao;
    private String ghiChu;
    private String hoVaTen;
    private String lyDo;
    
    public ModelBaoTu() {
    }

    public ModelBaoTu(String ngayMat, String hoVaTen, String nguoiKhai, String lyDo) {
        this.ngayMat = ngayMat;
        this.nguoiKhai = nguoiKhai;
        this.hoVaTen = hoVaTen;
        this.lyDo = lyDo;
    }

    public Object[] toRowTable() {
        return new Object[]{ngayMat, hoVaTen, nguoiKhai, lyDo};
    }
    
    public String getSoHoKhau() {
        return soHoKhau;
    }

    public String getCMND() {
        return CMND;
    }

    public String getNgayKhai() {
        return ngayKhai;
    }

    public String getNgayMat() {
        return ngayMat;
    }

    public String getNguoiKhai() {
        return nguoiKhai;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public void setNgayKhai(String ngayKhai) {
        this.ngayKhai = ngayKhai;
    }

    public void setNgayMat(String ngayMat) {
        this.ngayMat = ngayMat;
    }

    public void setNguoiKhai(String nguoiKhai) {
        this.nguoiKhai = nguoiKhai;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
