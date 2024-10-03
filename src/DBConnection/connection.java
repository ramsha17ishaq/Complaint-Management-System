
package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class connection {
    public PreparedStatement pstmt;
    public Statement stmt;
    public ResultSet rs;
    public Connection conn;
    public connection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/complaintmanagementsystem","root","8962");
            stmt = conn.createStatement();
            
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null,"Cannot Establish Connection To The Server.\n"
                    + "Contact Developer or Admin for Support.\nError_Description-"+ex);
        }
    }
}
