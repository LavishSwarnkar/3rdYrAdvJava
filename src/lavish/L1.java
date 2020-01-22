package lavish;
import java.sql.*;
import java.util.Scanner;

public class L1 {
    
    public static void main(String[] args) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lavish"
                , "root"
                , "");
        Statement st = conn.createStatement();
        
        //st.executeUpdate("create table idiots(name varchar(10), id int)");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of entries: ");
        int noOfEntries = sc.nextInt();
        for(int i=0 ; i<noOfEntries ; i++){
            System.out.print((i+1) + ". Enter name: ");
            String name = sc.next();
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            st.executeUpdate("insert into idiots values('" + name + "'," + id + ")");
        }
        
    }
    
}
