package models;

public class ModelTamVang {
    private String CMND;
    private String noiTamTru;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String lyDo;
    private String nguoiTao;

    public ModelTamVang() {
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

    public String getngayBatDau() {
        return ngayBatDau;
    }

    public void setngayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getngayKetThuc() {
        return ngayKetThuc;
    }

    public void setngayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
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
}
