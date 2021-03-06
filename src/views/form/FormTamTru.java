/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerLichSu;
import controllers.ControllerNhanKhau;
import controllers.ControllerTamTru;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelLichSu;
import models.ModelTamTru;
import test.Main;
import views.dialog.Message;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

public class FormTamTru extends javax.swing.JPanel {
    private String userName;
    private String chucVu;
    private String hoVaTen;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }

    private boolean showMessageOption(String message) {
        MessageOption obj = new MessageOption(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }
    
    public FormTamTru(String username, String chucvu, String hoVaTen, String password ) {
        this.hoVaTen = hoVaTen;
        this.chucVu = chucvu;
        this.passWord = password;
        this.userName = username;
        initComponents();
    }
    
    public FormTamTru() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HoVaTentextField = new views.swing.textfield.TextField();
        NgaySinhtextField = new views.swing.textfield.TextField();
        CMCDtextField = new views.swing.textfield.TextField();
        DiaChiThuongTrutextField = new views.swing.textfield.TextField();
        NgayCaptextField = new views.swing.textfield.TextField();
        LyDotextField = new views.swing.textfield.TextField();
        ThoiHantextField = new views.swing.textfield.TextField();
        SaveButton = new views.swing.Button();
        diaChiTamTrutextField = new views.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        HoVaTentextField.setBackground(new java.awt.Color(245, 245, 245));
        HoVaTentextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        HoVaTentextField.setLabelText("H??? V?? T??N");
        HoVaTentextField.setOpaque(false);
        HoVaTentextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoVaTentextFieldActionPerformed(evt);
            }
        });

        NgaySinhtextField.setBackground(new java.awt.Color(245, 245, 245));
        NgaySinhtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgaySinhtextField.setLabelText("NG??Y SINH");
        NgaySinhtextField.setOpaque(false);
        NgaySinhtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgaySinhtextFieldActionPerformed(evt);
            }
        });

        CMCDtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMCDtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDtextField.setLabelText("S??? CMND/CCCD");
        CMCDtextField.setOpaque(false);
        CMCDtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDtextFieldActionPerformed(evt);
            }
        });

        DiaChiThuongTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        DiaChiThuongTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DiaChiThuongTrutextField.setLabelText("?????A CH??? TH?????NG TR??");
        DiaChiThuongTrutextField.setOpaque(false);
        DiaChiThuongTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiThuongTrutextFieldActionPerformed(evt);
            }
        });

        NgayCaptextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayCaptextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayCaptextField.setLabelText("NG??Y C???P");
        NgayCaptextField.setOpaque(false);
        NgayCaptextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayCaptextFieldActionPerformed(evt);
            }
        });

        LyDotextField.setBackground(new java.awt.Color(245, 245, 245));
        LyDotextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        LyDotextField.setLabelText("L?? DO");
        LyDotextField.setOpaque(false);
        LyDotextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LyDotextFieldActionPerformed(evt);
            }
        });

        ThoiHantextField.setBackground(new java.awt.Color(245, 245, 245));
        ThoiHantextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ThoiHantextField.setLabelText("TH???I H???N");
        ThoiHantextField.setOpaque(false);
        ThoiHantextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThoiHantextFieldActionPerformed(evt);
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

        diaChiTamTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        diaChiTamTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        diaChiTamTrutextField.setLabelText("?????A CH??? T???M TR??");
        diaChiTamTrutextField.setOpaque(false);
        diaChiTamTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiTamTrutextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KHAI B??O TH??NG TIN T???M TR??");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DiaChiThuongTrutextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(diaChiTamTrutextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(NgayCaptextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LyDotextField, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                .addGap(18, 125, Short.MAX_VALUE)
                .addComponent(ThoiHantextField, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(HoVaTentextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CMCDtextField, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(NgaySinhtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(CMCDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoVaTentextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgaySinhtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(DiaChiThuongTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(diaChiTamTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayCaptextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ThoiHantextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SaveButton.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void HoVaTentextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoVaTentextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoVaTentextFieldActionPerformed

    private void NgaySinhtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgaySinhtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgaySinhtextFieldActionPerformed

    private void CMCDtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMCDtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMCDtextFieldActionPerformed

    private void DiaChiThuongTrutextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiThuongTrutextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiThuongTrutextFieldActionPerformed

    private void NgayCaptextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayCaptextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayCaptextFieldActionPerformed

    private void LyDotextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LyDotextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LyDotextFieldActionPerformed

    private void ThoiHantextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThoiHantextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThoiHantextFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        if (CMCDtextField.getText().equals("") || DiaChiThuongTrutextField.getText().equals("") || HoVaTentextField.getText().equals("") || NgaySinhtextField.getText().equals("")
            || LyDotextField.getText().equals("") || NgayCaptextField.equals("") || ThoiHantextField.equals("") || diaChiTamTrutextField.equals(""))
        {
            showMessage("Ch??a nh???p ?????y ????? c??c tr?????ng c???n thi???t", 2);
        }    
        else{
            try {
                ControllerTamTru tamTruController = new ControllerTamTru();
                ModelTamTru x = new ModelTamTru();
                x.setCMND(CMCDtextField.getText());
                x.setDiaChiThuongTru(DiaChiThuongTrutextField.getText());
                x.setDiaChiTamTru(diaChiTamTrutextField.getText());
                x.setHoVaTen(HoVaTentextField.getText());
                x.setLyDo(LyDotextField.getText());
                x.setNgayCap(NgayCaptextField.getText());
                x.setNgaySinh(NgaySinhtextField.getText());
                x.setNguoiTao("user1");
                x.setThoiHan(ThoiHantextField.getText());

                tamTruController.insertTamTru(x);

                CMCDtextField.setText("");
                DiaChiThuongTrutextField.setText("");
                diaChiTamTrutextField.setText("");
                HoVaTentextField.setText("");
                LyDotextField.setText("");
                NgayCaptextField.setText("");
                NgaySinhtextField.setText("");
                ThoiHantextField.setText("");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();

                ControllerLichSu lichsuController = new ControllerLichSu();
                ///public ModelLichSu(String ngayThayDoi, String nguoiThayDoi, String loaiThayDoi, String chucVu)
                lichsuController.insertLichSu(new ModelLichSu(formatter.format(date).toString(), this.hoVaTen, "T???m tr??", this.chucVu));
            } catch (SQLException ex) {
                showMessage("Nh???p sai", 2);
            } catch (ClassNotFoundException ex) {
                showMessage("Nh???p sai", 2);
            }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void diaChiTamTrutextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiTamTrutextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaChiTamTrutextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMCDtextField;
    private views.swing.textfield.TextField DiaChiThuongTrutextField;
    private views.swing.textfield.TextField HoVaTentextField;
    private views.swing.textfield.TextField LyDotextField;
    private views.swing.textfield.TextField NgayCaptextField;
    private views.swing.textfield.TextField NgaySinhtextField;
    private views.swing.Button SaveButton;
    private views.swing.textfield.TextField ThoiHantextField;
    private views.swing.textfield.TextField diaChiTamTrutextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
