package Emp;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;


public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		boolean flag=true;
		while(flag) {
			System.out.println("------------------------------------------------");
			
			System.out.println("                  ADMIN             ");
			
			System.out.println("------------------------------------------------");
		
		System.out.println("1. Enter 1 for Insert");
		
		System.out.println("2. Enter 2 for Delete");
		
		System.out.println("3. Enter 3 for Update");
		
		System.out.println("4. Enter 4 for ViewDetails");
		
		System.out.println("5. Enter 5 for Exit");
		
		int check= handleException.check(InsertEmployee.s.next());
		
		switch(check) {
		case 1:
			try {
				InsertEmployee.insert();
				System.out.println("Inserted Successfully!!");
				System.out.println("----------------------------------------------------");
			}
			catch(SQLIntegrityConstraintViolationException sq) {
				System.out.println("Enter Valid Details ");
				
				InsertEmployee.insert();
				
			}
			break;
		case 2:
			DeleteEmployee.delete();
			System.out.println("Deleted!!");
			System.out.println("--------------------------------");
			break;
		case 3:
			UpdateEmployee.update();
			System.out.println("Updated sucessfully");
			System.out.println("-----------------------------------");
			break;
		case 4:
			RetrieveDetails.retrive();
			System.out.println("retrieved sucessfully");
			System.out.println("-----------------------------------");
			break;
		case 5:
			flag=false;
			
	}
		}
		
	}
}
