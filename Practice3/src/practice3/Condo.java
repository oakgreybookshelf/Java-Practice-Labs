package practice3;

public class Condo extends Lodging{
	
	// constructor
	Condo(int sqFeet, String address, String zip, String location, int daysOnMarket, double price, int lotsize, String status, double latitude, double longitude, int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot) {
		super(0, "address", "zip", "loca", 19, 13.3, 0, "avail", 101.2, 101.3, 1, 2, 3, 4);
		
		super.setlotsize(0);
	}
}
