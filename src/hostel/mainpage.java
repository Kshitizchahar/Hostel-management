/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;


import hostel.GymInformation;
import hostel.HostelInformation;
import hostel.MessInformation;
import hostel.Studentlogin;

/**
 *
 * @author kshitiz chahar
 */
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    public mainpage() {
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

        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        hostel = new javax.swing.JMenuItem();
        mess = new javax.swing.JMenuItem();
        gym = new javax.swing.JMenuItem();
        contact = new javax.swing.JMenu();
        gallery = new javax.swing.JMenu();
        pic = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        loginadmin = new javax.swing.JMenuItem();
        studentlogin = new javax.swing.JMenuItem();

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logo hostel.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(173, 173, 173))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logo hostel_1.jpg"))); // NOI18N
        jMenu1.setText("       ");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("About us      ");

        hostel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/hostel_32_1.png"))); // NOI18N
        hostel.setText("Hostel");
        hostel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hostelActionPerformed(evt);
            }
        });
        jMenu2.add(hostel);

        mess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/mess_32_1.png"))); // NOI18N
        mess.setText("Mess");
        mess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messActionPerformed(evt);
            }
        });
        jMenu2.add(mess);

        gym.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/gym_32_1.png"))); // NOI18N
        gym.setText("Gym");
        gym.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gymActionPerformed(evt);
            }
        });
        jMenu2.add(gym);

        jMenuBar1.add(jMenu2);

        contact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/call_32.png"))); // NOI18N
        contact.setText("Contact us: 1800123456       ");
        jMenuBar1.add(contact);

        gallery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/gall_32.png"))); // NOI18N
        gallery.setText("Gallery       ");
        gallery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                galleryActionPerformed(evt);
            }
        });

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/pic_32.png"))); // NOI18N
        pic.setText("Pictures");
        pic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                picActionPerformed(evt);
            }
        });
        gallery.add(pic);

        jMenuBar1.add(gallery);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/logout.png"))); // NOI18N
        jMenu4.setText("Login");

        loginadmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/admin_32.png"))); // NOI18N
        loginadmin.setText("Admin");
        loginadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginadminActionPerformed(evt);
            }
        });
        jMenu4.add(loginadmin);

        studentlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/student_32.png"))); // NOI18N
        studentlogin.setText("Student");
        studentlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentloginActionPerformed(evt);
            }
        });
        jMenu4.add(studentlogin);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentloginActionPerformed
        // TODO add your handling code here:
        Studentlogin ls= new Studentlogin();
        ls.setVisible(true);
        dispose();
    }//GEN-LAST:event_studentloginActionPerformed

    private void loginadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginadminActionPerformed
        // TODO add your handling code here:\
        login l= new login();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginadminActionPerformed

    private void messActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messActionPerformed
        // TODO add your handling code here:
        MessInformation mi=new MessInformation();
        mi.setVisible(true);
        dispose();
    }//GEN-LAST:event_messActionPerformed

    private void gymActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gymActionPerformed
        // TODO add your handling code here:
        GymInformation gi=new GymInformation();
        gi.setVisible(true);
        dispose();
    }//GEN-LAST:event_gymActionPerformed

    private void galleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_galleryActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_galleryActionPerformed

    private void picActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_picActionPerformed
        // TODO add your handling code here:
        Pictures p =new Pictures();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_picActionPerformed

    private void hostelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hostelActionPerformed
        // TODO add your handling code here:
        HostelInformation hi=new HostelInformation();
        hi.setVisible(true);
        dispose();
    }//GEN-LAST:event_hostelActionPerformed

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu contact;
    private javax.swing.JMenu gallery;
    private javax.swing.JMenuItem gym;
    private javax.swing.JMenuItem hostel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem loginadmin;
    private javax.swing.JMenuItem mess;
    private javax.swing.JMenuItem pic;
    private javax.swing.JMenuItem studentlogin;
    // End of variables declaration//GEN-END:variables
}
