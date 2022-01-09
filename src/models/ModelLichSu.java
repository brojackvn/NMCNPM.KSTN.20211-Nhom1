package models;

import java.util.Date;

public class ModelLichSu {
    private String ngayThayDoi;
    private String nguoiThayDoi;
    private String loaiThayDoi;
    private String chucVu;

    public ModelLichSu() {
    }

    public ModelLichSu(String ngayThayDoi, String nguoiThayDoi, String loaiThayDoi, String chucVu) {
        this.ngayThayDoi = ngayThayDoi;
        this.nguoiThayDoi = nguoiThayDoi;
        this.loaiThayDoi = loaiThayDoi;
        this.chucVu = chucVu;
    }
    
    public String getNgayThayDoi() {
        return ngayThayDoi;
    }

    public void setNgayThayDoi(String ngayThayDoi) {
        this.ngayThayDoi = ngayThayDoi;
    }

    public String getNguoiThayDoi() {
        return nguoiThayDoi;
    }

    public void setNguoiThayDoi(String nguoiThayDoi) {
        this.nguoiThayDoi = nguoiThayDoi;
    }

    public String getLoaiThayDoi() {
        return loaiThayDoi;
    }

    public void setLoaiThayDoi(String loaiThayDoi) {
        this.loaiThayDoi = loaiThayDoi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    public Object[] toRowTable() {
        return new Object[]{ngayThayDoi, loaiThayDoi, nguoiThayDoi, chucVu};
    }
}
