package practice4;

public class Horse {
	private String name;
	private double height;
	private double weight;
	private int yearBorn;
	private String color;
	private String breed;
	
	// constructor     
	Horse(String name, double height, double weight, int yearBorn, 
			String color, String breed) {
		
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.yearBorn = yearBorn;
		this.color = color;
		this.breed = breed;
	}
		
	// setter for name
	public void setName(String name) {
		this.name = name; //read user input
	}
	
	// setter for height
	public void setHeight(double height) {
		this.height = height; //read user input
	}
	
	// setter for weight
	public void setWeight(double weight) {
		this.weight = weight; //read user input
	}
	
	// setter for yearBorn
	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn; //read user input
	}
	
	// setter for color
	public void setColor(String color) {
		this.color = color; //read user input
	}
	
	// setter for breed
	public void setBreed(String breed) {
		this.breed = breed; //read user input
	}
	
	// getter for name
	public String getName() {
		return name; // output name
	}
	
	// getter for height
	public double getHeight() {
		return height; // output name
	}
	
	// getter for weight
	public double getWeight() {
		return weight; // output name
	}
	
	// getter for yearBorn
	public int getYearBorn() {
		return yearBorn; // output name
	}
	
	// getter for color
	public String getColor() {
		return color; // output name
	}
	
	// getter for breed
	public String getBreed() {
		return breed; // output name
	}
	
	@Override
	public String toString() {
		return ("\n Race Horse Name: " + this.getName() + ", Height: " + this.getHeight() + ", Weight: " + this.getWeight() + ", Year born: " + this.getYearBorn() + ", Color: " + this.getColor() + ", Breed:" + this.getBreed() + "\n" + "======");
	}
	
}
