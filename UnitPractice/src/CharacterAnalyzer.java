//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;

	public CharacterAnalyzer()
	{
		setChar('0');
	}

	public CharacterAnalyzer(char c)
	{
		setChar(c);
	}

	public void setChar(char c)
	{
		theChar = c;
	}

	public char getChar()
	{
		return theChar;
	}

	public boolean isUpper( )
	{
		if (theChar >= 65 && !isLower()) return true;
		return false;
	}

	public boolean isLower( )
	{
		return (theChar >= 97);
	}
	
	public boolean isNumber( )
	{
		return (theChar >= 48 && !isUpper() && !isLower());
	}	

	public int getASCII( )
	{
		return (int)theChar;
	}

	public String toString()
	{
		if (isUpper()) {
			return ""+getChar() + " is an uppercase character. ASCII == " + getASCII() + "\n";	  
		}
		else if (isLower()) {
			return ""+getChar() + " is a lowercase character. ASCII == " + getASCII() + "\n";	  
		}
		return ""+getChar() + " is a number character. ASCII == " + getASCII() + "\n";	  
	}
}