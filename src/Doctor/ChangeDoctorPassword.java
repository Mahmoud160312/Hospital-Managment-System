/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Doctor;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mahmoud160312
 */
public class ChangeDoctorPassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangeAdminUsernameAndPassword
     */
    public ChangeDoctorPassword() {
        initComponents();
        CenteredFrame(this);
    }

    public void CenteredFrame(javax.swing.JFrame objFrame) {
        Dimension objDimension = Toolkit.getDefaultToolkit().getScreenSize();
        int iCoordX = (objDimension.width - objFrame.getWidth()) / 2;
        int iCoordY = (objDimension.height - objFrame.getHeight()) / 2;
        objFrame.setLocation(iCoordX, iCoordY);
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
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Change = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        newAdminPassword = new javax.swing.JPasswordField();
        newAdminUserName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        newAdminUserName1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("<<");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7);
        jLabel7.setBounds(10, 10, 24, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        Change.setBackground(new java.awt.Color(0, 153, 204));
        Change.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        Change.setForeground(new java.awt.Color(255, 255, 255));
        Change.setText("Change");
        Change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeActionPerformed(evt);
            }
        });
        jPanel2.add(Change);
        Change.setBounds(110, 220, 127, 39);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 204));
        jLabel4.setText("ID Code");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 30, 140, 30);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setText("New Password");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 150, 122, 30);

        newAdminPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                newAdminPasswordKeyTyped(evt);
            }
        });
        jPanel2.add(newAdminPassword);
        newAdminPassword.setBounds(170, 150, 180, 30);

        newAdminUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAdminUserNameActionPerformed(evt);
            }
        });
        jPanel2.add(newAdminUserName);
        newAdminUserName.setBounds(170, 30, 180, 30);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setText("Current Password");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 90, 140, 30);

        newAdminUserName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAdminUserName1ActionPerformed(evt);
            }
        });
        jPanel2.add(newAdminUserName1);
        newAdminUserName1.setBounds(170, 90, 180, 30);

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Current pass  must have a value");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(170, 120, 180, 20);

        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("New pass  must have a value");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(170, 180, 170, 20);

        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("ID code  must have a value");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(160, 60, 170, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 170, 360, 290);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hds/photo/change the password photo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 170);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        DoctorPortal f = new DoctorPortal();
        this.setVisible(false);
        f.setVisible(true);

    }//GEN-LAST:event_jLabel7MouseClicked

    private void ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeActionPerformed
        
        
        if(newAdminUserName.getText().equals("")){
            jLabel10.setVisible(true);}
        if(newAdminUserName1.getText().equals("")){
            jLabel2.setVisible(true);}
        if(newAdminPassword.getText().equals("")){
            jLabel9.setVisible(true);}
        
      /*  if(!set.getString("doctor_id").equals(newAdminUserName.getText()) || !set.getString("Dpassword").equals(newAdminUserName1.getText())){
                JOptionPane.showMessageDialog(this,"Your \"ID code\" or \"current password\" may be Wrong ,please check it again ","Confim",JOptionPane.INFORMATION_MESSAGE);
                return;
                
            } */
       else if(!"".equals(newAdminUserName.getText()) && !"".equals(newAdminUserName1.getText()) && !"".equals(newAdminPassword.getText()))
        {     
            try {
            java.sql.Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hdbs?autoReconnect=true&useSSL=false", "root", "root");
            PreparedStatement stmt = con.prepareStatement("select *from  doctor ");
            PreparedStatement stmt2 = con.prepareStatement("update doctor set Dpassword=? where doctor_id=?");
             
             ResultSet set = stmt.executeQuery();
    
            String  ID_code="", cur_pass="",new_pass="",ID="",pass="";
             ID_code=newAdminUserName.getText();
             cur_pass=newAdminUserName1.getText();
             new_pass=newAdminPassword.getText();
        
             
             
             while(set.next()){
                ID=set.getString("doctor_id");
                pass=set.getString("Dpassword");
                     
            if(ID_code.equals(ID) && cur_pass.equals(pass)){
                stmt2.setString(1, new_pass); 
                stmt2.setString(2, ID_code);
                stmt2.executeUpdate();
                 break;
        
            }    
                   
            }
            if (ID.equals(ID_code) && pass.equals(cur_pass)) {
                
      
                JOptionPane.showMessageDialog(this,"Your password saved Successfully :)","Confim",JOptionPane.INFORMATION_MESSAGE);
                newAdminUserName.setText("");
                newAdminUserName1.setText("");
                newAdminPassword.setText("");
                jLabel2.setVisible(false);
                jLabel10.setVisible(false);
                jLabel9.setVisible(false);
            }
            else {
                jLabel10.setVisible(true);
                jLabel2.setVisible(true);
                jLabel9.setVisible(true);
            } 
             
             
        
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"you make some thing wrong please review the the system guide","Confim",JOptionPane.INFORMATION_MESSAGE);
                
          System.out.println("Error"+ex.getErrorCode());
            
            }
        }
    }//GEN-LAST:event_ChangeActionPerformed

    private void newAdminUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAdminUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newAdminUserNameActionPerformed

    private void newAdminPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_newAdminPasswordKeyTyped
        
    }//GEN-LAST:event_newAdminPasswordKeyTyped

    private void newAdminUserName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAdminUserName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newAdminUserName1ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeDoctorPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeDoctorPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeDoctorPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeDoctorPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeDoctorPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Change;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField newAdminPassword;
    private javax.swing.JTextField newAdminUserName;
    private javax.swing.JTextField newAdminUserName1;
    // End of variables declaration//GEN-END:variables
}
