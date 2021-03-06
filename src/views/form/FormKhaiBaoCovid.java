/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;
import controllers.ControllerKhaiBaoCovid;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import models.ModelKhaiBaoCovid;
import models.ModelUser;
import javax.swing.*;
import test.Main;
import views.dialog.MessageConfirm;

/**
 *
 * @author HO ANH
 */
public class FormKhaiBaoCovid extends javax.swing.JPanel {

    /**
     * Creates new form FormKhaiBaoCovid
     */
    public FormKhaiBaoCovid() {
        initComponents();
     
    }
    
    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }

    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KieuButtonGroup = new javax.swing.ButtonGroup();
        TinhTrangSucKhoeButtonGroup = new javax.swing.ButtonGroup();
        SoMuiTiemButton = new javax.swing.ButtonGroup();
        SoMuiTiem = new javax.swing.JLabel();
        TinhTrangSucKhoe = new javax.swing.JLabel();
        SaveButton = new views.swing.Button();
        KhongRadioButton = new javax.swing.JRadioButton();
        HoCamSotRadioButton = new javax.swing.JRadioButton();
        HaiMuiTiemRadioButton = new javax.swing.JRadioButton();
        MotMuiTiemRadioButton = new javax.swing.JRadioButton();
        KhongMuiTiemRadioButton = new javax.swing.JRadioButton();
        DiaDiemDiChuyentextField = new views.swing.textfield.TextField();
        CMCDCovidtextField = new views.swing.textfield.TextField();
        LanTestGanNhattextField = new views.swing.textfield.TextField();
        ketQuaLanTestGanNhattextField = new views.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        SoMuiTiem.setBackground(new java.awt.Color(245, 245, 245));
        SoMuiTiem.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        SoMuiTiem.setForeground(new java.awt.Color(153, 153, 153));
        SoMuiTiem.setText("S??? M??I TI??M:");

        TinhTrangSucKhoe.setBackground(new java.awt.Color(245, 245, 245));
        TinhTrangSucKhoe.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        TinhTrangSucKhoe.setForeground(new java.awt.Color(153, 153, 153));
        TinhTrangSucKhoe.setText("T??NH TR???NG S???C KH???E:");

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

        KhongRadioButton.setBackground(new java.awt.Color(245, 245, 245));
        TinhTrangSucKhoeButtonGroup.add(KhongRadioButton);
        KhongRadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KhongRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        KhongRadioButton.setLabel("Kh??ng");

        HoCamSotRadioButton.setBackground(new java.awt.Color(245, 245, 245));
        TinhTrangSucKhoeButtonGroup.add(HoCamSotRadioButton);
        HoCamSotRadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        HoCamSotRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        HoCamSotRadioButton.setLabel("Ho, c???m, s???t");

        HaiMuiTiemRadioButton.setBackground(new java.awt.Color(245, 245, 245));
        SoMuiTiemButton.add(HaiMuiTiemRadioButton);
        HaiMuiTiemRadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        HaiMuiTiemRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        HaiMuiTiemRadioButton.setLabel("2");
        HaiMuiTiemRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HaiMuiTiemRadioButtonActionPerformed(evt);
            }
        });

        MotMuiTiemRadioButton.setBackground(new java.awt.Color(245, 245, 245));
        SoMuiTiemButton.add(MotMuiTiemRadioButton);
        MotMuiTiemRadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        MotMuiTiemRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        MotMuiTiemRadioButton.setLabel("1");
        MotMuiTiemRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MotMuiTiemRadioButtonActionPerformed(evt);
            }
        });

        KhongMuiTiemRadioButton.setBackground(new java.awt.Color(245, 245, 245));
        SoMuiTiemButton.add(KhongMuiTiemRadioButton);
        KhongMuiTiemRadioButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        KhongMuiTiemRadioButton.setForeground(new java.awt.Color(153, 153, 153));
        KhongMuiTiemRadioButton.setLabel("0");

        DiaDiemDiChuyentextField.setBackground(new java.awt.Color(245, 245, 245));
        DiaDiemDiChuyentextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DiaDiemDiChuyentextField.setLabelText("???? ??I ????U TRONG 14 NG??Y (NH???P ?????A ??I???M C??CH NHAU B???I \";\")");
        DiaDiemDiChuyentextField.setOpaque(false);
        DiaDiemDiChuyentextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaDiemDiChuyentextFieldActionPerformed(evt);
            }
        });

        CMCDCovidtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMCDCovidtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDCovidtextField.setLabelText("S??? CMND/CCCD");
        CMCDCovidtextField.setOpaque(false);
        CMCDCovidtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDCovidtextFieldActionPerformed(evt);
            }
        });

        LanTestGanNhattextField.setBackground(new java.awt.Color(245, 245, 245));
        LanTestGanNhattextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LanTestGanNhattextField.setLabelText("L???N TEST G???N NH???T");
        LanTestGanNhattextField.setOpaque(false);
        LanTestGanNhattextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LanTestGanNhattextFieldActionPerformed(evt);
            }
        });

        ketQuaLanTestGanNhattextField.setBackground(new java.awt.Color(245, 245, 245));
        ketQuaLanTestGanNhattextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ketQuaLanTestGanNhattextField.setLabelText("K???T QU??? L???N TEST G???N NH???T");
        ketQuaLanTestGanNhattextField.setOpaque(false);
        ketQuaLanTestGanNhattextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ketQuaLanTestGanNhattextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KHAI B??O Y T???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CMCDCovidtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 451, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiaDiemDiChuyentextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ketQuaLanTestGanNhattextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TinhTrangSucKhoe, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(HoCamSotRadioButton)
                                        .addGap(27, 27, 27)
                                        .addComponent(KhongRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SoMuiTiem, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(KhongMuiTiemRadioButton)
                                        .addGap(50, 50, 50)
                                        .addComponent(MotMuiTiemRadioButton)
                                        .addGap(50, 50, 50)
                                        .addComponent(HaiMuiTiemRadioButton))
                                    .addComponent(LanTestGanNhattextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(CMCDCovidtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TinhTrangSucKhoe)
                    .addComponent(HoCamSotRadioButton)
                    .addComponent(KhongRadioButton))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SoMuiTiem)
                    .addComponent(KhongMuiTiemRadioButton)
                    .addComponent(MotMuiTiemRadioButton)
                    .addComponent(HaiMuiTiemRadioButton))
                .addGap(35, 35, 35)
                .addComponent(LanTestGanNhattextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ketQuaLanTestGanNhattextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(DiaDiemDiChuyentextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (CMCDCovidtextField.getText().equals("") || DiaDiemDiChuyentextField.getText().equals("") || LanTestGanNhattextField.getText().equals("")
                || ketQuaLanTestGanNhattextField.getText().equals("") || (!HoCamSotRadioButton.isSelected() && !KhongRadioButton.isSelected()) || (!MotMuiTiemRadioButton.isSelected()
                && !HaiMuiTiemRadioButton.isSelected() && !KhongMuiTiemRadioButton.isSelected())) {
            showMessage("Ch??a nh???p ?????y ????? c??c tr?????ng c???n thi???t", 2);
        } else {
            ControllerKhaiBaoCovid checkCMNDkhai = new ControllerKhaiBaoCovid();
            try {
                if (!checkCMNDkhai.checkCMND(CMCDCovidtextField.getText())) {
                    try {
                        ControllerKhaiBaoCovid khaiBaoCovidController = new ControllerKhaiBaoCovid();
                        ModelKhaiBaoCovid x = new ModelKhaiBaoCovid(CMCDCovidtextField.getText(), Integer.parseInt(getSelectedButtonText(SoMuiTiemButton)), getSelectedButtonText(TinhTrangSucKhoeButtonGroup), LanTestGanNhattextField.getText(), ketQuaLanTestGanNhattextField.getText(), DiaDiemDiChuyentextField.getText(), "user1");
                        x.printKhaiBaoCovid();
                        try {
                            khaiBaoCovidController.insertKhaiBaoCovid(x);
                        } catch (SQLException ex) {
                            Logger.getLogger(FormKhaiBaoCovid.class.getName()).log(Level.SEVERE, null, ex);
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(FormKhaiBaoCovid.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        CMCDCovidtextField.setText("");
                        DiaDiemDiChuyentextField.setText("");
                        DiaDiemDiChuyentextField.setText("");
                        KieuButtonGroup.clearSelection();
                        TinhTrangSucKhoeButtonGroup.clearSelection();
                        SoMuiTiemButton.clearSelection();
                        LanTestGanNhattextField.setText("");
                        DiaDiemDiChuyentextField.setText("");
                        ketQuaLanTestGanNhattextField.setText("");
                    } catch (Exception ex) {
                        showMessage("Nh???p sai", 2);
                    }
                } else {
                    checkCMNDkhai.updateKhaiBaoCovid(new ModelKhaiBaoCovid(CMCDCovidtextField.getText(), Integer.parseInt(getSelectedButtonText(SoMuiTiemButton)), getSelectedButtonText(TinhTrangSucKhoeButtonGroup), LanTestGanNhattextField.getText(), ketQuaLanTestGanNhattextField.getText(), DiaDiemDiChuyentextField.getText(), "user1"));
                    CMCDCovidtextField.setText("");
                    DiaDiemDiChuyentextField.setText("");
                    DiaDiemDiChuyentextField.setText("");
                    KieuButtonGroup.clearSelection();
                    TinhTrangSucKhoeButtonGroup.clearSelection();
                    SoMuiTiemButton.clearSelection();
                    LanTestGanNhattextField.setText("");
                    DiaDiemDiChuyentextField.setText("");
                    ketQuaLanTestGanNhattextField.setText("");

                }

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void DiaDiemDiChuyentextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaDiemDiChuyentextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaDiemDiChuyentextFieldActionPerformed

    private void CMCDCovidtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMCDCovidtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMCDCovidtextFieldActionPerformed

    private void LanTestGanNhattextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LanTestGanNhattextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LanTestGanNhattextFieldActionPerformed

    private void MotMuiTiemRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MotMuiTiemRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MotMuiTiemRadioButtonActionPerformed

    private void HaiMuiTiemRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HaiMuiTiemRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HaiMuiTiemRadioButtonActionPerformed

    private void ketQuaLanTestGanNhattextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ketQuaLanTestGanNhattextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ketQuaLanTestGanNhattextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMCDCovidtextField;
    private views.swing.textfield.TextField DiaDiemDiChuyentextField;
    private javax.swing.JRadioButton HaiMuiTiemRadioButton;
    private javax.swing.JRadioButton HoCamSotRadioButton;
    private javax.swing.JRadioButton KhongMuiTiemRadioButton;
    private javax.swing.JRadioButton KhongRadioButton;
    private javax.swing.ButtonGroup KieuButtonGroup;
    private views.swing.textfield.TextField LanTestGanNhattextField;
    private javax.swing.JRadioButton MotMuiTiemRadioButton;
    private views.swing.Button SaveButton;
    private javax.swing.JLabel SoMuiTiem;
    private javax.swing.ButtonGroup SoMuiTiemButton;
    private javax.swing.JLabel TinhTrangSucKhoe;
    private javax.swing.ButtonGroup TinhTrangSucKhoeButtonGroup;
    private javax.swing.JLabel jLabel1;
    private views.swing.textfield.TextField ketQuaLanTestGanNhattextField;
    // End of variables declaration//GEN-END:variables
}
