package views.form;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import models.ModelNhanKhau;
import test.Main;
import views.dialog.Message;
import views.event.EventActionFormXoa;
import views.swing.table.TableHeader;

public class FormXoaNhanKhau extends javax.swing.JPanel {
    public FormXoaNhanKhau() {
        initComponents();
        table1.fixTable(jScrollPane1);
        table1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 4) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
              return header;
            }     
        });
        table1.removeColumn(table1.getColumnModel().getColumn(0));
        initTableData();
    }

    public void initTableData() {
        EventActionFormXoa eventAction = new EventActionFormXoa() {
            @Override
            public void delete(ModelNhanKhau nhanKhau) {
                showMessage("Xóa nhân khẩu: " + nhanKhau.getHoVaTen());
                System.out.println(table1.getSelectedRow());
            }
        };
        table1.addRow(new ModelNhanKhau("123", "Ho Anh", "04/09/2001", 1, "Con").toRowTableFormXoaNhanKhau(eventAction));
        table1.addRow(new ModelNhanKhau("456", "NNN", "05/02/2001", 0, "Con").toRowTableFormXoaNhanKhau(eventAction));
    }
    
    private void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNhapSoHoKhau = new views.swing.textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        searchButton = new views.swing.Button();
        textFieldhoVaTenChuHo = new views.swing.textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldhoVaTenChuHo1 = new views.swing.textfield.TextField();
        textFieldhoVaTenChuHo2 = new views.swing.textfield.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();

        setBackground(new java.awt.Color(245, 245, 245));

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

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("THÔNG TIN SỔ HỘ KHẨU");

        textFieldhoVaTenChuHo1.setEditable(false);
        textFieldhoVaTenChuHo1.setBackground(new java.awt.Color(245, 245, 245));
        textFieldhoVaTenChuHo1.setText(" ");
        textFieldhoVaTenChuHo1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldhoVaTenChuHo1.setLabelText("ĐỊA CHỈ");
        textFieldhoVaTenChuHo1.setOpaque(false);
        textFieldhoVaTenChuHo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldhoVaTenChuHo1ActionPerformed(evt);
            }
        });

        textFieldhoVaTenChuHo2.setEditable(false);
        textFieldhoVaTenChuHo2.setBackground(new java.awt.Color(245, 245, 245));
        textFieldhoVaTenChuHo2.setText(" ");
        textFieldhoVaTenChuHo2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldhoVaTenChuHo2.setLabelText("NGÀY ĐĂNG KÍ");
        textFieldhoVaTenChuHo2.setOpaque(false);
        textFieldhoVaTenChuHo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldhoVaTenChuHo2ActionPerformed(evt);
            }
        });

        table1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 5, 10, 5));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CMND", "NHÂN KHẨU", "NGÀY SINH", "GIỚI TÍNH", "QUAN HỆ CHỦ HỘ", "HÀNH ĐỘNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false, false, true
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 198, Short.MAX_VALUE)
                        .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldhoVaTenChuHo2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldhoVaTenChuHo1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldhoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
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
                .addGap(4, 4, 4)
                .addComponent(textFieldhoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldhoVaTenChuHo1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldhoVaTenChuHo2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNhapSoHoKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNhapSoHoKhauActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void textFieldhoVaTenChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldhoVaTenChuHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldhoVaTenChuHoActionPerformed

    private void textFieldhoVaTenChuHo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldhoVaTenChuHo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldhoVaTenChuHo1ActionPerformed

    private void textFieldhoVaTenChuHo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldhoVaTenChuHo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldhoVaTenChuHo2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private views.swing.Button searchButton;
    private views.swing.table.Table table1;
    private views.swing.textfield.TextField textFieldNhapSoHoKhau;
    private views.swing.textfield.TextField textFieldhoVaTenChuHo;
    private views.swing.textfield.TextField textFieldhoVaTenChuHo1;
    private views.swing.textfield.TextField textFieldhoVaTenChuHo2;
    // End of variables declaration//GEN-END:variables
}
