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
    
    private void showMessage(String message){
        Message obj = new Message(Main.getFrames()[0],true);
        obj.showMessage(message);
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
        InButton = new views.swing.Button();
        diaChiTamTrutextField = new views.swing.textfield.TextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        HoVaTentextField.setBackground(new java.awt.Color(245, 245, 245));
        HoVaTentextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        HoVaTentextField.setLabelText("HỌ VÀ TÊN");
        HoVaTentextField.setOpaque(false);
        HoVaTentextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoVaTentextFieldActionPerformed(evt);
            }
        });

        NgaySinhtextField.setBackground(new java.awt.Color(245, 245, 245));
        NgaySinhtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgaySinhtextField.setLabelText("NGÀY SINH");
        NgaySinhtextField.setOpaque(false);
        NgaySinhtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgaySinhtextFieldActionPerformed(evt);
            }
        });

        CMCDtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMCDtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDtextField.setLabelText("SỐ CMND/CCCD");
        CMCDtextField.setOpaque(false);
        CMCDtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDtextFieldActionPerformed(evt);
            }
        });

        DiaChiThuongTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        DiaChiThuongTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DiaChiThuongTrutextField.setLabelText("ĐỊA CHỈ THƯỜNG TRÚ");
        DiaChiThuongTrutextField.setOpaque(false);
        DiaChiThuongTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiThuongTrutextFieldActionPerformed(evt);
            }
        });

        NgayCaptextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayCaptextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayCaptextField.setLabelText("NGÀY CẤP");
        NgayCaptextField.setOpaque(false);
        NgayCaptextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayCaptextFieldActionPerformed(evt);
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

        ThoiHantextField.setBackground(new java.awt.Color(245, 245, 245));
        ThoiHantextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ThoiHantextField.setLabelText("THỜI HẠN");
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

        diaChiTamTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        diaChiTamTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        diaChiTamTrutextField.setLabelText("ĐỊA CHỈ TẠM TRÚ");
        diaChiTamTrutextField.setOpaque(false);
        diaChiTamTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaChiTamTrutextFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KHAI BÁO THÔNG TIN TẠM TRÚ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(diaChiTamTrutextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HoVaTentextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(NgaySinhtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DiaChiThuongTrutextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NgayCaptextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ThoiHantextField, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CMCDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(InButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(CMCDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HoVaTentextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgaySinhtextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(DiaChiThuongTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(diaChiTamTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ThoiHantextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NgayCaptextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "BẠN CHƯA NHẬP ĐỦ NHỮNG TRƯỜNG CẦN THIẾT");
        }    
        else{        
                
        
        try {
            ControllerNhanKhau checkCMND = new ControllerNhanKhau();
            if (checkCMND.checkCMNDIsExist(CMCDtextField.getText())){
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
                lichsuController.insertLichSu(new ModelLichSu(formatter.format(date).toString(), this.hoVaTen, "Tạm trú", this.chucVu));
        }
            else{
                JOptionPane.showMessageDialog(null, "Chứng minh nhân dân không tồn tại");
            }
        }
        
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Nhập sai");
        }
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void InButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InButtonActionPerformed

    private void diaChiTamTrutextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaChiTamTrutextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaChiTamTrutextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMCDtextField;
    private views.swing.textfield.TextField DiaChiThuongTrutextField;
    private views.swing.textfield.TextField HoVaTentextField;
    private views.swing.Button InButton;
    private views.swing.textfield.TextField LyDotextField;
    private views.swing.textfield.TextField NgayCaptextField;
    private views.swing.textfield.TextField NgaySinhtextField;
    private views.swing.Button SaveButton;
    private views.swing.textfield.TextField ThoiHantextField;
    private views.swing.textfield.TextField diaChiTamTrutextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
