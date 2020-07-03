package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[]array = {"1","2","3","4","mango"};
		assertEquals(_00_LinearSearch.linearSearch(array,"4"),3);
		assertEquals(_00_LinearSearch.linearSearch(array,"Gaby is so amazingly fat"),-1);
		assertEquals(_00_LinearSearch.linearSearch(array, "mango"),4);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[]array = {1,6,11,16,21,26,31};
		assertEquals(_01_BinarySearch.binarySearch(array, 0, array.length-1, 26),5);
		assertEquals(_01_BinarySearch.binarySearch(array, 0, array.length-1, 36),-1);
		assertEquals(_01_BinarySearch.binarySearch(array, 0, array.length-1, 1),0);
		
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] array = {0,10,20,30,40,50};
		assertEquals(_02_InterpolationSearch.interpolationSearch(array,50),5);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array,5),-1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(array,51),-1);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] array = {23,52,81,110,139,168};
		assertEquals(_03_ExponentialSearch.exponentialSearch(array,139),4); 
		assertEquals(_03_ExponentialSearch.exponentialSearch(array,169),-1); 
		assertEquals(_03_ExponentialSearch.exponentialSearch(array,27),-1); 
	}
}
