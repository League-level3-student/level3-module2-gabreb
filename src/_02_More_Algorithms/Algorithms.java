package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i ++) {
			if (eggs.get(i)=="cracked") {
				return i;
			}
				
		}
		return -1;
	}
	public static int countPearls(List<Boolean> oysters) {
		int z = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i)==true) {
				z += 1; 
			}
		}
		return z;
	}
	public static double findTallest(List<Double> peeps) {
		double z = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i)>z) {
				z = peeps.get(i);
			}
		}
		return z;
	}
	public static String findLongestWord(List<String> words) {
		String z = "";
		for (int i = 0; i < words.size()-1; i++) {
			if (words.get(i).length()>z.length()) {
				z = words.get(i);
			}
		}
		return z;
	}
	
	public static boolean containsSOS(List<String> message) {
		for (int i = 0; i < message.size()-1; i++) {
			if (message.get(i).equalsIgnoreCase("... --- ...")) {
				return true;
			}
		}
		return false;
	}
	public static double sortScores(List<Double> results) {
		return -1.0;
	}
	
}
