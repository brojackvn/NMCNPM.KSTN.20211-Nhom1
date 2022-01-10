/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerTamVang;
import java.sql.SQLException;
import java.util.ArrayList;
import models.ModelTamVang;

/**
 *
 * @author HO ANH
 */
public class FormDanhMucTamVang extends javax.swing.JPanel {

    /**
     * Creates new form FormDanhMucTamVang
     */
    public FormDanhMucTamVang() {
        initComponents();
        table1.fixTable(jScrollPane1);
        try{
           initDataTable();
        }catch(Exception e){};
    }

    public void initDataTable() throws SQLException, ClassNotFoundException{
        ControllerTamVang TamVang = new ControllerTamVang();
        ArrayList<ModelTamVang> resultListTamVang = new ArrayList<ModelTamVang>();

        resultListTamVang = TamVang.selectDanhMucTamVang(); 

        for(int i=0; i<resultListTamVang.size(); i++){
            table1.addRow(resultListTamVang.get(i).toRowTableTamVang());
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
        jLabel2 = new javax.swing.JLabel();
        ButtonTimKiem = new views.swing.Button();

        setBackground(new java.awt.Color(245, 245, 245));

        table1.setBackground(new java.awt.Color(245, 245, 245));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Họ tên", "Địa chỉ thường trú ", "Lý do"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("DANH MỤC TẠM TRÚ");

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setText("IN PDF");
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(366, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addContainerGap(366, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 477, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed

    }//GEN-LAST:event_ButtonTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonTimKiem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
