//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	//add constructors

	//add a set method
   public Perfect() {
	   number = 0;
   }
   public Perfect(int number) {
	   setNumber(number);
   }
   public void setNumber(int number) {
	   this.number = number;
   }

	public boolean isPerfect()
	{
		int sum = 0;
		for (int i = 1; i<number; i++) {
			if (number % i == 0) {
				sum+=i;
			}
		}
		return (sum == number);
	}

	public String toString() {
		return (isPerfect() ? number + " is perfect" : number + " is not perfect");
	}
	//add a toString	
	
}