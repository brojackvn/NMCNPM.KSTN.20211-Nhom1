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
import controllers.ControllerKhaiTu;
import controllers.ControllerNhanKhau;
import controllers.ControllerSoHoKhau;
import java.awt.Color;
import java.io.File;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import models.ModelKhaiTu;
import models.ModelSoHoKhau;
import test.Main;
import views.dialog.MessageConfirm;


public class FormDanhMucBaoTu extends javax.swing.JPanel {
    ArrayList<ModelKhaiTu> arr;
    
    public FormDanhMucBaoTu() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initDataTable();
    }

    public void initDataTable() {
        try {
            table1.clearRow();
            arr = new ControllerKhaiTu().selectDanhMucKhaiTu();
            for (int i = 0; i < arr.size(); ++i) {
                table1.addRow(new ModelKhaiTu(new ControllerNhanKhau().gethoVaTenFromCMND(arr.get(i).getCMNDNguoiMat()), arr.get(i).getNgayMat(), arr.get(i).getHoVaTenNguoiKhai(), arr.get(i).getLyDo()).toRowTable());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();
        ButtonTimKiem = new views.swing.Button();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("DANH MỤC BÁO TỬ");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HỌ VÀ TÊN", "NGÀY MẤT", "NGƯỜI KHAI", "LÝ DO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        ButtonTimKiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonTimKiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonTimKiem.setText("IN PDF");
        ButtonTimKiem.setToolTipText("");
        ButtonTimKiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(ButtonTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTimKiemActionPerformed
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
            String para1 = "Danh mục báo tử: ";
            Paragraph paragraph1 = new Paragraph(para1).setFont(font);
            document.add(paragraph1);

            Table table = new Table(new float[]{100F, 50F, 100F ,300F});

            Cell cell1 = new Cell();
            cell1.add(new Paragraph("Họ và tên").setFont(font));
            table.addCell(cell1);

            Cell cell2 = new Cell();
            cell2.add(new Paragraph("Ngày mất").setFont(font));
            table.addCell(cell2);

            Cell cell3 = new Cell();
            cell3.add(new Paragraph("Họ và tên người khai").setFont(font));
            table.addCell(cell3);
            
            Cell cell4 = new Cell();
            cell4.add(new Paragraph("Lý do").setFont(font));
            table.addCell(cell4);

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
    }//GEN-LAST:event_ButtonTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonTimKiem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
