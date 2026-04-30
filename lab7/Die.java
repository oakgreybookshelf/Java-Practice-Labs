package lab7;

import java.util.ArrayList;
import java.util.Arrays;

public class Die implements Rollable{

	public String rollRandom() {
	// hard code values into arraylist
	// generate random index to select items from arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("1 ","2 ", "3 ", "4 ", "5 ", "6 "));
		
		String rolls = "";
		
		for (int i = 0; i < 2; i++) {
			int index = (int)(Math.random() * list.size());
			String num = (String)(list.get(index));
			rolls += num;
		}
		
		return rolls;
	}
	
}
