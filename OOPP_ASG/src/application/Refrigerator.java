package application;

public class Refrigerator extends Product {
	private String doorDesign;
	private String color;
	private int capacity;
	
	public Refrigerator(int item_num,
			String productName, 
			String doorDesign,
			String color, 
			int capacity,
			int quantity, 
			double price,
			boolean productStatus) {
		super(item_num, productName, quantity, price);
		this.doorDesign = doorDesign;
		this.color = color;
		this.capacity = capacity;
	}
	public String getDoorDesign() {
		return doorDesign;
	}
	public String getColor() {
		return color;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setDoorDesign(String design) {
		doorDesign = design;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public double calcStock() {
		return getPrice() * getQty();
	}
	
	@Override
	public String toString() {
		return "Item number: " + getItemNum()
		+ "\nProduct name: " + getName()
		+ "\nDoor design: " + getDoorDesign()
		+ "\nColor: " + getColor()
		+ "\nCapacity (in Litres): " + getCapacity()
		+ "\nQuantity available: " + getQty()
		+ "\nPrice (RM): " + getPrice()
		+ "\nInventory value (RM): " + getTotalInventoryValue()
		+ "\nProduct status: " + getStatus();
	}
}
