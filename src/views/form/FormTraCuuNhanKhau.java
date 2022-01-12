
package views.form;

import com.itextpdf.io.font.PdfEncodings;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import models.ModelNhanKhau;
import controllers.ControllerNhanKhau;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

public class FormTraCuuNhanKhau extends javax.swing.JPanel {
    
    public boolean flag = false;

    public FormTraCuuNhanKhau() {
        initComponents();
        initTable();
    }

    public void initTable() {
        
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
    
        public void clearTableData(views.swing.table.Table table1){
        while (table1.getRowCount()>0)
          {
             table1.removeRow(0);
          }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textFieldNhapCMND = new views.swing.textfield.TextField();
        searchButton = new views.swing.Button();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        textFieldQuanHeChuHo = new views.swing.textfield.TextField();
        textFieldMaSHK = new views.swing.textfield.TextField();
        textFieldTenGoiKhac = new views.swing.textfield.TextField();
        textFieldHoVaTen = new views.swing.textfield.TextField();
        textFieldNgaysinh = new views.swing.textfield.TextField();
        textFieldGioiTinh = new views.swing.textfield.TextField();
        textFieldDanToc = new views.swing.textfield.TextField();
        textFieldTonGiao = new views.swing.textfield.TextField();
        textFieldQuocTich = new views.swing.textfield.TextField();
        textFieldHocVan = new views.swing.textfield.TextField();
        textFieldChuyenMon = new views.swing.textfield.TextField();
        textFieldNgheNghiep = new views.swing.textfield.TextField();
        textFieldNoiSinh = new views.swing.textfield.TextField();
        textFieldQueQuan = new views.swing.textfield.TextField();
        textFieldThuongTru = new views.swing.textfield.TextField();
        textFieldChoOHienTai = new views.swing.textfield.TextField();
        searchButton1 = new views.swing.Button();
        textFieldGhiChu = new views.swing.textfield.TextField();

        setOpaque(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRA CỨU NHÂN KHẨU");

        textFieldNhapCMND.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNhapCMND.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldNhapCMND.setLabelText("NHẬP MÃ SỐ CMND/CCCD");
        textFieldNhapCMND.setOpaque(false);
        textFieldNhapCMND.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapCMNDMousePressed(evt);
            }
        });
        textFieldNhapCMND.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNhapCMNDActionPerformed(evt);
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

        textFieldQuanHeChuHo.setEditable(false);
        textFieldQuanHeChuHo.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuanHeChuHo.setText(" ");
        textFieldQuanHeChuHo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuanHeChuHo.setLabelText("QUAN HỆ VỚI CHỦ HỘ");

        textFieldMaSHK.setEditable(false);
        textFieldMaSHK.setBackground(new java.awt.Color(245, 245, 245));
        textFieldMaSHK.setText(" ");
        textFieldMaSHK.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldMaSHK.setLabelText("MÃ SỐ SỔ HỘ KHẨU");

        textFieldTenGoiKhac.setEditable(false);
        textFieldTenGoiKhac.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTenGoiKhac.setText(" ");
        textFieldTenGoiKhac.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTenGoiKhac.setLabelText("TÊN GỌI KHÁC");

        textFieldHoVaTen.setEditable(false);
        textFieldHoVaTen.setBackground(new java.awt.Color(245, 245, 245));
        textFieldHoVaTen.setText(" ");
        textFieldHoVaTen.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldHoVaTen.setLabelText("HỌ VÀ TÊN");

        textFieldNgaysinh.setEditable(false);
        textFieldNgaysinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgaysinh.setText(" ");
        textFieldNgaysinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgaysinh.setLabelText("NGÀY SINH");

        textFieldGioiTinh.setEditable(false);
        textFieldGioiTinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGioiTinh.setText(" ");
        textFieldGioiTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGioiTinh.setLabelText("GIỚI TÍNH");

        textFieldDanToc.setEditable(false);
        textFieldDanToc.setBackground(new java.awt.Color(245, 245, 245));
        textFieldDanToc.setText(" ");
        textFieldDanToc.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldDanToc.setLabelText("DÂN TỘC");

        textFieldTonGiao.setEditable(false);
        textFieldTonGiao.setBackground(new java.awt.Color(245, 245, 245));
        textFieldTonGiao.setText(" ");
        textFieldTonGiao.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldTonGiao.setLabelText("TÔN GIÁO");

        textFieldQuocTich.setEditable(false);
        textFieldQuocTich.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQuocTich.setText(" ");
        textFieldQuocTich.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQuocTich.setLabelText("QUỐC TỊCH");

        textFieldHocVan.setEditable(false);
        textFieldHocVan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldHocVan.setText(" ");
        textFieldHocVan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldHocVan.setLabelText("TRÌNH ĐỘ HỌC VẤN");

