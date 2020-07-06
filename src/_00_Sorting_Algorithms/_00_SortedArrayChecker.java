package _00_Sorting_Algorithms;

import java.lang.reflect.Array;
import java.util.List;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	//   This method takes in an array of integers
	//   and it returns a boolean.
	//   The method returns true if the integer
	//   array is in ascending order and false otherwise

	static boolean intArraySorted (int[]array) {
		for (int i = 0; i < array.length-1; i++) {
			if (array[i]>array[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean intListSorted (List<Double> results) {
		for (int i = 0; i < results.size()-1; i++) {
			if (results.get(i)>results.get(i+1)) {
				return false;
			}
		}
		return true;
	}
	public static boolean StringSorted (List<String> s) {
		for (int i = 0; i < s.size()-1; i++) {
			if (s.get(i).length() > s.get(i+1).length()) {
				return false;
			}
		}
		return true;
	}
	public static boolean Stringy (List<String> words) {
		for (int i = 0; i < words.size()-1; i++) {
			if (words.get(i).compareTo(words.get(i+1)) == 1) {
				return false;
			}
		}
		return true;
	}
	
	//2. Write a static method called doubleArraySorted. 
	//   This method takes in an array of doubles
	//   and it returns a boolean.
	//   The method returns true if the double
	//   array is in ascending order and false otherwise
static boolean doubleArraySorted(double[] da) {
	for (int i = 0; i < da.length-1; i++) {
		if (da[i]>da[i+1]) {
			return false;
		}
	}
	return true;
}
	
	//3. Write a static method called charArraySorted. 
	//   This method takes in an array of characters
	//   and it returns a boolean.
	//   The method returns true if the character
	//   array is in alphabetical order and false otherwise
	//   (You can compare characters just like integers)
static boolean charArraySorted(char[] ca) {
	for (int i = 0; i < ca.length-1; i++) {
		if (ca[i]>=ca[i+1]) {
			return false;
		}
	}
	return true;
}
	
	//4. Write a static method called stringArraySorted. 
	//   This method takes in an array of Strings
	//   and it returns a boolean.
	//   The method returns true if the String
	//   array is in alphabetical order and false otherwise
	//   (Use the compareTo(String) method)


static boolean stringArraySorted (String[]sa) {
	for (int i = 0; i < sa.length-1; i++) {
		if (sa[i].compareTo(sa[i+1])<=0) {
			return false;
		}
	}
	return true;
}









}
