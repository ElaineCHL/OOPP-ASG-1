package application;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// main function
public class StockManagement {

	public static int getMaxProducts(Scanner scanner) {
		System.out.println("How many products do you wish to add?");
		int amount =  scanner.nextInt();
		while (amount < 0) {
			System.out.println("Invalid number! Amount should not be negative");
			amount = scanner.nextInt();
		}
		return amount;
	}

	public static int displayAndSelectProduct(ArrayList<Product> list, Scanner scanner) {

		return 0;
	}

	public static int displayMenu(Scanner sc) throws InputMismatchException {
		System.out.println("\n====================== Menu ======================\n");
		System.out.println(" 1. View Products");
		System.out.println(" 2. Add stock");
		System.out.println(" 3. Deduct stock");
		System.out.println(" 4. Discontinue product");
		System.out.println(" 0. Exit");
		System.out.println("\n==================================================\n");
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
		System.out.println("\n=============== Add Product =================\n");
		System.out.println("1. Refrigerator");
		System.out.println("2. TV");
		System.out.println("3. Microwave");
		System.out.print("Choose a product: ");
		int productChoice = scanner.nextInt();
		
	}
	public static void addRefrigerator(Scanner scanner) {
		
	}
	public static void addTV(Scanner scanner) {
		
	}
	public static void displayProducts(ArrayList<Product> list) {
		
	}
	
	public static void main(String[] args) throws IOException {
		ArrayList<Product> list = new ArrayList<Product>();
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

		if (exit.equals("y") || exit.equals("Y")) {

			int num = getMaxProducts(sc);
			while (num > 0) {
				addProduct(list, sc);
				num--;
				if(num != 0)
					System.out.println(num + " more products to go!");
				else
					System.out.println("All done!");
			}
			displayAndSelectProduct(list, sc);
			addProduct(null, sc);
		}
		
		displayMenu(sc);

		sc.close();
	}
	
}
