/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class frmTrangChuDocGia extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
   ;
    private frmTimKiem frmTimKiem = null;

    public frmTrangChuDocGia() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Trang chủ");
        // Kích thước form trang chủ = kích thước màn hình 
        Dimension mainDimension = Toolkit.getDefaultToolkit().getScreenSize();
        // Lấy kích thước menuBar
        Dimension menuBarDimension = menuBar.getSize();
        // Khởi tạo kích thước cho desktopPane
        Dimension dpDimension = new Dimension();
        dpDimension.setSize(mainDimension.getWidth(), mainDimension.getHeight() - menuBarDimension.getHeight());
        this.setMaximumSize(mainDimension);
        dpMain.setMaximumSize(dpDimension);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
//         this.setResizable(false);
//        this.setSize(1100, 800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpMain = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuThoat = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnuTimKiemSach = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ");

        javax.swing.GroupLayout dpMainLayout = new javax.swing.GroupLayout(dpMain);
        dpMain.setLayout(dpMainLayout);
        dpMainLayout.setHorizontalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 963, Short.MAX_VALUE)
        );
        dpMainLayout.setVerticalGroup(
            dpMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );

        menuBar.setAlignmentX(1.5F);
        menuBar.setAlignmentY(2.0F);
        menuBar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jMenu1.setText("Hệ thống");
        jMenu1.setAlignmentX(1.0F);
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnuThoat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuThoat.setText("Thoát");
        mnuThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuThoatActionPerformed(evt);
            }
        });
        jMenu1.add(mnuThoat);

        menuBar.add(jMenu1);

        jMenu4.setText("Tìm kiếm");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        mnuTimKiemSach.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mnuTimKiemSach.setText("Tìm sách");
        mnuTimKiemSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuTimKiemSachActionPerformed(evt);
            }
        });
        jMenu4.add(mnuTimKiemSach);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpMain)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
        frmChonTCDN frm  = new frmChonTCDN();
        frm.setVisible(true);
    }//GEN-LAST:event_mnuThoatActionPerformed

    private void mnuTimKiemSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuTimKiemSachActionPerformed
        // TODO add your handling code here:
        if (frmTimKiem == null || frmTimKiem.isClosed()) {
            try {
                frmTimKiem = new frmTimKiem();
            } catch (Exception ex) {
                Logger.getLogger(frmTrangChuDocGia.class.getName()).log(Level.SEVERE, null, ex);
            }
            dpMain.add(frmTimKiem);
            frmTimKiem.setLocation(this.getWidth() / 2 - frmTimKiem.getWidth() / 2, (this.getHeight() - 20) / 2 - frmTimKiem.getHeight() / 2 - 20);
            frmTimKiem.setVisible(true);
        } else {
            frmTimKiem.setLocation(this.getWidth() / 2 - frmTimKiem.getWidth() / 2, (this.getHeight() - 20) / 2 - frmTimKiem.getHeight() / 2 - 20);
            frmTimKiem.setVisible(true);
            frmTimKiem.toFront();
        }
    }//GEN-LAST:event_mnuTimKiemSachActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmTrangChuDocGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTrangChuDocGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTrangChuDocGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTrangChuDocGia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTrangChuDocGia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpMain;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnuThoat;
    private javax.swing.JMenuItem mnuTimKiemSach;
    // End of variables declaration//GEN-END:variables
}
