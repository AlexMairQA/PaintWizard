package paintWizard;

public class Paint {
	private double price;
	private String brand;
	private double areaPerLitre;
	private double canSize;
	private int noOfCans;
	public Paint(double price, String brand, double areaPerLitre, double canSize) {
		super();
		this.price = price;
		this.brand = brand;
		this.areaPerLitre = areaPerLitre;
		this.canSize = canSize;
	}
	
		
	public int getNoOfCans() {
		
		return noOfCans;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	public double getAreaPerLitre() {
		return areaPerLitre;
	}
	public double getCanSize() {
		return canSize;
	}
	
	public double getTotalPrice() {
		int totalPriceInt= noOfCans*(int)(price*100);
		double totalPrice=((double)totalPriceInt)/100;
		return totalPrice;
	}
	public void calculateNoOfCans(double roomInSquareMeters){
		noOfCans=(int) (roomInSquareMeters/(areaPerLitre*canSize))+1;
	
	}

}