        textFieldChuyenMon.setEditable(false);
        textFieldChuyenMon.setBackground(new java.awt.Color(245, 245, 245));
        textFieldChuyenMon.setText(" ");
        textFieldChuyenMon.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldChuyenMon.setLabelText("TRÌNH ĐỘ CHUYÊN MÔN");

        textFieldNgheNghiep.setEditable(false);
        textFieldNgheNghiep.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNgheNghiep.setText(" ");
        textFieldNgheNghiep.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNgheNghiep.setLabelText("NGHỀ NGHIỆP HIỆN TẠI");

        textFieldNoiSinh.setEditable(false);
        textFieldNoiSinh.setBackground(new java.awt.Color(245, 245, 245));
        textFieldNoiSinh.setText(" ");
        textFieldNoiSinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldNoiSinh.setLabelText("NƠI SINH");

        textFieldQueQuan.setEditable(false);
        textFieldQueQuan.setBackground(new java.awt.Color(245, 245, 245));
        textFieldQueQuan.setText(" ");
        textFieldQueQuan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldQueQuan.setLabelText("QUÊ QUÁN");

        textFieldThuongTru.setEditable(false);
        textFieldThuongTru.setBackground(new java.awt.Color(245, 245, 245));
        textFieldThuongTru.setText(" ");
        textFieldThuongTru.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldThuongTru.setLabelText("NƠI THƯỜNG TRÚ");

        textFieldChoOHienTai.setEditable(false);
        textFieldChoOHienTai.setBackground(new java.awt.Color(245, 245, 245));
        textFieldChoOHienTai.setText(" ");
        textFieldChoOHienTai.setAutoscrolls(false);
        textFieldChoOHienTai.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldChoOHienTai.setLabelText("CHỖ Ở HIỆN TẠI");

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

