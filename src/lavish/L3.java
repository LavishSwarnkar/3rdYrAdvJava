package lavish;
import java.sql.*;
import java.util.Scanner;

public class L3 {
   
    
    public static void main(String[] args) throws SQLException{
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root" , "");
        Statement st = conn.createStatement();
        PreparedStatement pstmt = conn.prepareStatement("update idiots set name=? where id=?;");
        Scanner sc = new Scanner(System.in);
        char ch;
        do{
            System.out.print("Enter name: ");
            String name = sc.next();
            System.out.print("Enter id: ");
            int id = sc.nextInt();
            
            pstmt.setString(1, name);
            pstmt.setInt(2, id);
            
            pstmt.execute();
            
            System.out.print("Do you want to add more entries ? (Y/N) : ");
            ch = sc.next().charAt(0);
        }while(ch != 'N');
    
    }
    
}