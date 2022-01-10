package views.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import models.ModelNhanKhau;
import models.ModelSoHoKhau;
import views.swing.scrollbar.ScrollBarCustom;
import controllers.ControllerSoHoKhau;
import java.util.ArrayList;

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
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        searchButton1 = new views.swing.Button();
        textFielddiaChi = new views.swing.textfield.TextField();
        textFieldngayDangKi = new views.swing.textfield.TextField();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRA CỨU SỔ HỘ KHẨU");

        textFieldNhapSoHoKhau.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhau.setLabelText("NHẬP MÃ SỐ SỔ HỘ KHẨU");
        textFieldNhapSoHoKhau.setOpaque(false);
        textFieldNhapSoHoKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNhapSoHoKhauActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

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

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NHÂN KHẨU", "NGÀY SINH", "GIỚI TÍNH", "QUAN HỆ CHỦ HỘ", "NƠI Ở HIỆN TẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setMinWidth(100);
            table1.getColumnModel().getColumn(1).setMinWidth(40);
            table1.getColumnModel().getColumn(2).setMinWidth(30);
            table1.getColumnModel().getColumn(4).setMinWidth(270);
        }

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("THÔNG TIN SỔ HỘ KHẨU");

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

        textFielddiaChi.setEditable(false);
        textFielddiaChi.setBackground(new java.awt.Color(245, 245, 245));
        textFielddiaChi.setText(" ");
        textFielddiaChi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFielddiaChi.setLabelText("ĐỊA CHỈ");
        textFielddiaChi.setOpaque(false);
        textFielddiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFielddiaChiActionPerformed(evt);
            }
        });

        textFieldngayDangKi.setEditable(false);
        textFieldngayDangKi.setBackground(new java.awt.Color(245, 245, 245));
        textFieldngayDangKi.setText(" ");
        textFieldngayDangKi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldngayDangKi.setLabelText("NGÀY ĐĂNG KÍ");
        textFieldngayDangKi.setOpaque(false);
        textFieldngayDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldngayDangKiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 154, Short.MAX_VALUE)
                        .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 155, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator3)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldngayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFielddiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldhoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldhoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFielddiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldngayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNhapSoHoKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNhapSoHoKhauActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
//        System.out.println("Helloew wwww");
        String MaSHK = textFieldNhapSoHoKhau.getText();
    
        try{
           ControllerSoHoKhau CTLSoHoKhau = new ControllerSoHoKhau();

           //So Ho Khau
           ModelSoHoKhau SHK = CTLSoHoKhau.TraCuuSHK(MaSHK);
           //List Nhan Khau Trong Ho
           ArrayList<ModelNhanKhau> listNhanKhau = CTLSoHoKhau.getListNhanKhau_fromSoSHK(MaSHK);

           //hiển thị thông tin về Hộ Khẩu
           textFieldhoVaTenChuHo.setText(SHK.getHoVaTenChuHo());
           textFielddiaChi.setText(SHK.getDiaChi());
           textFieldngayDangKi.setText(SHK.getNgayDangKi());

           //hiển thị thông tin về nhân khẩu trong hộ
           for(int i=0; i<listNhanKhau.size(); i++){
                table1.addRow(listNhanKhau.get(i).toRowTableTraCuuHoKhau());
           }
        } catch(Exception e){};
        textFieldNhapSoHoKhau.setText("");
    }//GEN-LAST:event_searchButtonActionPerformed

    private void textFieldhoVaTenChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldhoVaTenChuHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldhoVaTenChuHoActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void textFielddiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFielddiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFielddiaChiActionPerformed

    private void textFieldngayDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldngayDangKiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldngayDangKiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private views.swing.Button searchButton;
    private views.swing.Button searchButton1;
    private views.swing.table.Table table1;
    private views.swing.textfield.TextField textFieldNhapSoHoKhau;
    private views.swing.textfield.TextField textFielddiaChi;
    private views.swing.textfield.TextField textFieldhoVaTenChuHo;
    private views.swing.textfield.TextField textFieldngayDangKi;
    // End of variables declaration//GEN-END:variables
}