        textFieldGhiChu.setEditable(false);
        textFieldGhiChu.setBackground(new java.awt.Color(245, 245, 245));
        textFieldGhiChu.setText(" ");
        textFieldGhiChu.setAutoscrolls(false);
        textFieldGhiChu.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        textFieldGhiChu.setLabelText("GHI CHÚ");

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
                        .addComponent(textFieldNhapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(textFieldMaSHK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(112, 112, 112)
                .addComponent(textFieldQuanHeChuHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(220, 220, 220))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(textFieldChoOHienTai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldThuongTru, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldQueQuan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNoiSinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textFieldHocVan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53)
                        .addComponent(textFieldChuyenMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(54, 54, 54)
                        .addComponent(textFieldNgheNghiep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textFieldGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldDanToc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldTonGiao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(textFieldQuocTich, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(textFieldHoVaTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(textFieldTenGoiKhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(textFieldNgaysinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldGhiChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addComponent(textFieldNhapCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldQuanHeChuHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldMaSHK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldHoVaTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTenGoiKhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNgaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldDanToc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTonGiao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldQuocTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldHocVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldChuyenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldNgheNghiep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldNoiSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldThuongTru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldChoOHienTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textFieldGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldNhapCMNDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNhapCMNDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNhapCMNDActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed

        String CMND = textFieldNhapCMND.getText();

        try{
            
            ControllerNhanKhau CTLNhanKhau = new ControllerNhanKhau();
            if(CTLNhanKhau.checkCMNDIsExist(CMND)){
                flag = true;
                ModelNhanKhau NhanKhau = CTLNhanKhau.TraCuuNhanKhau(CMND);

                if(NhanKhau.getGioiTinh()==1) textFieldGioiTinh.setText("Nam");
                else {textFieldGioiTinh.setText("Nữ");}
                textFieldThuongTru.setText(CTLNhanKhau.get_NoiThuongTru(NhanKhau.getSoHoKhau()));
                textFieldChoOHienTai.setText(NhanKhau.getNoiOHienTai());
                textFieldTonGiao.setText(NhanKhau.getTonGiao());
                textFieldChuyenMon.setText(NhanKhau.getTrinhDoChuyenMon());
                textFieldDanToc.setText(NhanKhau.getDanToc());
                textFieldGhiChu.setText(NhanKhau.getGhiChu());
                textFieldHoVaTen.setText(NhanKhau.getHoVaTen());
                textFieldHocVan.setText(NhanKhau.getTrinhDoHocVan());
                textFieldMaSHK.setText(NhanKhau.getSoHoKhau());
                textFieldNgaysinh.setText(NhanKhau.getNgaySinh());
                textFieldNgheNghiep.setText(NhanKhau.getNgheNghiepHienTai());
                textFieldNoiSinh.setText(NhanKhau.getNoiSinh());
                textFieldQuanHeChuHo.setText(NhanKhau.getQuanHeChuHo());
                textFieldQueQuan.setText(NhanKhau.getQueQuan());
                textFieldQuocTich.setText(NhanKhau.getQuocTich());
                textFieldTenGoiKhac.setText(NhanKhau.getTenGoiKhac());
            }
            else{
                showMessage("Sổ hộ khẩu không tồn tại.", 2);
            }

        }catch(Exception e){};
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        if(textFieldNhapCMND.getText().equals("")){
            showMessage("Vui lòng nhập tìm kiếm", 2);
        }
        else{
            try {
                JFileChooser chooser = new JFileChooser();
                String currentDirectory = System.getProperty("user.dir");
                chooser.setSelectedFile(new File("Untitled.pdf"));
                chooser.setCurrentDirectory(new File(currentDirectory));
                chooser.showSaveDialog(null);
                String path = chooser.getSelectedFile().getAbsolutePath();
                PdfWriter writer = new PdfWriter(path);
                
                PdfDocument pdf = new PdfDocument(writer);
                pdf.addNewPage();
                PdfFont font = PdfFontFactory.createFont(".\\resources\\fonts\\calibri.ttf", PdfEncodings.IDENTITY_H);

                Document document = new Document(pdf);

                String para = "Chứng minh nhân dân: " + textFieldNhapCMND.getText();
                Paragraph paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Mã số sổ hộ khẩu: " + textFieldMaSHK.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Quan hệ với chủ hộ: " + textFieldQuanHeChuHo.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Tên gọi khác: " + textFieldTenGoiKhac.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Ngày sinh: " + textFieldNgaysinh.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Giới tính: " + textFieldGioiTinh.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Dân tộc: " + textFieldDanToc.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Tôn giáo: " + textFieldTonGiao.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Quốc tịch: " + textFieldQuocTich.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Trình độ học vấn: " + textFieldHocVan.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Trình độ chuyên môn: " + textFieldChuyenMon.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Nghề nghiệp hiện tại: " + textFieldNgheNghiep.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Nơi sinh: " + textFieldNoiSinh.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Quê quán: " + textFieldQueQuan.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Nơi thường trú: " + textFieldThuongTru.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Chỗ ở hiện tại: " + textFieldChoOHienTai.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);

                para = "Ghi chú: " + textFieldGhiChu.getText();
                paragraph = new Paragraph(para).setFont(font);
                document.add(paragraph);
                
                document.close();
                showMessage("Bạn đã in PDF thành công", 1);
                System.out.println("PDF created");
            } catch (Exception e) {
              System.out.println(e);
            }
        }
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void textFieldNhapCMNDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapCMNDMousePressed
        if(flag==true){
            boolean ans = showMessageOption("Bạn có muốn nhập sổ hộ khẩu khác hay không?");
            if(ans==true){
                textFieldNhapCMND.setFocusable(true);
                textFieldThuongTru.setText(" ");
                textFieldChoOHienTai.setText(" ");
                textFieldTonGiao.setText(" ");
                textFieldChuyenMon.setText(" ");
                textFieldDanToc.setText(" ");
                textFieldGhiChu.setText(" ");
                textFieldHoVaTen.setText(" ");
                textFieldHocVan.setText(" ");
                textFieldMaSHK.setText(" ");
                textFieldNgaysinh.setText(" ");
                textFieldNgheNghiep.setText(" ");
                textFieldNoiSinh.setText(" ");
                textFieldQuanHeChuHo.setText(" ");
                textFieldQueQuan.setText(" ");
                textFieldQuocTich.setText(" ");
                textFieldTenGoiKhac.setText(" ");
                textFieldGioiTinh.setText(" ");
                textFieldNhapCMND.setText("");

                flag = false;
            }
            else{
                textFieldNhapCMND.setFocusable(false);
            }
        }
    }//GEN-LAST:event_textFieldNhapCMNDMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private views.swing.Button searchButton;
    private views.swing.Button searchButton1;
    private views.swing.textfield.TextField textFieldChoOHienTai;
    private views.swing.textfield.TextField textFieldChuyenMon;
    private views.swing.textfield.TextField textFieldDanToc;
    private views.swing.textfield.TextField textFieldGhiChu;
    private views.swing.textfield.TextField textFieldGioiTinh;
    private views.swing.textfield.TextField textFieldHoVaTen;
    private views.swing.textfield.TextField textFieldHocVan;
    private views.swing.textfield.TextField textFieldMaSHK;
    private views.swing.textfield.TextField textFieldNgaysinh;
    private views.swing.textfield.TextField textFieldNgheNghiep;
    private views.swing.textfield.TextField textFieldNhapCMND;
    private views.swing.textfield.TextField textFieldNoiSinh;
    private views.swing.textfield.TextField textFieldQuanHeChuHo;
    private views.swing.textfield.TextField textFieldQueQuan;
    private views.swing.textfield.TextField textFieldQuocTich;
    private views.swing.textfield.TextField textFieldTenGoiKhac;
    private views.swing.textfield.TextField textFieldThuongTru;
    private views.swing.textfield.TextField textFieldTonGiao;
    // End of variables declaration//GEN-END:variables
}
