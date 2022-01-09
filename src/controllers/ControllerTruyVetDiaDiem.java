/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import connection.ConnectDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.ModelTruyVetDiaDiem;
import models.ModelTruyVetTiepXuc;
import java.util.ArrayList;
/**
 *
 * @author huutu
 */
public class ControllerTruyVetDiaDiem {
   
    ArrayList<ModelTruyVetDiaDiem> mangTruyVetDiaDiem = new ArrayList<ModelTruyVetDiaDiem>();
    public String findNgaySinhByCMND(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM nhan_khau";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
      
                
                if(rs.getString("CMND").equals(CMND)){
             
                return rs.getString("ngaySinh");
                }
              
                
            }
            return null;
        }
    }
     public String findHoVaTenByCMND(String CMND) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM nhan_khau";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
              
                if(rs.getString("CMND").equals(CMND)){
          
                return rs.getString("hoVaTen");
                }
              
                
            }
            return null;
        }
    }
      
    
     public ArrayList<ModelTruyVetDiaDiem> findNguoiByDiaDiem(String diaDiem) throws SQLException, ClassNotFoundException {
  
        String sql = "SELECT * FROM khai_bao_covid";
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
           
            ResultSet rs = pstmt.executeQuery();
               
            while (rs.next()) {

                if(rs.getString("diaDiemDaDiQua").contains(diaDiem)){
                    ControllerTruyVetDiaDiem truyvetdiadiem = new ControllerTruyVetDiaDiem();
                    ModelTruyVetDiaDiem x = new ModelTruyVetDiaDiem();
                    String hoVaTen;
                    String ngaySinh;
                    hoVaTen = new String(truyvetdiadiem.findHoVaTenByCMND(rs.getString("CMND")));
                    ngaySinh = new String(truyvetdiadiem.findNgaySinhByCMND(rs.getString("CMND")));
                
                    x.setHoVaTen(hoVaTen);
                    x.setNgaySinh(ngaySinh);
                
                
                    mangTruyVetDiaDiem.add(x);
           
                }
              
                
            }
            return mangTruyVetDiaDiem;
        }
    }
     
     
     
    public ArrayList<ModelTruyVetDiaDiem> findNguoiByMangDiaDiem(String[] diaDiem) throws SQLException, ClassNotFoundException {
  
        String sql = "SELECT * FROM khai_bao_covid where diaDiemDaDiQua like ?";
        for (int i=1; i<diaDiem.length; i++){
            sql = sql + " or diaDiemDaDiqua like ?";
        }
        
        try (
                Connection con = ConnectDatabase.openConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
        ) {
            pstmt.setString(1, "123");
            for (int i=0; i<diaDiem.length; i++){
                pstmt.setString(i+1, "%" + diaDiem[i] +"%");
                System.out.println(diaDiem[i]);
            }
           
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("CMND"));
                 ControllerTruyVetDiaDiem truyvetdiadiem = new ControllerTruyVetDiaDiem();
                ModelTruyVetDiaDiem x = new ModelTruyVetDiaDiem();
                String hoVaTen;
                String ngaySinh;
                hoVaTen = new String(truyvetdiadiem.findHoVaTenByCMND(rs.getString("CMND")));
                ngaySinh = new String(truyvetdiadiem.findNgaySinhByCMND(rs.getString("CMND")));
                
                x.setHoVaTen(hoVaTen);
                x.setNgaySinh(ngaySinh);
                System.out.println(x.getHoVaTen());
                System.out.println(x.getNgaySinh());
           
                mangTruyVetDiaDiem.add(x);
            }
            
            return mangTruyVetDiaDiem;
        }
    }
    
}
