//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList = new ArrayList<Toy>();

	public ToyStore()
	{
		loadToys("");
	}

	public void loadToys( String toys )
	{
		Scanner sc = new Scanner(toys);
		while (sc.hasNext()) {
			toyList.add(new Toy(sc.next()));
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i = 0; i<toyList.size(); i++) {
  			if (toyList.get(i).getName().equals(nm)) return toyList.get(i);
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 0;
  		int index = 0;
  		for (int i = 0; i<toyList.size(); i++) {
  			int count = 0;
  			for (int j=0; j<toyList.size(); j++) {
  				if (toyList.get(i) == toyList.get(j)) {
  					count++;
  				}
  			}
  			if (count > max) {max = count; index = i;}
  		}
  		return toyList.get(index).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		
  	}  
  	  
	public String toString()
	{
		String output="[";
		for (Toy t : toyList) {
			output += String.format("%s, ", t.getName());
		}
		output+="]\n" + String.format("max == %s", getMostFrequentToy());
		return output;
	}
}