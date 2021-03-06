package views.form;

import controllers.ControllerLichSu;
import controllers.ControllerNhanKhau;
import controllers.ControllerSoHoKhau;
import java.awt.Component;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import models.ModelLichSu;
import models.ModelNhanKhau;
import models.ModelSoHoKhau;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;
import views.event.EventActionFormXoa;
import views.swing.table.TableHeader;

public class FormXoaNhanKhau extends javax.swing.JPanel {
    private ArrayList<ModelNhanKhau> arr = new ArrayList<>();
    private ArrayList<ModelNhanKhau> stackArrayList = new ArrayList<>();
    private boolean flag = false;
    
    private String username;
    private String chucVu;
    private String hoVaTen;
    private String password;
    
    public FormXoaNhanKhau(String userName, String chucVu, String hoVaTen, String passWord) {
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
        this.username = userName;
        this.chucVu = chucVu;
        this.hoVaTen = hoVaTen;
        this.password = password;
    }

    public void initTableData() {
        EventActionFormXoa eventAction = new EventActionFormXoa() {
            @Override
            public void delete(ModelNhanKhau nhanKhau) {
                boolean ans = showMessageOption("B???n mu???n x??a nh??n kh???u: " + nhanKhau.getHoVaTen());
                table1.removeRow(table1.getSelectedRow());
                System.out.println(table1.getSelectedRow());
                if (ans) {
                    for (int i = 0; i < arr.size(); ++i) {
                        if (arr.get(i).getCMND().equals(nhanKhau.getCMND())) {
                            stackArrayList.add(arr.get(i));
                            arr.remove(i);
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
                        }
                    }    
                }
            }
        };
        
        for (int i = 0; i < arr.size(); ++i) {
                table1.addRow(new ModelNhanKhau(arr.get(i).getCMND(), arr.get(i).getHoVaTen(), arr.get(i).getNgaySinh(), arr.get(i).getGioiTinh(), arr.get(i).getQuanHeChuHo()).toRowTableFormXoaNhanKhau(eventAction));
        }
//        table1.addRow(new ModelNhanKhau("456", "NNN", "05/02/2001", 0, "Con").toRowTableFormXoaNhanKhau(eventAction));
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
        textFieldNhapSoHoKhau = new views.swing.textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonTimKiem = new views.swing.Button();
        textFieldHoVaTenChuHo = new views.swing.textfield.TextField();
        jLabel2 = new javax.swing.JLabel();
        textFieldDiaChi = new views.swing.textfield.TextField();
        textFieldNgayDangKi = new views.swing.textfield.TextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();
        ButtonHoanThanh = new views.swing.Button();
        ButtonHoanTac = new views.swing.Button();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRA C???U S??? H??? KH???U");

        textFieldNhapSoHoKhau.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhau.setLabelText("NH???P M?? S??? S??? H??? KH???U");
        textFieldNhapSoHoKhau.setOpaque(false);
        textFieldNhapSoHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapSoHoKhauMousePressed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setText("T??M KI???M");
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

        textFieldHoVaTenChuHo.setEditable(false);
        textFieldHoVaTenChuHo.setBackground(new java.awt.Color(245, 245, 245));
        textFieldHoVaTenChuHo.setText(" ");
        textFieldHoVaTenChuHo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldHoVaTenChuHo.setLabelText("H??? V?? T??N CH??? H???");
        textFieldHoVaTenChuHo.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("TH??NG TIN S??? H??? KH???U");

        textFieldDiaChi.setEditable(false);
        textFieldDiaChi.setBackground(new java.awt.Color(245, 245, 245));
        textFieldDiaChi.setText(" ");
        textFieldDiaChi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldDiaChi.setLabelText("?????A CH???");
        textFieldDiaChi.setOpaque(false);

        textFieldNgayDangKi.setEditable(false);
        textFieldNgayDangKi.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgayDangKi.setText(" ");
        textFieldNgayDangKi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgayDangKi.setLabelText("NG??Y ????NG K??");
        textFieldNgayDangKi.setOpaque(false);

        table1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 5, 10, 5));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CMND", "NH??N KH???U", "NG??Y SINH", "GI???I T??NH", "QUAN H??? CH??? H???", "H??NH ?????NG"
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

        ButtonHoanThanh.setBackground(new java.awt.Color(89, 89, 255));
        ButtonHoanThanh.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHoanThanh.setToolTipText("");
        ButtonHoanThanh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonHoanThanh.setLabel("HO??N TH??NH");
        ButtonHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHoanThanhActionPerformed(evt);
            }
        });

        ButtonHoanTac.setBackground(new java.awt.Color(89, 89, 255));
        ButtonHoanTac.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHoanTac.setToolTipText("");
        ButtonHoanTac.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonHoanTac.setLabel("HO??N T??C");
        ButtonHoanTac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHoanTacActionPerformed(evt);
            }
        });

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
                        .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
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
                    .addComponent(textFieldNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldHoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonHoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(ButtonHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(textFieldHoVaTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonHoanTac, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed
        try {
            if (textFieldNhapSoHoKhau.getText().equals("")) {
                showMessage("Vui l??ng nh???p m?? s??? h??? kh???u", 2);
            } else {
                if (!new ControllerSoHoKhau().checkMaSHKIsExist(textFieldNhapSoHoKhau.getText())) {
                    showMessage("M?? s??? h??? kh???u kh??ng t???n t???i", 2);
                    textFieldNhapSoHoKhau.setText("");
                } else {
                    flag = true;
                    ButtonTimKiem.setEnabled(false);
                    arr = new ControllerNhanKhau().selectDanhMucNhanKhau(textFieldNhapSoHoKhau.getText());
                    ModelSoHoKhau soHoKhau = new ControllerSoHoKhau().TraCuuSHK(textFieldNhapSoHoKhau.getText());
                    textFieldHoVaTenChuHo.setText(soHoKhau.getHoVaTenChuHo());
                    textFieldDiaChi.setText(soHoKhau.getDiaChi());
                    textFieldNgayDangKi.setText(soHoKhau.getNgayDangKi());
                    initTableData();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonTimKiemActionPerformed

    private void textFieldNhapSoHoKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMousePressed
        if (flag == true) {
            boolean ans = showMessageOption("B???n mu???n nh???p s??? h??? kh???u kh??c");
            flag = false;
            if (ans) {
                ButtonTimKiem.setEnabled(true);
                
                textFieldNhapSoHoKhau.setFocusable(true);
                textFieldNhapSoHoKhau.setText("");
                
                textFieldHoVaTenChuHo.setText("");
                textFieldDiaChi.setText("");
                textFieldNgayDangKi.setText("");
                
                table1.clearRow();
            } else {
                flag = true;
                textFieldNhapSoHoKhau.setFocusable(false);
            }
        }
    }//GEN-LAST:event_textFieldNhapSoHoKhauMousePressed

    private void ButtonHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHoanThanhActionPerformed
        try {
            if (stackArrayList.size() > 0) {
                for (int i = 0; i < stackArrayList.size(); ++i) {
                    new ControllerNhanKhau().delete(stackArrayList.get(i).getCMND());
                }
                showMessage("B???n ???? x??a th??nh c??ng nh??n kh???u", 1);
                
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                Date date = new Date();
                new ControllerLichSu().insertLichSu(new ModelLichSu(formatter.format(date).toString(), this.hoVaTen, "X??a nh??n kh???u", this.chucVu));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        textFieldNhapSoHoKhau.setText("");
        textFieldHoVaTenChuHo.setText("");
        textFieldNgayDangKi.setText("");
        textFieldDiaChi.setText("");
        table1.clearRow();
        flag = false;
        ButtonTimKiem.setEnabled(true);
    }//GEN-LAST:event_ButtonHoanThanhActionPerformed

    private void ButtonHoanTacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHoanTacActionPerformed
        EventActionFormXoa eventAction = new EventActionFormXoa() {
            @Override
            public void delete(ModelNhanKhau nhanKhau) {
                showMessage("B???n mu???n x??a nh??n kh???u: " + nhanKhau.getHoVaTen(),1);
                table1.removeRow(table1.getSelectedRow());
                System.out.println(table1.getSelectedRow());
                for (int i = 0; i < arr.size(); ++i) {
                    if (arr.get(i).getCMND().equals(nhanKhau.getCMND())) {
                        stackArrayList.add(arr.get(i));
                        arr.remove(i);
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
                    }
                }
            }
        };
        
        if (stackArrayList.size() > 0) {
            arr.add(stackArrayList.get(stackArrayList.size() - 1));
            stackArrayList.remove(stackArrayList.size() - 1);
            table1.addRow(new ModelNhanKhau(arr.get(arr.size()-1).getCMND(), arr.get(arr.size()-1).getHoVaTen(), arr.get(arr.size()-1).getNgaySinh(), arr.get(arr.size()-1).getGioiTinh(), arr.get(arr.size()-1).getQuanHeChuHo()).toRowTableFormXoaNhanKhau(eventAction));
        }
    }//GEN-LAST:event_ButtonHoanTacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonHoanTac;
    private views.swing.Button ButtonHoanThanh;
    private views.swing.Button ButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private views.swing.table.Table table1;
    private views.swing.textfield.TextField textFieldDiaChi;
    private views.swing.textfield.TextField textFieldHoVaTenChuHo;
    private views.swing.textfield.TextField textFieldNgayDangKi;
    private views.swing.textfield.TextField textFieldNhapSoHoKhau;
    // End of variables declaration//GEN-END:variables
}
