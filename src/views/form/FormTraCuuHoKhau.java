package views.form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
import models.ModelSoHoKhau;
import views.swing.scrollbar.ScrollBarCustom;
import controllers.ControllerSoHoKhau;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import test.Main;
import views.dialog.MessageConfirm;
import views.dialog.MessageOption;

public class FormTraCuuHoKhau extends javax.swing.JPanel { 
 
    public boolean flag = false;
    
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
    
    public void clearTableData(views.swing.table.Table table1){
        while (table1.getRowCount()>0)
          {
             table1.removeRow(0);
          }
    }
    
    public void initThongTinSHK() {  
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
        textFieldNhapSoHoKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textFieldNhapSoHoKhauMousePressed(evt);
            }
        });
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
        String MaSHK = textFieldNhapSoHoKhau.getText();
    
        try{
           ControllerSoHoKhau CTLSoHoKhau = new ControllerSoHoKhau();
           if(CTLSoHoKhau.checkMaSHKIsExist(MaSHK)){
                flag = true;
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
           }
           else{
               showMessage("Sổ hộ khẩu không tồn tại.", 2);
           }


        } catch(Exception e){};
    }//GEN-LAST:event_searchButtonActionPerformed

    private void textFieldhoVaTenChuHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldhoVaTenChuHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldhoVaTenChuHoActionPerformed

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed
        // TODO add your handling code here:
        
        if(textFieldNhapSoHoKhau.getText().equals("")){
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
                String para1 = "Mã số sổ hộ khẩu: " + textFieldNhapSoHoKhau.getText();
                Paragraph paragraph1 = new Paragraph(para1).setFont(font);
                String para2 = "Họ và tên chủ hộ: " + textFieldhoVaTenChuHo.getText();
                Paragraph paragraph2 = new Paragraph(para2).setFont(font);
                String para3 = "Địa chỉ: " + textFielddiaChi.getText();
                Paragraph paragraph3 = new Paragraph(para3).setFont(font);
                String para4 = "Ngày đăng kí: " + textFieldngayDangKi.getText() + "\n\n";
                Paragraph paragraph4 = new Paragraph(para4).setFont(font);

                document.add(paragraph1);
                document.add(paragraph2);
                document.add(paragraph3);
                document.add(paragraph4);

                Table table = new Table(new float[]{100F, 100F, 100F, 100F, 100F});

                Cell cell1 = new Cell();
                cell1.add(new Paragraph("Họ và tên").setFont(font));
                table.addCell(cell1);

                Cell cell2 = new Cell();
                cell2.add(new Paragraph("Ngày sinh").setFont(font));
                table.addCell(cell2);

                Cell cell3 = new Cell();
                cell3.add(new Paragraph("Giới tính").setFont(font));
                table.addCell(cell3);

                Cell cell4 = new Cell();
                cell4.add(new Paragraph("Quan hệ với chủ hộ").setFont(font));
                table.addCell(cell4);

                Cell cell5 = new Cell();
                cell5.add(new Paragraph("Nơi ở hiện tại").setFont(font));
                table.addCell(cell5);

                ArrayList<String> arr = table1.readTable();
                for (int i = 0; i < arr.size(); ++i) {
                    Cell cell = new Cell();
                    cell.add(new Paragraph(arr.get(i)).setFont(font));
                    table.addCell(cell);
                }

                document.add(table);

                document.close();
                showMessage("Bạn đã in PDF thành công", 1);
                System.out.println("PDF created");
            } catch (Exception e) {
              System.out.println(e);
            }
        }
    }//GEN-LAST:event_searchButton1ActionPerformed

    private void textFielddiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFielddiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFielddiaChiActionPerformed

    private void textFieldngayDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldngayDangKiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldngayDangKiActionPerformed

    private void textFieldNhapSoHoKhauMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNhapSoHoKhauMousePressed
        if(flag==true){
            boolean ans = showMessageOption("Bạn có muốn nhập sổ hộ khẩu khác hay không?");
            if(ans==true){
                textFieldNhapSoHoKhau.setFocusable(true);
                textFieldNhapSoHoKhau.setText("");
                clearTableData(table1);
                textFielddiaChi.setText(" ");
                textFieldhoVaTenChuHo.setText(" ");
                textFieldngayDangKi.setText(" ");
                flag = false;
            }
            else{
                textFieldNhapSoHoKhau.setFocusable(false);
            }
        }
        
    }//GEN-LAST:event_textFieldNhapSoHoKhauMousePressed


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
