package Emp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrieveDetails {
public static void retrive() throws SQLException {
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
	PreparedStatement pstmt=con.prepareStatement("select * from emp ");
	ResultSet rs=pstmt.executeQuery();
	System.out.println("-------------------------------------------------------------------------");
	System.out.println("ID     Name       JOB                      Salary");
	System.out.println("------------------------------------------------------------------------");
	while(rs.next()) {
		
		System.out.println(rs.getInt(1)+"    |    "+rs.getString(2)+"     |    "+rs.getString(3)+"    |  "+rs.getString(4));

		System.out.println("-------------------------------------------------------------------------");
		
	}
	
}
}
