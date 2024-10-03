
package customer;

import DBConnection.connection;
import homepage.Homepage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logs.loggWriter;

public class CustomerRegistration extends javax.swing.JFrame {
loggWriter log;
    public CustomerRegistration() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        log=new loggWriter("CustomerRegistration Opened.",true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        login_ = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        cname = new javax.swing.JTextField();
        confirmPass = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        register_ = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Customer Registration");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 758));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Registration");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(220, 40, 820, 90);

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Fill the Following Form to Avail our Services");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 120, 480, 40);

        login_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                login_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                login_MouseExited(evt);
            }
        });
        jPanel1.add(login_);
        login_.setBounds(740, 660, 70, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Already Registered?Login 'here'.");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(410, 660, 420, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Your Name :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(200, 200, 400, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Address :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(200, 250, 400, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Contact :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 300, 400, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Email :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(200, 350, 400, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Useername :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(200, 400, 400, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Password :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(200, 450, 400, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Confirm Password :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(200, 500, 400, 40);

        pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(pass);
        pass.setBounds(650, 450, 370, 40);

        contact.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(contact);
        contact.setBounds(650, 300, 370, 40);

        email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(email);
        email.setBounds(650, 350, 370, 40);

        user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(user);
        user.setBounds(650, 400, 370, 40);

        cname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cname);
        cname.setBounds(650, 200, 370, 40);

        confirmPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(confirmPass);
        confirmPass.setBounds(650, 500, 370, 40);

        address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(address);
        address.setBounds(650, 250, 370, 40);

        register_.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        register_.setForeground(new java.awt.Color(204, 204, 204));
        register_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register_.setText("Register");
        register_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                register_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                register_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                register_MouseExited(evt);
            }
        });
        jPanel1.add(register_);
        register_.setBounds(520, 570, 230, 70);

        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/exit(2).png"))); // NOI18N
        exit.setToolTipText("Feeling bored? Exit !");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(1130, 640, 110, 60);

        back.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        back.setForeground(new java.awt.Color(204, 204, 204));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("<<");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(60, 50, 150, 60);

        homepage.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        homepage.setForeground(new java.awt.Color(204, 204, 204));
        homepage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/homepage.png"))); // NOI18N
        homepage.setToolTipText("Back to Homepage");
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
        homepage.setBounds(90, 600, 80, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wp2533040.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_MouseClicked
        try {
            connection c=new connection();
            String Cid = null;
            try {
                c.rs=c.stmt.executeQuery("select cid from customer order by cid desc limit 1;");
                if(c.rs.next()){
                    Cid=c.rs.getString("cid");
                }
                else{
                    Cid="Cid-00000aaa";
                }
            }
            catch (SQLException ex) {
                log.write2(""+ex);        
            }
            try {
                c.rs=c.stmt.executeQuery("select user from customerlogin where user='"+user.getText()+"';");
            } catch (SQLException ex) {
                Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(!c.rs.next()){
                try {
                    Cid=customerid(Cid);
                    c.stmt.executeUpdate("insert into customer value('"+Cid+"','"+cname.getText()+"','"+address.getText()+"',"+Double.parseDouble(contact.getText())+",'"+email.getText()+"');");
                  if(pass.getText().equals(confirmPass.getText())){
                        c.stmt.executeUpdate("insert into customerLogin value('" +   Cid    +    "','"    +    user.getText()    +    "','"
                                +     pass.getText()        +      "');");
                        
        JOptionPane.showMessageDialog(null, "Customer id  - "+Cid);
            CustomerLogin login=new CustomerLogin();
            login.setVisible(true);
            this.setVisible(false);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Confirm Password Field Doesn't match Password Field.");
                } catch (SQLException ex) {
                    Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
                JOptionPane.showMessageDialog(null, "Username Already Exist.");
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
    }//GEN-LAST:event_register_MouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        
        int a;
        a = JOptionPane.showConfirmDialog(null,"Feeling Bored?? Wanna Exit?","Please Don't Leave.",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0){
            JOptionPane.showMessageDialog(null, "I'll Miss YOU!!💔", "Miss You.", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else if(a==1||a==2){
            JOptionPane.showMessageDialog(null,"I Love You Tooo!!!!😘😘","hehe.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void login_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_MouseClicked
        CustomerLogin login=new CustomerLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_login_MouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        CustomerLogin login=new CustomerLogin();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
       int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
       back.setBorder(null);
    }//GEN-LAST:event_backMouseExited

    private void register_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_MouseEntered
       register_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_register_MouseEntered

    private void register_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_MouseExited
        register_.setBorder(null);
    }//GEN-LAST:event_register_MouseExited

    private void login_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_MouseEntered
        login_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_login_MouseEntered

    private void login_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_MouseExited
        login_.setBorder(null);
    }//GEN-LAST:event_login_MouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBorder(null);
    }//GEN-LAST:event_exitMouseExited

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        Homepage home=new Homepage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homepageMouseClicked

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        homepage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_homepageMouseEntered

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
        homepage.setBorder(null);
    }//GEN-LAST:event_homepageMouseExited
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public String customerid(String id){
        String N;
        char ch[]=id.toCharArray();
        int n=Integer.parseInt(new StringBuilder().append(ch[4]).append(ch[5]).append(ch[6]).append(ch[7]).append(ch[8]).toString());
        
        if(n==99999){
            N="00000";
            int temp;
            if(ch[11]=='z'){
                if(ch[10]=='z'){
                    temp=ch[9];
                    ch[9]=(char) ++temp;
                }
                else{
                        temp=ch[10];
                        ch[10]=(char)++temp;
                }
            }
            else{
                temp=ch[11];
                ch[11]=(char)++temp;
                if(temp==123){
                    temp=65;
                    ch[11]=(char)temp; 
                }
                
            }
        return "Cid-"+N+new StringBuilder().append(ch[9]).append(ch[10]).append(ch[11]).toString();
        }
        else{
        n++;
        }
        if(count(n)<2) 
            return "Cid-"+"0000"+n+new StringBuilder().append(ch[9]).append(ch[10]).append(ch[11]).toString();
        else if(count(n)<3) 
             return "Cid-"+"000"+n+new StringBuilder().append(ch[9]).append(ch[10]).append(ch[11]).toString();
        else if(count(n)<4) 
             return "Cid-"+"00"+n+new StringBuilder().append(ch[9]).append(ch[10]).append(ch[11]).toString();
        else if(count(n)<5) 
             return "Cid-"+"0"+n+new StringBuilder().append(ch[9]).append(ch[10]).append(ch[11]).toString();
        
            return "Cid-"+n+new StringBuilder().append(ch[9]).append(ch[10]).append(ch[11]).toString();
        
        
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int count(int no){
    int count=0;
        while(no>0){
        no=no/10;
        count++;
        }
        return count;
    }
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
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel back;
    private javax.swing.JTextField cname;
    private javax.swing.JTextField confirmPass;
    private javax.swing.JTextField contact;
    private javax.swing.JTextField email;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel login_;
    private javax.swing.JTextField pass;
    private javax.swing.JLabel register_;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
