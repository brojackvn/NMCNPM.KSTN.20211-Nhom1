package views.form;

import controllers.ControllerThongKe;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import test.Main;
import views.dialog.Message;
import views.model.ModelCard;
import views.swing.icon.GoogleMaterialDesignIcons;
import views.swing.icon.IconFontSwing;
import views.swing.noticeboard.ModelNoticeBoard;

public class FormHome extends javax.swing.JPanel {
    public FormHome() {
        initComponents();
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
        initNoticeBoard();
    }
  
    private void initCardData() {
        try {
            Icon icon = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PEOPLE, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));

            card1.setData(new ModelCard("Đã tiêm", new ControllerThongKe().thongKeNam() + new ControllerThongKe().thongKeNu(), new ControllerThongKe().thongKeMotMuiTiem() + new ControllerThongKe().thongKeHaiMuiTiem(), icon));

            card4.setData(new ModelCard("Cách ly", new ControllerThongKe().thongKeNam() + new ControllerThongKe().thongKeNu(), new ControllerThongKe().thongKeF0() + new ControllerThongKe().thongKeF1() + new ControllerThongKe().thongKeF2(), null));

            card5.setData(new ModelCard("Nhân khẩu", 100, new ControllerThongKe().thongKeNam() + new ControllerThongKe().thongKeNu(), null));
        } catch(Exception e){};
        
    }
    
    private void initNoticeBoard() {
        noticeBoard.addDate("12/01/2021");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(94, 49, 238), "Khen thưởng", "7:00 AM", "Thông báo tiêm vaccine mũi 3: Những cá nhân trong tổ dân phố đã được tiêm đầy đủ 2 mũi vaccine covid-19 có mặt tại y tế phường vào ngày thứ 7 15/01/2022 để thực hiện tiêm mũi 3."));
        noticeBoard.addDate("11/01/2021");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(94, 49, 238), "Khen thưởng", "Now", "Tổ chức khen thưởng cho các cháu có thành tích học tập xuất sắc trong năm học vừa quá"));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(218, 49, 238), "Khẩn", "2h ago", "Tình hình dịch Covid đang rất phức tạp, đề nghị các tổ phó rà soát, nhắc nhở các hộ gia đình tuân thủ quy tắc 5K"));
        noticeBoard.addDate("10/01/2021");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(32, 171, 43), "Thông tin Covid", "12:30 PM", "ộ Y tế cho biết có 16.035 ca mắc COVID-19 trên cả nước, Hà Nội tiếp tục nhiều nhất, gần 2.900 ca; trong ngày có gần 6.900 bệnh nhân khỏi; 256 ca tử vong"));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(50, 93, 215), "Thông tin Covid", "10:30 AM", "Tính đến hiện nay tổ dân phố chúng ta có nhiều ca dịch, người dân hạn chế tập trung đông người"));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(27, 188, 204), "Thông báo dọn vệ sinh ", "9:00 AM", "Thông báo về việc dọn vệ sinh tổ dân phố: Chủ nhật ngày 16/01/2022, tổ dân phố thực hiện công tác dọn vệ sinh theo quy định của phường nhằm mục đích giữ môi trường xanh, sạch, đẹp."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57), "Thông báo khen thưởng", "7:15 AM", "Trên cơ sở đối tượng, tiêu chí theo quy định, các địa phương xem xét, lựa chọn, khen thưởng và đề nghị cấp trên khen thưởng. Hồ sơ khen thưởng phải được các địa phương gửi về Sở Văn hóa và Thể thao chậm nhất là 9 giờ thứ Năm hàng tuần để tổng hợp."));
//        noticeBoard.scrollToTop();
    }
    
    private void showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new views.component.Card();
        card4 = new views.component.Card();
        card5 = new views.component.Card();
        jPanel1 = new javax.swing.JPanel();
        noticeBoard = new views.swing.noticeboard.NoticeBoard();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setOpaque(false);

        card1.setBackground(new java.awt.Color(51, 51, 255));
        card1.setColorGradient(new java.awt.Color(255, 51, 255));

        card4.setBackground(new java.awt.Color(51, 51, 255));
        card4.setColorGradient(new java.awt.Color(255, 51, 255));

        card5.setBackground(new java.awt.Color(51, 51, 255));
        card5.setColorGradient(new java.awt.Color(255, 51, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setText("Thông tin TDP");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(105, 105, 105));
        jLabel2.setText("Khẩn");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel3.setIconTextGap(3);
        jLabel3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(0, 286, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noticeBoard, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card5, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.component.Card card1;
    private views.component.Card card4;
    private views.component.Card card5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private views.swing.noticeboard.NoticeBoard noticeBoard;
    // End of variables declaration//GEN-END:variables
}
