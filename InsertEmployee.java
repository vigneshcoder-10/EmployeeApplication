package Emp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class InsertEmployee {

	
 static  Scanner s=new Scanner(System.in);
	 
public static void insert() throws SQLException {
	
	Driver driver=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(driver);
Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
	
	PreparedStatement pstmt=con.prepareStatement("insert into emp values(?,?,?,?)");

	System.out.println("Enter id of an Employee");
	int id=handleException.check1(s.next());
	pstmt.setInt(1, id);
	
	System.out.println("Enter name of an Employee");
	String name=handleException.check2(s.next());
	pstmt.setString(2, name.replace(" ", ""));
	
	System.out.println("Enter designation of an Employee");
	String designation=handleException.check4(s.next());
	pstmt.setString(3, designation.replace(" ", ""));
	System.out.println("Enter Salary of an Employee");
	double salary=handleException.check3(s.next());
	pstmt.setDouble(4, salary);
      pstmt.execute();
	
}
}