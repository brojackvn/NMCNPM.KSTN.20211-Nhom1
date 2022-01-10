package views.form;

import controllers.ControllerNhanKhau;
import java.util.ArrayList;
import models.ModelNhanKhau;
import models.ModelSoHoKhau;
import controllers.ControllerSoHoKhau;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

public class FormDangKiHoKhau extends javax.swing.JPanel {
    private ArrayList<ModelNhanKhau> listNhanKhau = new ArrayList<ModelNhanKhau>();
    private ModelSoHoKhau SHK = new ModelSoHoKhau();
    
    public FormDangKiHoKhau() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textMaSHK = new views.swing.textfield.TextField();
        textHoTenChuHo = new views.swing.textfield.TextField();
        textNgayDangKi = new views.swing.textfield.TextField();
        textFieldQuanHeVoiChuHo = new views.swing.textfield.TextField();
        textFieldHoVaTen = new views.swing.textfield.TextField();
        textFieldTenGoiKhac = new views.swing.textfield.TextField();
        textFieldGioiTinh = new views.swing.textfield.TextField();
        textFieldNgaySinh = new views.swing.textfield.TextField();
        textFieldCMND = new views.swing.textfield.TextField();
        textFieldQuocTich = new views.swing.textfield.TextField();
        textFieldDanToc = new views.swing.textfield.TextField();
        textFieldTonGiao = new views.swing.textfield.TextField();
        textFieldNgheNghiepHienTai = new views.swing.textfield.TextField();
        textFieldTrinhDoChuyenMon = new views.swing.textfield.TextField();
        textFieldTrinhDoHocVan = new views.swing.textfield.TextField();
        textFieldNoiSinh = new views.swing.textfield.TextField();
        textFieldQueQuan = new views.swing.textfield.TextField();
        textFieldNoiOHienTai = new views.swing.textfield.TextField();
        textFieldGhiChu = new views.swing.textfield.TextField();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonTimKiem = new views.swing.Button();
        ButtonLuu = new views.swing.Button();
        jSeparator2 = new javax.swing.JSeparator();
        ButtonHoanThanh = new views.swing.Button();
        textDiaChi = new views.swing.textfield.TextField();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("ĐĂNG KÍ SỔ HỘ KHẨU");

        textMaSHK.setBackground(new java.awt.Color(245, 245, 245));
        textMaSHK.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textMaSHK.setLabelText("MÃ SỐ SỔ HỘ KHẨU");

        textHoTenChuHo.setBackground(new java.awt.Color(245, 245, 245));
        textHoTenChuHo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textHoTenChuHo.setLabelText("HỌ VÀ TÊN CHỦ HỘ");

        textNgayDangKi.setBackground(new java.awt.Color(245, 245, 245));
        textNgayDangKi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textNgayDangKi.setLabelText("NGÀY ĐĂNG KÍ");
        textNgayDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNgayDangKiActionPerformed(evt);
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

        textFieldGioiTinh.setEditable(false);
        textFieldGioiTinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGioiTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGioiTinh.setLabelText("GIỚI TÍNH");

        textFieldNgaySinh.setEditable(false);
        textFieldNgaySinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgaySinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgaySinh.setLabelText("NGÀY SINH");

        textFieldCMND.setEditable(false);
        textFieldCMND.setBackground(new java.awt.Color(245, 245, 245));
        textFieldCMND.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldCMND.setLabelText("CMND/CCCD");

        textFieldQuocTich.setEditable(false);
        textFieldQuocTich.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuocTich.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuocTich.setLabelText("QUỐC TỊCH");

        textFieldDanToc.setEditable(false);
        textFieldDanToc.setBackground(new java.awt.Color(245, 245, 245));
        textFieldDanToc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldDanToc.setLabelText("DÂN TỘC");

        textFieldTonGiao.setEditable(false);
        textFieldTonGiao.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTonGiao.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTonGiao.setLabelText("TÔN GIÁO");

        textFieldNgheNghiepHienTai.setEditable(false);
        textFieldNgheNghiepHienTai.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgheNghiepHienTai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgheNghiepHienTai.setLabelText("NGHỀ NGHIỆP HIỆN TẠI");

        textFieldTrinhDoChuyenMon.setEditable(false);
        textFieldTrinhDoChuyenMon.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTrinhDoChuyenMon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTrinhDoChuyenMon.setLabelText("TRÌNH ĐỘ CHUYÊN MÔN");

        textFieldTrinhDoHocVan.setEditable(false);
        textFieldTrinhDoHocVan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTrinhDoHocVan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTrinhDoHocVan.setLabelText("TRÌNH ĐỘ HỌC VẤN");

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

        textFieldGhiChu.setEditable(false);
        textFieldGhiChu.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGhiChu.setToolTipText("");
        textFieldGhiChu.setAutoscrolls(false);
        textFieldGhiChu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGhiChu.setLabelText("GHI CHÚ");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setActionCommand("KIỂM TRA");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.setLabel("KIỂM TRA");
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

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

