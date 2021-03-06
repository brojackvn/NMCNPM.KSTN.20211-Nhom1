package views.form;

import controllers.ControllerCachLyCovid;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import models.ModelCachLyCovid;
import test.Main;
import views.dialog.MessageConfirm;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author huutu
 */
public class FormCachLy extends javax.swing.JPanel {

    /**
     * Creates new form FormCachLy
     */
    
      public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    
    public FormCachLy() {
        initComponents();
    }

    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mucDoCachLyButtonGroup = new javax.swing.ButtonGroup();
        soLanTestButtonGroup = new javax.swing.ButtonGroup();
        F0RadioButton = new javax.swing.JRadioButton();
        F1RadioButton = new javax.swing.JRadioButton();
        F2RadioButton = new javax.swing.JRadioButton();
        noiCachLytextField = new views.swing.textfield.TextField();
        Kieu = new javax.swing.JLabel();
        CMCDCovidtextField = new views.swing.textfield.TextField();
        thoiGianBatDautextField = new views.swing.textfield.TextField();
        SaveButton = new views.swing.Button();
        DiaDiemDiChuyentextField1 = new views.swing.textfield.TextField();
        Kieu1 = new javax.swing.JLabel();
        MotLanTest = new javax.swing.JRadioButton();
        HaiLanTest = new javax.swing.JRadioButton();
        BaLanTest = new javax.swing.JRadioButton();
        KhongLanTest = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        F0RadioButton.setBackground(new java.awt.Color(245, 245, 245));
        mucDoCachLyButtonGroup.add(F0RadioButton);
        F0RadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        F0RadioButton.setForeground(new java.awt.Color(153, 153, 153));
        F0RadioButton.setActionCommand("asdf");
        F0RadioButton.setLabel("F0");
        F0RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F0RadioButtonActionPerformed(evt);
            }
        });

        F1RadioButton.setBackground(new java.awt.Color(245, 245, 245));
        mucDoCachLyButtonGroup.add(F1RadioButton);
        F1RadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        F1RadioButton.setForeground(new java.awt.Color(153, 153, 153));
        F1RadioButton.setLabel("F1");
        F1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1RadioButtonActionPerformed(evt);
            }
        });

        F2RadioButton.setBackground(new java.awt.Color(245, 245, 245));
        mucDoCachLyButtonGroup.add(F2RadioButton);
        F2RadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        F2RadioButton.setForeground(new java.awt.Color(153, 153, 153));
        F2RadioButton.setLabel("F2");

        noiCachLytextField.setBackground(new java.awt.Color(245, 245, 245));
        noiCachLytextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        noiCachLytextField.setLabelText("N??I C??CH LY");
        noiCachLytextField.setOpaque(false);
        noiCachLytextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noiCachLytextFieldActionPerformed(evt);
            }
        });

        Kieu.setBackground(new java.awt.Color(245, 245, 245));
        Kieu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Kieu.setForeground(new java.awt.Color(153, 153, 153));
        Kieu.setText("S??? L???N TEST");

        CMCDCovidtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMCDCovidtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDCovidtextField.setLabelText("S??? CMND/CCCD");
        CMCDCovidtextField.setOpaque(false);
        CMCDCovidtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDCovidtextFieldActionPerformed(evt);
            }
        });

        thoiGianBatDautextField.setBackground(new java.awt.Color(245, 245, 245));
        thoiGianBatDautextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        thoiGianBatDautextField.setLabelText("TH???I GIAN B???T ?????U");
        thoiGianBatDautextField.setOpaque(false);
        thoiGianBatDautextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoiGianBatDautextFieldActionPerformed(evt);
            }
        });

        SaveButton.setBackground(new java.awt.Color(89, 89, 255));
        SaveButton.setForeground(new java.awt.Color(255, 255, 255));
        SaveButton.setToolTipText("");
        SaveButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        SaveButton.setLabel("L??U");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        DiaDiemDiChuyentextField1.setBackground(new java.awt.Color(245, 245, 245));
        DiaDiemDiChuyentextField1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DiaDiemDiChuyentextField1.setLabelText("???? ??I ????U TRONG 14 NG??Y (NH???P ?????A ??I???M C??CH NHAU B???I \";\")");
        DiaDiemDiChuyentextField1.setOpaque(false);
        DiaDiemDiChuyentextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaDiemDiChuyentextField1ActionPerformed(evt);
            }
        });

        Kieu1.setBackground(new java.awt.Color(245, 245, 245));
        Kieu1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Kieu1.setForeground(new java.awt.Color(153, 153, 153));
        Kieu1.setText("M???C ????? C??CH LY");

        MotLanTest.setBackground(new java.awt.Color(245, 245, 245));
        soLanTestButtonGroup.add(MotLanTest);
        MotLanTest.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        MotLanTest.setForeground(new java.awt.Color(153, 153, 153));
        MotLanTest.setText("1");
        MotLanTest.setActionCommand("asdf");
        MotLanTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotLanTestActionPerformed(evt);
            }
        });

        HaiLanTest.setBackground(new java.awt.Color(245, 245, 245));
        soLanTestButtonGroup.add(HaiLanTest);
        HaiLanTest.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        HaiLanTest.setForeground(new java.awt.Color(153, 153, 153));
        HaiLanTest.setText("2");
        HaiLanTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HaiLanTestActionPerformed(evt);
            }
        });

        BaLanTest.setBackground(new java.awt.Color(245, 245, 245));
        soLanTestButtonGroup.add(BaLanTest);
        BaLanTest.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        BaLanTest.setForeground(new java.awt.Color(153, 153, 153));
        BaLanTest.setText("3");
        BaLanTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BaLanTestActionPerformed(evt);
            }
        });

        KhongLanTest.setBackground(new java.awt.Color(245, 245, 245));
        soLanTestButtonGroup.add(KhongLanTest);
        KhongLanTest.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KhongLanTest.setForeground(new java.awt.Color(153, 153, 153));
        KhongLanTest.setText("0");
        KhongLanTest.setActionCommand("asdf");
        KhongLanTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KhongLanTestActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KHAI B??O TH??NG TIN C??CH LY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noiCachLytextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(thoiGianBatDautextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Kieu1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(F0RadioButton)
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(MotLanTest)
                                            .addComponent(F1RadioButton))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(HaiLanTest)
                                            .addComponent(F2RadioButton)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Kieu, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(KhongLanTest)
                                        .addGap(213, 213, 213)
                                        .addComponent(BaLanTest)))
                                .addGap(0, 414, Short.MAX_VALUE))
                            .addComponent(DiaDiemDiChuyentextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CMCDCovidtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(CMCDCovidtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(noiCachLytextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(thoiGianBatDautextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Kieu1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(F0RadioButton)
                        .addComponent(F1RadioButton)
                        .addComponent(F2RadioButton)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kieu)
                    .addComponent(MotLanTest)
                    .addComponent(HaiLanTest)
                    .addComponent(BaLanTest)
                    .addComponent(KhongLanTest))
                .addGap(35, 35, 35)
                .addComponent(DiaDiemDiChuyentextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void F0RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F0RadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F0RadioButtonActionPerformed

    private void F1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1RadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_F1RadioButtonActionPerformed

    private void noiCachLytextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noiCachLytextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noiCachLytextFieldActionPerformed

    private void CMCDCovidtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMCDCovidtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMCDCovidtextFieldActionPerformed

    private void thoiGianBatDautextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoiGianBatDautextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thoiGianBatDautextFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (CMCDCovidtextField.getText().equals("") || DiaDiemDiChuyentextField1.getText().equals("") || thoiGianBatDautextField.getText().equals("") || noiCachLytextField.getText().equals("")
            || (!F0RadioButton.isSelected() && !F1RadioButton.isSelected() && !F2RadioButton.isSelected()) 
                ||(!KhongLanTest.isSelected()&&!MotLanTest.isSelected()&&!HaiLanTest.isSelected()&&!BaLanTest.isSelected())
                )   {
             showMessage("Ch??a nh???p ?????y ????? c??c tr?????ng c???n thi???t", 2);
        }
        else{
            ControllerCachLyCovid cachlycontroller = new ControllerCachLyCovid();
            try{
            if (!cachlycontroller.checkCMND(CMCDCovidtextField.getText())){
        ModelCachLyCovid x = new ModelCachLyCovid();
           x.setCMND(CMCDCovidtextField.getText());
           x.setDiaDiemDaDiQua(DiaDiemDiChuyentextField1.getText());
           x.setMucDoCachLy(getSelectedButtonText(mucDoCachLyButtonGroup));
           x.setNguoiTao("user1");
           x.setNoiCachLy(noiCachLytextField.getText());
           x.setSoLanTest(Integer.parseInt(getSelectedButtonText(soLanTestButtonGroup)));
           x.setThoiGianBatDau(thoiGianBatDautextField.getText());
           ControllerCachLyCovid cachLyCovidController = new ControllerCachLyCovid();
          try {
              cachLyCovidController.insertCachLyCovid(x);
          } catch (SQLException ex) {
              Logger.getLogger(FormCachLy.class.getName()).log(Level.SEVERE, null, ex);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(FormCachLy.class.getName()).log(Level.SEVERE, null, ex);
          }
          CMCDCovidtextField.setText("");
          DiaDiemDiChuyentextField1.setText("");
          mucDoCachLyButtonGroup.clearSelection();
          noiCachLytextField.setText("");
          soLanTestButtonGroup.clearSelection();
          thoiGianBatDautextField.setText("");
        }
            else{
            //update cach ly
            ModelCachLyCovid x = new ModelCachLyCovid();
           x.setCMND(CMCDCovidtextField.getText());
           x.setDiaDiemDaDiQua(DiaDiemDiChuyentextField1.getText());
           x.setMucDoCachLy(getSelectedButtonText(mucDoCachLyButtonGroup));
           x.setNguoiTao("user1");
           x.setNoiCachLy(noiCachLytextField.getText());
           x.setSoLanTest(Integer.parseInt(getSelectedButtonText(soLanTestButtonGroup)));
           x.setThoiGianBatDau(thoiGianBatDautextField.getText());
            cachlycontroller.updateKhaiBaoCovid(x);
             CMCDCovidtextField.setText("");
          DiaDiemDiChuyentextField1.setText("");
          mucDoCachLyButtonGroup.clearSelection();
          noiCachLytextField.setText("");
          soLanTestButtonGroup.clearSelection();
          thoiGianBatDautextField.setText("");
            }
            }
           catch(Exception e){
           }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void DiaDiemDiChuyentextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaDiemDiChuyentextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaDiemDiChuyentextField1ActionPerformed

    private void MotLanTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotLanTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotLanTestActionPerformed

    private void HaiLanTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HaiLanTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HaiLanTestActionPerformed

    private void KhongLanTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KhongLanTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KhongLanTestActionPerformed

    private void BaLanTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BaLanTestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BaLanTestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton BaLanTest;
    private views.swing.textfield.TextField CMCDCovidtextField;
    private views.swing.textfield.TextField DiaDiemDiChuyentextField1;
    private javax.swing.JRadioButton F0RadioButton;
    private javax.swing.JRadioButton F1RadioButton;
    private javax.swing.JRadioButton F2RadioButton;
    private javax.swing.JRadioButton HaiLanTest;
    private javax.swing.JRadioButton KhongLanTest;
    private javax.swing.JLabel Kieu;
    private javax.swing.JLabel Kieu1;
    private javax.swing.JRadioButton MotLanTest;
    private views.swing.Button SaveButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.ButtonGroup mucDoCachLyButtonGroup;
    private views.swing.textfield.TextField noiCachLytextField;
    private javax.swing.ButtonGroup soLanTestButtonGroup;
    private views.swing.textfield.TextField thoiGianBatDautextField;
    // End of variables declaration//GEN-END:variables
}
