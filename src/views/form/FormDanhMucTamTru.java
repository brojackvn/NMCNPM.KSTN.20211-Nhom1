/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;


import models.ModelTamTru;
import controllers.ControllerTamTru;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author HO ANH
 */
public class FormDanhMucTamTru extends javax.swing.JPanel {

    /**
     * Creates new form FormDanhMucTamTru
     */
    public FormDanhMucTamTru() {
        initComponents();
        table1.fixTable(jScrollPane1);
        try{
           initDataTable();
        }catch(Exception e){};
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new views.swing.table.Table();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));

        table1.setBackground(new java.awt.Color(245, 245, 245));
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ tên", "Địa chỉ tạm trú ", "Lý do"
            }
        ));
        jScrollPane1.setViewportView(table1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Danh Mục Tạm Trú");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private views.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables

        //add data to row table
    public void initDataTable() throws SQLException, ClassNotFoundException{
        ControllerTamTru TamTru = new ControllerTamTru();
        ArrayList<ModelTamTru> resultListTamTru = new ArrayList<ModelTamTru>();

        resultListTamTru = TamTru.selectDanhMucTamTru(); 
        for(int i=0; i<resultListTamTru.size(); i++){
            table1.addRow(resultListTamTru.get(i).toRowTable());
        }
    }
}
