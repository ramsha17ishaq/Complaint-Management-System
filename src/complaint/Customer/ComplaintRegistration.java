
package complaint.Customer;

import DBConnection.connection;
import complaint.Employee.ComplaintAction;
import customer.CustomerMenu;
import homepage.Homepage;
import java.sql.SQLException;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logs.loggWriter;


public class ComplaintRegistration extends javax.swing.JFrame {
    connection c=new connection();
    String CID;
    
    public ComplaintRegistration() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        new loggWriter("Complaint Registration Opened.",true);
        
    try {
        c.rs=c.stmt.executeQuery("select complaint_id from complaintregistration order by complaint_id desc limit 1;");
        if(c.rs.next())
        COID.setText(complaintid(c.rs.getString("complaint_id")));
        else
            COID.setText("CO-aaa00000");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Complaint Id Loading Error.\nError Description - "+ex);
    }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
        
    }

    public ComplaintRegistration(String cid) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        new loggWriter("Complaint Registration Opened.",true);
        
    try {
        c.rs=c.stmt.executeQuery("select complaint_id from complaintregistration order by complaint_id desc limit 1;");
        if(c.rs.next())
        COID.setText(complaintid(c.rs.getString("complaint_id")));
        else
            COID.setText("CO-aaa00000");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Complaint Id Loading Error.\nError Description - "+ex);
    }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
        cuid.setText(cid);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cuid = new javax.swing.JLabel();
        COID = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        tos = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        register_ = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        condition = new javax.swing.JComboBox();
        exit = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setExtendedState(1);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bauhaus 93", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Complaint Registration");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 30, 770, 80);

        cuid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cuid.setForeground(new java.awt.Color(204, 204, 204));
        cuid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(cuid);
        cuid.setBounds(270, 130, 170, 50);

        COID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        COID.setForeground(new java.awt.Color(204, 204, 204));
        COID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(COID);
        COID.setBounds(1050, 130, 190, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CustomerID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 130, 200, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ComplaintID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(840, 130, 190, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Description :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 290, 240, 40);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(670, 290, 440, 130);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Type Of Service :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(350, 450, 250, 40);

        tos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tosActionPerformed(evt);
            }
        });
        jPanel1.add(tos);
        tos.setBounds(670, 450, 440, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Place :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(350, 510, 250, 40);
        jPanel1.add(place);
        place.setBounds(670, 510, 440, 40);

        register_.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
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
        register_.setBounds(490, 630, 360, 60);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Condition :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 570, 250, 40);

        condition.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select>", "Serious", "Too Bad", "Bad", "Not OK" }));
        condition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conditionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conditionMouseExited(evt);
            }
        });
        jPanel1.add(condition);
        condition.setBounds(670, 570, 260, 40);

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
        exit.setBounds(1130, 600, 90, 60);

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
        back.setBounds(60, 40, 150, 60);

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Problem Title :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(350, 220, 250, 40);
        jPanel1.add(title);
        title.setBounds(670, 220, 440, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/wp2533040.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_MouseClicked
        try {
            Calendar cal=Calendar.getInstance();
       c.stmt.executeUpdate("insert into complaintregistration(ProblemTitle,complaint_id,cid ,date ,description  "
               + ",typeofservice  ,place  ,`condition`, status) value('"
                    +title.getText()+"','"+COID.getText()+"','"+  cuid.getText()  +   "','"   
                    +   cal.get(Calendar.DATE) +"/"+cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.YEAR)   +   "','"  
                    +   description.getText()   +   "','"     +   tos.getText()  +   "','"    
                    +   place.getText() +   "','"   +   condition.getSelectedItem().toString()  +"','Initial Submission');");
            c.stmt.executeUpdate("insert into complaintAction(complaint_id) value('"+COID.getText()+"');");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cannot Register Complaint.\nError Description - "+ex);
            new logs.loggWriter().write2("Cannot Register Complaint.\nError Description - "+ex);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
            new logs.loggWriter().write2("Something unexpected Occured.\n Contact Admin for Support.\nError Description - "+ex);
        }
    }//GEN-LAST:event_register_MouseClicked

    private void tosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tosActionPerformed

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        CustomerMenu menu=new CustomerMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBorder(null);
    }//GEN-LAST:event_backMouseExited

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

    private void register_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_MouseEntered
        register_.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_register_MouseEntered

    private void register_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_register_MouseExited
        register_.setBorder(null);
    }//GEN-LAST:event_register_MouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBorder(null);
    }//GEN-LAST:event_exitMouseExited

    private void conditionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionMouseEntered
        condition.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.SoftBevelBorder.RAISED));
    }//GEN-LAST:event_conditionMouseEntered

    private void conditionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conditionMouseExited
        condition.setBorder(null);
    }//GEN-LAST:event_conditionMouseExited
//////////////////////////////////////////////////////////////////////////////////////////////
    public String complaintid(String id){
        String N;
        char ch[]=id.toCharArray();
        int n=Integer.parseInt(new StringBuilder().append(ch[6]).append(ch[7]).append(ch[8]).append(ch[9]).append(ch[10]).toString());
        
        if(n==99999){
            N="00000";
            int temp;
            if(ch[5]=='z'){
                if(ch[4]=='z'){
                    temp=ch[3];
                    ch[3]=(char) ++temp;
                }
                else{
                        temp=ch[4];
                        ch[4]=(char)++temp;
                }
            }
            else{
                temp=ch[5];
                ch[5]=(char)++temp;
                if(temp==123){
                    temp=65;
                    ch[5]=(char)temp; 
                }
                
            }
        return "CO-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+N;
        }
        else{
        n++;
        }
         if(count(n)<2) 
             return "CO-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"0000"+n;
        if(count(n)<3) 
             return "CO-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"000"+n;
        if(count(n)<4) 
             return "CO-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"00"+n;
        if(count(n)<5) 
             return "CO-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+"0"+n;
        else {
                return "CO-"+new StringBuilder().append(ch[3]).append(ch[4]).append(ch[5]).toString()+n;
                
                }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
            java.util.logging.Logger.getLogger(ComplaintRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COID;
    private javax.swing.JLabel back;
    private javax.swing.JComboBox condition;
    private javax.swing.JLabel cuid;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel homepage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField place;
    private javax.swing.JLabel register_;
    private javax.swing.JTextField title;
    private javax.swing.JTextField tos;
    // End of variables declaration//GEN-END:variables
}
