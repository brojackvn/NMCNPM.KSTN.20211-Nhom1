/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerNhanKhau;
import controllers.ControllerTruyVetDiaDiem;
import controllers.ControllerTruyVetTiepXuc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelTruyVetDiaDiem;  
import models.ModelTruyVetTiepXuc;
import views.swing.table.Table;

/**
 *
 * @author HO ANH
 */
public class FormTruyVetTiepXuc extends javax.swing.JPanel {

    /**
     * Creates new form FormTruyVetTiepXuc
     */
    public FormTruyVetTiepXuc() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initData();
    }
    
       public void initData() {
        initTableData();       
    }
    
    public void initTableData() {
        // Các data thì mình sẽ lấy từ database
        for (int i=0; i<mangmangTruyVetDiaDiem.size(); i++){
            for (int j=0; j<mangmangTruyVetDiaDiem.get(i).size(); j++){
                table1.addRow(new ModelTruyVetDiaDiem(mangmangTruyVetDiaDiem.get(i).get(j).getNgaySinh(), mangmangTruyVetDiaDiem.get(i).get(j).getHoVaTen()).toRowTable());
            }
            
        }
        
    }
    
        public void clearTableData(Table table1){
        while (table1.getRowCount()>0)
          {
             table1.removeRow(0);
          }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();
        CMNDtextField = new views.swing.textfield.TextField();
        searchButton = new views.swing.Button();

        setBackground(new java.awt.Color(245, 245, 245));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HỌ VÀ TÊN", "NGÀY SINH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        CMNDtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMNDtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMNDtextField.setLabelText("SỐ CMND/CCCD");
        CMNDtextField.setOpaque(false);
        CMNDtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMNDtextFieldActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(89, 89, 255));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("TÌM KIẾM");
        searchButton.setToolTipText("");
        searchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(CMNDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CMNDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CMNDtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMNDtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMNDtextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if (CMNDtextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "BẠN CHƯA NHẬP CHỨNG MINH NHÂN DÂN");
        }
        else{
        mangmangTruyVetDiaDiem.clear();
        clearTableData(table1);
    
            
        System.out.print(table1.getRowCount()+ "rowcount");
        try {
            ControllerNhanKhau checkCMND = new ControllerNhanKhau();
            if (checkCMND.checkCMNDIsExist(CMNDtextField.getText()))
            {
            ModelTruyVetTiepXuc x = new ModelTruyVetTiepXuc();
            x.setCMND(CMNDtextField.getText());
            ControllerTruyVetTiepXuc truyVetTiepXuc = new ControllerTruyVetTiepXuc();
            String diaDiemTiepXuc = new String(truyVetTiepXuc.findDiaDiemByCMND(x.getCMND()));
            String[] mangDiaDiemTiepXuc=diaDiemTiepXuc.split("; ");
            for(int i=0; i<mangDiaDiemTiepXuc.length;i++){
                
                try {
                   
                    ControllerTruyVetDiaDiem truyVetDiaDiem = new ControllerTruyVetDiaDiem();
                    mangTruyVetDiaDiem = truyVetDiaDiem.findNguoiByDiaDiem(new String(mangDiaDiemTiepXuc[i]));
              
                    mangmangTruyVetDiaDiem.add(mangTruyVetDiaDiem);
                   
                } catch (SQLException ex) {
                    Logger.getLogger(FormTruyVetDiaDiem.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormTruyVetDiaDiem.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
            }
           
//            truyVetTiepXuc.findNguoiByDiaDiem(mangDiaDiemTiepXuc[0]);
            
            CMNDtextField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "CHỨNG MINH NHÂN DÂN KHÔNG TỒN TẠI");
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormTruyVetTiepXuc.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormTruyVetTiepXuc.class.getName()).log(Level.SEVERE, null, ex);
        }
         initTableData();
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    private ArrayList<ArrayList<ModelTruyVetDiaDiem>> mangmangTruyVetDiaDiem = new ArrayList<ArrayList<ModelTruyVetDiaDiem>>();
    private ArrayList<ModelTruyVetDiaDiem> mangTruyVetDiaDiem = new ArrayList<ModelTruyVetDiaDiem>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMNDtextField;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.Button searchButton;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
