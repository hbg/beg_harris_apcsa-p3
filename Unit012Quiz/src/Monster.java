//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster() {this(0,0,0);}

	//write an initialization constructor with an int parameter ht

	public Monster(int ht) {this(ht, 0, 0);}

	//write an initialization constructor with int parameters ht and wt

	public Monster(int ht, int wt) {this(ht, wt, 0);}


	//write an initialization constructor with int parameters ht, wt, and age

	public Monster(int ht, int wt, int age) {
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}

	//modifiers - write set methods for height, weight, and age

	public void setHeight(int ht) {
		myHeight = ht;
	}
	
	public void setWeight(int wt) {
		myWeight = wt;
	}
	
	public void setAge(int age) {
		myAge = age;
	}
	
	//accessors - write get methods for height, weight, and age
	
	public int getHeight() {
		return myHeight;
	}
	
	public int getWeight() {
		return myWeight;
	}
	
	public int getAge() {
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		return this.compareTo(obj) == 0;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if (rhs.getHeight() != this.getHeight())
			return (this.getHeight() > rhs.getHeight() ? 1 : -1);
		else if  (rhs.getWeight() != this.getWeight())
			return (this.getWeight() > rhs.getWeight() ? 1 : -1);
		else if (rhs.getAge() != this.getAge())
			return (this.getAge() > rhs.getAge() ? 1 : -1);
		return 0;
	}

	//write a toString() method
	public String toString() {
		return String.format("%s %s %s", myHeight, myWeight, myAge);
	}
	
}