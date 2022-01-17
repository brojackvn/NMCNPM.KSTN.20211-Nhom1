package views.component;

import java.awt.Color;
import java.awt.Component;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import views.event.EventMenu;
import views.event.EventMenuSelected;
import views.event.EventShowPopupMenu;
import views.model.ModelMenu;
import views.swing.MenuAnimation;
import views.swing.MenuItem;
import views.swing.scrollbar.ScrollBarCustom;

public class Menu extends javax.swing.JPanel {
    private final MigLayout layout;
    private EventMenuSelected event;
    private EventShowPopupMenu eventShowPopup;
    private boolean enableMenu = true;
    private boolean showMenu = true;
   
    public Menu() {
        initComponents();
        setOpaque(false);
        sp.getViewport().setOpaque(false);
        sp.setVerticalScrollBar(new ScrollBarCustom());
        sp.setViewportBorder(null);
        layout = new MigLayout("wrap, fillx, insets 0", "[fill]", "[]0[]");
        panel.setLayout(layout);
    }

    public void initMenuItem() {   
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/1.png")), "TRANG CHỦ"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/3.png")), "TRA CỨU", "Hộ Khẩu", "Nhân Khẩu"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/7.png")), "THỦ TỤC HỘ KHẨU", "Đăng Kí Hộ Khẩu", "Tách Hộ Khẩu", "Xóa Hộ Khẩu"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/5.png")), "THỦ TỤC NHÂN KHẨU", "Thêm Nhân Khẩu", "Sửa Nhân Khẩu" , "Xóa Nhân Khẩu", "Tạm vắng", "Tạm trú", "Báo tử"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/12.png")), "DANH MỤC", "Hộ Khẩu", "Nhân Khẩu", "Tạm Trú", "Tạm Vắng", "Báo tử"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/4.png")), "COVID", "Khai báo COVID", "Khai báo Cách Ly", "Truy vết Tiếp Xúc", "Truy vết Địa Điểm"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/14.png")), "THỐNG KÊ"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/8.png")), "LỊCH SỬ"));
        addMenu(new ModelMenu(new ImageIcon(getClass().getResource("/resources/9.png")), "HỆ THỐNG", "Đổi mật khẩu", "Đăng xuất", "Thoát"));
    }
     
    private void addMenu(ModelMenu menu) {
        panel.add(new MenuItem(menu, getEventMenu(), event, panel.getComponentCount()), "h 40!"); 
    }
    
    private EventMenu getEventMenu() {
        return new EventMenu() {
            @Override
            public boolean menuPressed(Component com, boolean open) {
                if (enableMenu) {
                    if (isShowMenu()) {
                        if (open) {
                            new MenuAnimation(layout, com).openMenu();
                        } else {
                            new MenuAnimation(layout, com).closeMenu();
                        }
                        return true;
                    } else {
                        eventShowPopup.showPopup(com);
                    }
                }
                return false;
            }
        };
    }
    
    public void hideAllMenu() {
        for (Component component:panel.getComponents()) {
            MenuItem item = (MenuItem) component;
            if (item.isOpen()) {
                new MenuAnimation(layout, component).closeMenu();
                item.setOpen(false);
            }
        }
    }    
    
    public void addEventShowPopup(EventShowPopupMenu eventShowPopup) {
        this.eventShowPopup = eventShowPopup;
    }
    
    public void addEvent(EventMenuSelected event) {
        this.event = event;
    }

    public void setEnablemenu(boolean enablemenu) {
        this.enableMenu = enablemenu;
    }

    public boolean isShowMenu() {
        return showMenu;
    }
    
    public void setShowMenu(boolean showMenu) {
        this.showMenu = showMenu;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        logo2 = new views.component.Logo();

        setBackground(new java.awt.Color(214, 217, 223));
        setOpaque(false);

        sp.setBackground(new java.awt.Color(214, 217, 223));
        sp.setBorder(null);
        sp.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.setOpaque(false);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 383, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        sp.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sp, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(logo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    protected void paintComponent(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint gra = new GradientPaint(0, 0, new Color(33,105,249), getWidth(), 0, new Color(93,58,196));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent(grphcs);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private views.component.Logo logo2;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
