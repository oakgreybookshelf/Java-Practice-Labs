package lab6;

import java.util.*;

public class Quad<T> implements Comparable<Quad<T>>{
		String name; 
		T north;
		T south;
		T east;
		T west;

		//constructor take input as generic type T
		public Quad(String name, T north, T south, T east, T west) {
			this.name = name;
			this.north = north;
			this.south = south;
			this.east = east;
			this.west = west;
		}
		
		// implementing comparable to allow comparisons
		@Override
		public int compareTo(Quad<T> other) {
			return Integer.compare(this.getGrowtime(), other.growTime);
		}
		
		public Object getMin() {
			// create arraylist
			List growth = new ArrayList<>();
			// add crops to arraylist
			growth.add(this.south);
			growth.add(this.north);
			growth.add(this.west);
			growth.add(this.east);
			// sort arraylist in ascending order
			Collections.sort(growth);
			// assign max to the first index of the arraylist
			Object min = (Object) growth.get(0);
			return min;
		}
		
		public Object getMax() {
			// create arraylist
			List growth = new ArrayList<>();
			// add crops to arraylist
			growth.add(this.south);
			growth.add(this.north);
			growth.add(this.west);
			growth.add(this.east);
			// sort arraylist then reverse the list
			Collections.sort(growth);
			Collections.reverse(growth);
			// assign max to the first index of the arraylist
			Object max = (Object) growth.get(0);
			return max;
		}

		// getters and setters
		public T getNorth() {
			return north;
		}

		public void setNorth(T north) {
			this.north = north;
		}

		public T getSouth() {
			return south;
		}

		public void setSouth(T south) {
			this.south = south;
		}

		public T getEast() {
			return east;
		}

		public void setEast(T east) {
			this.east = east;
		}

		public T getWest() {
			return west;
		}

		public void setWest(T west) {
			this.west = west;
		}
		
		// method to print quad info
		public String toString() {
			return name + " North: " + north + " South: " + south + 
					"East: " + east + " West: " + west; 
		}
		

	}
