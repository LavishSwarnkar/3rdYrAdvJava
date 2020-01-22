package lavish;
import java.sql.*;

public class L2 {

    public static void main(String[] args) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lavish"
                , "root"
                , "");
        Statement st = conn.createStatement();
        
        ResultSet set = st.executeQuery("Select * from idiots");
        while(set.next())
            System.out.println(set.getString(1) + "\t" + set.getString(2));
    }
    
}
