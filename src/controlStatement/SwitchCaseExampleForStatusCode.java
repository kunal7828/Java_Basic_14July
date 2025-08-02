package controlStatement;

import java.util.Scanner;

public class SwitchCaseExampleForStatusCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter status code, 200, 300, 400, 401, 403, 404 and 500.");
		int statusCode= sc.nextInt();
	//	System.out.println("User role value: "+userRole);
		
		switch (statusCode) {
		case 200:
		{
			System.out.println("Request success.");
			break;
		}
		case 300:
		{
			System.out.println("Request Redirect");
			break;
		}

		case 400:
		{
			System.out.println("Bad Request");
			break;
		}
		case 404:
		{
			System.out.println("Path Issue");
			break;
		}
		case 401:
		{
			System.out.println("UnAuthorized");
			break;
		}
		case 403:
		{
			System.out.println("Permission issue");
			break;
		}
		case 500:
		{
			System.out.println("Server side issue");
			//break;
		}

		
		default:
		{
			System.out.println("Un expected status code."+statusCode);
			break;
		}
		}
		

	}

}
