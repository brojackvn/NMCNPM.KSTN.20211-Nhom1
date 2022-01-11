package views.form;

import controllers.ControllerNhanKhau;
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
import views.dialog.MessageTextField;
import views.event.EventActionFormTach;
import views.event.EventActionFormXoa;
import views.swing.table.TableHeader;

public class FormTachHoKhau extends javax.swing.JPanel {
    private boolean flag = false;
    private ArrayList<ModelNhanKhau> arrMuonTach = new ArrayList<>();
    private ArrayList<ModelNhanKhau> arrSauTach = new ArrayList<>();
    ModelSoHoKhau soHoKhau;
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
        initTableMuonTachData();
        
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
        initTableSauTachData();
    }

    public void initTableMuonTachData() {
        EventActionFormTach eventActionFormTach = new EventActionFormTach() {
            @Override
            public void move(ModelNhanKhau nhanKhau) {
                System.out.println("chuyen nhan khau");
                boolean ans = showMessageOption("Bạn muốn chuyển nhân khẩu: " + nhanKhau.getHoVaTen());
                if (ans) {
                    tableMuonTach.removeRow(tableMuonTach.getSelectedRow());
                    System.out.println(tableMuonTach.getSelectedRow());
                    for (int i = 0; i < arrMuonTach.size(); ++i) {
                        if (arrMuonTach.get(i).getCMND().equals(nhanKhau.getCMND())) {
                            arrSauTach.add(arrMuonTach.get(i));
                            initTableSauTachData();
                            arrMuonTach.remove(i);
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
                        }
                    }
                }
            }
        };
        tableMuonTach.clearRow();
        for (int i = 0; i < arrMuonTach.size(); ++i) {
            tableMuonTach.addRow(new ModelNhanKhau(arrMuonTach.get(i).getCMND(), arrMuonTach.get(i).getHoVaTen(), " ").toRowTableFormTachNhanKhau(eventActionFormTach));
        }
    }
    
        public void initTableSauTachData() {
        EventActionFormTach eventActionFormTach = new EventActionFormTach() {
            @Override
            public void move(ModelNhanKhau nhanKhau) {
                System.out.println("chuyen nhan khau");
                boolean ans = showMessageOption("Bạn muốn chuyển nhân khẩu: " + nhanKhau.getHoVaTen());
                if (ans) {
                    tableSauTach.removeRow(tableSauTach.getSelectedRow());
                    System.out.println(tableSauTach.getSelectedRow());
                    for (int i = 0; i < arrSauTach.size(); ++i) {
                        if (arrSauTach.get(i).getCMND().equals(nhanKhau.getCMND())) {
                            arrMuonTach.add(arrSauTach.get(i));
                            initTableMuonTachData();
                            arrSauTach.remove(i);
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
                        }
                    }
                }
            }
        };
        tableSauTach.clearRow();
        for (int i = 0; i < arrSauTach.size(); ++i) {
            tableSauTach.addRow(new ModelNhanKhau(arrSauTach.get(i).getCMND(), arrSauTach.get(i).getHoVaTen(), " ").toRowTableFormTachNhanKhau(eventActionFormTach));
        }
    }
    
    public boolean checkEmptyCell() {
        for (int i = 0; i < arrMuonTach.size(); ++i) {
            if (String.valueOf(tableMuonTach.getModel().getValueAt(i, 2)).equals(" ")) {
                return false;
            }
        }
        for (int i = 0; i < arrSauTach.size(); ++i) {
            if (String.valueOf(tableSauTach.getModel().getValueAt(i, 2)).equals(" ")) {
                return false;
            }
        }
        return true;
    }    
    
    public boolean checkCMNDinTable() {
        int co = 0;
        for (int i = 0; i < arrMuonTach.size(); ++i) {
            if (textFieldCMNDMuonTach.getText().equals(arrMuonTach.get(i).getCMND())) {
                ++co;
                break;
            }
        }
        if (co == 0) {
            return false;
        }
        
        for (int i = 0; i < arrSauTach.size(); ++i) {
            if (textFieldCMNDSauTach.getText().equals(arrSauTach.get(i).getCMND())) {
                ++co;
                break;
            }
        }
        if (co == 1) {
            return false;
        }
        return true;
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

    private String showMessageTextField() {
        MessageTextField obj = new MessageTextField(Main.getFrames()[0], true);
        obj.showMessage();
        return obj.dataTextField;
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
        ButtonTiepTuc = new views.swing.Button();
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
        textFieldNhapSoHoKhauMuonTach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapSoHoKhauMuonTachMousePressed(evt);
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
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMuonTach);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("NHẬP THÔNG TIN SỔ HỘ KHẨU MUỐN TÁCH");

        ButtonTiepTuc.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTiepTuc.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTiepTuc.setText("TIẾP TỤC");
        ButtonTiepTuc.setToolTipText("");
        ButtonTiepTuc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTiepTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTiepTucActionPerformed(evt);
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
                false, false, true, true
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
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textFieldCMNDMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldCMNDSauTach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldNgayDangKi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(textFielddiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(245, 245, 245))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(134, Short.MAX_VALUE)
                .addComponent(textFieldNhapSoHoKhauMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(textFieldCMNDSauTach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(textFieldCMNDMuonTach, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(ButtonTiepTuc, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed
        try {
            if (flag == true) {
                ButtonTimKiem.setEnabled(false);
            } else {
                if (textFieldNhapSoHoKhauMuonTach.getText().equals("")) {
                    showMessage("Vui lòng nhập mã sổ hộ khẩu", 2);
                } else {
                    if (!new ControllerSoHoKhau().checkMaSHKIsExist(textFieldNhapSoHoKhauMuonTach.getText())) {
                        showMessage("Mã sổ hộ khẩu không tồn tại", 2);
                        textFieldNhapSoHoKhauMuonTach.setText("");
                    } else {
                        flag = true;
                        showMessage("Nhập thông tin nhân khẩu", 1);
                        ButtonTimKiem.setEnabled(false);
                        arrMuonTach = new ControllerNhanKhau().selectDanhMucNhanKhau(textFieldNhapSoHoKhauMuonTach.getText());
                        initTableMuonTachData();
                        
                        soHoKhau = new ControllerSoHoKhau().TraCuuSHK(textFieldNhapSoHoKhauMuonTach.getText());
                        textFielddiaChi.setText(soHoKhau.getDiaChi());
                        
                        textFieldCMNDMuonTach.setText("");
                        textFieldCMNDSauTach.setText("");
                        textFieldNgayDangKi.setText("");
                        textFieldCMNDMuonTach.setEditable(true);
                        textFieldCMNDSauTach.setEditable(true);
                        textFieldNgayDangKi.setEditable(true);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonTimKiemActionPerformed

    private void ButtonTiepTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTiepTucActionPerformed
        try {
            if (flag == true) {
                if (tableSauTach.getRowCount() == 0 || tableMuonTach.getRowCount() == 0 || textFieldCMNDMuonTach.getText().equals("") || textFieldCMNDSauTach.getText().equals("") || textFieldNgayDangKi.getText().equals("")) {
                    showMessage("Vui lòng hoàn thành trước khi lưu", 2);
                } else if (checkCMNDinTable() == false) {
                    showMessage("Mã CMND/CCCD không tồn tại trong SHK", 2);
                } else {
                    if (checkEmptyCell()) {
                        String maSHKMoi = showMessageTextField();
                        if (maSHKMoi != null) {
                            // update hoVaTenChuHo table muon tach 
                            soHoKhau.setHoVaTenChuHo(new ControllerNhanKhau().TraCuuNhanKhau(textFieldCMNDMuonTach.getText()).getHoVaTen());
                            // update quanhechuho cho nhan khau
                            for (int i = 0; i < arrMuonTach.size(); ++i) {
                                arrMuonTach.get(i).setQuanHeChuHo(tableMuonTach.getModel().getValueAt(i, 2).toString());
                                new ControllerNhanKhau().updateQHCH(arrMuonTach.get(i).getCMND(), arrMuonTach.get(i).getQuanHeChuHo());
                            }
                             
                            // insert shk moi vao csdl
                            ModelSoHoKhau shkMoi = new ModelSoHoKhau();
                            shkMoi.setSoHoKhau(maSHKMoi);
                            shkMoi.setNgayDangKi(textFieldNgayDangKi.getText());
                            shkMoi.setDiaChi(textFielddiaChi.getText());
                            shkMoi.setHoVaTenChuHo(new ControllerNhanKhau().TraCuuNhanKhau(textFieldCMNDSauTach.getText()).getHoVaTen());
                            new ControllerSoHoKhau().insert(shkMoi);
                            
                            // update shk, quanhechuho cho nhan khau
                            for (int i = 0; i < arrSauTach.size(); ++i) {
                                arrSauTach.get(i).setSoHoKhau(maSHKMoi);
                                arrSauTach.get(i).setQuanHeChuHo(tableSauTach.getModel().getValueAt(i, 2).toString());
                                
                                new ControllerNhanKhau().updateQHCKandSHK(arrSauTach.get(i).getCMND(), arrSauTach.get(i).getQuanHeChuHo(), maSHKMoi);
                            }
                            
                            // Tra ve lai ban dau
                            ButtonTimKiem.setEnabled(true);
                            textFieldNhapSoHoKhauMuonTach.setText("");
                            textFieldCMNDMuonTach.setText("");
                            textFieldCMNDSauTach.setText("");
                            textFieldNgayDangKi.setText("");
                            textFielddiaChi.setText(" ");
                            textFieldCMNDMuonTach.setEditable(false);
                            textFieldCMNDSauTach.setEditable(false);
                            textFieldNgayDangKi.setEditable(false);
                            textFielddiaChi.setEditable(false);

                            tableMuonTach.clearRow();
                            tableSauTach.clearRow();
                            arrMuonTach.clear();
                            arrSauTach.clear();
                            flag = false;
                        }
                    } else {
                        showMessage("Nhấn đúp chuột vào ô QHCH đề điền TT", 2);
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonTiepTucActionPerformed

    private void textFieldNhapSoHoKhauMuonTachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMuonTachMousePressed
        if (flag == true) {
            boolean ans = showMessageOption("Bạn muốn tách sổ hộ khẩu khác");
            if (ans) {
                flag = false;
                ButtonTimKiem.setEnabled(true);
                textFieldNhapSoHoKhauMuonTach.setFocusable(true);
                textFieldNhapSoHoKhauMuonTach.setText("");
                textFieldCMNDMuonTach.setText("");
                textFieldCMNDSauTach.setText("");
                textFieldNgayDangKi.setText("");
                textFielddiaChi.setText(" ");
                textFieldCMNDMuonTach.setEditable(false);
                textFieldCMNDSauTach.setEditable(false);
                textFieldNgayDangKi.setEditable(false);
                textFielddiaChi.setEditable(false);
                
                tableMuonTach.clearRow();
                tableSauTach.clearRow();
                arrMuonTach.clear();
                arrSauTach.clear();
            } else {
                textFieldNhapSoHoKhauMuonTach.setFocusable(false);
            }
        }
    }//GEN-LAST:event_textFieldNhapSoHoKhauMuonTachMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonTiepTuc;
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
