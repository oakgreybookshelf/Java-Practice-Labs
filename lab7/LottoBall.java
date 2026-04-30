package lab7;

import java.util.Random;

public class LottoBall implements Rollable {
	
	public String rollRandom() {
	// generate random numbers form 0-99
		Random r = new Random();
		String numbers = "";
		for (int i = 0; i < 4; i++) {
			int number = r.nextInt(99);
			String num = Integer.toString(number);
			numbers += num + " ";
		}
		return numbers;
	}
}
