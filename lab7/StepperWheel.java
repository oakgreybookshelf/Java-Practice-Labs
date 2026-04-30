package lab7;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class StepperWheel extends Wheel {

	StepperWheel(int wheelSize) {
	// assign superclass variable to constructor input
        super.wheelSize = wheelSize;
    }
	
	public String rollRandom() {
	// hard code arraylist and generate random index to select items from arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(Arrays.asList("! ","@ ", "# ", "$ ", "% ", "^ ", "& ", "* ", "~ ", "? ", "< ", "> ", "+ ", "= ", "- ", "| "));
		
		String symbols = "";
		
		for (int i = 0; i < this.wheelSize; i++) {
			int index = (int)(Math.random() * list.size());
			String sym = (String)(list.get(index));
			symbols += sym;
		}
		
		return symbols;
		
	}

}
