package application;

public class test {
	public static void main(String[] args) {
		UserInfo user1 = new UserInfo();
		user1.promptName();
		System.out.println("Name: " + user1.getName());
		System.out.println("UserID: " + user1.getUserID());
		
		
	}
}
