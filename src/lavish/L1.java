package lavish;
import java.sql.*;

public class L1 {

    public static void main(String[] args) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lavish"
                , "root"
                , "");
        Statement st = conn.createStatement();
        
        st.executeUpdate("create table idiots(name varchar(10), id int)");
        System.out.println("Success!");
    }
    
}
