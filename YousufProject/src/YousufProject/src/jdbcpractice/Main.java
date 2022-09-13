package jdbcpractice;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        // There are 3 steps to connect to database using jdbc
        // step1 : Create Connection Object
        //step 2 : Create Statement Object
        //step 3 : execute Query
        // step 4 : close connection
        try {
            Connection c = DriverManager.
                     getConnection("databse_url", "username", "password");
            //mysql Connection c= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","john","p");
            Statement s = c.createStatement();
             s.executeQuery("database_query");
             c.close();
        }
        catch (Exception e){

        }
    }
}
