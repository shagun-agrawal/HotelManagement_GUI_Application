/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author microsoft
 */
public class addEmploys extends javax.swing.JFrame {
      PreparedStatement stmt = null;
        Connection conn = null;
        ResultSet rs=null;
        Statement st=null;

    /**
     * Creates new form addEmploys
     */
    public addEmploys() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        aadhar = new javax.swing.JTextField();
        phoneNo = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        jb1 = new javax.swing.JRadioButton();
        jb2 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        job = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 600));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 50, 60, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("AGE");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 100, 29, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 150, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("JOB");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 210, 40, 17);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Salary");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 260, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Phone No");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 300, 120, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("AADHAR");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 350, 70, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("EMAIL");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 400, 60, 17);
        jPanel1.add(name);
        name.setBounds(210, 50, 200, 30);
        jPanel1.add(age);
        age.setBounds(210, 100, 200, 30);
        jPanel1.add(email);
        email.setBounds(210, 390, 200, 30);
        jPanel1.add(aadhar);
        aadhar.setBounds(210, 340, 200, 30);

        phoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoActionPerformed(evt);
            }
        });
        jPanel1.add(phoneNo);
        phoneNo.setBounds(210, 290, 200, 30);
        jPanel1.add(salary);
        salary.setBounds(210, 250, 200, 30);

        buttonGroup4.add(jb1);
        jb1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb1.setText("Male");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });
        jPanel1.add(jb1);
        jb1.setBounds(210, 150, 70, 30);

        buttonGroup4.add(jb2);
        jb2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jb2.setText("Femail");
        jPanel1.add(jb2);
        jb2.setBounds(310, 150, 90, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 51));
        jLabel9.setText("Add Employ Details");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(330, -10, 420, 50);

        job.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        job.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "House Keeper", "Waiter", "Manager", "Accountent", "Chef", "Kitchen Staff", "Bussness Staff", "Interiour Designer", "Securuty", " " }));
        job.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobActionPerformed(evt);
            }
        });
        jPanel1.add(job);
        job.setBounds(210, 210, 200, 23);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(250, 470, 100, 31);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\microsoft\\Pictures\\same size hotel management photo\\employs1.jpg")); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(480, -140, 810, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1250, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoActionPerformed

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb1ActionPerformed

    private void jobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           try {
          
            
            
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            String dbURL = "jdbc:mysql://localhost:3308/hotel_management?user=root&password";
            conn = DriverManager.getConnection(dbURL);
            
            String Name=name.getText();
            String Age=age.getText();
            String Gender=null;
            if(jb1.isSelected())
            {
            Gender="Male";
            }
            else
            {
            if(jb2.isSelected())
            {
            Gender="Femail";
            }
            }
            String Job=job.getSelectedItem().toString();
          String Salary=salary.getText();
         String PhoneNo=phoneNo.getText();
         String Aadhar=aadhar.getText();
         String Email=email.getText();
                     
           
            int y=0;
            if(y==0)
            {
                 String query3 = "select AADHAR from add_employ";
            stmt=conn.prepareStatement(query3);
            
            rs = stmt.executeQuery();
            
            String j;
            
            Boolean bl=true;            
           while(rs.next() && bl!=false)
           {
               
    
                j = rs.getString("AADHAR");
               if(j.equals(Aadhar))
               {
                   JOptionPane.showMessageDialog(null,"This AADHAR No is already exist");
                bl=false;  
               }
           }
   
                 if(bl!=false)
           {
      JOptionPane.showMessageDialog(null,"Successfully Added Employ");
            String query1="insert into add_employ values('"+Name+"','"+Age+"','"+Gender+"','"+Job+"','"+Salary+"','"+PhoneNo+"','"+Aadhar+"','"+Email+"')";
            st=conn.createStatement();
            int i=st.executeUpdate(query1);
            
   
           }
               }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Something Went Wrong");
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
            java.util.logging.Logger.getLogger(addEmploys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmploys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmploys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmploys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmploys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aadhar;
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jb1;
    private javax.swing.JRadioButton jb2;
    private javax.swing.JComboBox job;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phoneNo;
    private javax.swing.JTextField salary;
    // End of variables declaration//GEN-END:variables
}
