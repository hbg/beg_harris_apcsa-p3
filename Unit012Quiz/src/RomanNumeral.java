//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class RomanNumeral implements Comparable<RomanNumeral>
{
	private Integer number;
	private String roman;

	private final static int[] NUMBERS= {1000,900,500,400,100,90,
													50,40,10,9,5,4,1};

	private final static String[] LETTERS = {"M","CM","D","CD","C","XC",
												  "L","XL","X","IX","V","IV","I"};

	public RomanNumeral(String str)
	{
		setRoman(str);
		setNumber(0);
	}

	public RomanNumeral(Integer orig)
	{
		setNumber(orig);
		setRoman("");
	}

	//write a set number method
	
	public void setNumber(int i) {
		number = i;
	}
	
	//write a set roman method

	public void setRoman(String s) {
		roman = s;
	}
	
	//write get methods for number and roman
	
	public int getNumber() {
		return number;
	}
	
	public String getRoman() {
		return roman;
	}
	

	public int compareTo(RomanNumeral r)
	{
		return this.getNumber() - r.getNumber();
	}

	//write  toString() method
	public String toString() {
		int copy = number;
		String s = "";
		for (int i = 0; i<NUMBERS.length; i++) {
			while (copy >= NUMBERS[i]) {
				copy-=NUMBERS[i];
				s+=LETTERS[i];
			}
		}
		setRoman(s);
		return s;
	}
	
	
	
}