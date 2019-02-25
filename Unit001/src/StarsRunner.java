//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Harris Beg
//Date - 1/31
//Class - AP CSA
//Lab  - Stars & Stripes
//www.apluscompsci.com


import static java.lang.System.*;

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      
      //call the methods needed to make the patterns on the word document
      StarsAndStripes s = new StarsAndStripes();
      for (int i = 0; i < 40; i++) {
    	  s.printTwentyDashes();
    	  s.printTwentyStars();
    	  s.printTwoBlankLines();
      }
      s.printABigBox();
   }
}