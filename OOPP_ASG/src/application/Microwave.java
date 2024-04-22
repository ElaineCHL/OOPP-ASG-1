package application;

public class Microwave extends Product {

	// if is extend abstract class need to have constructor
	// then only can abstract method of class
	private double Weight, Height, Length;
	private String Feature;

	// Default Constructor
	public Microwave() {

	}

	// Constructor
	public Microwave(String nm, double w, double h, double l, int ITnum, int qt, double prc, String f) {
		super(ITnum, nm, qt, prc);
		Weight = w;
		Height = h;
		Length = l;
		Feature = f;
	}

	// Set & Get the feature
	public void setFeature(String nf) {
		Feature = nf;
	}

	public String getFeature() {
		return Feature;
	}

	// Set&Get the ModelNum
	public void setModelNum(int no) {
		super.setItemNum(no);
	}

	public int getModelNNum() {
		return super.getItemNum();
	}

	// Set & Get the size of Microwave
	public void setSize(double w, double h, double l) {
		Weight = w;
		Height = h;
		Length = l;

	}

	public String getSize() {
		String a = ("The Length is " + Double.toString(Length) + "cm. \n");
		String b = ("The Height is " + Double.toString(Height) + "cm.\n");
		String c = ("The Weight is " + Double.toString(Weight) + "cm.");

		return (a + b + c);
	}

	// Set & Get Price
	public void setMicroPrice(double pc) {
		super.setPrice(pc);
	}

	public double getMicroPrice() {
		return super.getPrice();
	}

	// Update OR Get the Quantity
	public void UpdateMicroQuantity(int n, boolean st) { // every call the quantity increase
		if (super.getStatus()) {
			if (st)
				super.setQty(getQty() + n);
			else
				super.setQty(getQty() - n);
		}

		else
			System.out.println("This Microwave Model is Unavailable");

	}

	public int getMicroQuantity() {
		return super.getQty();
	}

	// Update Status
	public void UpdateStatus(boolean b) {
		super.setStatus(b);
	}

	public String getMicroStatus() {
		if (super.getStatus())
			return "Available";
		else
			return "Not Available";
	}

	// Set & get the Warranty of Microwave & info
	public void setMicroWarranty(int du) {
		Warranty warranty = new Warranty(du);

	}

	public int getMicroWarranty() {
		return Warranty.getDuration();
	}

	// Override
	public String toString() {
		String a = ("ItemNo: " + super.getItemNum() + "\nProductName: " + super.getName() + "\nSales Status: "
				+ getMicroStatus() + "\nPrice: RM" + super.getPrice() + " \n" + getSize() + "\nFeature: " + getFeature());
		String b = ("\nThe Warranty Duration is " + getMicroWarranty() + " years.");
		return a + b;
	}
}
