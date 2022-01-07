package models;

import views.event.EventActionFormXoa;

public class ModelNhanKhau {
    private String soHoKhau;
    private String hoVaTen;
    private String tenGoiKhac;
    private String ngaySinh;
    private int gioiTinh; // 0: nu; 1 nam
    private String danToc;
    private String noiSinh;
    private String queQuan;
    private String tonGiao;
    private String quocTich;
    private String CMND;
    private String soHoChieu;
    private String noiThuongTru;
    private String noiOHienTai;
    private String trinhDoHocVan;
    private String trinhDoChuyenMon;
    private String ngheNghiepHienTai;
    private String noiLamViec;
    private String ghiChu;
    private String liDoXoaDKThuongTru;
    private String quanHeChuHo;
    private String nguoiTao;
    
    public ModelNhanKhau() {
    }

    /**
     *
     * @param hoVaTen
     * @param ngaySinh
     * @param gioiTinh
     * @param quanHeChuHo
     * @param CMND
     */
    public ModelNhanKhau(String CMND, String hoVaTen, String ngaySinh, int gioiTinh, String quanHeChuHo) {
        this.CMND = CMND;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.quanHeChuHo = quanHeChuHo;
    }
    
    public ModelNhanKhau(String hoVaTen, String ngaySinh, int gioiTinh, String quanHeChuHo , String noiOHienTai) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.quanHeChuHo = quanHeChuHo;
        this.noiOHienTai = noiOHienTai;
    }

    public Object[] toRowTable() {
        return new Object[]{hoVaTen, ngaySinh, gioiTinh, quanHeChuHo, noiOHienTai};
    } 

    public Object[] toRowTableFormXoaNhanKhau(EventActionFormXoa event) {
        return new Object[]{CMND, hoVaTen, ngaySinh, gioiTinh, quanHeChuHo, new ModelAction(this, event)};
    } 
    
    public String getSoHoKhau() {
        return soHoKhau;
    }

    public void setSoHoKhau(String soHoKhau) {
        this.soHoKhau = soHoKhau;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenGoiKhac() {
        return tenGoiKhac;
    }

    public void setTenGoiKhac(String tenGoiKhac) {
        this.tenGoiKhac = tenGoiKhac;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getTonGiao() {
        return tonGiao;
    }

    public void setTonGiao(String tonGiao) {
        this.tonGiao = tonGiao;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getSoHoChieu() {
        return soHoChieu;
    }

    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    public String getNoiThuongTru() {
        return noiThuongTru;
    }

    public void setNoiThuongTru(String noiThuongTru) {
        this.noiThuongTru = noiThuongTru;
    }

    public String getNoiOHienTai() {
        return noiOHienTai;
    }

    public void setNoiOHienTai(String noiOHienTai) {
        this.noiOHienTai = noiOHienTai;
    }

    public String getTrinhDoHocVan() {
        return trinhDoHocVan;
    }

    public void setTrinhDoHocVan(String trinhDoHocVan) {
        this.trinhDoHocVan = trinhDoHocVan;
    }

    public String getTrinhDoChuyenMon() {
        return trinhDoChuyenMon;
    }

    public void setTrinhDoChuyenMon(String trinhDoChuyenMon) {
        this.trinhDoChuyenMon = trinhDoChuyenMon;
    }

    public String getNgheNghiepHienTai() {
        return ngheNghiepHienTai;
    }

    public void setNgheNghiepHienTai(String ngheNghiepHienTai) {
        this.ngheNghiepHienTai = ngheNghiepHienTai;
    }

    public String getNoiLamViec() {
        return noiLamViec;
    }

    public void setNoiLamViec(String noiLamViec) {
        this.noiLamViec = noiLamViec;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getLiDoXoaDKThuongTru() {
        return liDoXoaDKThuongTru;
    }

    public void setLiDoXoaDKThuongTru(String liDoXoaDKThuongTru) {
        this.liDoXoaDKThuongTru = liDoXoaDKThuongTru;
    }

    public String getQuanHeChuHo() {
        return quanHeChuHo;
    }

    public void setQuanHeChuHo(String quanHeChuHo) {
        this.quanHeChuHo = quanHeChuHo;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

}
