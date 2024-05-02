
package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class MyConnection {
    //public static final String username = "root";
    //public static final String password = "2376";
    //public static final String url = "jdbc:mysql://localhost:3306/second_hand_selling";
    
   
    public static Connection con = null;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/SymbiosisClassifieds","root","Aayusha16#TK");
            System.out.println("Connection Established");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,""+ex,"",JOptionPane.WARNING_MESSAGE);
        }
        return con;
    }
}
 