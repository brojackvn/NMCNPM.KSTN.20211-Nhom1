/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

/**
 *
 * @author HO ANH
 */
public class FormTamVang extends javax.swing.JPanel {

    /**
     * Creates new form FormTamVang
     */
    public FormTamVang() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CMCDtextField3 = new views.swing.textfield.TextField();
        DiaChiThuongTrutextField = new views.swing.textfield.TextField();
        NgayCaptextField = new views.swing.textfield.TextField();
        LyDotextField = new views.swing.textfield.TextField();
        SaveButton = new views.swing.Button();
        InButton = new views.swing.Button();
        NgayCaptextField1 = new views.swing.textfield.TextField();

        setBackground(new java.awt.Color(245, 245, 245));

        CMCDtextField3.setBackground(new java.awt.Color(245, 245, 245));
        CMCDtextField3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMCDtextField3.setLabelText("SỐ CMND/CCCD");
        CMCDtextField3.setOpaque(false);
        CMCDtextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMCDtextField3ActionPerformed(evt);
            }
        });

        DiaChiThuongTrutextField.setBackground(new java.awt.Color(245, 245, 245));
        DiaChiThuongTrutextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        DiaChiThuongTrutextField.setLabelText("NƠI TẠM TRÚ");
        DiaChiThuongTrutextField.setOpaque(false);
        DiaChiThuongTrutextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DiaChiThuongTrutextFieldActionPerformed(evt);
            }
        });

        NgayCaptextField.setBackground(new java.awt.Color(245, 245, 245));
        NgayCaptextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayCaptextField.setLabelText("NGÀY KẾT THÚC");
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

        NgayCaptextField1.setBackground(new java.awt.Color(245, 245, 245));
        NgayCaptextField1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        NgayCaptextField1.setLabelText("NGÀY BẮT ĐẦU");
        NgayCaptextField1.setOpaque(false);
        NgayCaptextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NgayCaptextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CMCDtextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DiaChiThuongTrutextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NgayCaptextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(NgayCaptextField, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(100, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(InButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addComponent(CMCDtextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DiaChiThuongTrutextField, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayCaptextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NgayCaptextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(LyDotextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(160, 160, 160))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CMCDtextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMCDtextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMCDtextField3ActionPerformed

    private void DiaChiThuongTrutextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DiaChiThuongTrutextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DiaChiThuongTrutextFieldActionPerformed

    private void NgayCaptextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayCaptextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayCaptextFieldActionPerformed

    private void LyDotextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LyDotextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LyDotextFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void InButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InButtonActionPerformed

    private void NgayCaptextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NgayCaptextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NgayCaptextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMCDtextField;
    private views.swing.textfield.TextField CMCDtextField1;
    private views.swing.textfield.TextField CMCDtextField2;
    private views.swing.textfield.TextField CMCDtextField3;
    private views.swing.textfield.TextField DiaChiThuongTrutextField;
    private views.swing.Button InButton;
    private views.swing.textfield.TextField LyDotextField;
    private views.swing.textfield.TextField NgayCaptextField;
    private views.swing.textfield.TextField NgayCaptextField1;
    private views.swing.Button SaveButton;
    // End of variables declaration//GEN-END:variables
}
