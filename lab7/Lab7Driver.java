package lab7;

import java.util.ArrayList;
import java.util.Arrays;

public class Lab7Driver {
	public static <T> void main (String[] args) {
		
		// instantiate Die type of gameofchance class, add plays, check for win, and print output
		Die die = new Die();
		GameOfChance<Die> gameOfChance3 = new GameOfChance<>();
		gameOfChance3.add(die);
		System.out.println(gameOfChance3.play());

		String win3 = gameOfChance3.win(gameOfChance3.winner());
		System.out.println("Dice: " + win3);
		System.out.println("");
		
		
		// instantiate LottoBall type of gameofchance class, add plays, check for win, and print output
		LottoBall lottoBall = new LottoBall();
		GameOfChance<LottoBall> gameOfChance2 = new GameOfChance<>();
		gameOfChance2.add(lottoBall);
		System.out.println(gameOfChance2.play());
		
		String win2 = gameOfChance2.win(gameOfChance2.winner("68 57 39 10 "));
		System.out.println("Lotto: " + win2);
		System.out.println("");

		
		// instantiate StepperWheel type of gameofchance class, add plays, check for win, and print output
		StepperWheel stepperWheel = new StepperWheel(6);
		GameOfChance<StepperWheel> gameOfChance1 = new GameOfChance<>();
		gameOfChance1.add(stepperWheel);
		System.out.println(gameOfChance1.play());
		
		String win1 = gameOfChance1.win(gameOfChance1.winner());
		System.out.println("Slot Machine: " + win1);
		
		System.out.println("===========");

	}
}
