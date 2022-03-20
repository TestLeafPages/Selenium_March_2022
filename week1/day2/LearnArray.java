package week1.day2;

import java.util.Arrays;

public class LearnArray {

	// group of values
	// Arrays are of fixed size, cause memory wastage
	public static void main(String[] args) {
		// 1-dimension
	//	int[] a = {10, 20, 50, 30, 25}; // index starts with 0
		// 10, 20, 50, 80
		String[] names = {"Haja", "Babu"};
		
		String[] b = new String[5];
		System.out.println(b[0]);
		int[] a = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]+a[1]);
		
		System.out.println(a.length);
		System.out.println(a[3]);
		
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		for(int i = a.length-1; i>=0; i--) {
			System.out.println(a[i]);
		}
		
	}

}
