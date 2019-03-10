//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in);
		//ask for name and size
		Monster m1 = new Skeleton();
		Monster m2 = new Skeleton();
		for (int i = 0; i<2;i++) {
			if (i==0) {
				p("Enter 1st Monster's name: ");
				String name = sc.next();
				p("Enter 1st Monster's size: ");
				int size = sc.nextInt();
				m1 = new Skeleton(size, name);
			}
			else {
				p("Enter 2nd Monster's name: ");
				String name = sc.next();
				p("Enter 2nd Monster's size: ");
				int size = sc.nextInt();
				m2 = new Skeleton(size, name);
			}
		}
		p(m1);
		p(m2);
		p(m1.isBigger(m2) == true ? ("Monster one is bigger than Monster two.") : ("Monster two is bigger than Monster one."));
		p(m1.namesTheSame(m2) == true ? ("Same name") : ("Different names"));
		
		
	}
	public static void p(Object o) {
		System.out.println(o);
	}
}