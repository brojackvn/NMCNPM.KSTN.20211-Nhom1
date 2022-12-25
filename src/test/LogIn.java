/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package test;

import controllers.ControllerDangNhap;
import controllers.ControllerUser;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.ModelUser;
import views.component.Header;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

/**
 *
 * @author huutu
 */
public class LogIn extends javax.swing.JFrame {

    public LogIn() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/resources/logo.png")).getImage());
        setTitle("Quản lý nhân khẩu - Ver 1.0.0");
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new views.login.Button();
        jPanel1 = new javax.swing.JPanel();
        background1 = new views.login.Background();
        jPanel2 = new javax.swing.JPanel();
        matKhauTextField = new views.login.PasswordField();
        tendangNhapTextField = new views.login.TextField();
        dangNhapButton = new views.swing.Button();
        thoatButton = new views.swing.Button();

        button1.setText("button1");

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(84, 137, 222), 2));

        javax.swing.GroupLayout background1Layout = new javax.swing.GroupLayout(background1);
        background1.setLayout(background1Layout);
        background1Layout.setHorizontalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        background1Layout.setVerticalGroup(
            background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        matKhauTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        matKhauTextField.setLabelText("MẬT KHẨU");
        matKhauTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matKhauTextFieldActionPerformed(evt);
            }
        });

        tendangNhapTextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        tendangNhapTextField.setLabelText("TÊN ĐĂNG NHẬP");
        tendangNhapTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tendangNhapTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tendangNhapTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
            .addComponent(matKhauTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(tendangNhapTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matKhauTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dangNhapButton.setBackground(new java.awt.Color(84, 137, 222));
        dangNhapButton.setForeground(new java.awt.Color(255, 255, 255));
        dangNhapButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        dangNhapButton.setLabel("ĐĂNG NHẬP");
        dangNhapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangNhapButtonActionPerformed(evt);
            }
        });

        thoatButton.setBackground(new java.awt.Color(84, 137, 222));
        thoatButton.setForeground(new java.awt.Color(255, 255, 255));
        thoatButton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        thoatButton.setLabel("THOÁT");
        thoatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dangNhapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thoatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dangNhapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thoatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tendangNhapTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tendangNhapTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tendangNhapTextFieldActionPerformed

    private void matKhauTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matKhauTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matKhauTextFieldActionPerformed

    private void dangNhapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangNhapButtonActionPerformed
        System.out.println(java.time.LocalDate.now().toString().getClass());
        try {
            ControllerDangNhap dangNhapController = new ControllerDangNhap();
            if (dangNhapController.checkUserName(tendangNhapTextField.getText())) {

                if (dangNhapController.getPassWordFromUserName(tendangNhapTextField.getText()).equals(String.valueOf(matKhauTextField.getPassword()))) {
                    ControllerUser userController = new ControllerUser();
                    ModelUser userModel = new ModelUser();
                    userModel = userController.findAllByusername(tendangNhapTextField.getText());
                    //String userName, String chucVu, String hoVaTen, String passWord
                    System.out.println("Đã đăng nhập");
                    new Main(userModel.getUsername(), userModel.getChucVu(), userModel.getHoVaTen(), userModel.getPassword(), new Header(userModel.getUsername(), userModel.getChucVu(), userModel.getHoVaTen(), userModel.getPassword())).setVisible(true);
                    this.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Mật khẩu không chính xác");
                }
            } else {
//                showMessage("Tài khoản không tồn tại", 3);
                JOptionPane.showMessageDialog(null, "Tài khoản không tồn tại");
            }
            ;
        } catch (Exception e) {
        }
    }//GEN-LAST:event_dangNhapButtonActionPerformed

    private void thoatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_thoatButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.login.Background background1;
    private views.login.Button button1;
    private views.swing.Button dangNhapButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private views.login.PasswordField matKhauTextField;
    private views.login.TextField tendangNhapTextField;
    private views.swing.Button thoatButton;
    // End of variables declaration//GEN-END:variables
}
