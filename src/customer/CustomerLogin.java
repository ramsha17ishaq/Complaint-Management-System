
package customer;

import DBConnection.connection;
import com.sun.glass.events.KeyEvent;
import homepage.Homepage;
import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logs.loggWriter;


public class CustomerLogin extends javax.swing.JFrame {
    connection c=new connection();

    public CustomerLogin() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        new loggWriter("Customer Login Opened.",true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        login = new javax.swing.JLabel();
        register = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        forgot = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Login");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setLayout(null);

        user.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jPanel1.add(user);
        user.setBounds(550, 310, 390, 50);

        pass.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(550, 400, 390, 50);

        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        jPanel1.add(login);
        login.setBounds(470, 510, 340, 60);

        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registerMouseExited(evt);
            }
        });
        jPanel1.add(register);
        register.setBounds(720, 630, 80, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("New Here? Register Here.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(430, 630, 410, 40);

        forgot.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        forgot.setForeground(new java.awt.Color(204, 0, 0));
        forgot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forgot.setText("Forgot Password?");
        forgot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));
        forgot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                forgotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                forgotMouseExited(evt);
            }
        });
        jPanel1.add(forgot);
        forgot.setBounds(470, 680, 340, 30);

        homepage.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        homepage.setForeground(new java.awt.Color(0, 204, 153));
        homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepage.setText("Homepage");
        homepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homepageMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homepageMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homepageMouseExited(evt);
            }
        });
        jPanel1.add(homepage);
        homepage.setBounds(490, 580, 290, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/1280x720.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        login();
    }//GEN-LAST:event_loginMouseClicked

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        CustomerRegistration cr=new CustomerRegistration();
        cr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_registerMouseClicked

    private void forgotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseClicked
        String user=JOptionPane.showInputDialog("Enter Username :").toString();
        try {
         c.rs=c.stmt.executeQuery("select cname,cl.cid  from Customer c inner join customerlogin cl on cl.cid=c.cid  where cl.user='"+user+"';");
        c.rs.next();
         String ans=JOptionPane.showInputDialog("Enter Customer ID - ");
        if(ans.equals(c.rs.getString("cl.cid")))
            c.stmt.executeUpdate("Update CustomerLogin set Pass='"+JOptionPane.showInputDialog("Enter Password :").toString()+"' where user='"+user+"';");
        else
            JOptionPane.showMessageDialog(null, "Customer ID doesn't match.");
         } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error Connecting To The Database.\nError Description - "+ex);
     }
    }//GEN-LAST:event_forgotMouseClicked

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        Homepage home=new Homepage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homepageMouseClicked

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        homepage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_homepageMouseEntered

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
        homepage.setBorder(null);
    }//GEN-LAST:event_homepageMouseExited

    private void registerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseEntered
       register.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_registerMouseEntered

    private void registerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseExited
        register.setBorder(null);
    }//GEN-LAST:event_registerMouseExited

    private void forgotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseEntered
       forgot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_forgotMouseEntered

    private void forgotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgotMouseExited
        forgot.setBorder(null);
    }//GEN-LAST:event_forgotMouseExited

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
        login.setBorder(null);
    }//GEN-LAST:event_loginMouseExited

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            login();
    }//GEN-LAST:event_passKeyReleased
private void login(){
try {
            c.rs=c.stmt.executeQuery("select * from customerlogin where user='"+user.getText()
                    +"' and  pass='"+String.valueOf(pass.getPassword())+"';");
            if(c.rs.next()){
                
        CustomerMenu menu=new CustomerMenu(c.rs.getString("cid"));
        menu.setVisible(true);
        this.setVisible(false);
            }
            else
                JOptionPane.showMessageDialog(null, "Incorrect username or password.\nNot Registered yet? Register.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
}
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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgot;
    private javax.swing.JLabel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel register;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
