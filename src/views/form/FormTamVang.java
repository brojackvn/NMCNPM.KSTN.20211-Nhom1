/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerTamVang;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelTamVang;

/**
 *
 * @author HO ANH
 */
public class FormTamVang extends javax.swing.JPanel {

    /**
     * Creates new form FormTamVang
     */
    public FormTamVang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CMCDTamVangtextField = new views.swing.textfield.TextField();
        NoiTamTrutextField = new views.swing.textfield.TextField();
        NgayKetThuctextField = new views.swing.textfield.TextField();
        LyDotextField = new views.swing.textfield.TextField();
        SaveButton = new views.swing.Button();
        InButton = new views.swing.Button();
        NgayBatDautextField = new views.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        CMCDTamVangtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMCDTamVangtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDTamVangtextField.setLabelText("SỐ CMND/CCCD");
        CMCDTamVangtextField.setOpaque(false);
        CMCDTamVangtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDTamVangtextFieldActionPerformed(evt);
            }
        });

        NoiTamTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        NoiTamTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NoiTamTrutextField.setLabelText("NƠI TẠM TRÚ");
        NoiTamTrutextField.setOpaque(false);
        NoiTamTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoiTamTrutextFieldActionPerformed(evt);
            }
        });

        NgayKetThuctextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayKetThuctextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayKetThuctextField.setLabelText("NGÀY KẾT THÚC");
        NgayKetThuctextField.setOpaque(false);
        NgayKetThuctextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayKetThuctextFieldActionPerformed(evt);
            }
        });

        LyDotextField.setBackground(new java.awt.Color(245, 245, 245));
        LyDotextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LyDotextField.setLabelText("LÝ DO");
        LyDotextField.setOpaque(false);
        LyDotextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LyDotextFieldActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(89, 89, 255));
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setToolTipText("");
        SaveButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SaveButton.setLabel("LƯU");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        InButton.setBackground(new java.awt.Color(89, 89, 255));
        InButton.setForeground(new java.awt.Color(255, 255, 255));
        InButton.setToolTipText("");
        InButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        InButton.setLabel("IN");
        InButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InButtonActionPerformed(evt);
            }
        });

        NgayBatDautextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayBatDautextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayBatDautextField.setLabelText("NGÀY BẮT ĐẦU");
        NgayBatDautextField.setOpaque(false);
        NgayBatDautextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayBatDautextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KHAI BÁO THÔNG TIN TẠM VẮNG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CMCDTamVangtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(NoiTamTrutextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NgayBatDautextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(NgayKetThuctextField, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(100, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(InButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(CMCDTamVangtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(NoiTamTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayBatDautextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayKetThuctextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CMCDTamVangtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMCDTamVangtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMCDTamVangtextFieldActionPerformed

    private void NoiTamTrutextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NoiTamTrutextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NoiTamTrutextFieldActionPerformed

    private void NgayKetThuctextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayKetThuctextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayKetThuctextFieldActionPerformed

    private void LyDotextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LyDotextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LyDotextFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (CMCDTamVangtextField.getText().equals("")|| LyDotextField.getText().equals("") || NgayBatDautextField.getText().equals("")
            || NgayKetThuctextField.getText().equals("") || NoiTamTrutextField.getText().equals("")
            )
            
        {
            JOptionPane.showMessageDialog(null, "CHƯA NHẠP ĐỦ CÁC TRƯỜNG CẦN THIẾT");
        }
        else{
        try {
            ControllerTamVang tamVangController = new ControllerTamVang();
            ModelTamVang x = new ModelTamVang();
            x.setCMND(CMCDTamVangtextField.getText());
            x.setLyDo(LyDotextField.getText());
            x.setNguoiTao("user1");
            x.setNoiTamTru(NoiTamTrutextField.getText());
            x.setngayBatDau(NgayBatDautextField.getText());
            x.setngayKetThuc(NgayKetThuctextField.getText());
            
            
            tamVangController.insertTamVang(x);
            
            CMCDTamVangtextField.setText("");
            LyDotextField.setText("");
            NoiTamTrutextField.setText("");
            NgayBatDautextField.setText("");
            NgayKetThuctextField.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(FormTamVang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormTamVang.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void InButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InButtonActionPerformed

    private void NgayBatDautextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayBatDautextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayBatDautextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMCDTamVangtextField;
    private views.swing.Button InButton;
    private views.swing.textfield.TextField LyDotextField;
    private views.swing.textfield.TextField NgayBatDautextField;
    private views.swing.textfield.TextField NgayKetThuctextField;
    private views.swing.textfield.TextField NoiTamTrutextField;
    private views.swing.Button SaveButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
