package views.form;

import controllers.ControllerLichSu;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ModelLichSu;

public class FormLichSu extends javax.swing.JPanel {
    private ArrayList<ModelLichSu> arr = new ArrayList<>();
    
    public FormLichSu() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initDataTable();
    }

    public void initDataTable() {
        try {
            arr = ControllerLichSu.selectDanhMucLichSu();
            for (int i = 0; i < arr.size(); ++i) {
                table1.addRow(new ModelLichSu(arr.get(i).getNgayThayDoi(), arr.get(i).getNguoiThayDoi(), arr.get(i).getLoaiThayDoi(), arr.get(i).getChucVu()).toRowTable());
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThemNhanKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();

        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("LỊCH SỬ CHỈNH SỬA HỆ THỐNG");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "THỜI GIAN", "KIỂU THAY ĐỔI", "NGƯỜI THAY ĐỔI", "CHỨC VỤ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
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
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 277, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 278, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
