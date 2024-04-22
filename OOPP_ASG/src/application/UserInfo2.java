package application;

import java.util.Scanner;

public class UserInfo2 {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String userID;

	public void promptName() {
		System.out.println("Please enter your full name: ");
		name = sc.nextLine();
		int index = name.lastIndexOf(' ');

		if (index == -1) {
			userID = "guest";
		} else {
			userID = name.charAt(0) + name.substring(index + 1);
		}
	}

	public String getName() {
		return name;
	}

	public String getUserID() {
		return userID;
	}
}
