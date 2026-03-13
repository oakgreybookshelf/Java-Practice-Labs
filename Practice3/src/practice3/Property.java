package lab3;

public class Property {
	private int sqFeet;
	private String address;
	private String zip;
	private String location;
	private int daysOnMarket;
	private double price;
	private int lotsize;
	private String status;
	private double latitude;
	private double longitude;
	
	// constructor
	public Property(int sqFeet, String address, String zip, String location, int daysOnMarket, double price, int lotsize, String status, double latitude, double longitude) {
		
		this.sqFeet = 0;
		this.address = "address";
		this.zip = "zip";
		this.location = "loca";
		this.daysOnMarket = 19;
		this.price = 13.3;
		this.lotsize = 100;
		this.status = "avail";
		this.latitude = 101.2;
		this.longitude = 101.3;
		
	}
	
	// setter for sqFeet
	public void setsqFeet(int sqFeet) {
		this.sqFeet = sqFeet; //read user input
	}
	
	// setter for address
	public void setaddress(String address) {
		this.address = address; //read user input
	}
	
	// setter for zip
	public void setzip(String zip) {
		this.zip = zip; //read user input
	}
	
	// setter for location
	public void setlocation(String location) {
		this.location = location; //read user input
	}
	
	// setter for daysOnMarket
	public void setdaysOnMarket(int daysOnMarket) {
		this.daysOnMarket = daysOnMarket; //read user input
	}
	
	// setter for price
	public void setprice(double price) {
		this.price = price; //read user input
	}
	
	// setter for lotsize
	public void setlotsize(int lotsize) {
		this.lotsize = lotsize; //read user input
	}
	
	// setter for status
	public void setstatus(String status) {
		this.status = status; //read user input
	}
	
	// setter for latitude
	public void setlatitude(double latitude) {
		this.latitude = latitude; //read user input
	}
	
	// setter for longitude
	public void longitude(double longitude) {
		this.longitude = longitude; //read user input
	}
	
	/***********************   GETTERS    ***************************************************************/
	
	// getter for sqFeet
	public int getsqFeet() {
		return sqFeet; // output name
	}
	
	// getter for address
	public String getaddress() {
		return address; // output name
	}
	
	// getter for zip
	public String getzip() {
		return zip; // output name
	}
	
	// getter for location
	public String getlocation() {
		return location; // output name
	}
	
	// getter for daysOnMarket
	public int getdaysOnMarket() {
		return daysOnMarket; // output name
	}
	
	// getter for price
	public Double getprice() {
		return price; // output name
	}
	
	// getter for lotsize
	public int getlotsize() {
		return lotsize; // output name
	}	
	
	// getter for status
	public String getstatus() {
		return status; // output name
	}
	
	// getter for latitude
	public double getlatitude() {
		return latitude; // output name
	}
	
	// getter for longitude
	public Double getlongitude() {
		return longitude; // output name
	}
	
	
}
