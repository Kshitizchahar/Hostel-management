/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hostel;

/**
 *
 * @author kshitiz chahar
 */
public class Aboutus extends javax.swing.JFrame {

    /**
     * Creates new form Aboutus
     */
    public Aboutus() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(5785120, 2354561));
        getContentPane().setLayout(null);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setBackground(new java.awt.Color(0, 153, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("There are separate hostel facilities for both, boys and girl- \nthe hostels are located within the campus.\n\nThe hostel rooms are spacious and well furnished. \nThe hostels have sports and other recreational\nfacilities,such as Dish TV, common room for interaction, etc.\n\nHygienic and healthy food is provided in a centrally located\nmess, adjacent to the hostels.\n\nThe mess is underthe guidance of the Mess Committee that\nhas both students and faculty members.\n\nThe hostels have open space around with greenery and plantation.\nThere is round-the-lock internet connectivity in the entire campus,\nincluding the hostel rooms ??? studentsworking through Wi-Fi\nInternetconnectivity on their laptops in the open lawns are a\ncommon sight in the evenings.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(570, 90, 760, 490);

        jLabel2.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel2.setText(" Hostel and Mess Information:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 20, 680, 25);

        jLabel3.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel3.setText("Gym Information:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(430, 690, 400, 25);

        jTextArea2.setBackground(new java.awt.Color(51, 153, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(540, 760, 710, 300);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/gym.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 810, 430, 190);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/campus-residence-1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 80, 500, 380);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aboutus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aboutus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    // End of variables declaration//GEN-END:variables
}
