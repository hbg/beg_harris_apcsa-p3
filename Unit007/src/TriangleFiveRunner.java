//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   TriangleFive t = new TriangleFive('C',4);
	   out.println(t.toString());
	   t = new TriangleFive('A',5);
	   out.println(t.toString());
	   t = new TriangleFive('X',8);
	   out.println(t);
	}
}