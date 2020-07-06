package _02_More_Algorithms;

import java.util.ArrayList;
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
	public static List<Double> sortScores(List<Double> results) {
		while (!_00_SortedArrayChecker.intListSorted(results)) {
			for (int i = 0; i < results.size()-1; i++) {
				if (results.get(i) > results.get(i+1)) {
					double ease; 
					ease = results.get(i);
					results.set(i, results.get(i+1));
					results.set(i+1,ease);
				}
			}
		}
		return results;
	}
	public static List<String> sortDNA(List<String> s) {
		while (!_00_SortedArrayChecker.StringSorted(s)) {
			for (int i = 0; i < s.size()-1; i++) {
				if (s.get(i).length() > s.get(i+1).length()) {
					String ease = "";
					ease = s.get(i);
					s.set(i,s.get(i+1));
					s.set(i+1, ease);
				}
			}
		}
		return s;
	}
	public static List<String> sortWords(List<String> words) {
		while (!_00_SortedArrayChecker.Stringy(words)) {
			for (int i = 0; i < words.size()-1; i++) {
				if (words.get(i).compareTo(words.get(i+1))==1) {
					String ease = "";
					ease = words.get(i);
					words.set(i,words.get(i+1));
					words.set(i+1, ease);
				}
			}
		}
		return words;
	}
}
