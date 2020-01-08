package userGUI;

import javax.swing.JFrame;
import passwordUserID.CheckUserAndPasswords;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Logon extends javax.swing.JFrame 
{
    public Logon() 
    {
        initComponents();
        this.setSize(250, 275);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogin = new javax.swing.JInternalFrame();
        lblLoginTitle = new javax.swing.JLabel();
        lblLoginUserID = new javax.swing.JLabel();
        lblLoginPassword = new javax.swing.JLabel();
        txtLoginUserID = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        btnLoginLogin = new javax.swing.JButton();
        btnLoginRequestNewPatientAccount = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogin.setMaximumSize(new java.awt.Dimension(230, 220));
        pnlLogin.setMinimumSize(new java.awt.Dimension(230, 220));
        pnlLogin.setPreferredSize(new java.awt.Dimension(230, 220));
        pnlLogin.setVisible(true);

        lblLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginTitle.setText("Login Page");
        lblLoginTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblLoginUserID.setText("User ID");

        lblLoginPassword.setText("Password");

        btnLoginLogin.setText("Login");
        btnLoginLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginLoginClicked(evt);
            }
        });

        btnLoginRequestNewPatientAccount.setText("Request new patient account");

        javax.swing.GroupLayout pnlLoginLayout = new javax.swing.GroupLayout(pnlLogin.getContentPane());
        pnlLogin.getContentPane().setLayout(pnlLoginLayout);
        pnlLoginLayout.setHorizontalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLoginLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlLoginLayout.createSequentialGroup()
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblLoginPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lblLoginUserID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLoginUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addComponent(btnLoginRequestNewPatientAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                .addGap(0, 11, Short.MAX_VALUE))
            .addComponent(lblLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlLoginLayout.setVerticalGroup(
            pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginLayout.createSequentialGroup()
                .addComponent(lblLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLoginUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLoginLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnLoginRequestNewPatientAccount))
        );

        lblLoginTitle.getAccessibleContext().setAccessibleName("lblLoginTitle");
        lblLoginUserID.getAccessibleContext().setAccessibleName("lblLoginUserID");
        lblLoginPassword.getAccessibleContext().setAccessibleName("lblLoginPassword");
        txtLoginUserID.getAccessibleContext().setAccessibleName("txtLoginUserID");
        jPasswordField1.getAccessibleContext().setAccessibleName("passtxtLoginPassword");
        btnLoginLogin.getAccessibleContext().setAccessibleName("btnLoginLogin");
        btnLoginRequestNewPatientAccount.getAccessibleContext().setAccessibleName("btnLoginRequestNewPatientAccount");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlLogin.getAccessibleContext().setAccessibleName("pnlLogin");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginLoginClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginLoginClicked
        checkLoginDetails();
    }//GEN-LAST:event_btnLoginLoginClicked

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
            java.util.logging.Logger.getLogger(Logon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Logon().setVisible(true);
                
            }
        });
    }
    
    ////////////////////////////////////////////////////////////////////////////
    // START OF LOGIN IN FUNCTIONALITY
    private void checkLoginDetails()
    {
        boolean success = checkForNull(txtLoginUserID);
        if (success) success = checkUserIDCharacterCount(txtLoginUserID);
        if (success) success = checkForNull(jPasswordField1);
        if (success) success = checkPasswordLength(jPasswordField1);
        if (success) success = checkUserNameAndPassword();
        if (success) loginSuccessful(txtLoginUserID.getText());
        else loginUnsuccessful();
    }
    // checks user input against data
    private boolean checkUserNameAndPassword()
    {
        CheckUserAndPasswords checkLogin = new CheckUserAndPasswords();
        boolean success = checkLogin.checkUserNameAndPassword
        (txtLoginUserID.getText(), jPasswordField1.getText());
        return success;
    }
    // prepare for user spefic gui
    private void loginSuccessful(String userID)
    {
        String personType = userID.substring(0, 1);
        switch(personType)
        {
            case "A":
                AdminGUI.main(userID);
                break;
            case "D":
                holding.main(userID);
                break;
            case "P":
                break;
            case "S":
                break;
                    
                
        }
        this.dispose();
    }
    //
    private void loginUnsuccessful()
    {
        txtLoginUserID.setText("");
        jPasswordField1.setText("");
    }
    // END OF LOGIN IN FUNCTIONALITY
    ////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
    // START OF INPUT CHECKS
    private boolean checkForNull(JTextField field)
    {
        return !field.getText().equals("");
    }
    private boolean checkForNull(JPasswordField field)
    {
        return !field.getText().equals("");
    }
    private boolean checkUserIDCharacterCount(JTextField field)
    {
        return field.getText().length()== 5;
    }
    private boolean checkPasswordLength(JPasswordField field)
    {
        return field.getText().length() > 7;
    }
    // END OF INPUT CHECKS
    ////////////////////////////////////////////////////////////////////////////
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginLogin;
    private javax.swing.JButton btnLoginRequestNewPatientAccount;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblLoginPassword;
    private javax.swing.JLabel lblLoginTitle;
    private javax.swing.JLabel lblLoginUserID;
    private javax.swing.JInternalFrame pnlLogin;
    private javax.swing.JTextField txtLoginUserID;
    // End of variables declaration//GEN-END:variables
}