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
import java.util.ArrayList;
import models.ModelTamVang;

/**
 *
 * @author HO ANH
 */
public class ControllerTamVang {

    //return all row from table tamvang
    public ArrayList<ModelTamVang> selectDanhMucTamVang () throws SQLException, ClassNotFoundException{
        ArrayList<ModelTamVang> resultList = new ArrayList<ModelTamVang>();

        String sql = "SELECT * FROM tam_vang";
        
        try (
            Connection con = ConnectDatabase.openConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
        ){
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                ModelTamVang newMTV = new ModelTamVang(rs.getString(1), rs.getString(2), rs.getString(5));
                newMTV.setHoVaTen(newMTV.getHoVaTen_fromCMND(rs.getString(1)));
                resultList.add(newMTV);
            }
        }
        return resultList;
    }
  

}

