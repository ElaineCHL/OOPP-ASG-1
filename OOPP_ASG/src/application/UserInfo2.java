package application;

import java.util.Scanner;

public class UserInfo2 {
	Scanner sc = new Scanner(System.in);
	private String name;
	private String userID;

	public void promptName() {
//		boolean contains_space = false;
		System.out.println("Please enter your full name: ");
		name = sc.nextLine();
		int index = name.lastIndexOf(' ');

//		for (int i = 0; i < name.length(); i++) {
//			if ((name.charAt(i)) == ' ') {
//				contains_space = true;
//				break;
//			}
//		}
//		if (contains_space) {
//			userID = name.charAt(1) + name.substring(name.lastIndexOf(" ") + 1);
//		} else {
//			userID = "guest";
//		}
		
		if (index == -1) { // 
			userID = "guest";
		}
		else {
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
