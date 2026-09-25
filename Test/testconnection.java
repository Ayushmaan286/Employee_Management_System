import java.sql.*;

import util.jdbc_utility;
public class testconnection {

    // check whether environmental variables are working or not 
    public static void main(String[] args) {
        Connection con=jdbc_utility.get_connection();
        if(con!=null)
        {
            System.out.println("success fully used enviromental variables");
        }
        else
        {
            System.out.println("failed");
        }
    }
    
}
