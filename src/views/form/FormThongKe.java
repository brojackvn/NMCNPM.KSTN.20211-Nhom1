/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.form;

import controllers.ControllerThongKe;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author HO ANH
 */
public class FormThongKe extends javax.swing.JPanel {

    /**
     * Creates new form FormThongKe
     */
    public FormThongKe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonDoTuoi = new views.swing.Button();
        ButtonGioiTinh = new views.swing.Button();
        ButtonCachLy = new views.swing.Button();
        ButtonSoMuiTiem = new views.swing.Button();

        setBackground(new java.awt.Color(245, 245, 245));

        ButtonDoTuoi.setBackground(new java.awt.Color(89, 89, 255));
        ButtonDoTuoi.setForeground(new java.awt.Color(255, 255, 255));
        ButtonDoTuoi.setText("THỐNG KÊ ĐỘ TUỔI");
        ButtonDoTuoi.setToolTipText("");
        ButtonDoTuoi.setActionCommand("KIỂM TRA");
        ButtonDoTuoi.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonDoTuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDoTuoiActionPerformed(evt);
            }
        });

        ButtonGioiTinh.setBackground(new java.awt.Color(89, 89, 255));
        ButtonGioiTinh.setForeground(new java.awt.Color(255, 255, 255));
        ButtonGioiTinh.setText("THỐNG KÊ GIỚI TÍNH");
        ButtonGioiTinh.setToolTipText("");
        ButtonGioiTinh.setActionCommand("KIỂM TRA");
        ButtonGioiTinh.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonGioiTinhActionPerformed(evt);
            }
        });

        ButtonCachLy.setBackground(new java.awt.Color(89, 89, 255));
        ButtonCachLy.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCachLy.setText("THỐNG KÊ CÁCH LY");
        ButtonCachLy.setToolTipText("");
        ButtonCachLy.setActionCommand("KIỂM TRA");
        ButtonCachLy.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonCachLy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCachLyActionPerformed(evt);
            }
        });

        ButtonSoMuiTiem.setBackground(new java.awt.Color(89, 89, 255));
        ButtonSoMuiTiem.setForeground(new java.awt.Color(255, 255, 255));
        ButtonSoMuiTiem.setText("THỐNG KÊ SỐ MŨI TIÊM");
        ButtonSoMuiTiem.setToolTipText("");
        ButtonSoMuiTiem.setActionCommand("KIỂM TRA");
        ButtonSoMuiTiem.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ButtonSoMuiTiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSoMuiTiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 337, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ButtonGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                        .addComponent(ButtonDoTuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonCachLy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(ButtonSoMuiTiem, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonDoTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ButtonGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ButtonCachLy, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ButtonSoMuiTiem, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDoTuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDoTuoiActionPerformed
        try {
            
           
   
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("Dưới 18", thongKeController.thongKeTuoiViThanhNien());
            pieDataset.setValue("Độ tuổi lao động", thongKeController.thongKeTuoiTrungNien());
            pieDataset.setValue("Trên 60", thongKeController.thongKeTuoiGia());
           
            JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
            ChartFrame frame = new ChartFrame("Pie Chart", chart);
            frame.setVisible(true);
            frame.setSize(450, 500);
        } catch (SQLException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonDoTuoiActionPerformed

    private void ButtonGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonGioiTinhActionPerformed
        try {
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("Nam", thongKeController.thongKeNam());
            pieDataset.setValue("Nữ", thongKeController.thongKeNu());
            
            JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
            ChartFrame frame = new ChartFrame("Pie Chart", chart);
            frame.setVisible(true);
            frame.setSize(450, 500);
        } catch (SQLException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonGioiTinhActionPerformed

    private void ButtonCachLyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCachLyActionPerformed
        try {
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("F0", thongKeController.thongKeF0());
            pieDataset.setValue("F1", thongKeController.thongKeF1());
            pieDataset.setValue("F2", thongKeController.thongKeF2());
            
            
         
            
            JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
            ChartFrame frame = new ChartFrame("Pie Chart", chart);
            frame.setVisible(true);
            frame.setSize(450, 500);
        } catch (SQLException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonCachLyActionPerformed

    private void ButtonSoMuiTiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSoMuiTiemActionPerformed
         
        try {
            DefaultPieDataset pieDataset = new DefaultPieDataset();
            pieDataset.setValue("Không mũi tiêm", thongKeController.thongKeKhongMuiTiem());
            pieDataset.setValue("Một mũi tiêm", thongKeController.thongKeMotMuiTiem());
            pieDataset.setValue("Hai mũi tiêm", thongKeController.thongKeHaiMuiTiem());
            
            JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);
            ChartFrame frame = new ChartFrame("Pie Chart", chart);
            frame.setVisible(true);
            frame.setSize(450, 500);
        } catch (SQLException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FormThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ButtonSoMuiTiemActionPerformed

    private ControllerThongKe thongKeController = new ControllerThongKe();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button ButtonCachLy;
    private views.swing.Button ButtonDoTuoi;
    private views.swing.Button ButtonGioiTinh;
    private views.swing.Button ButtonSoMuiTiem;
    // End of variables declaration//GEN-END:variables
}
