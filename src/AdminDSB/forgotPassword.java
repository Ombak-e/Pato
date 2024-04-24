package AdminDSB;

import LoginDSB.LoginDashboard;

public class forgotPassword extends javax.swing.JFrame {

    public forgotPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        newPassword = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(624, 467));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(624, 467));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORGOT PASSWORD");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, -1));

        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 90, -1));

        newPassword.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        newPassword.setForeground(new java.awt.Color(102, 102, 102));
        newPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        newPassword.setText("PIN");
        jPanel1.add(newPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 280, 27));

        username.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        username.setForeground(new java.awt.Color(102, 102, 102));
        username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        username.setText("ID");
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 280, 27));

        jButton2.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        confirm.setFont(new java.awt.Font("Yu Gothic", 1, 11)); // NOI18N
        confirm.setText("CONFIRM");
        confirm.setEnabled(false);
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 90, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8-forgot-password-64.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginDashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    }//GEN-LAST:event_jButton2ActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
    }//GEN-LAST:event_confirmActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new forgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField newPassword;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
