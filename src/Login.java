
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLoginPassword = new javax.swing.JPasswordField();
        jLoginUsername = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Customer_48px.png"))); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 310, 50);

        jLabel2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_User_50px.png"))); // NOI18N
        jLabel2.setText("USERNAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 110, 160, 40);

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Lock_50px_1.png"))); // NOI18N
        jLabel3.setText("PASSWORD");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 190, 170, 60);
        jPanel1.add(jLoginPassword);
        jLoginPassword.setBounds(220, 200, 230, 40);

        jLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(jLoginUsername);
        jLoginUsername.setBounds(220, 100, 230, 40);

        jButton1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Enter_50px.png"))); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(580, 140, 150, 60);

        jButton2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Synchronize_50px.png"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(190, 320, 140, 50);

        jButton3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_Shutdown_48px_1.png"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(400, 320, 130, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(-6, -6, 920, 560);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 912, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLoginUsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLoginUsername.setText(null);
        jLoginPassword.setText(null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
         String usernameA = jLoginUsername.getText();
        String passwordA = jLoginPassword.getText();
        
        if(usernameA.contains("admin") && passwordA.contains("faculty")){
            
            JOptionPane.showMessageDialog(null,"Login successful");
//            jAdminUsernameField.setText(null);
//            jAdminPasswordField.setText(null);
            new Home().setVisible(true);
           this.setVisible(false);
        }
     
          
        else{
          JOptionPane.showMessageDialog(null, "Invalid Login","Login Error  " ,JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jLoginPassword;
    private javax.swing.JTextField jLoginUsername;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
