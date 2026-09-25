/**
 * MAIN
 */
import java.sql.*;
public class MAIN {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/employee_management_system";
        String user="root";
        String password="Ahg@286!#$&";
        Connection connect=DriverManager.getConnection(url,user,password);
       
        System.out.println("sucess");

        
        connect.close();
        
        }
        catch(SQLException ee)
        {
            ee.printStackTrace();
        }
        catch(ClassNotFoundException ss)
        {
            ss.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }

}
