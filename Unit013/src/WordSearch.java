//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	int x= 0;
    	m = new String[size][size];
    	for (int i = 0; i<size; i++) {
    		for (int j = 0; j<size; j++) {
        		m[i][j] = String.valueOf(str.charAt(x));
        		x+=1;
        	}
    	}
    }

    public boolean isFound( String word )
    {
    	for (int i = 0; i<m[0].length;i++) {
    		for (int j = 0; j<m[1].length; j++) {
    			if (checkRight(word, i, j) || checkLeft(word, i, j) || checkUp(word, i, j) || checkDown(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpRight(word, i, j) || checkDiagUpLeft(word, i, j) || checkDiagDownRight(word, i, j) || checkDiagDownLeft(word, i, j)) return true;
    		}
    	}
    	return false;
    }

	public boolean checkRight(String w, int r, int c)
   {	
		int i = 0;
		if (r+w.length()<m[0].length) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r+i][c])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		int i = 0;
		if (r-w.length()>=0) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r-i][c])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkUp(String w, int r, int c)
	{
		int i = 0;
		if (c-w.length()>=0) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r][c-i])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkDown(String w, int r, int c)
   {
		int i = 0;
		if (c+w.length()<m[0].length) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r][c+i])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkDiagUpRight(String w, int r, int c)
	{
		int i = 0;
		if (c-w.length()>=0 && r+w.length()<m[0].length) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r+i][c-i])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkDiagUpLeft(String w, int r, int c)
	{
		int i = 0;
		if (c-w.length()>=0 && r-w.length()>=0) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r-i][c-i])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkDiagDownLeft(String w, int r, int c)
   {
		int i = 0;
		if (c+w.length()<m[0].length && r-w.length()>=0) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r-i][c+i])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

	public boolean checkDiagDownRight(String w, int r, int c)
	{
		int i = 0;
		if (c+w.length()<m[0].length && r+w.length()<m[0].length) {
			for (char c1 : w.toCharArray()) {
				if (!String.valueOf(c1).equals(m[r+i][c+i])) return false;
				i++;
			}
			return true;
		}
		return false;
	}

    public String toString()
    {
 		String s = "";
 		for (int i = 0; i<m[0].length; i++) {
 			for (int j = 0; j < m[0].length; j++) s+=m[i][j] + " ";
 			s+="\n";
 		}
 		return s;
    }
}
