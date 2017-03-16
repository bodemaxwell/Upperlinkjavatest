import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Qusetion5 extends javax.swing.JFrame {
Connection con;
ResultSet rs;
Statement st;
int curRow;
   
    public Qusetion5() {
        initComponents();
        DoConnect();
    }
public void DoConnect(){
    try{
    // connect to the database
    String host = "jdbc:derby://localhost:1527/Upperlinkdb ";
    String uName = "admin123";
    String pWord = "admin123";
    con= DriverManager.getConnection(host,uName,pWord);
    // SQL TO RETRIEVE RECORDS
    st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    String sql = "SELECT * FROM STUDENTREC";
    rs = st.executeQuery(sql);
    
    // to load the first record
    rs.next();
    int id_num = rs.getInt("ID");
    String id = Integer.toString(id_num);
    String firstName = rs.getString("FIRST_NAME");
    String lastName = rs.getString("LAST_NAME");
    String middlename = rs.getString("MIDDLE_NAME");
    String faculty = rs.getString("FACULTY");
    String department = rs.getString("DEPARTMENT");
    
    // SET THE FIRST RECORD INTO THE TEXT FIELDS
    txtid.setText(id);
    txtFirstName.setText(firstName);
    txtLastName.setText(lastName);
    txtMiddleName.setText(middlename);
    txtFaculty.setText(faculty);
    txtDepartment.setText(department);
    
       
    }
    catch(SQLException err){
    JOptionPane.showMessageDialog(Qusetion5.this, err.getMessage());
    }
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtMiddleName = new javax.swing.JTextField();
        txtFaculty = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtid.setText("id");

        txtFirstName.setText("firstname");

        txtLastName.setText("lastname");
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtMiddleName.setText("middlename");
        txtMiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiddleNameActionPerformed(evt);
            }
        });

        txtFaculty.setText("faculty");
        txtFaculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultyActionPerformed(evt);
            }
        });

        txtDepartment.setText("department");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setMnemonic('S');
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("UPDATE RECORD");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(txtFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtFacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
String FirstName = txtFirstName.getText();
String LastName = txtLastName.getText();
String MiddleName = txtMiddleName.getText();
String Faculty = txtFaculty.getText();
String Department = txtDepartment.getText();
String id = txtid.getText();
int idInt= Integer.parseInt(id);
try{
    rs.moveToInsertRow();
    rs.updateInt("ID", idInt);
    rs.updateString("FIRST_NAME", FirstName);
    rs.updateString("LAST_NAME", LastName);
    rs.updateString("MIDDLE_NAME", MiddleName);
    rs.updateString("FACULTY", Faculty);
    rs.updateString("DEPARTMENT", Department);
    rs.insertRow();
    rs.close();
    st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
    String sql = "SELECT*FROM STUDENTREC";
    rs=st.executeQuery(sql);
    
    rs.next();
    int id2 = rs.getInt("ID");
    String id22 = Integer.toString(id2);
    String firstname2 = rs.getString("FIRST_NAME");
    String lastname2 = rs.getString("LAST_NAME");
   String middlename2 = rs.getString("MIDDLE_NAME");
   String faculty2 = rs.getString("FACULTY");
   String department2 = rs.getString("DEPARTMENT");
   
    
    txtid.setText(id22);
    txtFirstName.setText(firstname2);
    txtLastName.setText(lastname2);
    txtMiddleName.setText(middlename2);
    txtFaculty.setText(faculty2);
    txtDepartment.setText(department2);
    
    
    


    
}
catch(SQLException err){
JOptionPane.showMessageDialog(Qusetion5.this,err.getMessage());
}
        // TODO add your handling code here:
                                                

    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtMiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMiddleNameActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       String id_num = txtid.getText();
String LastName = txtLastName.getText();
String FirstName = txtFirstName.getText();
String MiddleName = txtMiddleName.getText();
String Faculty = txtFaculty.getText();
String Department = txtDepartment.getText();
int id = Integer.parseInt(id_num);

try{
rs.updateInt("ID",id);
rs.updateString("FIRST NAME",FirstName);
rs.updateString("LAST NAME",LastName);
rs.updateString("MIDDLENAME", MiddleName);
rs.updateString("FACULTY", Faculty);
rs.updateString("DEPARTMENT", Department);
rs.updateRow();
 JOptionPane.showMessageDialog(Qusetion5.this, "Record Updated successfully");
 
}
catch(SQLException e){
 JOptionPane.showMessageDialog(Qusetion5.this, e.getMessage());


}


        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Qusetion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Qusetion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Qusetion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Qusetion5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Qusetion5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtFaculty;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables

}