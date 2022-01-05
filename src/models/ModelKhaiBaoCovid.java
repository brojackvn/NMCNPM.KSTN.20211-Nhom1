package models;

public class ModelKhaiBaoCovid {
    private String CMND;
    private int soMuiTiem;
    private String tinhTrangSucKhoe;
    private String nguoiTao;
    private String lanTestGanNhat;
    private String diaDiemDaDiQua;
    private String ketQuaLanTestGanNhat;

    public String getLanTestGanNhat() {
        return lanTestGanNhat;
    }

    public void setLanTestGanNhat(String lanTestGanNhat) {
        this.lanTestGanNhat = lanTestGanNhat;
    }

    public String getDiaDiemDaDiQua() {
        return diaDiemDaDiQua;
    }

    public void setDiaDiemDaDiQua(String diaDiemDaDiQua) {
        this.diaDiemDaDiQua = diaDiemDaDiQua;
    }

    public String getKetQuaLanTestGanNhat() {
        return ketQuaLanTestGanNhat;
    }

    public void setKetQuaLanTestGanNhat(String ketQuaLanTestGanNhat) {
        this.ketQuaLanTestGanNhat = ketQuaLanTestGanNhat;
    }
    
    
  

    public ModelKhaiBaoCovid(String CMND, int soMuiTiem, String tinhTrangSucKhoe, String lanTestGanNhat, String ketQuaTestGanNhat, String diaDiemDaDiQua ,String nguoiTao) {
        this.CMND = CMND;
        this.soMuiTiem = soMuiTiem;
        this.tinhTrangSucKhoe = tinhTrangSucKhoe;
        this.lanTestGanNhat = lanTestGanNhat;
        this.ketQuaLanTestGanNhat = ketQuaTestGanNhat;
        this.diaDiemDaDiQua = diaDiemDaDiQua;
        this.nguoiTao = nguoiTao;
        
        
    }
    public void printKhaiBaoCovid(){
        System.out.println("CMND" + this.CMND);
        System.out.println("soMuitiem" + this.soMuiTiem);
        System.out.println("tinhTrangSucKhoe" + this.tinhTrangSucKhoe);
        System.out.println("lanTestgannhat"+this.lanTestGanNhat);
        System.out.println("ketQuaLanTestGanNhat" + this.ketQuaLanTestGanNhat);
        System.out.println("diaDiemDaDiQua" + this.diaDiemDaDiQua);
        System.out.println("Nguoitao" + this.nguoiTao);
        
        
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
