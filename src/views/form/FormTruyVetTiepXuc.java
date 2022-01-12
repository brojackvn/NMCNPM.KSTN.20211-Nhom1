package views.form;

import controllers.ControllerNhanKhau;
import controllers.ControllerTruyVetDiaDiem;
import controllers.ControllerTruyVetTiepXuc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.ModelTruyVetDiaDiem;  
import models.ModelTruyVetTiepXuc;
import test.Main;
import views.dialog.MessageConfirm;
import views.swing.table.Table;

/**
 *
 * @author HO ANH
 */
public class FormTruyVetTiepXuc extends javax.swing.JPanel {
    public FormTruyVetTiepXuc() {
        initComponents();
        table1.fixTable(jScrollPane1);
        initData();
    }
    
    public void initData() {
        initTableData();       
    }
    
    public void initTableData() {
        // Các data thì mình sẽ lấy từ database
        for (int i=0; i < mangTruyVetDiaDiem.size(); i++){
            table1.addRow(new ModelTruyVetDiaDiem(mangTruyVetDiaDiem.get(i).getNgaySinh(), mangTruyVetDiaDiem.get(i).getHoVaTen()).toRowTable());
        } 
    }
    
        public void clearTableData(Table table1){
        while (table1.getRowCount()>0)
          {
             table1.removeRow(0);
          }
    }

    private void showMessage(String message, int func) {
        MessageConfirm obj = new MessageConfirm(Main.getFrames()[0], true, func);
        obj.showMessage(message);
    }    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CMNDtextField = new views.swing.textfield.TextField();
        searchButton = new views.swing.Button();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();

        setBackground(new java.awt.Color(245, 245, 245));

        CMNDtextField.setBackground(new java.awt.Color(245, 245, 245));
        CMNDtextField.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        CMNDtextField.setLabelText("SỐ CMND/CCCD");
        CMNDtextField.setOpaque(false);
        CMNDtextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMNDtextFieldActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("TRUY VẾT THEO TIẾP NGƯỜI CÁCH LY");

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HỌ VÀ TÊN", "NGÀY SINH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(738, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CMNDtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CMNDtextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CMNDtextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMNDtextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CMNDtextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
        if (CMNDtextField.getText().equals("")) {
            showMessage("Bạn chưa nhập CMND !!!!", 2);
        } else {
            mangTruyVetDiaDiem.clear();
            clearTableData(table1);

            System.out.print(table1.getRowCount() + "rowcount");
            try {
                ControllerNhanKhau checkCMND = new ControllerNhanKhau();
                if (checkCMND.checkCMNDIsExist(CMNDtextField.getText())) {
                    ModelTruyVetTiepXuc x = new ModelTruyVetTiepXuc();
                    x.setCMND(CMNDtextField.getText());
                    ControllerTruyVetTiepXuc truyVetTiepXuc = new ControllerTruyVetTiepXuc();
                    String diaDiemTiepXuc = new String(truyVetTiepXuc.findDiaDiemByCMND(x.getCMND()));
                    String[] mangDiaDiemTiepXuc = diaDiemTiepXuc.split("; ");
                    ControllerTruyVetDiaDiem truyverdiadiemController = new ControllerTruyVetDiaDiem();

                    mangTruyVetDiaDiem = truyverdiadiemController.findNguoiByMangDiaDiem(mangDiaDiemTiepXuc);

//            truyVetTiepXuc.findNguoiByDiaDiem(mangDiaDiemTiepXuc[0]);
                    CMNDtextField.setText("");
                } else {
                    showMessage("CMND không tồn tại !!!", 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(FormTruyVetTiepXuc.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FormTruyVetTiepXuc.class.getName()).log(Level.SEVERE, null, ex);
            }
            initTableData();
        }
    }//GEN-LAST:event_searchButtonActionPerformed
    private ArrayList<ArrayList<ModelTruyVetDiaDiem>> mangmangTruyVetDiaDiem = new ArrayList<ArrayList<ModelTruyVetDiaDiem>>();
    private ArrayList<ModelTruyVetDiaDiem> mangTruyVetDiaDiem = new ArrayList<ModelTruyVetDiaDiem>();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.textfield.TextField CMNDtextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.Button searchButton;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
