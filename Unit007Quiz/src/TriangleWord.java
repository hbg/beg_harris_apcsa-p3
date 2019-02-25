//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class TriangleWord
{
   private String word;

	public TriangleWord()
	{
		setWord("");
	}

	public TriangleWord(String w)
	{
		setWord(w);
	}

	public void setWord(String w)
	{
		word = w;
	}

	public String toString()
	{
		String output="";
		for (int i=0;i<word.length();i++) {
			for (int y=0; y<word.length()-1-i; y++) {
				output+=" ";
			}
			if (i == word.length()-1) {
				for (int j = word.length()-1; j>=0; j--) {
					output+=word.charAt(j);
				}
				for (int x = 1; x<word.length(); x++) {
					output+=word.charAt(x);
				}
			}
			else {
				
					output+=(word.charAt(i));
					for (int j = 0; j<i*2-1; j++) {
						output+=" ";
					}
					if (i > 0) output+=word.charAt(i);
				
			}
			output+="\n";
		}
		return output+"\n";
	}
}