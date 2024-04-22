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

	public static void main(String[] args) throws IOException {

		ArrayList<Product> list = new ArrayList<Product>();

		list.add(new TV(1, "Samsung QLED 4K TV", "QLED", "4K Ultra HD", 55, 4, 9000.00, true));
		list.add(new TV(2, "Vizio Quantum X Ultra HD TV", "QLED", " 4K Ultra HD", 60, 6, 8500.00, true));
		list.add(new Microwave("LG NeoChef Countertop Microwave", 55.80, 40.10, 60.70, 3, 8, 500.00,
				"SmoothTouch glass controls, hexagonal stable turntable"));
		list.add(new Refrigerator(4, "GE Bottom Freezer Refrigerator", "Bottom freezer drawer with French doors",
				"Slate Gray", 730, 2, 2500.00, true));
		list.add(new TV(5, "ONY Bravia 8K HDR TVV", "LED", " 8K Ultra HD", 702, 0, 8800.0, true));
		list.add(new Refrigerator(6, "Frigidaire Top Mount Freezer Refrigerator",
				"Top freezer with single door refrigerator", "Black", 488, 3, 1800.00, true));
		list.add(new Microwave("Panasonic Genius Sensor Microwave", 76.50, 53.70, 45.65, 7, 1, 450.00,
				"Inverter Turbo Defrost, Genius Sensor cooking"));

		String name;
		int menuChoice;

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

		UserInfo2 user = new UserInfo2();
		user.promptName();

		System.out.print("\nDo you want to add any products? (y/n): ");
		String exit = sc.next();

		if (exit.equals("y") || exit.equals("Y")) {
			int num = getMaxProducts(sc);
			while (num > 0) {
				// displayAndSelectProduct(list, sc);
				addProduct(list, sc);
				num--;
				if (num != 0) {
					System.out.println("\n" + num + " more products to go!");
				} else {
					System.out.println("\nAll done!");
					System.out.println("\nPress enter to continue...");
					sc.nextLine();
					sc.nextLine();
				}
			}
		}

		do {
			menuChoice = displayMenu(sc);
			setMenu(menuChoice, list, sc);
		} while (menuChoice != 0);
		System.out.printf("\nName: %s", user.getName());
		System.out.printf("\nUserID: %s", user.getUserID());

		System.out.println("\n\nSuccessfully exited!");

		sc.close();
	}

	public static int getMaxProducts(Scanner scanner) {
		System.out.println("How many products do you wish to add?");
		int maxProducts;
		while (true) {
			if (scanner.hasNextInt()) {
				int input = scanner.nextInt();
				if (input < 0) {
					System.out.println("Please enter a valid positive integer.");
				} else {
					maxProducts = input;
					break; // Exit the loop if a positive integer is entered
				}
			} else { // when input is double or string
				System.out.println("Invalid input. Please enter a valid integer.");
				scanner.nextLine(); // Clear the invalid input from the scanner
			}
		}
		return maxProducts;
	}

	public static int displayAndSelectProduct(ArrayList<Product> list, Scanner scanner) {

		return 0;
	}

	public static int displayMenu(Scanner sc) throws InputMismatchException {
		System.out.println("\n====================== MENU ======================\n");
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
		switch (choice) {
		case 0:
			return;

		case 1:
			displayProducts(list);
			break;

		case 2:
			addStock(list, scanner);
			break;

		case 3:
			deductStock(list, scanner);
			break;

		case 4:
			discontinueProduct(list, scanner);
			break;
		}
	}

	public static void discontinueProduct(ArrayList<Product> list, Scanner scanner) {

	}

	public static void addProduct(ArrayList<Product> list, Scanner scanner) {
		System.out.println("\n=============== Add Product =================\n");
		System.out.println("1. Refrigerator");
		System.out.println("2. TV");
		System.out.println("3. Microwave");

		System.out.print("\nChoose a product to add (1-3): ");
		int productChoice = scanner.nextInt();
		switch (productChoice) {
		case 1:
			list.add(addRefrigerator(scanner));
			break;
		case 2:
			list.add(addTV(scanner));
			break;
		case 3:
			list.add(addMicrowave(scanner));
			break;
		}
	}

	public static Product addRefrigerator(Scanner scanner) {
		// scanner.nextLine();
		System.out.println("\n~~~~~~~~~~~~~~~~~~ Add Refrigerator ~~~~~~~~~~~~~~~~~~\n");
		scanner.nextLine(); // clear the input buffer

		System.out.print("Enter name of refrigerator: ");
		String name = scanner.nextLine();
		System.out.print("Enter door design: ");
		String doorDesign = scanner.nextLine();
		System.out.print("Enter color: ");
		String color = scanner.nextLine();
		System.out.print("Enter capacity: ");
		int cap = scanner.nextInt();
		System.out.print("Enter quantity available in stock: ");
		int qty = scanner.nextInt();
		System.out.print("Enter price (RM): ");
		double price = scanner.nextDouble();
		System.out.print("Enter item number: ");
		int item_number = scanner.nextInt();
		Product fridge = new Refrigerator(item_number, name, doorDesign, color, cap, qty, price, true);
		return fridge;
	}

	public static Product addTV(Scanner scanner) {
		System.out.println("\n~~~~~~~~~~~~~~~~~~ Add TV ~~~~~~~~~~~~~~~~~~\n");
		scanner.nextLine(); // clear the input buffer
		System.out.print("Enter name of TV: ");
		String name = scanner.nextLine();
		System.out.print("Enter screen type: ");
		String screen_type = scanner.nextLine();
		System.out.print("Enter resolution: ");
		String resolution = scanner.nextLine();
		System.out.print("Enter display size: ");
		int size = scanner.nextInt();
		System.out.print("Enter quantity available in stock: ");
		int qty = scanner.nextInt();
		System.out.print("Enter price (RM): ");
		double price = scanner.nextDouble();
		System.out.print("Enter item number: ");
		int num = scanner.nextInt();
		Product tv = new TV(num, name, screen_type, resolution, size, qty, price, true);
		return tv;
	}

	public static Product addMicrowave(Scanner scanner) {
		System.out.println("\n~~~~~~~~~~~~~~~~~~ Add Microwave ~~~~~~~~~~~~~~~~~~\n");
		scanner.nextLine(); // clear the input buffer
		System.out.print("Enter name of microwave: ");
		String name = scanner.nextLine();
		System.out.print("Enter width (kg): ");
		double width = scanner.nextDouble();
		System.out.print("Enter height (cm): ");
		double height = scanner.nextDouble();
		System.out.print("Enter length (cm): ");
		double length = scanner.nextDouble();
		System.out.print("Enter feature: ");
		scanner.nextLine(); // clear input buffer
		String feature = scanner.nextLine();
		System.out.print("Enter quantity available in stock: ");
		int qty = scanner.nextInt();
		System.out.print("Enter price (RM): ");
		double price = scanner.nextDouble();
		System.out.print("Enter item number: ");
		int num = scanner.nextInt();
		Product microwave = new Microwave(name, width, height, length, num, qty, price, feature);
		return microwave;
	}

	public static void displayProducts(ArrayList<Product> list) {
		System.out.println("\n============ View Products ====================\n");
		if (list.size() == 0) {
			System.out.println("There is no products available...");
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + 1);
			System.out.println(list.get(i) + "\n");
		}
	}

}
