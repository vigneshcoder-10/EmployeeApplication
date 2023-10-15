package Emp;

import java.util.InputMismatchException;

public class handleException {

	public static int check(String num) {
		boolean res=true;
		while(res) {
			try {
			if((num.equals("1")||num.equals("2")||num.equals("3")||num.equals("4")||num.equals("5"))) {
				res=false;
				
			}
			else {
				System.out.println("Enter valid number");
				num=InsertEmployee.s.next();
			}
			}catch(InputMismatchException i) {
				System.out.println("Enter valid number");
				num=InsertEmployee.s.next();
			}
		}
		return Integer.parseInt(num) ;
	}
	public static int check5(String num) {
		boolean res=true;
		while(res) {
			try {
			if((num.equals("1")||num.equals("2")||num.equals("3")||num.equals("4")||num.equals("5")||num.equals("6")||num.equals("7"))) {
				res=false;
				
			}
			else {
				System.out.println("Enter valid number");
				num=InsertEmployee.s.next();
			}
			}catch(InputMismatchException i) {
				System.out.println("Enter valid number");
				num=InsertEmployee.s.next();
			}
		}
		return Integer.parseInt(num) ;
	}
	public static int check1(String num1)  {
		boolean res=true;
		int num=0;
		while(res) {
			try {
			num=Integer.parseInt(num1);
			res=false;
			}
			catch(NumberFormatException n) {
				
			System.out.println("Enter valid number");
				num1=InsertEmployee.s.next();
			}
		}
		return num;
	}
	public static String check2(String num1)  {
		boolean res=true;
		int num=0;
		String s2=num1;
		while(res) {
			try {
			num=Integer.parseInt(num1);
			if(num>=Integer.MIN_VALUE&&num<=Integer.MAX_VALUE) {
				System.out.println("Enter valid name");
				num1=InsertEmployee.s.next();
			}
			
			}
			catch(NumberFormatException n) {
				s2=num1;
				res=false;
				
			}
		}
		
		return s2;
	}
	public static String check4(String num1)  {
		boolean res=true;
		int num=0;
		String s2=num1;
		while(res) {
			try {
			num=Integer.parseInt(num1);
			if(num>=Integer.MIN_VALUE&&num<=Integer.MAX_VALUE) {
				System.out.println("Enter valid designation");
				num1=InsertEmployee.s.next();
			}
			
			}
			catch(NumberFormatException n) {
				s2=num1;
				res=false;
				
			}
		}
		
		return s2;
	}
	public static double check3(String num1)  {
		boolean res=true;
		double num=0;
		while(res) {
			try {
			num=Double.parseDouble(num1);
			res=false;
			}
			catch(NumberFormatException n) {
				
			System.out.println("Enter proper salary");
				num1=InsertEmployee.s.next();
			}
		}
		return num;
	}
}
