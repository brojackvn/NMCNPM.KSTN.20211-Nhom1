package views.form;

import controllers.ControllerLichSu;
import controllers.ControllerNhanKhau;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ModelLichSu;
import models.ModelNhanKhau;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

public class FormSuaNhanKhau extends javax.swing.JPanel {
    boolean flag = false;
    private String username;
    private String chucVu;
    private String hoVaTen;
    private String password;
    
    public FormSuaNhanKhau(String userName, String chucVu, String hoVaTen, String passWord) {
        initComponents();
        this.username = userName;
        this.chucVu = chucVu;
        this.hoVaTen = hoVaTen;
        this.password = password;
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
        textFieldNhapCMND = new views.swing.textfield.TextField();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("T??M KI???M TH??NG TIN NH??N KH???U CH???NH S???A");

        textFieldNhapSoHoKhau.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapSoHoKhau.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapSoHoKhau.setLabelText("NH???P M?? S??? S??? H??? KH???U");
        textFieldNhapSoHoKhau.setOpaque(false);
        textFieldNhapSoHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapSoHoKhauMousePressed(evt);
            }
        });

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setText("T??M KI???M");
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setActionCommand("KI???M TRA");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("S???A TH??NG TIN NH??N KH???U");

        textFieldNoiSinh.setEditable(false);
        textFieldNoiSinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNoiSinh.setToolTipText("");
        textFieldNoiSinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNoiSinh.setLabelText("N??I SINH");

        textFieldQueQuan.setEditable(false);
        textFieldQueQuan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQueQuan.setToolTipText("");
        textFieldQueQuan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQueQuan.setLabelText("QU?? QU??N");

        textFieldNoiOHienTai.setEditable(false);
        textFieldNoiOHienTai.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNoiOHienTai.setToolTipText("");
        textFieldNoiOHienTai.setAutoscrolls(false);
        textFieldNoiOHienTai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNoiOHienTai.setLabelText("N??I ??? HI???N T???I");

        ButtonLuu.setBackground(new java.awt.Color(89, 89, 255));
        ButtonLuu.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLuu.setToolTipText("");
        ButtonLuu.setActionCommand("KI???M TRA");
        ButtonLuu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonLuu.setLabel("C???P NH???T");
        ButtonLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLuuActionPerformed(evt);
            }
        });

        textFieldQuanHeVoiChuHo.setEditable(false);
        textFieldQuanHeVoiChuHo.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuanHeVoiChuHo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuanHeVoiChuHo.setLabelText("QUAN H??? V???I CH??? H???");

        textFieldHoVaTen.setEditable(false);
        textFieldHoVaTen.setBackground(new java.awt.Color(245, 245, 245));
        textFieldHoVaTen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldHoVaTen.setLabelText("H??? V?? T??N");

        textFieldTenGoiKhac.setEditable(false);
        textFieldTenGoiKhac.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTenGoiKhac.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTenGoiKhac.setLabelText("T??N G???I KH??C");

        textFieldCMND.setEditable(false);
        textFieldCMND.setBackground(new java.awt.Color(245, 245, 245));
        textFieldCMND.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldCMND.setLabelText("CMND/CCCD");

        textFieldNgaySinh.setEditable(false);
        textFieldNgaySinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgaySinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgaySinh.setLabelText("NG??Y SINH");

        textFieldGioiTinh.setEditable(false);
        textFieldGioiTinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGioiTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGioiTinh.setLabelText("GI???I T??NH");

        textFieldQuocTich.setEditable(false);
        textFieldQuocTich.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuocTich.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuocTich.setLabelText("QU???C T???CH");

        textFieldTonGiao.setEditable(false);
        textFieldTonGiao.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTonGiao.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTonGiao.setLabelText("T??N GI??O");

        textFieldDanToc.setEditable(false);
        textFieldDanToc.setBackground(new java.awt.Color(245, 245, 245));
        textFieldDanToc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldDanToc.setLabelText("D??N T???C");

        textFieldTrinhDoHocVan.setEditable(false);
        textFieldTrinhDoHocVan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTrinhDoHocVan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTrinhDoHocVan.setLabelText("TR??NH ????? H???C V???N");

        textFieldNgheNghiepHienTai.setEditable(false);
        textFieldNgheNghiepHienTai.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgheNghiepHienTai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgheNghiepHienTai.setLabelText("NGH??? NGHI???P HI???N T???I");

        textFieldTrinhDoChuyenMon.setEditable(false);
        textFieldTrinhDoChuyenMon.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTrinhDoChuyenMon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTrinhDoChuyenMon.setLabelText("TR??NH ????? CHUY??N M??N");

        textFieldGhiChu.setEditable(false);
        textFieldGhiChu.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGhiChu.setToolTipText("");
        textFieldGhiChu.setAutoscrolls(false);
        textFieldGhiChu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGhiChu.setLabelText("GHI CH?? (Ch??? c?? th??m th??ng tin ghi ch??)");

        textFieldNhapCMND.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapCMND.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapCMND.setLabelText("NH???P M?? S??? CMND/CCCD");
        textFieldNhapCMND.setOpaque(false);
        textFieldNhapCMND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapCMNDMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 714, Short.MAX_VALUE))
                    .addComponent(jSeparator2)
                    .addComponent(textFieldQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNoiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNoiOHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldNhapCMND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textFieldNhapSoHoKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textFieldNhapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            if (textFieldNhapCMND.getText().equals("") || textFieldNhapSoHoKhau.getText().equals("")) {
                showMessage("Vui l??ng nh???p ?????y ????? c??c tr?????ng t??m ki???m", 2);
            } else {
                if (ControllerNhanKhau.checkMaSHKCMND(textFieldNhapSoHoKhau.getText(), textFieldNhapCMND.getText())) {
                    flag = true;
                    showMessage("S???a th??ng tin nh??n kh???u", 1);
                    textFieldNhapSoHoKhau.setEditable(true);
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

                    ModelNhanKhau modelNhanKhau = new ControllerNhanKhau().TraCuuNhanKhau(textFieldNhapCMND.getText());

                    textFieldCMND.setText(modelNhanKhau.getCMND());
                    System.out.println(modelNhanKhau.getCMND());
                    textFieldQuanHeVoiChuHo.setText(modelNhanKhau.getQuanHeChuHo());
                    textFieldHoVaTen.setText(modelNhanKhau.getHoVaTen());
                    textFieldTenGoiKhac.setText(modelNhanKhau.getTenGoiKhac());
                    textFieldNgaySinh.setText(modelNhanKhau.getNgaySinh());
                    if (modelNhanKhau.getGioiTinh() == 1) {
                        textFieldGioiTinh.setText("Nam");
                    } else {
                        textFieldGioiTinh.setText("N???");
                    }
                    textFieldQuocTich.setText(modelNhanKhau.getQuocTich());
                    textFieldDanToc.setText(modelNhanKhau.getDanToc());
                    textFieldTonGiao.setText(modelNhanKhau.getTonGiao());
                    textFieldTrinhDoHocVan.setText(modelNhanKhau.getTrinhDoHocVan());
                    textFieldTrinhDoChuyenMon.setText(modelNhanKhau.getTrinhDoChuyenMon());
                    textFieldNgheNghiepHienTai.setText(modelNhanKhau.getNgheNghiepHienTai());
                    textFieldNoiSinh.setText(modelNhanKhau.getNoiSinh());
                    textFieldQueQuan.setText(modelNhanKhau.getQueQuan());
                    textFieldNoiOHienTai.setText(modelNhanKhau.getNoiOHienTai());
                    textFieldGhiChu.setText("");
                } else {
                    showMessage("Kh??ng t???n t???i nh??n kh???u b???n mu???n s???a", 2);
                    textFieldNhapSoHoKhau.setText("");
                    textFieldNhapCMND.setText("");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormSuaNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormSuaNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonTimKiemActionPerformed

    private void ButtonLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLuuActionPerformed
        ModelNhanKhau modelNhanKhau = new ModelNhanKhau();
        if (textFieldNhapSoHoKhau.getText().equals("") || textFieldNhapCMND.getText().equals("")) {
            showMessage("Vui l??ng nh???p ?????y ????? c??c tr?????ng", 2);
        }
        else if (textFieldQuanHeVoiChuHo.getText().equals("") || textFieldHoVaTen.getText().equals("") || textFieldCMND.getText().equals("")) {
            showMessage("Vui l??ng nh???p ?????y ????? c??c tr?????ng", 2);
        }
        else {
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
            boolean ans = showMessageOption("B???n th???c s??? mu???n c???p nh???t nh??n kh???u n??y");
            if (ans) {
                try {
                    boolean res = new ControllerNhanKhau().update(modelNhanKhau);
                    if (res) {
                        showMessage("C???p nh???t th??nh c??ng nh??n kh???u v??o CSDL", 1);
                        
                        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                        Date date = new Date();
                        new ControllerLichSu().insertLichSu(new ModelLichSu(formatter.format(date).toString(), this.hoVaTen, "S???a nh??n kh???u", this.chucVu));
                        
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
                        textFieldNhapCMND.setText("");
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
        }
    }//GEN-LAST:event_ButtonLuuActionPerformed

    private void textFieldNhapSoHoKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMousePressed
        if (flag == true) {
            boolean ans = showMessageOption("B???n mu???n s???a nh??n kh???u kh??c");
            flag = false;
            if (ans) {
                textFieldNhapSoHoKhau.setFocusable(true);
                textFieldNhapSoHoKhau.setText("");
                textFieldNhapCMND.setText("");
                
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

    private void textFieldNhapCMNDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapCMNDMousePressed
        if (flag == true) {
            boolean ans = showMessageOption("B???n mu???n s???a nh??n kh???u kh??c");
            flag = false;
            if (ans) {
                textFieldNhapCMND.setFocusable(true);
                
                textFieldNhapSoHoKhau.setText("");
                textFieldNhapCMND.setText("");
                
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
                textFieldNhapCMND.setFocusable(false);
            }
        }
    }//GEN-LAST:event_textFieldNhapCMNDMousePressed

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
    private views.swing.textfield.TextField textFieldNhapCMND;
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
