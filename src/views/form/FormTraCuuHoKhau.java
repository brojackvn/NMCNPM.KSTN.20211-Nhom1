package views.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import models.ModelNhanKhau;
import models.ModelSoHoKhau;
import views.swing.scrollbar.ScrollBarCustom;

public class FormTraCuuHoKhau extends javax.swing.JPanel {

    public FormTraCuuHoKhau() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initData();
    }
    
    public void initData() {
        initTableData();
    }
    
    public void initTableData() {
        // Các data thì mình sẽ lấy từ database
        table1.addRow(new ModelNhanKhau("Hồ Anh", "04/9/2001", 1, "Kinh", "Không", "Quảng Bình").toRowTable());
        
    }
    
    public void initThongTinSHK() {
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNhapSoHoKhau = new views.swing.textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        searchButton = new views.swing.Button();
        textFieldhoVaTenChuHo = new views.swing.textfield.TextField();
        textFieldDiaChi = new views.swing.textfield.TextField();
        textFieldNgayDen = new views.swing.textfield.TextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRA CỨU HỘ KHẨU");

        textFieldNhapSoHoKhau.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhau.setLabelText("NHẬP MÃ SỐ SỔ HỘ KHẨU");
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

        textFieldhoVaTenChuHo.setEditable(false);
        textFieldhoVaTenChuHo.setBackground(new java.awt.Color(245, 245, 245));
        textFieldhoVaTenChuHo.setText(" ");
        textFieldhoVaTenChuHo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldhoVaTenChuHo.setLabelText("HỌ VÀ TÊN CHỦ HỘ");
        textFieldhoVaTenChuHo.setOpaque(false);
        textFieldhoVaTenChuHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldhoVaTenChuHoActionPerformed(evt);
            }
        });

        textFieldDiaChi.setEditable(false);
        textFieldDiaChi.setBackground(new java.awt.Color(245, 245, 245));
        textFieldDiaChi.setText(" ");
        textFieldDiaChi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldDiaChi.setLabelText("NGÀY ĐẾN");
        textFieldDiaChi.setOpaque(false);
        textFieldDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDiaChiActionPerformed(evt);
            }
        });

        textFieldNgayDen.setEditable(false);
        textFieldNgayDen.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgayDen.setText(" ");
        textFieldNgayDen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgayDen.setLabelText("ĐỊA CHỈ");
        textFieldNgayDen.setOpaque(false);
        textFieldNgayDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNgayDenActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NHÂN KHẨU", "NGÀY SINH", "GIỚI TÍNH", "DÂN TỘC", "TÔN GIÁO", "NƠI Ở HIỆN TẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                                .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldNgayDen, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldhoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFieldhoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNgayDen, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
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

    private void textFieldhoVaTenChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldhoVaTenChuHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldhoVaTenChuHoActionPerformed

    private void textFieldDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDiaChiActionPerformed

    private void textFieldNgayDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNgayDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNgayDenActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private views.swing.Button searchButton;
    private views.swing.table.Table table1;
    private views.swing.textfield.TextField textFieldDiaChi;
    private views.swing.textfield.TextField textFieldNgayDen;
    private views.swing.textfield.TextField textFieldNhapSoHoKhau;
    private views.swing.textfield.TextField textFieldhoVaTenChuHo;
    // End of variables declaration//GEN-END:variables
}
