/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customer;

import DBConnection.connection;
import homepage.Homepage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import logs.loggWriter;


public class ComplaintDetails extends javax.swing.JFrame {
connection c=new connection();
    /**
     * Creates new form complaintDetails
     */
    public ComplaintDetails() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        new loggWriter("Complaint Details Opened.",true);
    }

    ComplaintDetails(String cid) {
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        update = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        place = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tos = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        COID = new javax.swing.JLabel();
        cuid = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        homepage = new javax.swing.JLabel();
        condition = new javax.swing.JTextField();
        serviceCenter = new javax.swing.JTextField();
        title = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));
        jPanel1.setLayout(null);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setText("01/01/2018");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(950, 510, 260, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Date :");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(750, 510, 150, 40);

        update.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        update.setForeground(new java.awt.Color(204, 204, 204));
        update.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        update.setText("Update");
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(490, 580, 320, 60);

        status.setEditable(false);
        jPanel1.add(status);
        status.setBounds(750, 260, 460, 40);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Service Center :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(750, 320, 290, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Status :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(750, 210, 170, 40);

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

        place.setEditable(false);
        jPanel1.add(place);
        place.setBounds(270, 510, 440, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Condition :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(750, 440, 250, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Place :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 510, 200, 40);

        tos.setEditable(false);
        tos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tosActionPerformed(evt);
            }
        });
        jPanel1.add(tos);
        tos.setBounds(270, 440, 440, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Type Of Service :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 440, 200, 40);

        description.setColumns(20);
        description.setRows(5);
        jScrollPane1.setViewportView(description);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 270, 440, 140);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Description :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 270, 200, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("ComplaintID :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(790, 130, 190, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("CustomerID :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(80, 130, 200, 50);

        COID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        COID.setForeground(new java.awt.Color(204, 204, 204));
        COID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        COID.setText("CO-aaa10200");
        jPanel1.add(COID);
        COID.setBounds(990, 130, 200, 50);

        cuid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cuid.setForeground(new java.awt.Color(204, 204, 204));
        cuid.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuid.setText("Cid-13200axz");
        jPanel1.add(cuid);
        cuid.setBounds(270, 130, 200, 50);

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Complaint Details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 30, 770, 80);

        homepage.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        homepage.setForeground(new java.awt.Color(204, 204, 204));
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
        homepage.setBounds(520, 640, 260, 50);

        condition.setEditable(false);
        jPanel1.add(condition);
        condition.setBounds(880, 440, 330, 40);

        serviceCenter.setEditable(false);
        jPanel1.add(serviceCenter);
        serviceCenter.setBounds(750, 370, 460, 40);
        jPanel1.add(title);
        title.setBounds(270, 210, 440, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Problem Title :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 210, 200, 40);

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

    private void tosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tosActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

        int a;
        a = JOptionPane.showConfirmDialog(null,"Feeling Bored?? Wanna Exit?","Please Don't Leave.",JOptionPane.YES_NO_CANCEL_OPTION);
        if(a==0){
            JOptionPane.showMessageDialog(null, "We'll Miss YOU!!", "Exiting..", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        else if(a==1||a==2){
            JOptionPane.showMessageDialog(null,"Thank You.","Thank You.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void homepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseClicked
        Homepage home=new Homepage();
        home.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homepageMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        CustomerMenu menu=new CustomerMenu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
       back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setBorder(null);
    }//GEN-LAST:event_backMouseExited

    private void updateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseEntered
        update.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_updateMouseEntered

    private void homepageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseEntered
        homepage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_homepageMouseEntered

    private void homepageMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homepageMouseExited
       homepage.setBorder(null);
    }//GEN-LAST:event_homepageMouseExited

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
       update.setBorder(null);
    }//GEN-LAST:event_updateMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
       exit.setBorder(null);
    }//GEN-LAST:event_exitMouseExited

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
    try {
        c.stmt.executeUpdate("update complaintRegistration set problemTitle='"+title.getText()+"', Description ='"+description.getText()+"' where Complaint_id='"+cuid.getText()+"';");
        JOptionPane.showMessageDialog(null, "Complaint Details Updated Succesfully.");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error while Updating Complaint Details.\nError Description - "+ex);
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Something Unexpected Occured.\nError Description - "+ex);}
    }//GEN-LAST:event_updateMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int option;
        option=JOptionPane.showConfirmDialog(this, "Confirm To Exit?", "Exit", JOptionPane.YES_NO_CANCEL_OPTION);
        if(option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(ComplaintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel COID;
    private javax.swing.JLabel back;
    private javax.swing.JTextField condition;
    private javax.swing.JLabel cuid;
    private javax.swing.JTextArea description;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel homepage;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField place;
    private javax.swing.JTextField serviceCenter;
    private javax.swing.JTextField status;
    private javax.swing.JTextField title;
    private javax.swing.JTextField tos;
    private javax.swing.JLabel update;
    // End of variables declaration//GEN-END:variables
}
