/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerTruyVetDiaDiem;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelNhanKhau;
import models.ModelTruyVetDiaDiem;
import test.Main;
import views.dialog.MessageConfirm;
import views.swing.table.Table;

/**
 *
 * @author HO ANH
 */
public class FormTruyVetDiaDiem extends javax.swing.JPanel {

    /**
     * Creates new form FormTruyVetDiaDiem
     */
    public FormTruyVetDiaDiem() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initData();
    }

    public void initData() {
        initTableData();       
    }
    
    public void initTableData() {
        // Các data thì mình sẽ lấy từ database
        for (int i=0; i<mangTruyVetDiaDiem.size(); i++){
            table1.addRow(new ModelTruyVetDiaDiem(mangTruyVetDiaDiem.get(i).getNgaySinh(), mangTruyVetDiaDiem.get(i).getHoVaTen()).toRowTable());
        }
        
    }
    public void clearTableData(Table table1){
        while (table1.getRowCount()>0)
          {
             table1.removeRow(0);
          }
    }
   
    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();
        diaDiemtextField = new views.swing.textfield.TextField();
        searchButton = new views.swing.Button();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

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

        diaDiemtextField.setBackground(new java.awt.Color(245, 245, 245));
        diaDiemtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        diaDiemtextField.setLabelText("ĐỊA ĐIỂM");
        diaDiemtextField.setOpaque(false);
        diaDiemtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaDiemtextFieldActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRUY VẾT THEO ĐỊA ĐIỂM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(diaDiemtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diaDiemtextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 956, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 583, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        if (diaDiemtextField.getText().equals("")) {
            showMessage("Chưa nhập địa điểm", 2);
        } else {
            try {
                mangTruyVetDiaDiem.clear();
                clearTableData(table1);

                ControllerTruyVetDiaDiem truyVetDiaDiem = new ControllerTruyVetDiaDiem();

                mangTruyVetDiaDiem = truyVetDiaDiem.findNguoiByDiaDiem(diaDiemtextField.getText());

                initTableData();
            } catch (SQLException ex) {
                Logger.getLogger(FormTruyVetDiaDiem.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormTruyVetDiaDiem.class.getName()).log(Level.SEVERE, null, ex);
            }
            diaDiemtextField.setText("");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void diaDiemtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaDiemtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaDiemtextFieldActionPerformed

    private ArrayList<ModelTruyVetDiaDiem> mangTruyVetDiaDiem = new ArrayList<ModelTruyVetDiaDiem>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField diaDiemtextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.Button searchButton;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
