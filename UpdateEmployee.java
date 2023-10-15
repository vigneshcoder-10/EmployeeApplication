package Emp;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployee {

public static void update() throws SQLException {
		
		Driver driver=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(driver);
	Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/employee?user=root&password=root");
	
	System.out.println("what you want to upate \n1.Name\n2.Designation\n3.salary\n4.Name,Designation\n5.Name,salary\n6.Designation,salary\n7.Name,desinaton,salary");
	int num=handleException.check5(InsertEmployee.s.next());
	String designation="";String name="";double salary=0.0;
	switch(num) {
	case 1:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		System.out.println("Enter name of an Employee");
		
		 name=handleException.check2(InsertEmployee.s.next());
		PreparedStatement  pstmt=con.prepareStatement("update emp set ename=? where id=?");
		pstmt.setString(1, name);
		pstmt.setInt(2, num);
		pstmt.execute();
		System.out.println("Updated Successfully");
		System.out.println("-------------------------------------------------");
		break;
	case 2:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		System.out.println("Enter designation of an Employee");
		 designation=handleException.check2(InsertEmployee.s.next());
		PreparedStatement  pstmt1=con.prepareStatement("update emp set job=? where id=?");
		pstmt1.setString(1, designation);
		pstmt1.setInt(2, num);
		pstmt1.execute();
		System.out.println("Updated Successfully");
		System.out.println("-------------------------------------------------");
		break;
	case 3:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		System.out.println("Enter salary of an Employee");
		 salary=handleException.check3(InsertEmployee.s.next());
		PreparedStatement  pstmt2=con.prepareStatement("update emp set salary=? where id=?");
		pstmt2.setDouble(1, salary);
		pstmt2.setInt(2, num);
		pstmt2.execute();
		System.out.println("Updated Successfully");
		System.out.println("-------------------------------------------------");
		break;
	case 5:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		System.out.println("Enter name of an Employee");
		 name=handleException.check2(InsertEmployee.s.next());
		 System.out.println("Enter salary of an Employee");
		 salary=handleException.check3(InsertEmployee.s.next());
		 PreparedStatement  pstmt5=con.prepareStatement("update emp set name=?, salary=? where id=?");
			pstmt5.setString(1, name);
			pstmt5.setDouble(2, salary);
			pstmt5.setInt(3, num);
			pstmt5.execute();
			System.out.println("Updated Successfully");
			System.out.println("-------------------------------------------------");
			break;

	case 4:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		System.out.println("Enter name of an Employee");
		
		 name=handleException.check2(InsertEmployee.s.next());
		System.out.println("Enter designation of an Employee");
		 designation=handleException.check2(InsertEmployee.s.next());
		PreparedStatement  pstmt4=con.prepareStatement("update emp set ename=?, job=? where id=?");
		pstmt4.setString(1, name);
		pstmt4.setString(2, designation);
		pstmt4.setInt(3, num);
		pstmt4.execute();
		System.out.println("Updated Successfully");
		System.out.println("-------------------------------------------------");
		break;
	case 6:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		 System.out.println("Enter designation of an Employee");
			 designation=handleException.check2(InsertEmployee.s.next());
			 System.out.println("Enter salary of an Employee");
			 salary=handleException.check3(InsertEmployee.s.next());
			 PreparedStatement  pstmt6=con.prepareStatement("update emp set job=?, salary=? where id=?");
				pstmt6.setString(1, designation);
				pstmt6.setDouble(2, salary);
				pstmt6.setInt(3, num);
				pstmt6.execute();
				System.out.println("Updated Successfully");
				System.out.println("-------------------------------------------------");
				break;
	case 7:
		System.out.println("Enter Id of An Employee you want to update ");
		 num=handleException.check5(InsertEmployee.s.next());
		System.out.println("Enter name of an Employee");
		
		 name=handleException.check2(InsertEmployee.s.next());
		System.out.println("Enter designation of an Employee");
		 designation=handleException.check2(InsertEmployee.s.next());
		 System.out.println("Enter salary of an Employee");
		 salary=handleException.check3(InsertEmployee.s.next());
		 PreparedStatement  pstmt7=con.prepareStatement("update emp set ename=?, job=?,salary=? where id=?");
		    pstmt7.setString(1,name);
			pstmt7.setString(2, designation);
			pstmt7.setDouble(3, salary);
			pstmt7.setInt(4, num);
			pstmt7.execute();
			System.out.println("Updated Successfully");
			System.out.println("-------------------------------------------------");
			break;
	}	
}	
}

