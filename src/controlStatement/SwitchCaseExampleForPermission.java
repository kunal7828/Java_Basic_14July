package controlStatement;

import java.util.Scanner;

public class SwitchCaseExampleForPermission {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user role, like Admin, Viewer, Emp.");
	//	String userRole= sc.nextLine();
	//	System.out.println("User role value: "+userRole);
		
		String userRole= "Viewer";
		
		switch (userRole) {
		case "Admin":
		{
			System.out.println("Welcome admin");
			break;
		}
		case "Viewer":
		{
			System.out.println("Welcome Viewer");
			break;
		}

		case "Emp":
		{
			System.out.println("Welcome Emp");
			break;
		}

		default:
		{
			System.out.println("Please enter the valid role.");
			break;
		}
		}
		

	}

}
