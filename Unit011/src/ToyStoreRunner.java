//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		ToyStore hamleys = new ToyStore();
		hamleys.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		hamleys.sortToysByCount();
		System.out.println(hamleys);
	}
}