package lab6;

public class Crop implements Comparable<Crop>{
	
	private String name;
	private int growTime;
	
	// constructor
	public Crop(String name, int length) {
		this.name = name;
		this.growTime = length;
	}
	
	// getters and setters
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGrowTime(int length) {
		this.growTime = length;
	}
	
	public String getName() {
		return name;
	}
	
	public int getGrowTime() {
		return growTime;
	}
	
	// method to allow printing class info
	@Override
	public String toString() {
		return "Name: " + name + " Growing season in days: " + growTime; 
	}
	
	// implementing comparable to allow comparisons
	@Override
	public int compareTo(Crop other) {
		return Integer.compare(this.getGrowTime(), other.getGrowTime());
	}

}
