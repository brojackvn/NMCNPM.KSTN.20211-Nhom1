/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerLichSu;
import controllers.ControllerNhanKhau;
import controllers.ControllerTamVang;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelLichSu;
import models.ModelTamVang;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import test.Main;
import views.dialog.MessageConfirm;

/**
 *
 * @author HO ANH
 */
public class FormTamVang extends javax.swing.JPanel {
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
    /**
     * Creates new form FormTamVang
     */
    public FormTamVang() {
        initComponents();
    }
    public FormTamVang(String username, String chucvu, String hoVaTen, String password) {
        this.hoVaTen = hoVaTen;
        this.chucVu = chucvu;
        this.passWord = password;
        this.userName = username;
        initComponents();
    }

    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CMCDTamVangtextField = new views.swing.textfield.TextField();
        NoiTamTrutextField = new views.swing.textfield.TextField();
        NgayKetThuctextField = new views.swing.textfield.TextField();
        LyDotextField = new views.swing.textfield.TextField();
        SaveButton = new views.swing.Button();
        NgayBatDautextField = new views.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        CMCDTamVangtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMCDTamVangtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDTamVangtextField.setLabelText("S??? CMND/CCCD");
        CMCDTamVangtextField.setOpaque(false);
        CMCDTamVangtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDTamVangtextFieldActionPerformed(evt);
            }
        });

        NoiTamTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        NoiTamTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NoiTamTrutextField.setLabelText("N??I T???M TR??");
        NoiTamTrutextField.setOpaque(false);
        NoiTamTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NoiTamTrutextFieldActionPerformed(evt);
            }
        });

        NgayKetThuctextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayKetThuctextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayKetThuctextField.setLabelText("NG??Y K???T TH??C");
        NgayKetThuctextField.setOpaque(false);
        NgayKetThuctextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayKetThuctextFieldActionPerformed(evt);
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

        NgayBatDautextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayBatDautextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayBatDautextField.setLabelText("NG??Y B???T ?????U");
        NgayBatDautextField.setOpaque(false);
        NgayBatDautextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayBatDautextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KHAI B??O TH??NG TIN T???M V???NG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NoiTamTrutextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(NgayBatDautextField, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addGap(244, 244, 244)
                .addComponent(NgayKetThuctextField, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
            .addComponent(LyDotextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CMCDTamVangtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(CMCDTamVangtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(NoiTamTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayBatDautextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayKetThuctextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            showMessage("Ch??a nh???p ?????y ????? c??c tr?????ng c???n thi???t", 2);
        }
        else{
        try {
            ControllerNhanKhau checkCMND = new ControllerNhanKhau();
            if (checkCMND.checkCMNDIsExist(CMCDTamVangtextField.getText())){
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
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	Date date = new Date();
            ControllerLichSu lichsuController = new ControllerLichSu();
                ///public ModelLichSu(String ngayThayDoi, String nguoiThayDoi, String loaiThayDoi, String chucVu)
                lichsuController.insertLichSu(new ModelLichSu(formatter.format(date).toString(), this.hoVaTen, "T???m v???ng", this.chucVu));
            }
            else{
                showMessage("CMND kh??ng t???n t???i!!!", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormTamVang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormTamVang.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void NgayBatDautextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayBatDautextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayBatDautextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMCDTamVangtextField;
    private views.swing.textfield.TextField LyDotextField;
    private views.swing.textfield.TextField NgayBatDautextField;
    private views.swing.textfield.TextField NgayKetThuctextField;
    private views.swing.textfield.TextField NoiTamTrutextField;
    private views.swing.Button SaveButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
