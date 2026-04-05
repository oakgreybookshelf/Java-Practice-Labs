package practice3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Practice3Driver {

	// read info from csv and print it
	public static void printProperties(String fileName, String propertyType)
	        throws FileNotFoundException {

	    File file = new File(fileName);
	    Scanner input = new Scanner(file);

	    input.nextLine(); 

	    while (input.hasNextLine()) {
	        String line = input.nextLine();
	        String[] parts = line.split(",");

	        String type = parts[1].replace("\"", ""); 

	        if (type.equalsIgnoreCase(propertyType)) {
	            System.out.println(line);
	        }
	    }

	    input.close();
	}

	// read info from csv and print it
    public static void printPropertiesPrice(String fileName, double maxPrice)
            throws FileNotFoundException {

        File file = new File(fileName);
        Scanner input = new Scanner(file);

        input.nextLine();

        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] parts = line.split(",");

            if (parts[6].isEmpty()) continue;

            double price = Double.parseDouble(parts[6]);

            if (price <= maxPrice) {
                System.out.println(line);
            }
        }

        input.close();
    }

	// Take file name as input and throw exception if file is not found
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name of CSV file: ");
        String fileName = sc.nextLine();

        System.out.print("Enter property type: ");
        String type = sc.nextLine();

        printProperties(fileName, type);

        System.out.print("\nEnter max price: ");
        double max = sc.nextDouble();

        printPropertiesPrice(fileName, max);

        sc.close();
    }

	// class instantiations
	MultiFamily family = new MultiFamily(0, "453 Rearheaert Dr", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 6, 9, 3, 4);
	family.setaddress("453 Rearheaert Dr");
	Townhouse town = new Townhouse(0, "801 Outhwood Pk", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 1, 2, 3, 4);
	town.setaddress("801 Outhwood Pk");
	Condo condo = new Condo(0, "987 Winne Rd", "zip", "loca", 19, 13.3, 0, "avail", 101.2, 101.3, 1, 2, 3, 4);
	condo.setaddress("987 Winne Rd");
	SingleFamily single = new SingleFamily(0, "8393 Justing Ct", "zip", "loca", 19, 13.3, 100, "avail", 101.2, 101.3, 1, 2, 3, 4);
	single.setaddress("8393 Justing Ct");
	Land land = new Land(0, "3928 Rhuthing Place", "zip", "loca", 19, 13.3, 0, "avail", 101.2, 101.3, 1, 2, 3, 4);
	land.setaddress("3928 Rhuthing Place");
	
	// printing addresses
	System.out.println();
	System.out.println("Multi-Family at: " + family.getaddress() + " can lodge " + family.getnumFamilies() + " families.");
	System.out.println("Townhouse at: " + town.getaddress());
	System.out.println("Condo at: " + condo.getaddress());
	System.out.println("SignleFamily at: " + single.getaddress());
	System.out.println("Land at: " + land.getaddress());

}

