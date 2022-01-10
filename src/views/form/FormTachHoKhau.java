package views.form;

import controllers.ControllerSoHoKhau;
import java.awt.Component;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import models.ModelNhanKhau;
import models.ModelSoHoKhau;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;
import views.event.EventActionFormTach;
import views.event.EventActionFormXoa;
import views.swing.table.TableHeader;

public class FormTachHoKhau extends javax.swing.JPanel {
    private boolean flag = false;
    private ArrayList<ModelNhanKhau> arrMuonTach;
    private ArrayList<ModelNhanKhau> arrSauTach;
        
    public FormTachHoKhau() {
        initComponents();
        tableMuonTach.fixTable(jScrollPane1);
        tableMuonTach.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 2) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
              return header;
            }
        });
        tableMuonTach.removeColumn(tableMuonTach.getColumnModel().getColumn(0));
        
        tableSauTach.fixTable(jScrollPane2);
        tableSauTach.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
                TableHeader header = new TableHeader(o + "");
                if (i1 == 2) {
                    header.setHorizontalAlignment(JLabel.CENTER);
                }
              return header;
            }
        });
        tableSauTach.removeColumn(tableSauTach.getColumnModel().getColumn(0));
        
        initTableMuonTachData();
    }

    public void initTableMuonTachData() {
        EventActionFormTach eventAction = new EventActionFormTach() {
            @Override
            public void move(ModelNhanKhau nhanKhau) {
//                showMessage("Bạn muốn xóa nhân khẩu: " + nhanKhau.getHoVaTen(),1);
//                table1.removeRow(table1.getSelectedRow());
//                System.out.println(table1.getSelectedRow());
//                for (int i = 0; i < arr.size(); ++i) {
//                    if (arr.get(i).getCMND().equals(nhanKhau.getCMND())) {
//                        stackArrayList.add(arr.get(i));
//                        arr.remove(i);
//                        table1.getTableHeader().setDefaultRenderer(new DefaultTableCellRenderer() {
//                            @Override
//                            public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
//                                TableHeader header = new TableHeader(o + "");
//                                if (i1 == 4) {
//                                    header.setHorizontalAlignment(JLabel.CENTER);
//                                }
//                                return header;
//                            }
//                        });
//                        table1.removeColumn(table1.getColumnModel().getColumn(0));
//                    }
//                }
            }
        };
        
//        for (int i = 0; i < arr.size(); ++i) {
//                table1.addRow(new ModelNhanKhau(arr.get(i).getCMND(), arr.get(i).getHoVaTen(), arr.get(i).getNgaySinh(), arr.get(i).getGioiTinh(), arr.get(i).getQuanHeChuHo()).toRowTableFormXoaNhanKhau(eventAction));
//        }
        tableMuonTach.addRow(new ModelNhanKhau("456", "NNN", "Con").toRowTableFormTachNhanKhau(eventAction));
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

        jLabel1 = new javax.swing.JLabel();
        textFieldNhapSoHoKhauMuonTach = new views.swing.textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonTimKiem = new views.swing.Button();
        textFieldCMNDMuonTach = new views.swing.textfield.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMuonTach = new views.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();
        ButtonHoanThanh = new views.swing.Button();
        textFieldCMNDSauTach = new views.swing.textfield.TextField();
        jLabel3 = new javax.swing.JLabel();
        textFieldNgayDangKi = new views.swing.textfield.TextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableSauTach = new views.swing.table.Table();
        textFielddiaChi = new views.swing.textfield.TextField();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("NHẬP SỔ HỘ KHẨU MUỐN TÁCH");

        textFieldNhapSoHoKhauMuonTach.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhauMuonTach.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhauMuonTach.setLabelText("NHẬP MÃ SỐ SỔ HỘ KHẨU MUỐN TÁCH");
        textFieldNhapSoHoKhauMuonTach.setOpaque(false);
        textFieldNhapSoHoKhauMuonTach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNhapSoHoKhauMuonTachActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setText("TÌM KIẾM");
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

        textFieldCMNDMuonTach.setEditable(false);
        textFieldCMNDMuonTach.setBackground(new java.awt.Color(245, 245, 245));
        textFieldCMNDMuonTach.setText(" ");
        textFieldCMNDMuonTach.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldCMNDMuonTach.setLabelText("CMND/CCCD CHỦ HỘ");
        textFieldCMNDMuonTach.setOpaque(false);

        tableMuonTach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CMND", "NHÂN KHẨU", "QUAN HỆ CHỦ HỘ", "HÀNH ĐỘNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMuonTach);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("NHẬP THÔNG TIN SỔ HỘ KHẨU MUỐN TÁCH");

        ButtonHoanThanh.setBackground(new java.awt.Color(89, 89, 255));
        ButtonHoanThanh.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHoanThanh.setText("HOÀN THÀNH");
        ButtonHoanThanh.setToolTipText("");
        ButtonHoanThanh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHoanThanhActionPerformed(evt);
            }
        });

        textFieldCMNDSauTach.setEditable(false);
        textFieldCMNDSauTach.setBackground(new java.awt.Color(245, 245, 245));
        textFieldCMNDSauTach.setText(" ");
        textFieldCMNDSauTach.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldCMNDSauTach.setLabelText("CMND/CCCD CHỦ HỘ");
        textFieldCMNDSauTach.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("NHẬP THÔNG TIN HỘ KHẨU SAU KHI TÁCH");

        textFieldNgayDangKi.setEditable(false);
        textFieldNgayDangKi.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgayDangKi.setText(" ");
        textFieldNgayDangKi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgayDangKi.setLabelText("NGÀY ĐĂNG KÍ");
        textFieldNgayDangKi.setOpaque(false);

        tableSauTach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CMND", "NHÂN KHẨU", "QUAN HỆ CHỦ HỘ", "HÀNH ĐỘNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableSauTach);

        textFielddiaChi.setEditable(false);
        textFielddiaChi.setBackground(new java.awt.Color(245, 245, 245));
        textFielddiaChi.setText(" ");
        textFielddiaChi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFielddiaChi.setLabelText("ĐỊA CHỈ");
        textFielddiaChi.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                    .addComponent(textFieldCMNDMuonTach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textFieldNgayDangKi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(textFieldCMNDSauTach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(textFielddiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(245, 245, 245))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldNhapSoHoKhauMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNhapSoHoKhauMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textFielddiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldCMNDSauTach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textFieldCMNDMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(ButtonHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNhapSoHoKhauMuonTachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMuonTachActionPerformed
        try {
            if (textFieldNhapSoHoKhauMuonTach.getText().equals("")) {
                showMessage("Vui lòng nhập mã sổ hộ khẩu", 2);
            } else {
                if (!new ControllerSoHoKhau().checkMaSHKIsExist(textFieldNhapSoHoKhauMuonTach.getText())) {
                    showMessage("Mã sổ hộ khẩu không tồn tại", 2);
                    textFieldNhapSoHoKhauMuonTach.setText("");
                } else {
                    flag = true;
                    showMessage("Nhập thông tin nhân khẩu", 1);
                    ModelSoHoKhau soHoKhau = new ControllerSoHoKhau().TraCuuSHK(textFieldNhapSoHoKhauMuonTach.getText());
                    textFielddiaChi.setText(soHoKhau.getDiaChi());
                    
                    textFieldCMNDMuonTach.setEditable(true);
                    textFieldCMNDSauTach.setEditable(true);
                    textFieldNgayDangKi.setEditable(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_textFieldNhapSoHoKhauMuonTachActionPerformed

    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed

    }//GEN-LAST:event_ButtonTimKiemActionPerformed

    private void ButtonHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHoanThanhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonHoanThanhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonHoanThanh;
    private views.swing.Button ButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private views.swing.table.Table tableMuonTach;
    private views.swing.table.Table tableSauTach;
    private views.swing.textfield.TextField textFieldCMNDMuonTach;
    private views.swing.textfield.TextField textFieldCMNDSauTach;
    private views.swing.textfield.TextField textFieldNgayDangKi;
    private views.swing.textfield.TextField textFieldNhapSoHoKhauMuonTach;
    private views.swing.textfield.TextField textFielddiaChi;
    // End of variables declaration//GEN-END:variables
}
