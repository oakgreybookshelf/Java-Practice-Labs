package practice4;
import java.util.Arrays;

public class Racebale implements Comparable<Raceable> {

	double averageWinnings;
	double getWinnings;
	
	// getter for averageWinnings
	public double getAverageWinnings() {
		return averageWinnings; // output name
	}
	
	@Override
	public int compareTo(final Raceable raceable) {
		if(raceable == null ) {
			return -1;
		} else {
			return (int)(this.averageWinnings - raceable.getAverageWinnings);
		}
	 }
	
}
