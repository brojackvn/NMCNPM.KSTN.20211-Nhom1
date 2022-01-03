package models;

import java.text.DecimalFormat;
import java.util.Date;
import views.swing.table.EventAction;
import views.swing.table.ModelAction;
import views.swing.table.ModelProfile;

public class ModelSoHoKhau {
    private String hoVaTenChuHo;
    private String soHoKhau;
    private String diaChi;
    private String ngayDen;
    private String nguoiTao;

    public ModelSoHoKhau() {
    }

    public ModelSoHoKhau(String hoVaTenChuHo, String diaChi, String ngayDen, String nguoiTao) {
        this.hoVaTenChuHo = hoVaTenChuHo;
        this.diaChi = diaChi;
        this.ngayDen = ngayDen;
        this.nguoiTao = nguoiTao;
    }
    
    public Object[] toRowTable(EventAction event) {
//        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
        return new Object[]{hoVaTenChuHo, diaChi,ngayDen, nguoiTao};
    } 
    
    public String getHoVaTenChuHo() {
        return hoVaTenChuHo;
    }

    public void setHoVaTenChuHo(String hoVaTenChuHo) {
        this.hoVaTenChuHo = hoVaTenChuHo;
    }

    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;   
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }
}
