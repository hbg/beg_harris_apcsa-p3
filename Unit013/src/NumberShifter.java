//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private static int[] arr;
	public static int[] makeLucky7Array( int size)
	{
		int[] nums = new int[size];
		for (int i = 0; i<size; i++)
			nums[i] = (int)(Math.random()*10) + 1;
		return nums;
	}
	public static int[] shiftEm(int[] array)
	{
		int[] nums = array;
		for (int i = 0; i < array.length; i++) {
			if (nums[i] == 7) {
				for (int z = 0; z < array.length; z++) {
					if (nums[z] != 7) {
						nums[i] = nums[z];
						nums[z] = 7;
						break;
					}
				}
			}
		}
		return nums;
	}
}