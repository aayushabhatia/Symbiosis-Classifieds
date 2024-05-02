/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package user;
import javax.swing.JFrame;
/**
 *
 * @author Aastha Arora
 */
// Define a clickable interface
interface Clickable {
    void onClick();
}

// Define a base class for buttons that extends JButton and implements Clickable
abstract class CustomButton extends javax.swing.JButton implements Clickable {
    // Constructor
    public CustomButton(String text) {
        super(text);
    }

    // Abstract method to be implemented by subclasses
    public abstract void onClick();
}

// Define subclasses for specific button functionalities
class DashboardButton extends CustomButton {
    // Constructor
    public DashboardButton() {
        super("Dashboard");
    }

    // Implementation of onClick method
    @Override
    public void onClick() {
        // Open Dashboard
        new Dashboard().setVisible(true);
        JFrame topLevelFrame = (JFrame) this.getTopLevelAncestor();
        topLevelFrame.dispose();
    }
}

class SecondHandItemsButton extends CustomButton {
    // Constructor
    public SecondHandItemsButton() {
        super("Second Hand Items");
    }

    // Implementation of onClick method
    @Override
    public void onClick() {
        // Open Second Hand Items Dashboard
        new SecondHandItemsDashboard().setVisible(true);
        JFrame topLevelFrame = (JFrame) this.getTopLevelAncestor();
        topLevelFrame.dispose();
    }
}

class EditAdminButton extends CustomButton {
    // Constructor
    public EditAdminButton() {
        super("Edit Admin");
    }

    // Implementation of onClick method
    @Override
    public void onClick() {
        // Open Edit Admin window
        new EditAdmin().setVisible(true);
        JFrame topLevelFrame = (JFrame) this.getTopLevelAncestor();
        topLevelFrame.dispose();
    }
}

class FlatAvailabilityButton extends CustomButton {
    // Constructor
    public FlatAvailabilityButton() {
        super("Flat Availability");
    }

    // Implementation of onClick method
    @Override
    public void onClick() {
        // Open Flat Availability Dashboard
        new FlatAvailabilityDashboard().setVisible(true);
        JFrame topLevelFrame = (JFrame) this.getTopLevelAncestor();
        topLevelFrame.dispose();
    }
}

class LoginButton extends CustomButton {
    // Constructor
    public LoginButton() {
        super("Login");
    }

    // Implementation of onClick method
    @Override
    public void onClick() {
        // Open Login window
        new Login().setVisible(true);
        JFrame topLevelFrame = (JFrame) this.getTopLevelAncestor();
        topLevelFrame.dispose();
    }
}

public class AdminFunctionalities extends javax.swing.JFrame {

    /**
     * Creates new form AdminFunctionalities
     */
    public AdminFunctionalities() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AdminFunctionalities");

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Lost and Found");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 160, 300, 90));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Flat Availability");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 160, 290, 90));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setText("Second Hand Item Selling");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 300, 100));

        b5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b5.setText("Edit Admin");
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });
        jPanel2.add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 290, 290, 100));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin Functionalities");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 24, 520, 67));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("LOGOUT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 6, -1, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/op.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Method to initialize user-defined components
    private void init() {
        // Instantiate custom buttons
        CustomButton dashboardButton = new DashboardButton();
        CustomButton secondHandItemsButton = new SecondHandItemsButton();
        CustomButton editAdminButton = new EditAdminButton();
        CustomButton flatAvailabilityButton = new FlatAvailabilityButton();
        CustomButton loginButton = new LoginButton();

        // Set positions and add buttons to the jPanel2
        // Omitted for brevity
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new SecondHandItemsDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        // TODO add your handling code here:
        EditAdmin ed= new EditAdmin();
        ed.setVisible(true);
    }//GEN-LAST:event_b5MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        FlatAvailabilityDashboard fad=new FlatAvailabilityDashboard();
        fad.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(AdminFunctionalities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminFunctionalities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminFunctionalities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminFunctionalities.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AdminFunctionalities().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
