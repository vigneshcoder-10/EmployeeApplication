package Emp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteEmployee {
	public static void delete() throws SQLException {
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
	System.out.println("Enter Id of An Employee you to delete ");
	PreparedStatement pstmt=con.prepareStatement("delete from emp where id=?");
	int id=handleException.check1(InsertEmployee.s.next());
	pstmt.setInt(1,id);
	pstmt.execute();
		
	}
}
