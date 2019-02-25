import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Harris Beg
//Date - 1/31
//Class - AP CSA
//Lab  - Variables

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		long longOne = 2L;
		int intOne = 1;
		boolean boolOne = true;
		double doubleOne = 2.0;
		float floatOne = 3.0f;
		String stringOne = "String";
		short shortOne = 8;
		char charOne = 65;
		ArrayList<Object> o = new ArrayList<Object>();
		o.add("a");
		//decimal variables


		//other integer types


		//other types


		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - byteOne = "+byteOne+"\t\t*");
		System.out.println("*16 bit - s2 = "+shortOne+"\t\t*");
		System.out.println("*32 bit - i = "+intOne+"\t\t*");
		System.out.println("*64 bit - f = "+floatOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        	real types          *");
		System.out.println("*                               *");
		System.out.println("*32 bit - fl = "+floatOne+"\t\t*");
		System.out.println("*64 bit - d = "+doubleOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        	other int types          *");
		System.out.println("*                               *");
		System.out.println("*16 bit - c = "+charOne+"\t\t*");
		System.out.println("*                               *");
		System.out.println("*        	other types          *");
		System.out.println("*                               *");
		System.out.println("*boolean b = "+boolOne+"\t\t*");
		System.out.println("*String s = "+stringOne+"\t\t*");










	}
	
	public static void println(Object o) {
		System.out.println(o);
	}
}
