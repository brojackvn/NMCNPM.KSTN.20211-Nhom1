package views.form;

import controllers.ControllerNhanKhau;
import controllers.ControllerSoHoKhau;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ModelNhanKhau;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

public class FormThemNhanKhau extends javax.swing.JPanel {

    private boolean flag = false;

    public FormThemNhanKhau() {
        initComponents();
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
//        textFieldNhapSoHoKhau;
//        textFieldCMND;
//        textFieldQuanHeVoiChuHo;
//        textFieldHoVaTen;
//        textFieldTenGoiKhac;
//        textFieldNgaySinh;
//        textFieldGioiTinh;
//        textFieldQuocTich;
//        textFieldDanToc;
//        textFieldTonGiao;
//        textFieldTrinhDoHocVan;
//        textFieldTrinhDoChuyenMon;
//        textFieldNgheNghiepHienTai;
//        textFieldNoiSinh;
//        textFieldQueQuan;
//        textFieldNoiOHienTai;
//        textFieldGhiChu;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNhapSoHoKhau = new views.swing.textfield.TextField();
        ButtonTimKiem = new views.swing.Button();
        jLabel2 = new javax.swing.JLabel();
        textFieldNoiSinh = new views.swing.textfield.TextField();
        textFieldQueQuan = new views.swing.textfield.TextField();
        textFieldNoiOHienTai = new views.swing.textfield.TextField();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonLuu = new views.swing.Button();
        textFieldQuanHeVoiChuHo = new views.swing.textfield.TextField();
        textFieldHoVaTen = new views.swing.textfield.TextField();
        textFieldTenGoiKhac = new views.swing.textfield.TextField();
        textFieldCMND = new views.swing.textfield.TextField();
        textFieldNgaySinh = new views.swing.textfield.TextField();
        textFieldGioiTinh = new views.swing.textfield.TextField();
        textFieldQuocTich = new views.swing.textfield.TextField();
        textFieldTonGiao = new views.swing.textfield.TextField();
        textFieldDanToc = new views.swing.textfield.TextField();
        textFieldTrinhDoHocVan = new views.swing.textfield.TextField();
        textFieldNgheNghiepHienTai = new views.swing.textfield.TextField();
        textFieldTrinhDoChuyenMon = new views.swing.textfield.TextField();
        textFieldGhiChu = new views.swing.textfield.TextField();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KIỂM TRA MÃ SỐ SỔ HỘ KHẨU");

        textFieldNhapSoHoKhau.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhau.setLabelText("NHẬP MÃ SỐ SỔ HỘ KHẨU");
        textFieldNhapSoHoKhau.setOpaque(false);
        textFieldNhapSoHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapSoHoKhauMousePressed(evt);
            }
        });

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setText("TÌM KIẾM");
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setActionCommand("KIỂM TRA");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("THÊM THÔNG TIN NHÂN KHẨU");

        textFieldNoiSinh.setEditable(false);
        textFieldNoiSinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNoiSinh.setToolTipText("");
        textFieldNoiSinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNoiSinh.setLabelText("NƠI SINH");

        textFieldQueQuan.setEditable(false);
        textFieldQueQuan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQueQuan.setToolTipText("");
        textFieldQueQuan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQueQuan.setLabelText("QUÊ QUÁN");

        textFieldNoiOHienTai.setEditable(false);
        textFieldNoiOHienTai.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNoiOHienTai.setToolTipText("");
        textFieldNoiOHienTai.setAutoscrolls(false);
        textFieldNoiOHienTai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNoiOHienTai.setLabelText("NƠI Ở HIỆN TẠI");

        ButtonLuu.setBackground(new java.awt.Color(89, 89, 255));
        ButtonLuu.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLuu.setText("LƯU");
        ButtonLuu.setToolTipText("");
        ButtonLuu.setActionCommand("KIỂM TRA");
        ButtonLuu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLuuActionPerformed(evt);
            }
        });

        textFieldQuanHeVoiChuHo.setEditable(false);
        textFieldQuanHeVoiChuHo.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuanHeVoiChuHo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuanHeVoiChuHo.setLabelText("QUAN HỆ VỚI CHỦ HỘ");

        textFieldHoVaTen.setEditable(false);
        textFieldHoVaTen.setBackground(new java.awt.Color(245, 245, 245));
        textFieldHoVaTen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldHoVaTen.setLabelText("HỌ VÀ TÊN");

        textFieldTenGoiKhac.setEditable(false);
        textFieldTenGoiKhac.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTenGoiKhac.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTenGoiKhac.setLabelText("TÊN GỌI KHÁC");

        textFieldCMND.setEditable(false);
        textFieldCMND.setBackground(new java.awt.Color(245, 245, 245));
        textFieldCMND.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldCMND.setLabelText("CMND/CCCD");

        textFieldNgaySinh.setEditable(false);
        textFieldNgaySinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgaySinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgaySinh.setLabelText("NGÀY SINH");

        textFieldGioiTinh.setEditable(false);
        textFieldGioiTinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGioiTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGioiTinh.setLabelText("GIỚI TÍNH");

        textFieldQuocTich.setEditable(false);
        textFieldQuocTich.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuocTich.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuocTich.setLabelText("QUỐC TỊCH");

        textFieldTonGiao.setEditable(false);
        textFieldTonGiao.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTonGiao.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTonGiao.setLabelText("TÔN GIÁO");

        textFieldDanToc.setEditable(false);
        textFieldDanToc.setBackground(new java.awt.Color(245, 245, 245));
        textFieldDanToc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldDanToc.setLabelText("DÂN TỘC");

        textFieldTrinhDoHocVan.setEditable(false);
        textFieldTrinhDoHocVan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTrinhDoHocVan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTrinhDoHocVan.setLabelText("TRÌNH ĐỘ HỌC VẤN");

        textFieldNgheNghiepHienTai.setEditable(false);
        textFieldNgheNghiepHienTai.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgheNghiepHienTai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgheNghiepHienTai.setLabelText("NGHỀ NGHIỆP HIỆN TẠI");

        textFieldTrinhDoChuyenMon.setEditable(false);
        textFieldTrinhDoChuyenMon.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTrinhDoChuyenMon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTrinhDoChuyenMon.setLabelText("TRÌNH ĐỘ CHUYÊN MÔN");

        textFieldGhiChu.setEditable(false);
        textFieldGhiChu.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGhiChu.setToolTipText("");
        textFieldGhiChu.setAutoscrolls(false);
        textFieldGhiChu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGhiChu.setLabelText("GHI CHÚ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(textFieldQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNoiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNoiOHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 171, Short.MAX_VALUE)
                        .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textFieldQuanHeVoiChuHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldTenGoiKhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textFieldCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldQuocTich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldDanToc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldTonGiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textFieldTrinhDoHocVan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldTrinhDoChuyenMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22)
                        .addComponent(textFieldNgheNghiepHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textFieldGhiChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldQuanHeVoiChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTenGoiKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldTrinhDoHocVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTrinhDoChuyenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNgheNghiepHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldNoiOHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed
        try {
            if (textFieldNhapSoHoKhau.getText().equals("")) {
                showMessage("Vui lòng nhập mã sổ hộ khẩu", 2);
            } else {
                if (!new ControllerSoHoKhau().checkMaSHKIsExist(textFieldNhapSoHoKhau.getText())) {
                    showMessage("Mã sổ hộ khẩu không tồn tại", 2);
                    textFieldNhapSoHoKhau.setText("");
                } else {
                    flag = true;
                    showMessage("Nhập thông tin nhân khẩu", 1);
                    textFieldNhapSoHoKhau.setEditable(true);
                    textFieldCMND.setEditable(true);
                    textFieldQuanHeVoiChuHo.setEditable(true);
                    textFieldHoVaTen.setEditable(true);
                    textFieldTenGoiKhac.setEditable(true);
                    textFieldNgaySinh.setEditable(true);
                    textFieldGioiTinh.setEditable(true);
                    textFieldQuocTich.setEditable(true);
                    textFieldDanToc.setEditable(true);
                    textFieldTonGiao.setEditable(true);
                    textFieldTrinhDoHocVan.setEditable(true);
                    textFieldTrinhDoChuyenMon.setEditable(true);
                    textFieldNgheNghiepHienTai.setEditable(true);
                    textFieldNoiSinh.setEditable(true);
                    textFieldQueQuan.setEditable(true);
                    textFieldNoiOHienTai.setEditable(true);
                    textFieldGhiChu.setEditable(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonTimKiemActionPerformed

    private void ButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLuuActionPerformed
        ModelNhanKhau modelNhanKhau = new ModelNhanKhau();
        if (textFieldNhapSoHoKhau.getText().equals("")) {
            showMessage("Vui lòng nhập đầy đủ các trường", 2);
        } else if (textFieldQuanHeVoiChuHo.getText().equals("") || textFieldHoVaTen.getText().equals("") || textFieldCMND.getText().equals("")) {
            showMessage("Vui lòng nhập đầy đủ các trường", 2);
        } else {
            modelNhanKhau.setSoHoKhau(textFieldNhapSoHoKhau.getText());
            modelNhanKhau.setCMND(textFieldCMND.getText());
            modelNhanKhau.setQuanHeChuHo(textFieldQuanHeVoiChuHo.getText());
            modelNhanKhau.setHoVaTen(textFieldHoVaTen.getText());
            modelNhanKhau.setTenGoiKhac(textFieldTenGoiKhac.getText());
            modelNhanKhau.setNgaySinh(textFieldNgaySinh.getText());
            if (textFieldGioiTinh.getText().toLowerCase().contains("nam")) {
                modelNhanKhau.setGioiTinh(1);
            } else {
                modelNhanKhau.setGioiTinh(0);
            }
            modelNhanKhau.setQuocTich(textFieldQuocTich.getText());
            modelNhanKhau.setDanToc(textFieldDanToc.getText());
            modelNhanKhau.setTonGiao(textFieldTonGiao.getText());
            modelNhanKhau.setTrinhDoHocVan(textFieldTrinhDoHocVan.getText());
            modelNhanKhau.setTrinhDoChuyenMon(textFieldTrinhDoChuyenMon.getText());
            modelNhanKhau.setNgheNghiepHienTai(textFieldNgheNghiepHienTai.getText());
            modelNhanKhau.setNoiSinh(textFieldNoiSinh.getText());
            modelNhanKhau.setQueQuan(textFieldQueQuan.getText());
            modelNhanKhau.setNoiOHienTai(textFieldNoiOHienTai.getText());
            modelNhanKhau.setGhiChu(textFieldGhiChu.getText());
            try {
                boolean ans = showMessageOption("Bạn có thực sự muốn lưu nhân khẩu");
                if (ans) {
                    new ControllerNhanKhau().insert(modelNhanKhau);
                    showMessage("Lưu thành công nhân khẩu vào CSDL", 1);
                    textFieldCMND.setEditable(false);
                    textFieldQuanHeVoiChuHo.setEditable(false);
                    textFieldHoVaTen.setEditable(false);
                    textFieldTenGoiKhac.setEditable(false);
                    textFieldNgaySinh.setEditable(false);
                    textFieldGioiTinh.setEditable(false);
                    textFieldQuocTich.setEditable(false);
                    textFieldDanToc.setEditable(false);
                    textFieldTonGiao.setEditable(false);
                    textFieldTrinhDoHocVan.setEditable(false);
                    textFieldTrinhDoChuyenMon.setEditable(false);
                    textFieldNgheNghiepHienTai.setEditable(false);
                    textFieldNoiSinh.setEditable(false);
                    textFieldQueQuan.setEditable(false);
                    textFieldNoiOHienTai.setEditable(false);
                    textFieldGhiChu.setEditable(false);

                    textFieldNhapSoHoKhau.setText("");
                    textFieldCMND.setText("");
                    textFieldQuanHeVoiChuHo.setText("");
                    textFieldHoVaTen.setText("");
                    textFieldTenGoiKhac.setText("");
                    textFieldNgaySinh.setText("");
                    textFieldGioiTinh.setText("");
                    textFieldQuocTich.setText("");
                    textFieldDanToc.setText("");
                    textFieldTonGiao.setText("");
                    textFieldTrinhDoHocVan.setText("");
                    textFieldTrinhDoChuyenMon.setText("");
                    textFieldNgheNghiepHienTai.setText("");
                    textFieldNoiSinh.setText("");
                    textFieldQueQuan.setText("");
                    textFieldNoiOHienTai.setText("");
                    textFieldGhiChu.setText("");
                    flag = false;
                }
            } catch (SQLException ex) {
                Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_ButtonLuuActionPerformed

    private void textFieldNhapSoHoKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMousePressed
        if (flag == true) {
            boolean ans = showMessageOption("Bạn muốn nhập sổ hộ khẩu khác");
            flag = false;
            if (ans) {
                textFieldNhapSoHoKhau.setFocusable(true);
                textFieldNhapSoHoKhau.setText("");

                textFieldCMND.setEditable(false);
                textFieldQuanHeVoiChuHo.setEditable(false);
                textFieldHoVaTen.setEditable(false);
                textFieldTenGoiKhac.setEditable(false);
                textFieldNgaySinh.setEditable(false);
                textFieldGioiTinh.setEditable(false);
                textFieldQuocTich.setEditable(false);
                textFieldDanToc.setEditable(false);
                textFieldTonGiao.setEditable(false);
                textFieldTrinhDoHocVan.setEditable(false);
                textFieldTrinhDoChuyenMon.setEditable(false);
                textFieldNgheNghiepHienTai.setEditable(false);
                textFieldNoiSinh.setEditable(false);
                textFieldQueQuan.setEditable(false);
                textFieldNoiOHienTai.setEditable(false);
                textFieldGhiChu.setEditable(false);

                textFieldCMND.setText("");
                textFieldQuanHeVoiChuHo.setText("");
                textFieldHoVaTen.setText("");
                textFieldTenGoiKhac.setText("");
                textFieldNgaySinh.setText("");
                textFieldGioiTinh.setText("");
                textFieldQuocTich.setText("");
                textFieldDanToc.setText("");
                textFieldTonGiao.setText("");
                textFieldTrinhDoHocVan.setText("");
                textFieldTrinhDoChuyenMon.setText("");
                textFieldNgheNghiepHienTai.setText("");
                textFieldNoiSinh.setText("");
                textFieldQueQuan.setText("");
                textFieldNoiOHienTai.setText("");
                textFieldGhiChu.setText("");
            } else {
                flag = true;
                textFieldNhapSoHoKhau.setFocusable(false);
            }
        }
    }//GEN-LAST:event_textFieldNhapSoHoKhauMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonLuu;
    private views.swing.Button ButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private views.swing.textfield.TextField textFieldCMND;
    private views.swing.textfield.TextField textFieldDanToc;
    private views.swing.textfield.TextField textFieldGhiChu;
    private views.swing.textfield.TextField textFieldGioiTinh;
    private views.swing.textfield.TextField textFieldHoVaTen;
    private views.swing.textfield.TextField textFieldNgaySinh;
    private views.swing.textfield.TextField textFieldNgheNghiepHienTai;
    private views.swing.textfield.TextField textFieldNhapSoHoKhau;
    private views.swing.textfield.TextField textFieldNoiOHienTai;
    private views.swing.textfield.TextField textFieldNoiSinh;
    private views.swing.textfield.TextField textFieldQuanHeVoiChuHo;
    private views.swing.textfield.TextField textFieldQueQuan;
    private views.swing.textfield.TextField textFieldQuocTich;
    private views.swing.textfield.TextField textFieldTenGoiKhac;
    private views.swing.textfield.TextField textFieldTonGiao;
    private views.swing.textfield.TextField textFieldTrinhDoChuyenMon;
    private views.swing.textfield.TextField textFieldTrinhDoHocVan;
    // End of variables declaration//GEN-END:variables
}
