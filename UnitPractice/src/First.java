//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public  String go( String a )
	{
	   for (int i = 1; i<a.length(); i++)
		   if (a.charAt(i) == a.charAt(0)) return "yes";
	   return "no";
	}
   public int[] sort(int[] a) {
	   boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i<a.length; i++)
				for (int j = 0; j<a.length; j++)
				if (j > i && a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
			}
	}
	return a;
   }
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/