        ButtonHoanThanh.setBackground(new java.awt.Color(89, 89, 255));
        ButtonHoanThanh.setForeground(new java.awt.Color(255, 255, 255));
        ButtonHoanThanh.setText("HOÀN THÀNH");
        ButtonHoanThanh.setToolTipText("");
        ButtonHoanThanh.setActionCommand("KIỂM TRA");
        ButtonHoanThanh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonHoanThanh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonHoanThanhActionPerformed(evt);
            }
        });

        textDiaChi.setBackground(new java.awt.Color(245, 245, 245));
        textDiaChi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textDiaChi.setLabelText("ĐỊA CHỈ");
        textDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDiaChiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(textMaSHK, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textHoTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(textDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(textFieldQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textFieldNoiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(textFieldNoiOHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(textFieldGhiChu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMaSHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHoTenChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textNgayDangKi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonLuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonHoanThanh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    
     private boolean showMessageOption(String message) {
        MessageOption obj = new MessageOption(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }
    
    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed

        SHK.setNgayDangKi(textNgayDangKi.getText());
        SHK.setSoHoKhau(textMaSHK.getText());
        SHK.setHoVaTenChuHo(textHoTenChuHo.getText());
        SHK.setDiaChi(textDiaChi.getText());
        SHK.setNguoiTao("user");
        
        
        ControllerSoHoKhau CtlSHK = new ControllerSoHoKhau();
        try{
            if(CtlSHK.checkMaSHKIsExist(SHK.getSoHoKhau())){
                showMessage("Sổ Hộ Khẩu đã tồn tại.", 2);
            }
            else{
                showMessage("Số Sổ Hộ Khẩu hợp lệ", 1);
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
        }catch(Exception e){};
    }//GEN-LAST:event_ButtonTimKiemActionPerformed

    private void ButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLuuActionPerformed
        ModelNhanKhau modelNhanKhau = new ModelNhanKhau();
        if (textFieldQuanHeVoiChuHo.getText().equals("") || textFieldHoVaTen.getText().equals("") || textFieldCMND.getText().equals("")) {
            showMessage("Vui lòng nhập đầy đủ các trường", 2);
        } else {
            modelNhanKhau.setSoHoKhau(SHK.getSoHoKhau());
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
                boolean ans = showMessageOption("Bạn có muốn thêm nhân khẩu");
                if (ans) {
                    if(modelNhanKhau.getQuanHeChuHo().equals("Chủ hộ") && !modelNhanKhau.getHoVaTen().equals(SHK.getHoVaTenChuHo())){
                        showMessage("Họ tên chủ hộ không khớp. Vui lòng kiểm tra lại", 2);
                    } 
                    else{
                        listNhanKhau.add(modelNhanKhau);
                        showMessage("Đã thêm nhân khẩu vào hộ khẩu", 1);
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
                    }
                }
            } catch (Exception ex) {
            } 
        }
    }//GEN-LAST:event_ButtonLuuActionPerformed

    private void ButtonHoanThanhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonHoanThanhActionPerformed
        ControllerNhanKhau CtlNhanKhau = new ControllerNhanKhau();
        ControllerSoHoKhau CtlSHK = new ControllerSoHoKhau();
        try{
            boolean ans = showMessageOption("Bạn có muốn thêm hộ khẩu");
            if (ans) {
                CtlSHK.insert(SHK);

                for(int i=0; i<listNhanKhau.size(); i++){
                   CtlNhanKhau.insert(listNhanKhau.get(i));
                }
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
                textDiaChi.setText("");
                textMaSHK.setText("");
                textHoTenChuHo.setText("");
                textNgayDangKi.setText("");
            }
            
        } catch(Exception e){};
        
    }//GEN-LAST:event_ButtonHoanThanhActionPerformed

    private void textNgayDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNgayDangKiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNgayDangKiActionPerformed

    private void textDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDiaChiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonHoanThanh;
    private views.swing.Button ButtonLuu;
    private views.swing.Button ButtonTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private views.swing.textfield.TextField textDiaChi;
    private views.swing.textfield.TextField textFieldCMND;
    private views.swing.textfield.TextField textFieldDanToc;
    private views.swing.textfield.TextField textFieldGhiChu;
    private views.swing.textfield.TextField textFieldGioiTinh;
    private views.swing.textfield.TextField textFieldHoVaTen;
    private views.swing.textfield.TextField textFieldNgaySinh;
    private views.swing.textfield.TextField textFieldNgheNghiepHienTai;
    private views.swing.textfield.TextField textFieldNoiOHienTai;
    private views.swing.textfield.TextField textFieldNoiSinh;
    private views.swing.textfield.TextField textFieldQuanHeVoiChuHo;
    private views.swing.textfield.TextField textFieldQueQuan;
    private views.swing.textfield.TextField textFieldQuocTich;
    private views.swing.textfield.TextField textFieldTenGoiKhac;
    private views.swing.textfield.TextField textFieldTonGiao;
    private views.swing.textfield.TextField textFieldTrinhDoChuyenMon;
    private views.swing.textfield.TextField textFieldTrinhDoHocVan;
    private views.swing.textfield.TextField textHoTenChuHo;
    private views.swing.textfield.TextField textMaSHK;
    private views.swing.textfield.TextField textNgayDangKi;
    // End of variables declaration//GEN-END:variables
}
