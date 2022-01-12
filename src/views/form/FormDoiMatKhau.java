/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerUser;
import javax.swing.JOptionPane;
import test.Main;
import views.dialog.MessageConfirm;
/**
 *
 * @author huutu
 */
public class FormDoiMatKhau extends javax.swing.JPanel {
    private String userName;
    private String chucVu;
    private String hoVaTen;
    private String passWord;
    /**
     * Creates new form FormDoiMatKhau
     */
    public FormDoiMatKhau(String userName, String chucVu, String hoVaTen, String passWord) {
        initComponents();
        this.userName = userName;
        this.chucVu = chucVu;
        this.hoVaTen = hoVaTen;
        this.passWord = passWord;
    }
    
    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        matKhauHienTaitextField = new views.login.PasswordField();
        matKhauMoiTextField = new views.login.PasswordField();
        xacNhanMatKhauMoitextField = new views.login.PasswordField();
        xacNhanButton = new views.swing.Button();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        matKhauHienTaitextField.setBackground(new java.awt.Color(245, 245, 245));
        matKhauHienTaitextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        matKhauHienTaitextField.setLabelText("Mật khẩu hiện tại");

        matKhauMoiTextField.setBackground(new java.awt.Color(245, 245, 245));
        matKhauMoiTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        matKhauMoiTextField.setLabelText("Mật khẩu mới");

        xacNhanMatKhauMoitextField.setBackground(new java.awt.Color(245, 245, 245));
        xacNhanMatKhauMoitextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        xacNhanMatKhauMoitextField.setLabelText("Xác nhận mật khẩu mới");

        xacNhanButton.setBackground(new java.awt.Color(89, 89, 255));
        xacNhanButton.setForeground(new java.awt.Color(255, 255, 255));
        xacNhanButton.setText("XÁC NHẬN");
        xacNhanButton.setToolTipText("");
        xacNhanButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        xacNhanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacNhanButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matKhauHienTaitextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matKhauMoiTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xacNhanMatKhauMoitextField, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 358, Short.MAX_VALUE)
                .addComponent(xacNhanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(matKhauHienTaitextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(matKhauMoiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xacNhanMatKhauMoitextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(xacNhanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void xacNhanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacNhanButtonActionPerformed
        // TODO add your handling code here:
        if (String.valueOf(matKhauHienTaitextField.getPassword()).equals("") || String.valueOf(matKhauMoiTextField.getPassword()).equals("") || String.valueOf(xacNhanMatKhauMoitextField.getPassword()).equals("")) {
            showMessage("Chưa nhập đầy đủ các trường cần thiết", 2);
        } else if (!String.valueOf(matKhauMoiTextField.getPassword()).equals(String.valueOf(xacNhanMatKhauMoitextField.getPassword()))) {
            showMessage("Xác nhận mật khẩu không khớp", 2);
        } else {
            ControllerUser userController = new ControllerUser();
            try {
                if (!userController.checkPasswordUsername(userName, String.valueOf(matKhauHienTaitextField.getPassword()))) {
                    showMessage("Mật khẩu hiện tại không đúng", 2);
                } else {
                    try {
                        userController.updatePassword(this.userName, String.valueOf(matKhauHienTaitextField.getPassword()), String.valueOf(matKhauMoiTextField.getPassword()));
                        showMessage("Đổi mật khẩu thành công", 1);
                        matKhauHienTaitextField.setText("");
                        matKhauMoiTextField.setText("");
                        xacNhanMatKhauMoitextField.setText("");
                    } catch (Exception e) {
                    }
                }
            } catch (Exception e) {
            }
        }

    }//GEN-LAST:event_xacNhanButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.login.PasswordField matKhauHienTaitextField;
    private views.login.PasswordField matKhauMoiTextField;
    private views.swing.Button xacNhanButton;
    private views.login.PasswordField xacNhanMatKhauMoitextField;
    // End of variables declaration//GEN-END:variables
}
