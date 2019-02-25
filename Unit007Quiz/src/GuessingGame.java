//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound, random, finalCounter;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		Random r = new Random();
		random = 1+r.nextInt(upperBound);
	}

	public void playGame()
	{
		Scanner keyboard = new Scanner(System.in);
		int counter = 0;
		do {
			counter+=1;
			System.out.println("Enter a number between 1 and " +upperBound +" ");
		} while (keyboard.nextInt() != random);
		finalCounter = counter;
		
	}

	public String toString()
	{
		playGame();
		return "It took you " + finalCounter + " guesses to guess " + random +  ".";
	}
}