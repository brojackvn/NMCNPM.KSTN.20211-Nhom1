
package views.form;

import models.ModelNhanKhau;

public class FormTraCuuNhanKhau extends javax.swing.JPanel {

    public FormTraCuuNhanKhau() {
        initComponents();
        initTable();
    }

    public void initTable() {
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNhapSoHoKhau = new views.swing.textfield.TextField();
        searchButton = new views.swing.Button();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        textField1 = new views.swing.textfield.TextField();
        textField2 = new views.swing.textfield.TextField();
        textField3 = new views.swing.textfield.TextField();
        textField4 = new views.swing.textfield.TextField();
        textField5 = new views.swing.textfield.TextField();
        textField6 = new views.swing.textfield.TextField();
        textField7 = new views.swing.textfield.TextField();
        textField8 = new views.swing.textfield.TextField();
        textField9 = new views.swing.textfield.TextField();
        textField10 = new views.swing.textfield.TextField();
        textField11 = new views.swing.textfield.TextField();
        textField12 = new views.swing.textfield.TextField();
        textField13 = new views.swing.textfield.TextField();
        textField14 = new views.swing.textfield.TextField();
        textField15 = new views.swing.textfield.TextField();
        textField16 = new views.swing.textfield.TextField();
        searchButton1 = new views.swing.Button();
        textField17 = new views.swing.textfield.TextField();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRA CỨU NHÂN KHẨU");

        textFieldNhapSoHoKhau.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhau.setLabelText("NHẬP MÃ SỐ CMND/CCCD");
        textFieldNhapSoHoKhau.setOpaque(false);
        textFieldNhapSoHoKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNhapSoHoKhauActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(89, 89, 255));
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("TÌM KIẾM");
        searchButton.setToolTipText("");
        searchButton.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("THÔNG TIN NHÂN KHẨU");

        textField1.setEditable(false);
        textField1.setBackground(new java.awt.Color(245, 245, 245));
        textField1.setText(" ");
        textField1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField1.setLabelText("QUAN HỆ VỚI CHỦ HỘ");

        textField2.setEditable(false);
        textField2.setBackground(new java.awt.Color(245, 245, 245));
        textField2.setText(" ");
        textField2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField2.setLabelText("MÃ SỐ SỔ HỘ KHẨU");

        textField3.setEditable(false);
        textField3.setBackground(new java.awt.Color(245, 245, 245));
        textField3.setText(" ");
        textField3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField3.setLabelText("TÊN GỌI KHÁC");

        textField4.setEditable(false);
        textField4.setBackground(new java.awt.Color(245, 245, 245));
        textField4.setText(" ");
        textField4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField4.setLabelText("HỌ VÀ TÊN");

        textField5.setEditable(false);
        textField5.setBackground(new java.awt.Color(245, 245, 245));
        textField5.setText(" ");
        textField5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField5.setLabelText("NGÀY SINH");

        textField6.setEditable(false);
        textField6.setBackground(new java.awt.Color(245, 245, 245));
        textField6.setText(" ");
        textField6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField6.setLabelText("GIỚI TÍNH");

        textField7.setEditable(false);
        textField7.setBackground(new java.awt.Color(245, 245, 245));
        textField7.setText(" ");
        textField7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField7.setLabelText("DÂN TỘC");

        textField8.setEditable(false);
        textField8.setBackground(new java.awt.Color(245, 245, 245));
        textField8.setText(" ");
        textField8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField8.setLabelText("TÔN GIÁO");

        textField9.setEditable(false);
        textField9.setBackground(new java.awt.Color(245, 245, 245));
        textField9.setText(" ");
        textField9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField9.setLabelText("QUỐC TỊCH");

        textField10.setEditable(false);
        textField10.setBackground(new java.awt.Color(245, 245, 245));
        textField10.setText(" ");
        textField10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField10.setLabelText("TRÌNH ĐỘ HỌC VẤN");

        textField11.setEditable(false);
        textField11.setBackground(new java.awt.Color(245, 245, 245));
        textField11.setText(" ");
        textField11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField11.setLabelText("TRÌNH ĐỘ CHUYÊN MÔN");

        textField12.setEditable(false);
        textField12.setBackground(new java.awt.Color(245, 245, 245));
        textField12.setText(" ");
        textField12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField12.setLabelText("NGHỀ NGHIỆP HIỆN TẠI");

        textField13.setEditable(false);
        textField13.setBackground(new java.awt.Color(245, 245, 245));
        textField13.setText(" ");
        textField13.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField13.setLabelText("NƠI SINH");

        textField14.setEditable(false);
        textField14.setBackground(new java.awt.Color(245, 245, 245));
        textField14.setText(" ");
        textField14.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField14.setLabelText("QUÊ QUÁN");

        textField15.setEditable(false);
        textField15.setBackground(new java.awt.Color(245, 245, 245));
        textField15.setText(" ");
        textField15.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField15.setLabelText("NƠI THƯỜNG TRÚ");

        textField16.setEditable(false);
        textField16.setBackground(new java.awt.Color(245, 245, 245));
        textField16.setText(" ");
        textField16.setAutoscrolls(false);
        textField16.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField16.setLabelText("CHỖ Ở HIỆN TẠI");

        searchButton1.setBackground(new java.awt.Color(89, 89, 255));
        searchButton1.setForeground(new java.awt.Color(255, 255, 255));
        searchButton1.setText("IN PDF");
        searchButton1.setToolTipText("");
        searchButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        textField17.setEditable(false);
        textField17.setBackground(new java.awt.Color(245, 245, 245));
        textField17.setText(" ");
        textField17.setAutoscrolls(false);
        textField17.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textField17.setLabelText("CHỖ Ở HIỆN TẠI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(159, Short.MAX_VALUE)
                        .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112)
                .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textField16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addComponent(textField11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(textField12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textField9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(textField5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNhapSoHoKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNhapSoHoKhauActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        System.out.println("Helloew wwww");
        System.out.println(textFieldNhapSoHoKhau.getText());
        textFieldNhapSoHoKhau.setText("");
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private views.swing.Button searchButton;
    private views.swing.Button searchButton1;
    private views.swing.textfield.TextField textField1;
    private views.swing.textfield.TextField textField10;
    private views.swing.textfield.TextField textField11;
    private views.swing.textfield.TextField textField12;
    private views.swing.textfield.TextField textField13;
    private views.swing.textfield.TextField textField14;
    private views.swing.textfield.TextField textField15;
    private views.swing.textfield.TextField textField16;
    private views.swing.textfield.TextField textField17;
    private views.swing.textfield.TextField textField2;
    private views.swing.textfield.TextField textField3;
    private views.swing.textfield.TextField textField4;
    private views.swing.textfield.TextField textField5;
    private views.swing.textfield.TextField textField6;
    private views.swing.textfield.TextField textField7;
    private views.swing.textfield.TextField textField8;
    private views.swing.textfield.TextField textField9;
    private views.swing.textfield.TextField textFieldNhapSoHoKhau;
    // End of variables declaration//GEN-END:variables
}
