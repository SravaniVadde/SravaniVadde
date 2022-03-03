package demo;
import java.sql.*;
public class ConnectMe
{
public static void main(String[] args)
{
try
{
     Class.forName("oracle.jdbc.driver.OracleDriver");
     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr","hr");
     Statement stmt=con.createStatement();
     ResultSet rs = stmt.executeQuery("select * from Departments");
   while(rs.next())
   {
     System.out.println(rs.getString(1)+" "+rs.getString(2));
    }
 }
catch (ClassNotFoundException e)
{
   System.out.println("Driver Not Found");
} catch (SQLException e) {
   System.out.println("Connection Error "+e.getMessage());
}
}
}