//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
	private String[] choices = new String[] {"R","P","S"};

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		compChoice = choices[(int)Math.random()*3];
	}

	public String determineWinner()
	{
		String winner = "player";
		switch (playChoice) {
		
		case "R":
			if (compChoice.equals("P")) {
				winner = "computer";
			}
			else if (compChoice.equals("R")) {
				winner = "nobody";
			}
			break;
		case "P":
			if (compChoice.equals("S")) {
				winner = "computer";
			}
			else if (compChoice.equals("P")) {
				winner = "nobody";
			}
			break;
		case "S":
			if (compChoice.equals("R")) {
				winner = "computer";
			}
			else if (compChoice.equals("S")) {
				winner = "nobody";
			}
			break;
		
		}
		return winner;
	}

	public String toString()
	{
		return "player chose: " + playChoice + "\ncomputer chose: " + compChoice + "\n" + determineWinner() + " won!";
	}
}