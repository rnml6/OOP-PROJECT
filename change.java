/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author anday
 */
public class change extends javax.swing.JFrame {

    /**
     * Creates new form add
     */
    public change() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        roompane = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        usernamepane = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        passwordpane = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        namepane = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        contactspane = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        monthlypane = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        duedatepane = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(19, 62, 135));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(19, 62, 135));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(19, 62, 135));
        jLabel7.setText("DUEDATE:");

        roompane.setBackground(new java.awt.Color(19, 62, 135));
        roompane.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        roompane.setForeground(new java.awt.Color(255, 255, 255));
        roompane.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        roompane.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        roompane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roompaneActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(19, 62, 135));
        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(19, 62, 135));
        jLabel9.setText("ROOM:");

        jLabel10.setBackground(new java.awt.Color(19, 62, 135));
        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(19, 62, 135));
        jLabel10.setText("USERNAME:");

        jLabel11.setBackground(new java.awt.Color(19, 62, 135));
        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(19, 62, 135));
        jLabel11.setText("PASSWORD:");

        jLabel12.setBackground(new java.awt.Color(19, 62, 135));
        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(19, 62, 135));
        jLabel12.setText("NAME:");

        jLabel13.setBackground(new java.awt.Color(19, 62, 135));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(19, 62, 135));
        jLabel13.setText("CONTACTS:");

        jLabel14.setBackground(new java.awt.Color(19, 62, 135));
        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(19, 62, 135));
        jLabel14.setText("MONTLY BILL:");

        jScrollPane2.setViewportView(usernamepane);

        jScrollPane3.setViewportView(passwordpane);

        jScrollPane4.setViewportView(namepane);

        jScrollPane5.setViewportView(contactspane);

        jScrollPane6.setViewportView(monthlypane);

        jScrollPane7.setViewportView(duedatepane);

        jButton1.setBackground(new java.awt.Color(19, 62, 135));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.setPreferredSize(new java.awt.Dimension(83, 24));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(19, 62, 135));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RELOAD");
        jButton2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(19, 62, 135));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("CHANGE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(19, 62, 135));
        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel14)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 19, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(roompane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(roompane)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("STHupo", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("EDIT ROOM DETAIL");

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(19, 62, 135));
        jButton5.setText("EXIT");
        jButton5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(19, 62, 135));
        jButton6.setText("HOME");
        jButton6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void roompaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roompaneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roompaneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String room = (String) roompane.getSelectedItem();
String name = namepane.getText();
String contacts = contactspane.getText();
String monthly = monthlypane.getText();
String duedate = duedatepane.getText();
String username = usernamepane.getText();
String password = passwordpane.getText();

if (room == null || name.isEmpty() || contacts.isEmpty() || monthly.isEmpty() || duedate.isEmpty() || username.isEmpty() || password.isEmpty()) {
    JOptionPane.showMessageDialog(this, "Please complete all the information.", "Warning", JOptionPane.WARNING_MESSAGE);
    return;
}

// Query to check how many rooms are occupied
String countQuery = "SELECT COUNT(*) FROM ronmeltb WHERE username IS NOT NULL"; 
String occupiedRoomQuery = "SELECT COUNT(*) FROM ronmeltb WHERE room = ? AND username IS NOT NULL"; 
String shiftRoomsQuery = "UPDATE ronmeltb SET room = room + 1 WHERE room < 5 AND username IS NOT NULL"; 

int response = 0;

