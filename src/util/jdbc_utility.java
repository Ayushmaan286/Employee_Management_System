package util;
import java.sql.*;
public class jdbc_utility {

    static 
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Connection get_connection() 
    {
        try
        {
            String url=System.getenv("DB_URL");
            String user=System.getenv("DB_USER");
            String pass=System.getenv("DB_PASSWORD");
            return DriverManager.getConnection(url,user,pass);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }
    public static void close_connection(Connection conect,PreparedStatement statement)
    {
        try
        {
            statement.close();
            conect.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }

}

