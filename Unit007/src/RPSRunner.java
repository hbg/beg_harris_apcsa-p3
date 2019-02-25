//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		//add in a do while loop after you get the basics up and running
		out.print("Let's start. Do you want to play (y/n)?");
		while (keyboard.next().equals("y")) {
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			
			//read in the player value
			String choice = keyboard.next();
			RockPaperScissors game = new RockPaperScissors(choice);	
			out.println(game.toString());
			out.println("Do you want to play another round (y/n)?");
		}
	}
}



