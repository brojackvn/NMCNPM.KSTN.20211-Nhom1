package views.dialog;

import controllers.ControllerSoHoKhau;
import views.swing.icon.GoogleMaterialDesignIcons;
import views.swing.icon.IconFontSwing;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import test.Main;
import views.form.FormThemNhanKhau;

public class MessageTextField extends javax.swing.JDialog {
    private final Animator animator;
    private boolean show = true;
    private boolean success;
    public String dataTextField;
    
    public MessageTextField(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lbIcon.setIcon(IconFontSwing.buildIcon(GoogleMaterialDesignIcons.REPLY, 60, new Color(119,216,77), new Color(113, 74, 67)));
        setOpacity(0f);
        getContentPane().setBackground(Color.WHITE);
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (show) {
                    setOpacity(fraction);
                } else {
                    setOpacity(1f - fraction);
                }
            }

            @Override
            public void end() {
                if (show == false) {
                    setVisible(false);
                }
            }

        };
        animator = new Animator(200, target);
        animator.setResolution(0);
        animator.setAcceleration(0.5f);
    }

    public void showMessage() {
        animator.start();
        setVisible(true);
    }
    
    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        buttonLuu = new views.swing.Button();
        textFieldNhapSoHoKhauMuonTach = new views.swing.textfield.TextField();
        buttonLuu1 = new views.swing.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(377, 142));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(75, 134, 253)));

        lbIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buttonLuu.setForeground(new java.awt.Color(82, 82, 82));
        buttonLuu.setText("LƯU");
        buttonLuu.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuuActionPerformed(evt);
            }
        });

        textFieldNhapSoHoKhauMuonTach.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhauMuonTach.setLabelText("NHẬP MÃ CỦA SỔ HỘ KHẨU ĐÃ TÁCH");
        textFieldNhapSoHoKhauMuonTach.setOpaque(false);
        textFieldNhapSoHoKhauMuonTach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNhapSoHoKhauMuonTachActionPerformed(evt);
            }
        });

        buttonLuu1.setForeground(new java.awt.Color(82, 82, 82));
        buttonLuu1.setText("TRỞ VỀ");
        buttonLuu1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        buttonLuu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLuu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldNhapSoHoKhauMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(buttonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(buttonLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNhapSoHoKhauMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLuu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuuActionPerformed
        try {
            if (textFieldNhapSoHoKhauMuonTach.getText().equals("")) {
                showMessage("Vui lòng nhập mã sổ hộ khẩu", 2);
            } else {
                if (new ControllerSoHoKhau().checkMaSHKIsExist(textFieldNhapSoHoKhauMuonTach.getText())) {
                    showMessage("Mã sổ hộ khẩu đã tồn tại", 2);
                } else {
                    dataTextField = textFieldNhapSoHoKhauMuonTach.getText();
                    closeMenu();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buttonLuuActionPerformed

    private void buttonLuu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLuu1ActionPerformed
        closeMenu();
    }//GEN-LAST:event_buttonLuu1ActionPerformed

    private void textFieldNhapSoHoKhauMuonTachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMuonTachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNhapSoHoKhauMuonTachActionPerformed

    private void closeMenu() {
        if (animator.isRunning()) {
            animator.stop();
        }
        show = false;
        animator.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button buttonLuu;
    private views.swing.Button buttonLuu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbIcon;
    private views.swing.textfield.TextField textFieldNhapSoHoKhauMuonTach;
    // End of variables declaration//GEN-END:variables
}
