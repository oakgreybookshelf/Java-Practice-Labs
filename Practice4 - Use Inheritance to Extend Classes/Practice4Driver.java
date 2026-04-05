package practice4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice4Driver {
	
    public static void main(String[] args) {

		// class instantiations
		Horse horse = new Horse("Max", 5.5, 400, 2006, "white", "stallion");
		Horse horse2 = new Horse("Mary", 5.5, 400, 2006, "white", "stallion");
		//horse.setaddress("453 Rearheaert Dr");
		RaceHorse racehorse = new RaceHorse("Max", 5.5, 400, 2006, "white", "stallion", "12345567", 2010, 10, 555.55);
		RaceHorse racehorse2 = new RaceHorse("Mary", 5.5, 400, 2006, "white", "stallion", "12345567", 2010, 10, 555.55);
				
		/*
		Lab4Driver[] arr;
		arr = new Lab4Driver[4];
		arr[0] = new Lab4Driver(horse);
		*/
		
		// create array and store class objects
		List<Horse> array = new ArrayList<Horse>();
		array.add(horse);
		array.add(horse2);
		array.add(racehorse);
		array.add(racehorse2);
		
		System.out.println("*****UNSORTED ARRAY*****");
		// print the array
		System.out.println(array);
		System.out.println("*****SORTED ARRAY*****");
		// sort the array
		//array.sort()
		System.out.println(array);

    }
}
