//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int numOne, denOne;
	//write two constructors
	public Rational() {
		setRational(1,1);
	}
	public Rational(int i, int j) {
		setRational(i, j);
	}

	//write a setRational method
	public void setRational(int numOne, int denOne) {
		this.numOne = numOne;
		this.denOne = denOne;
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num) {
		numOne = num;
	}
	public void setDenominator(int num) {
		denOne = num;
	}

	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		numOne = (numOne * other.denOne + other.numOne * denOne);
		denOne = (other.denOne * denOne);
		


		reduce();
	}

	private void reduce()
	{
		for (int j = 1; j<=Math.min(numOne, denOne); j++) {
			for (int i = 1; i<=Math.min(numOne, denOne); i++) {
				if (numOne % i == 0 && denOne % i == 0) {
					numOne /= i;
					denOne /= i;
				}
			}
		} //	Double protection

	}

	private int gcd(int numOne, int numTwo)
	{
		for (int i = Math.min(numOne, denOne); i>1; i--) {
			if (numOne % i == 0 && denOne % i == 0) return i;
		}
		return 1;
	}

	public Object clone ()
	{
		return new Rational(numOne, denOne);
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	@SuppressWarnings("finally")
	public boolean equals( Object obj)
	{

		try {
			Rational r = (Rational) obj;
			return (r.denOne == denOne && r.numOne == numOne);
		} 
		finally {
			return false;
		}
	}

	public int compareTo(Rational other)
	{
		return ((double)numOne/denOne > (double) other.numOne/other.denOne ? 1 : -1);
	}



	
	//write  toString() method
	public String toString() {
		return String.format("%s/%s", numOne, denOne);
	}
	
	
}