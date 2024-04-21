package application;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

// main function
public class StockManagement {

	Scanner sc = new Scanner(System.in);
	ArrayList<Product> list = new ArrayList<Product>();

	public static int getMaxProducts(Scanner sc) {

		return 0;
	}

	public static int displayAndSelectProduct(ArrayList<Product> list, Scanner sc) {

		return 0;
	}

	public static int displayMenu(Scanner sc) throws InputMismatchException {
		System.out.println("\n====================== Menu ======================\n");
		System.out.println("1. View Products");
		System.out.println("2. Add stock");
		System.out.println("3. Deduct stock");
		System.out.println("4. Discontinue product");
		System.out.println("0. Exit");
		System.out.print("\nPlease enter a menu option: ");
		int option;
		do {
			option = sc.nextInt();
			if (option > 4 || option < 0) {
				System.out.print("Invalid option. Please try again: ");
			}
		} while (option > 4 || option < 0);
		return option;
	}

	public static void addStock(ArrayList<Product> list, Scanner scanner) {

	}
	public static void deductStock(ArrayList<Product> list, Scanner scanner) {

	}
	public static void setStatus(ArrayList<Product> list, Scanner scanner) {

	}
	public static void setMenu(int choice, ArrayList<Product> list, Scanner scanner) {

	}
	
	public static void discontinueProduct(ArrayList<Product> list, Scanner scanner) {
		
	}
	
	public static void addProduct(ArrayList<Product> list, Scanner scanner) {
		
	}
	public static void addRefrigerator(Scanner scanner) {
		
	}
	public static void addTV(Scanner scanner) {
		
	}
	public static void displayProducts(ArrayList<Product> list) {
		
	}
	public static void main(String[] args) throws IOException {

		String name;

		Scanner sc = new Scanner(System.in);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy  HH:mm:ss");
		DayOfWeek dayOfWeek = DayOfWeek.from(LocalDate.now());
		LocalDateTime now = LocalDateTime.now();
		System.out.print(dayOfWeek + "  ");
		System.out.println(dtf.format(now));
		System.out.println("_________________________________________\n");

		System.out.println(" Welcome to SMS Stock Management System!");
		System.out.println("_________________________________________\n");



		System.out.println("\nNames of group member:");
		System.out.println("1. Chai Yee Wen");
		System.out.println("2. Goay Cai Wen");
		System.out.println("3. Elaine Chung Hui Lin");
		System.out.println("4. Michi Chong");

		System.out.println("\nPress enter to continue...");
		sc.nextLine();
		System.out.print("\nPlease enter your full name: ");
		name = sc.nextLine();

		System.out.print("\nDo you want to add any products? (y/n): ");
		String exit = sc.next();

		if (exit.equals("n") || exit.equals("N")) {
			displayMenu(sc);

		} else {
			// add product function
			addProduct(null, sc);
			
			// display menu
			displayMenu(sc);

		}
		sc.close();
	}
	
}
