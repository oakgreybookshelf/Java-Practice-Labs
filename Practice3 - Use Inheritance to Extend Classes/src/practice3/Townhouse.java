package practice3;

public class Townhouse extends Lodging {
	
	private double hoaFee;
	
	// constructor
	Townhouse(int sqFeet, String address, String zip, String location, int daysOnMarket, double price, int lotsize, String status, double latitude, double longitude, int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot) {
		super(0, "address", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 1, 2, 3, 4);
		this.hoaFee = 34.4;
		super.setlotsize(0);
	}

	// getter for hoaFee
	public double gethoaFee() {
		return hoaFee; // output name
	}
}
