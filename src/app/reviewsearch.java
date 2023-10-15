/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.util.List;
import app.GoogleBooksScraper.SearchResult;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class reviewsearch extends JPanel {
    private YourApp app = (YourApp) SwingUtilities.getWindowAncestor(this);

    public reviewsearch(YourApp app) {
        this.app=app;
    
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
       

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search_box = new app.textbx(50);

        setPreferredSize(new java.awt.Dimension(1889, 740));

        jPanel1.setMaximumSize(new java.awt.Dimension(1280, 720));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 0, 34)); // NOI18N
        jLabel2.setText("🔍");
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new MouseAdapter() { 
            @Override
            public void mouseClicked (MouseEvent e) {  
                String srch = search_box.getText();
                if (srch == null || srch.trim().isEmpty()) {
                    return;
                }
                List<SearchResult> returnedResults = GoogleBooksScraper.search(srch);
                app.addSearchPage(returnedResults);
                app.showSearch();
        }
        });

        search_box.setForeground(new java.awt.Color(12, 15, 20));
        search_box.setBackground(new java.awt.Color(255,255,255));
        search_box.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search_box.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search_box.setOpaque(false);
        search_box.setBorder(javax.swing.BorderFactory.createCompoundBorder(search_box.getBorder(),javax.swing.BorderFactory.createEmptyBorder(5, 14, 7, 10)));
        search_box.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String srch = search_box.getText(); 
                if (srch == null || srch.trim().isEmpty()) {
                    return;
                }
                List<SearchResult> returnedResults = GoogleBooksScraper.search(srch);
                app.addSearchPage(returnedResults);
                app.showSearch();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(442, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(2360, 2360, 2360)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(486, Short.MAX_VALUE)
                    .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1915, 1915, 1915)))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 2919, Short.MAX_VALUE)

        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(518, 518, 518)
                    .addComponent(jLabel2)
                    .addContainerGap(368, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(514, 514,514)
                    .addComponent(search_box, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)

        );

        ImageIcon imageIcon = new ImageIcon(new ImageIcon(getClass().getResource("/Image/hero-bg-2x.jpg"))
            .getImage().getScaledInstance(1889, 840, Image.SCALE_SMOOTH));

        jLabel1.setIcon(imageIcon);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }// </editor-fold>//GEN-END:initComponents

    private void search_boxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_boxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_boxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(reviewsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reviewsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reviewsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reviewsearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField search_box;
    // End of variables declaration//GEN-END:variables
}
