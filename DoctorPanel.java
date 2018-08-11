
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class DoctorPanel extends javax.swing.JFrame {
    public DoctorPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
        show_user();
    }
    public ArrayList<Show> userList(){
         ArrayList<Show> userList=new ArrayList<>();
             try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=HM;username=redwan;password=2323";
            Connection con = DriverManager.getConnection(url);
            String query="Select *from patient";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(query);
            Show patient;
            while(rs.next()){
                patient= new Show(rs.getInt("p_id"),rs.getString("name"),rs.getInt("age"),rs.getString("gender"),rs.getString("address1"),rs.getString("phone"),rs.getInt("ward"),rs.getInt("bed"),rs.getString("date1"),rs.getString("dname"),rs.getInt("d_id"),rs.getString("date2"));
                userList.add(patient);
            }
             }
             
             catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    
        }
         return userList;
    
}
    public void show_user(){
        ArrayList<Show> list=userList();
        DefaultTableModel model=(DefaultTableModel)patientdisplaytabel.getModel();
        Object[]row=new Object[12];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getid();
            row[1]=list.get(i).getname();
            row[2]=list.get(i).getage();
            row[3]=list.get(i).getgender();
            row[4]=list.get(i).getaddress1();
            row[5]=list.get(i).getphone();
            row[6]=list.get(i).getward();
            row[7]=list.get(i).getbed();
            row[8]=list.get(i).getdate();
            row[9]=list.get(i).getdname();
            row[10]=list.get(i).getdid();
            row[11]=list.get(i).getnextdate();
            model.addRow(row);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nextdate = new javax.swing.JTextField();
        doctorid = new javax.swing.JTextField();
        dname = new javax.swing.JTextField();
        bed = new javax.swing.JTextField();
        ward = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        address1 = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        p_id = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        clear = new javax.swing.JButton();
        save = new javax.swing.JButton();
        update = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientdisplaytabel = new javax.swing.JTable();
        Delete = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 103, 103));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 51));
        jLabel8.setText("Patient Information");

        jPanel1.setBackground(new java.awt.Color(153, 51, 255));

        back.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Doctor ID:");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Date:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("ID:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Age:");

        gender.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        gender.setText("Gender:");

        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Address:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Phone-No:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Ward-No:");

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setText("Bed-No:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setText("Doctor Name:");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setText("NextDate:");

        clear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        save.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 204));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        patientdisplaytabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Gender", "Address", "Phone-No", "Ward-No", "Bed-No", "Date", "Dr.Name", "Dr.ID", "Next-Date"
            }
        ));
        patientdisplaytabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                patientdisplaytabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(patientdisplaytabel);

        Delete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gender)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel7))
                                    .addGap(30, 30, 30))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(27, 27, 27)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bed, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextdate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(male)
                                .addGap(55, 55, 55)
                                .addComponent(female))
                            .addComponent(ward, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clear)
                        .addGap(18, 18, 18)
                        .addComponent(save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(update)
                        .addGap(12, 12, 12)
                        .addComponent(Delete)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 814, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(p_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gender)
                    .addComponent(male)
                    .addComponent(female))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(address1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ward, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(bed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(doctorid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(nextdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clear)
                    .addComponent(save)
                    .addComponent(update)
                    .addComponent(Delete))
                .addGap(23, 23, 23))
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel3))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=HM;username=redwan;password=2323";
            Connection con = DriverManager.getConnection(url);
            String query1="Select bed from patient where bed=?";
            PreparedStatement pt1=con.prepareStatement(query1);
            pt1.setString(1,bed.getText());
            ResultSet rs= pt1.executeQuery();
            
            if(rs.next())
            {
                JOptionPane.showMessageDialog(null, " This Bed Already taken");
            }
            else
            {
                try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String query="insert into patient(name,age,gender,address1,phone,ward,bed,date1,dname,d_id,date2)values(?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement pt=con.prepareStatement(query);
            pt.setString(1,name.getText());
            pt.setString(2,age.getText());
            if (male.isSelected()){
                pt.setString(3,male.getText());
            }
            else{
                pt.setString(3,female.getText());
            }
            pt.setString(4,address1.getText());
            pt.setString(5,phone.getText());
            pt.setString(6,ward.getText());
            pt.setString(7,bed.getText());
            pt.setString(8,date.getText());
            pt.setString(9,dname.getText());
            pt.setString(10,doctorid.getText());
            pt.setString(11,nextdate.getText());
            JOptionPane.showMessageDialog(null,"Information Saved");
            pt.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)patientdisplaytabel.getModel();
            model.setRowCount(0);
            show_user();
                   
            
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
        }
            
            }
}
catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    
}

    }//GEN-LAST:event_saveActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        RegesterFrom rf=new RegesterFrom();
        rf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        if(female.isSelected()){
            male.setSelected(false);
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        if(male.isSelected()){
            female.setSelected(false);
        }
    }//GEN-LAST:event_maleActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
     p_id.setText("");
     name.setText("");
     age.setText("");
     address1.setText("");
     phone.setText("");
     ward.setText("");
     bed.setText("");
     date.setText("");
     dname.setText("");
     doctorid.setText("");
     nextdate.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=HM;username=redwan;password=2323";
            Connection con = DriverManager.getConnection(url);
            int r =patientdisplaytabel.getSelectedRow();
            String value=(patientdisplaytabel).getModel().getValueAt(r,0).toString();
            String query="Update patient set name=?,age=?,gender=?,address1=?,phone=?,ward=?,bed=?,date1=?,dname=?,d_id=?,date2=? where p_id="+value;
            PreparedStatement pt=con.prepareStatement(query);
            pt.setString(1, name.getText());
            pt.setString(2, age.getText());
            if (male.isSelected()){
                pt.setString(3,male.getText());
            }
            else{
                pt.setString(3,female.getText());
            }
            pt.setString(4, address1.getText());
            pt.setString(5,phone.getText());
            pt.setString(6, ward.getText());
            pt.setString(7,bed.getText());
            pt.setString(8, date.getText());
            pt.setString(9,dname.getText());
            pt.setString(10, doctorid.getText());
            pt.setString(11,nextdate.getText());
            pt.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)patientdisplaytabel.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null,"Update Successfully");
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    
        }
    }//GEN-LAST:event_updateActionPerformed

    private void patientdisplaytabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_patientdisplaytabelMouseClicked
        int i=patientdisplaytabel.getSelectedRow();
        TableModel model=patientdisplaytabel.getModel();
        p_id.setText(model.getValueAt(i,0).toString());
        name.setText(model.getValueAt(i,1).toString());
        age.setText(model.getValueAt(i,2).toString());
        String sex= model.getValueAt(i,3).toString();
        if(sex.equals("male")){
            male.setSelected(true);
        }
        else{
            female.setSelected(true);
        }
        address1.setText(model.getValueAt(i,4).toString());
        phone.setText(model.getValueAt(i, 5).toString());
        ward.setText(model.getValueAt(i,6).toString());
        bed.setText(model.getValueAt(i,7).toString());
        date.setText(model.getValueAt(i,8).toString());
        dname.setText(model.getValueAt(i,9).toString());
        doctorid.setText(model.getValueAt(i,10).toString());
        
    }//GEN-LAST:event_patientdisplaytabelMouseClicked

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        try{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;databaseName=HM;username=redwan;password=2323";
            Connection con = DriverManager.getConnection(url);
            int r=patientdisplaytabel.getSelectedRow();
            String value=(patientdisplaytabel).getModel().getValueAt(r,0).toString();
            String query="DELETE FROM patient where p_id="+value;
            PreparedStatement pt=con.prepareStatement(query);
            pt.executeUpdate();
            DefaultTableModel model=(DefaultTableModel)patientdisplaytabel.getModel();
            model.setRowCount(0);
            show_user();
            JOptionPane.showMessageDialog(null,"Delete Succssefully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
    
        }
    }//GEN-LAST:event_DeleteActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Delete;
    private javax.swing.JTextField address1;
    private javax.swing.JTextField age;
    private javax.swing.JButton back;
    private javax.swing.JTextField bed;
    private javax.swing.JButton clear;
    private javax.swing.JTextField date;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField doctorid;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nextdate;
    private javax.swing.JTextField p_id;
    private javax.swing.JTable patientdisplaytabel;
    private javax.swing.JTextField phone;
    private javax.swing.JButton save;
    private javax.swing.JToggleButton update;
    private javax.swing.JTextField ward;
    // End of variables declaration//GEN-END:variables
}