//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Harris Beg
//Date - 1/31
//Class - AP CSA
//Lab  - Stars & Stripes

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
      
   }

   public void printTwentyStars()
   {
	   for (int i = 0; i<20; i++) {
		   System.out.print("*");
	   }
	   printLine();
   }
   
   public static void printLine() {
	   System.out.println("");
   }

   public void printTwentyDashes()
   {
	   for (int i = 0; i<20; i++) {
		   System.out.print("*");
	   }
	   printLine();
   }

   public void printTwoBlankLines()
   {
	   for (int i = 0; i<2; i++) {
		   System.out.print("\n");
	   }
   }
   
   public void printASmallBox()
   {	
	   System.out.println("+++++++++++++++++++++++++" );
		for (int i = 0; i<5; i++) {
			System.out.println("+\t\t\t+");
			
		}
		System.out.println("+++++++++++++++++++++++++" );
   }
 
   public void printABigBox()
   { 	
	   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++" );
		for (int i = 0; i<5; i++) {
			System.out.println("+\t\t\t\t\t\t+");
			
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++" );
   }   
}