/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author huutu
 */
public class ModelTruyVetDiaDiem {
 
    private String ngaySinh;
    private String hoVaTen;

    public ModelTruyVetDiaDiem(String ngaySinh, String hoVaTen){
        this.ngaySinh = ngaySinh;
        this.hoVaTen = hoVaTen;
    }
    public ModelTruyVetDiaDiem(){
    }
    
    
     public Object[] toRowTable() {
        return new Object[]{hoVaTen, ngaySinh};
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

}
