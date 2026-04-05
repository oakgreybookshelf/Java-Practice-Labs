package lab6;

import java.util.*;

public class QuadDriver {

	public static <T> void main(String[] args) {
		// instantiate crop objects
		Crop crop = new Crop("Beanstalk", 37);
		Crop crop1 = new Crop("Grains", 79);
		Crop crop2 = new Crop("Figtrees", 87);
		Crop crop3 = new Crop("Pear trees", 55);

		
		Crop crops1 = new Crop("Wheat", 46);
		Crop crops2 = new Crop("Barley", 39);
		Crop crops3 = new Crop("Hay", 42);
		Crop crops4 = new Crop("Corn", 78);
		
		//instantiate quad object and pass crop objects as parameters
		Quad<Crop> quads1 = new Quad<Crop>("Farmer McDonald", crops1, crops2, crops3, crops4);
		Quad<Crop> quads2 = new Quad<Crop>("Farmer McGregor", crop, crop1, crop2, crop3);

		// create array list
		ArrayList list = new ArrayList();
		
		// add quad objects to the arraylist
		list.add(quads2);
		list.add(quads1);
		
		//loop through arraylist, print quad info and min crop grow time
		System.out.println("**** Min Crop Growing Season ****");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			T min = (T) ((Quad<Crop>) list.get(i)).getMin();
			System.out.println(" Min: " + min);
		}
		
		//loop through arraylist, print quad info and min crop grow time
		System.out.println("**** Max Crop Growing Season ****");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
			T max = (T) ((Quad<Crop>) list.get(i)).getMax();
			System.out.println(" Max: " + max);
		}
    }
}
