package models;

public class ModelKhaiBaoCovid {
    private String CMND;
    private int soMuiTiem;
    private String tinhTrangSucKhoe;
    private String nguoiTao;
    private String lanTestGanNhat;
    private String laFmay;

    public ModelKhaiBaoCovid() {
    }
    
    public String getlaFmay(){
        return laFmay;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getSoMuiTiem() {
        return soMuiTiem;
    }
    
    public void setlaFmay(String laFmay){
        this.laFmay = laFmay;
    }

    public void setSoMuiTiem(int soMuiTiem) {
        this.soMuiTiem = soMuiTiem;
    }

    public String getTinhTrangSucKhoe() {
        return tinhTrangSucKhoe;
    }

    public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getlanTestGanNhat() {
        return lanTestGanNhat;
    }

    public void setlanTestGanNhat(String lanTestGanNhat) {
        this.lanTestGanNhat = lanTestGanNhat;
    }
}
