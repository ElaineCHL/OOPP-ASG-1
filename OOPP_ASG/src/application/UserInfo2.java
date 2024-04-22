package application;

import java.util.Scanner;

public class UserInfo2 {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String userID;

	public void promptName() {
		String firstName, surname;
		
		System.out.println("Enter first name: ");
		firstName = sc.nextLine();
		
		System.out.println("Enter surname: ");
		surname = sc.nextLine();
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getUserID() {
		return userID;
	}

}
