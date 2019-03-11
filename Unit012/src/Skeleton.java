//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private int size;
	private String name;
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return this.getHowBig() > other.getHowBig();
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return this.getHowBig() < other.getHowBig();
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return this.getName().equals(other.getName());
	}
	public Skeleton() {
		this(0, "");
	}
	public Skeleton(int size, String name) {
		this.size = size;
		this.name = name;
	}
	public String toString() {
		return String.format("%s: %s", name, size);
	}
}