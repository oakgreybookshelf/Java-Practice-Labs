package practice3;

public class Lodging extends Property{
	private int sqFeet;
	private int yearBuilt;
	private int numBeds;
	private int numBaths;
	private double pricePerSqFoot;
	
	// constructor     
	
	Lodging(int sqFeet, String address, String zip, String location, int daysOnMarket, double price, int lotsize, String status, double latitude, double longitude, 
			int yearBuilt, int numBeds, int numBaths, double pricePerSqFoot) {
		super(0, "address", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3);
		// sqFeet, address, zip, location, daysOnMarket, price, lotsize, status, latitude, longitude)
		
		//this.sqFeet = 0;
		this.yearBuilt = 1;
		this.numBeds = 2;
		this.numBaths = 3;
		this.pricePerSqFoot = 4;
	}
	
	//Lodging prop = new Lodging(0, "address", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 1, 2, 3, 4);	
	
	// setter for sqFeet
	public void setsqFeet(int sqFeet) {
		this.sqFeet = sqFeet; //read user input
	}
	
	// setter for yearBuilt
	public void setyearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt; //read user input
	}
	
	// setter for numBeds
	public void setnumBeds(int numBeds) {
		this.numBeds = numBeds; //read user input
	}
	
	// setter for numBaths
	public void setnumBaths(int numBaths) {
		this.numBaths = numBaths; //read user input
	}
	
	// setter for pricePerSqFoot
	public void setpricePerSqFoot(double pricePerSqFoot) {
		this.pricePerSqFoot = pricePerSqFoot; //read user input
	}	
	
	// getter for sqFeet
	public int getsqFeet() {
		return sqFeet; // output name
	}
	
	// getter for yearBuilt
	public int getyearBuilt() {
		return yearBuilt; // output name
	}
	
	// getter for numBeds
	public int getnumBeds() {
		return numBeds; // output name
	}
	
	// getter for numBaths
	public int getnumBaths() {
		return numBaths; // output name
	}
	
	// getter for pricePerSqFoot
	public Double getpricePerSqFoot() {
		return pricePerSqFoot; // output name
	}
}
