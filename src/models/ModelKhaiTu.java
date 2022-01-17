package models;

import views.event.EventActionFormTach;

public class ModelKhaiTu {
    private String soHoKhau;
    private String hoVaTenNguoiKhai;
    private String CMNDNguoiMat;
    private String ngayMat;
    private String lyDo;
    private String nguoiTao;
    private String ngayKhai;

    public ModelKhaiTu() {
    }

    public ModelKhaiTu(String soHoKhau, String hoVaTenNguoiKhai, String CMNDNguoiMat, String ngayMat, String lyDo, String nguoiTao, String ngayKhai) {
        this.soHoKhau = soHoKhau;
        this.hoVaTenNguoiKhai = hoVaTenNguoiKhai;
        this.CMNDNguoiMat = CMNDNguoiMat;
        this.ngayMat = ngayMat;
        this.lyDo = lyDo;
        this.nguoiTao = nguoiTao;
        this.ngayKhai = ngayKhai;
    }

    public ModelKhaiTu(String CMNDNguoiMat, String ngayMat, String hoVaTenNguoiKhai, String lyDo) {
        this.hoVaTenNguoiKhai = hoVaTenNguoiKhai;
        this.CMNDNguoiMat = CMNDNguoiMat;
        this.ngayMat = ngayMat;
        this.lyDo = lyDo;
    }
    
    public Object[] toRowTable() {
        return new Object[]{CMNDNguoiMat, ngayMat, hoVaTenNguoiKhai, lyDo};
    }
    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getHoVaTenNguoiKhai() {
        return hoVaTenNguoiKhai;
    }

    public void setHoVaTenNguoiKhai(String hoVaTenNguoiKhai) {
        this.hoVaTenNguoiKhai = hoVaTenNguoiKhai;
    }

   

    public String getCMNDNguoiMat() {
        return CMNDNguoiMat;
    }

    public void setCMNDNguoiMat(String CMNDNguoiMat) {
        this.CMNDNguoiMat = CMNDNguoiMat;
    }

    public String getNgayMat() {
        return ngayMat;
    }

    public void setNgayMat(String ngayMat) {
        this.ngayMat = ngayMat;
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

    public String getNgayKhai() {
        return ngayKhai;
    }

    public void setNgayKhai(String ngayKhai) {
        this.ngayKhai = ngayKhai;
    }
}
