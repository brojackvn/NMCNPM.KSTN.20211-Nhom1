package test;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.crypto.Mac;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;
import views.component.Header;
import views.component.Menu;
import views.event.EventMenuSelected;
import views.event.EventShowPopupMenu;
import views.form.FormHome;
import views.form.MainForm;
import views.swing.MenuItem;
import views.swing.PopupMenu;
import views.swing.icon.GoogleMaterialDesignIcons;
import views.swing.icon.IconFontSwing;

public class Main extends javax.swing.JFrame {
    private MigLayout layout;
    private Menu menu;
    private Header header;
    private MainForm main;
    private Animator animator;
    
    public Main() {
        initComponents();
        init();
        setTitle("Quản lý nhân khẩu - Ver 1.0.0");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void init() {
        layout = new MigLayout("fill", "0[]0[100%, fill]0", "0[fill, top]0");
        
        bg.setLayout(layout);
        menu = new Menu();
        header = new Header();
        main = new MainForm();
        menu.addEvent(new EventMenuSelected() {
            @Override
            public void menuSelected(int menuIndex, int subMenuIndex) {
                System.out.println("Menu Index: " + menuIndex + " sub menu index:" + subMenuIndex);
                if (menuIndex == 0) { // Hiển thị trang chủ
                    main.showForm(new FormHome());
                } else if (menuIndex == 1) { // Phần Tra cứu
                    if (subMenuIndex == 0) { // Hiển thị Tra cứu Nhân khẩu 
                        
                    } else if (subMenuIndex == 1) { // Hiển thị Tra cứu Hộ Khẩu
                        
                    }
                } else if (menuIndex == 2) { // Thủ tục Hộ Khẩu
                    if (subMenuIndex == 0) { // Đăng kí Hộ Khẩu
                        
                    } else if (subMenuIndex == 1) { // Tách Hộ Khẩu
                        
                    }
                } else if (menuIndex == 3) { // Thủ tục nhân khẩu
                    if (subMenuIndex == 0) { // Thêm mới nhân khẩu
                        
                    } else if (subMenuIndex == 1) { // Nhập Khẩu
                        
                    } else if (subMenuIndex == 2) { // Tách Khẩu
                        
                    } else if (subMenuIndex == 3) { // Tạm Vắng
                        
                    } else if (subMenuIndex == 4) { // Tạm trú
                        
                    } else if (subMenuIndex == 5) { // Báo tử
                        
                    }
                } else if (menuIndex == 4) { // Danh mục
                    if (subMenuIndex == 0) { // Nhân Khẩu
                        
                    } else if (subMenuIndex == 1) { // Hộ Khẩu
                        
                    }
                } else if (menuIndex == 5) { 
                    if (subMenuIndex == 0) { // Khai báo covid
                        
                    } else if (subMenuIndex == 1) { // Truy vết
                        
                    }
                } else if (menuIndex == 6) { // Thống kê 
                    if (subMenuIndex == 0) { // Thống kê Dân cư
                        
                    } else if (subMenuIndex == 1) { // Thống kê COVID
                    
                    }
                } else if (menuIndex == 7) { // Lịch sử
                    
                } else if (menuIndex == 8) { // Hệ thống
                    
                }
            }
        });
        
        menu.addEventShowPopup(new EventShowPopupMenu() {
            @Override
            public void showPopup(Component com) {
                MenuItem item = (MenuItem) com;
                PopupMenu popup = new PopupMenu(Main.this, item.getIndex(), item.getEventSelected(), item.getMenu().getSubMenu());
                int x = Main.this.getX() + 52;
                int y = Main.this.getY() + com.getY() + 86;
                popup.setLocation(x, y);
                popup.setVisible(true);
            }
        });
        menu.initMenuItem();
        
        bg.add(menu, "w 230!, spany 2"); // span Y 2 cells
        bg.add(header, "h 50!, wrap");
        bg.add(main, "w 100%, h 100%");
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                double width;
                if (menu.isShowMenu()) {
                    width = 55 + (170* (1f - fraction));
                } else {
                    width = 55 + 170 * fraction;
                }
                layout.setComponentConstraints(menu, "w " + width + "!, spany2" );
                menu.revalidate();
            }
            
            @Override
            public void end() {
                menu.setShowMenu(!menu.isShowMenu());
                menu.setEnablemenu(true);
            }
        };
        animator = new Animator(500, target);
        animator.setResolution(0);
        animator.setDeceleration(0.5f);
        animator.setAcceleration(0.5f);
        header.addMenuEvent(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!animator.isRunning()) {
                    animator.start();
                }
                menu.setEnablemenu(false);
                if (menu.isShowMenu()) {
                    menu.hideAllMenu();
                }
            }
        });
        
        // Khởi tạo google font
        IconFontSwing.register(GoogleMaterialDesignIcons.getIconFont());
    
        // Giao diện sẽ bắt đầu với trang này luôn
        main.showForm(new FormHome());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(245, 245, 245));
        bg.setOpaque(true);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane bg;
    // End of variables declaration//GEN-END:variables
}
