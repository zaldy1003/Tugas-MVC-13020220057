package package_0057;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 * Muhammad Afrizaldi Attalah
 * 13020220057
 * A2
 * 
 */

public class database {
    private static Connection con = null;
    public static Connection getConnection() throws Exception{
        if(con == null){
            try{
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MVC_GUI_0057", "root", "");
            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
        return con;
    }
    public static boolean isConnect(){
        try{
            if(getConnection() == null){
                return false;
            }
        }catch(Exception ex){
            Logger.getLogger(database.class.getName()).log(Level.SEVERE,null,ex);         
        }
        return true;
    }
    
}
