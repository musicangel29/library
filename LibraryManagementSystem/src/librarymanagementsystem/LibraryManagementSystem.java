
package librarymanagementsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import com.sun.glass.events.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class LibraryManagementSystem {
    
    static Connection conn = null;
    
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "";
    static final String DB_NAME = "db_library";
    static final String DB_URL = "jdbc:mysql://localhost:3306/";
    
    public static Connection getConnection (){
        try {
            int db_exist = 0;
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL + DB_NAME, DB_USERNAME, DB_PASSWORD);
            return conn;
            
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
