//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new arry of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		pups[spot] = new Dog(age, name);
	}

	public String getNameOfOldest()
	{
		Dog returnedDog = pups[0];
		int max = pups[0].getAge();
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() > max) {
				returnedDog = pups[i];
			}
		}
		return returnedDog.getName();
	}

	public String getNameOfYoungest()
	{
		Dog returnedDog = pups[0];
		int min = pups[0].getAge();
		for (int i = 0; i < pups.length; i++) {
			if (pups[i].getAge() < min) {
				returnedDog = pups[i];
			}
		}
		return returnedDog.getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}