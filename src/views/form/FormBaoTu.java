/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerKhaiTu;
import controllers.ControllerLichSu;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelKhaiTu;
import models.ModelLichSu;
import test.Main;
import views.dialog.MessageConfirm;

/**
 *
 * @author huutu
 */
public class FormBaoTu extends javax.swing.JPanel {
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
     * Creates new form FormBaoTu1
     */
    public FormBaoTu() {
        initComponents();
    }
    public FormBaoTu(String username, String chucvu, String hoVaTen, String password ) {
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

        jLabel1 = new javax.swing.JLabel();
        CMNDCCCDBaoTutextField = new views.swing.textfield.TextField();
        ngayKhaitextField = new views.swing.textfield.TextField();
        NhapSoHoKhautextField = new views.swing.textfield.TextField();
        ngayMattextField = new views.swing.textfield.TextField();
        lyDotextField = new views.swing.textfield.TextField();
        nguoiKhaitextField = new views.swing.textfield.TextField();
        saveButton = new views.swing.Button();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BÁO TỬ");

        CMNDCCCDBaoTutextField.setBackground(new java.awt.Color(245, 245, 245));
        CMNDCCCDBaoTutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMNDCCCDBaoTutextField.setLabelText("NHẬP SỐ CMND/CCCD");
        CMNDCCCDBaoTutextField.setOpaque(false);
        CMNDCCCDBaoTutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMNDCCCDBaoTutextFieldActionPerformed(evt);
            }
        });

        ngayKhaitextField.setBackground(new java.awt.Color(245, 245, 245));
        ngayKhaitextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ngayKhaitextField.setLabelText("NGÀY KHAI");
        ngayKhaitextField.setOpaque(false);
        ngayKhaitextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayKhaitextFieldActionPerformed(evt);
            }
        });

        NhapSoHoKhautextField.setBackground(new java.awt.Color(245, 245, 245));
        NhapSoHoKhautextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NhapSoHoKhautextField.setLabelText("NHẬP SỐ HỘ KHẨU");
        NhapSoHoKhautextField.setOpaque(false);
        NhapSoHoKhautextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapSoHoKhautextFieldActionPerformed(evt);
            }
        });

        ngayMattextField.setBackground(new java.awt.Color(245, 245, 245));
        ngayMattextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ngayMattextField.setLabelText("NGÀY MẤT");
        ngayMattextField.setOpaque(false);
        ngayMattextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngayMattextFieldActionPerformed(evt);
            }
        });

        lyDotextField.setBackground(new java.awt.Color(245, 245, 245));
        lyDotextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lyDotextField.setLabelText("LÝ DO");
        lyDotextField.setOpaque(false);
        lyDotextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lyDotextFieldActionPerformed(evt);
            }
        });

        nguoiKhaitextField.setBackground(new java.awt.Color(245, 245, 245));
        nguoiKhaitextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nguoiKhaitextField.setLabelText("NGƯỜI KHAI");
        nguoiKhaitextField.setOpaque(false);
        nguoiKhaitextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nguoiKhaitextFieldActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(89, 89, 255));
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setToolTipText("");
        saveButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        saveButton.setLabel("LƯU");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ngayKhaitextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nguoiKhaitextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NhapSoHoKhautextField, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ngayMattextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(lyDotextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CMNDCCCDBaoTutextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 109, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CMNDCCCDBaoTutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NhapSoHoKhautextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ngayKhaitextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ngayMattextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nguoiKhaitextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CMNDCCCDBaoTutextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMNDCCCDBaoTutextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMNDCCCDBaoTutextFieldActionPerformed

    private void ngayKhaitextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayKhaitextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayKhaitextFieldActionPerformed

    private void NhapSoHoKhautextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapSoHoKhautextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapSoHoKhautextFieldActionPerformed

    private void ngayMattextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngayMattextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngayMattextFieldActionPerformed

    private void lyDotextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lyDotextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lyDotextFieldActionPerformed

    private void nguoiKhaitextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nguoiKhaitextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nguoiKhaitextFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        if (CMNDCCCDBaoTutextField.getText().equals("") || ngayKhaitextField.getText().equals("") || ngayMattextField.getText().equals("")
            || NhapSoHoKhautextField.getText().equals("") || nguoiKhaitextField.getText().equals("") || lyDotextField.getText().equals("")
        ) {
            showMessage("Chưa nhập đầy đủ các trường cần thiết", 2);
        }
        else{

            try{
                ControllerKhaiTu khaiTuController = new ControllerKhaiTu();
                ModelKhaiTu x = new ModelKhaiTu(NhapSoHoKhautextField.getText(), nguoiKhaitextField.getText(), CMNDCCCDBaoTutextField.getText(), ngayMattextField.getText(), lyDotextField.getText(), this.hoVaTen, ngayKhaitextField.getText());

                try {
                    khaiTuController.insertKhaiTu(x);
                } catch (SQLException ex) {
                    Logger.getLogger(FormKhaiBaoCovid.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FormKhaiBaoCovid.class.getName()).log(Level.SEVERE, null, ex);
                }
                CMNDCCCDBaoTutextField.setText("");
                nguoiKhaitextField.setText("");
                NhapSoHoKhautextField.setText("");
                ngayMattextField.setText("");
                lyDotextField.setText("");
                ngayKhaitextField.setText("");
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                ControllerLichSu lichsuController = new ControllerLichSu();
                ///public ModelLichSu(String ngayThayDoi, String nguoiThayDoi, String loaiThayDoi, String chucVu)
                lichsuController.insertLichSu(new ModelLichSu(formatter.format(date).toString(), this.hoVaTen, "Báo tử", this.chucVu));
            }
            catch(Exception ex){
                showMessage("Nhập sai", 2);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMNDCCCDBaoTutextField;
    private views.swing.textfield.TextField NhapSoHoKhautextField;
    private javax.swing.JLabel jLabel1;
    private views.swing.textfield.TextField lyDotextField;
    private views.swing.textfield.TextField ngayKhaitextField;
    private views.swing.textfield.TextField ngayMattextField;
    private views.swing.textfield.TextField nguoiKhaitextField;
    private views.swing.Button saveButton;
    // End of variables declaration//GEN-END:variables
}
