package models;

import java.text.DecimalFormat;
import java.util.Date;

public class ModelSoHoKhau {
    private String hoVaTenChuHo;
    private String soHoKhau;
    private String diaChi;
    private String ngayDangKi;
    private String nguoiTao;

    public ModelSoHoKhau() {
    }

    public ModelSoHoKhau(String hoVaTenChuHo, String diaChi, String ngayDangKi) {
        this.hoVaTenChuHo = hoVaTenChuHo;
        this.diaChi = diaChi;
        this.ngayDangKi = ngayDangKi;
    }

    public ModelSoHoKhau(String hoVaTenChuHo, String diaChi, String ngayDen, String nguoiTao) {
        this.hoVaTenChuHo = hoVaTenChuHo;
        this.diaChi = diaChi;
        this.ngayDangKi = ngayDen;
        this.nguoiTao = nguoiTao;
    }
    
    
    public Object[] toRowTable() {
//        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
        return new Object[]{hoVaTenChuHo, diaChi, ngayDangKi, nguoiTao};
    } 

    public Object[] toRowTableSoHoKhau() {
//        return new Object[]{new ModelProfile(icon, name), gender, course, df.format(fees), new ModelAction(this, event)};
        return new Object[]{hoVaTenChuHo, ngayDangKi, diaChi};
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

    public String getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(String ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }
}
