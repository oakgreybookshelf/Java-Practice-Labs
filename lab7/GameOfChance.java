package lab7;

import java.util.ArrayList;
import java.lang.Throwable;
import java.util.Arrays;

public class GameOfChance<T extends Rollable>{
	
	static String currentPlay = "";
	ArrayList<T> myList = new ArrayList<>();
	
	public void add(T game) {
	// add game instantiation to arraylist
		myList.add(game);
	}
	
	public String play() {
	// for game in arraylist, call the function
		for (T game : myList) {			
			currentPlay = game.rollRandom();
		}
		return currentPlay;
	}
	
	
	public String win(boolean win) {
	// throw exception when plays are too few
	// return message based on win results
		try {
			if (currentPlay.length() < 4) {
			throw new Exception("Too few plays");
			}
        } 
        catch (Exception e) {
            System.out.println(e);
        }
		String message = (win == true) ? "Winner!" : "No winner.";
		
		return message;
	}
	
	
	public static boolean winner(String number) {
		// compare rollRandom results to established value
		boolean win = false;
		if (currentPlay == number) {
			win = true;
		}
		return win;
	}
	
	
	public boolean winner() {
		// determine if all results are the same
		boolean win = false;
		int matches = 0;
		
		String firstPair = currentPlay.substring(0, 2);
		
		int length = currentPlay.length();
	    for (int i = 2; i < length; i+=2) {
	        String currentPair = currentPlay.substring(i, i + 2);
	        if (currentPair.equals(firstPair)) {
	        		matches += 1;
	        }
	    }
		
		/*
		int length = currentPlay.length();
	    for (int i = 1; i < length; i++) {
	        if (currentPlay.charAt(i) == currentPlay.charAt(0)) {
	        	matches += 1;
	        }
	    }
		
		for (int i = 0; i < myList.size() - 1; i++) {
			if (myList.get(i) == myList.get(i +1)) {
				myList.set(i+1, myList.get(i));
				matches += 1;
			}
		}
		*/
		
		if (matches == (currentPlay.length() / 2) -1){
			win = true;
		}
		
		return win;
	}
}