// Confirmation before performing action
int adminResponse = JOptionPane.showConfirmDialog(this, "Are you sure you want to add", "Confirm Action", JOptionPane.YES_NO_OPTION);
if (adminResponse == JOptionPane.YES_OPTION) {
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ronmeldb", "root", "ronmel06");
         PreparedStatement countPst = con.prepareStatement(countQuery);
         PreparedStatement occupiedPst = con.prepareStatement(occupiedRoomQuery)) {

        // Check how many rooms are occupied
        ResultSet countResult = countPst.executeQuery();
        int totalRoomsOccupied = 0;
        if (countResult.next()) {
            totalRoomsOccupied = countResult.getInt(1);
        }

        // If there are already 5 rooms occupied with actual users
        if (totalRoomsOccupied >= 5) {
            JOptionPane.showMessageDialog(this, "All rooms are occupied. Cannot add new user.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Check if the specified room is already occupied
        occupiedPst.setString(1, room);
        ResultSet occupiedResult = occupiedPst.executeQuery();
        boolean isRoomOccupied = false;
        if (occupiedResult.next()) {
            isRoomOccupied = occupiedResult.getInt(1) > 0;
        }

        // If the room is occupied, show a message
        if (isRoomOccupied) {
            JOptionPane.showMessageDialog(this, "The room is already occupied.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Handle the insertion if we are adding a user to room 5
        if (room.equals("6")) {
            // Shift rooms 1-4 up by 1
            try (PreparedStatement shiftPst = con.prepareStatement(shiftRoomsQuery)) {
                shiftPst.executeUpdate();
            }
        }
        // Room is free or new room has been added, proceed to update/insert data
        String updateQuery = "UPDATE ronmeltb SET username = ?, password = ?, name = ?, contacts = ?, monthly = ?, duedate = ? WHERE room = ?";
        
        try (PreparedStatement pst = con.prepareStatement(updateQuery)) {
            // Set parameters for the update
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, name);
            pst.setString(4, contacts);
            pst.setString(5, monthly);
            pst.setString(6, duedate);
            pst.setString(7, room);

            // Execute the update query
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this, "User Data Updated Successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Insert a new user if the update didn't affect any rows
                String insertQuery = "INSERT INTO ronmeltb (username, password, room, name, contacts, monthly, duedate) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement insertPst = con.prepareStatement(insertQuery)) {
                    insertPst.setString(1, username);
                    insertPst.setString(2, password);
                    insertPst.setString(3, room);
                    insertPst.setString(4, name);
                    insertPst.setString(5, contacts);
                    insertPst.setString(6, monthly);
                    insertPst.setString(7, duedate);

                    insertPst.executeUpdate();
                   
                    
                    // Clear the input fields
                    namepane.setText("");
                    contactspane.setText("");
                    monthlypane.setText("");
                    duedatepane.setText("");
                    usernamepane.setText("");
                    passwordpane.setText("");
                }
            }
        }
    } catch (SQLException e) {
    JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
}
} else {
    // No action taken if the admin selected "No"
 
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String roomNumber = (String) roompane.getSelectedItem();
String selectQuery = "SELECT username, password, name, contacts, monthly, duedate FROM ronmeltb WHERE room = ?";
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ronmeldb", "root", "ronmel06");
         PreparedStatement pst = con.prepareStatement(selectQuery)) {
        
        pst.setString(1, roomNumber);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Populate the panes with existing details
            usernamepane.setText(rs.getString("username"));
            passwordpane.setText(rs.getString("password"));
            namepane.setText(rs.getString("name"));
            contactspane.setText(rs.getString("contacts"));
            monthlypane.setText(rs.getString("monthly"));
            duedatepane.setText(rs.getString("duedate"));
        } else {
            JOptionPane.showMessageDialog(this, "No Client Found", "Info", JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
    } catch (SQLException e) {
        usernamepane.setText("Error loading room details: " + e.getMessage());
    }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// Show a confirmation dialog to the admin
int response = JOptionPane.showConfirmDialog(this, 
    "Are you sure you want to update this user data?", 
    "Confirm Update", 
    JOptionPane.YES_NO_OPTION);
    
if (response == JOptionPane.YES_OPTION) {
    // Proceed with collecting data and updating the database
    String username = usernamepane.getText();
    String password = passwordpane.getText();
    String name = namepane.getText();
    String contacts = contactspane.getText();
    String monthly = monthlypane.getText();
    String duedate = duedatepane.getText();
    String room = (String) roompane.getSelectedItem();

    // Prepare the update query
    String updateQuery = "UPDATE ronmeltb SET username = ?, password = ?, name = ?, contacts = ?, monthly = ?, duedate = ? WHERE room = ?";
    
    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ronmeldb", "root", "ronmel06");
         PreparedStatement pst = con.prepareStatement(updateQuery)) {
        
        // Set parameters for the update
        pst.setString(1, username);
        pst.setString(2, password);
        pst.setString(3, name);
        pst.setString(4, contacts);
        pst.setString(5, monthly);
        pst.setString(6, duedate);
        pst.setString(7, room); // Update for the specified room

        // Execute the update query
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            
        } else {
            JOptionPane.showMessageDialog(this, "There's no existing data to change.", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        usernamepane.setText("Error updating user data: " + e.getMessage());
    }
} else {
   
}

}

// Method to clear the input fields
private void clearFields() {
    namepane.setText("");
    contactspane.setText("");
    monthlypane.setText("");
    duedatepane.setText("");
    usernamepane.setText("");
    passwordpane.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
String room = (String) roompane.getSelectedItem();

// Prompt for confirmation before deletion
int confirmation = JOptionPane.showConfirmDialog(this, 
    "Are you sure you want to delete the data?", 
    "Confirm Deletion", 
    JOptionPane.YES_NO_OPTION);

if (confirmation == JOptionPane.YES_OPTION) {
    // Proceed with the delete query
    String deleteQuery = "DELETE FROM ronmeltb WHERE room = ?";

    try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ronmeldb", "root", "ronmel06");
         PreparedStatement deletePst = con.prepareStatement(deleteQuery)) {

        // Set room parameter for deletion
        deletePst.setString(1, room);

        // Execute the delete query
        int rowsDeleted = deletePst.executeUpdate();

        if (rowsDeleted > 0) {
            
            
            // Now proceed to update the data if necessary
            String username = usernamepane.getText();
            String password = passwordpane.getText();
            String name = namepane.getText();
            String contacts = contactspane.getText();
            String monthly = monthlypane.getText();
            String duedate = duedatepane.getText();

            // Prepare the update query
            String updateQuery = "INSERT INTO ronmeltb (username, password, name, contacts, monthly, duedate, room) VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Additional code for executing the insert goes here...
            namepane.setText("");
                    contactspane.setText("");
                    monthlypane.setText("");
                    duedatepane.setText("");
                    usernamepane.setText("");
                    passwordpane.setText("");

        } else {
            JOptionPane.showMessageDialog(this, "There's no data existed in the room", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException e) {
        usernamepane.setText("Error updating/deleting user data: " + e.getMessage());
    }
} else {
    
}

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       int response = JOptionPane.showConfirmDialog(null,
            "Do you want to proceed?",
            "Confirm",
            JOptionPane.YES_NO_OPTION);

        // Handle the user's response
        if (response == JOptionPane.YES_OPTION) {
            new Escape().home();
        } else{

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

class Escape{
    public void home(){
        dispose();
    }
}

class homeRefresh extends Escape{
    @Override
    public void home(){
        dashboard dash = new dashboard();
        dash.setVisible(true);
        dispose();

        try {
            dash.setTextPane();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(change.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(change.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
homeRefresh goHome = new homeRefresh();
goHome.home();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(change.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new change().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane contactspane;
    private javax.swing.JTextPane duedatepane;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane monthlypane;
    private javax.swing.JTextPane namepane;
    private javax.swing.JTextPane passwordpane;
    private javax.swing.JComboBox<String> roompane;
    private javax.swing.JTextPane usernamepane;
    // End of variables declaration//GEN-END:variables

}