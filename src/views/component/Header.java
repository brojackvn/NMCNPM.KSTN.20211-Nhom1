package views.component;

import controllers.ControllerUser;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ModelUser;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;
import views.form.FormThemNhanKhau;

public class Header extends javax.swing.JPanel {
    private String username;
    private String chucVu;
    private String hoVaTen;
    private String password;
    
    public Header(String userName, String chucVu, String hoVaTen, String password) {
        initComponents();
        this.username = userName;
        this.chucVu = chucVu;
        this.hoVaTen = hoVaTen;
        this.password = password;
        
        System.out.println(hoVaTen + " " + chucVu);
        lbUsername.setText(hoVaTen);
        lbRole.setText(chucVu);
    }

    public void addMenuEvent(ActionListener event) {
        cmdMenu.addActionListener(event);
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

        buttonBadges2 = new views.swing.ButtonBadges();
        cmdMenu = new views.swing.Button();
        pic = new views.swing.ImageAvatar();
        lbUsername = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonBadges4 = new views.swing.ButtonBadges();
        buttonBadges5 = new views.swing.ButtonBadges();

        buttonBadges2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/notification.png"))); // NOI18N
        buttonBadges2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges2ActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/menu.png"))); // NOI18N
        cmdMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMenuActionPerformed(evt);
            }
        });

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/user.png"))); // NOI18N

        lbUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonBadges4.setForeground(new java.awt.Color(0, 0, 255));
        buttonBadges4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/notification.png"))); // NOI18N
        buttonBadges4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges4ActionPerformed(evt);
            }
        });

        buttonBadges5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/message.png"))); // NOI18N
        buttonBadges5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBadges5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 422, Short.MAX_VALUE)
                .addComponent(buttonBadges5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonBadges4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRole, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmdMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonBadges5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRole))
                    .addComponent(buttonBadges4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMenuActionPerformed

    private void buttonBadges2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBadges2ActionPerformed

    private void buttonBadges4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges4ActionPerformed
        showMessage("Chức năng đang trong giai đoạn phát triển", 3);
    }//GEN-LAST:event_buttonBadges4ActionPerformed

    private void buttonBadges5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBadges5ActionPerformed
        showMessage("Chức năng đang trong giai đoạn phát triển", 3);
    }//GEN-LAST:event_buttonBadges5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.ButtonBadges buttonBadges2;
    private views.swing.ButtonBadges buttonBadges4;
    private views.swing.ButtonBadges buttonBadges5;
    private views.swing.Button cmdMenu;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUsername;
    private views.swing.ImageAvatar pic;
    // End of variables declaration//GEN-END:variables
}
