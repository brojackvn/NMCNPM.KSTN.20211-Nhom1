package views.swing.table;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.ModelMove;

public class Move extends javax.swing.JPanel {
    public Move(ModelMove data) {
        initComponents();
        cmdMove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                data.getEvent().move(data.getNhanKhau());
            }
        });
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.setColor(new Color(230,230,230));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight()-1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMove = new views.swing.Button();

        cmdMove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/edit.png"))); // NOI18N
        cmdMove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cmdMove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(cmdMove, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdMoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdMoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.swing.Button cmdMove;
    // End of variables declaration//GEN-END:variables
}
