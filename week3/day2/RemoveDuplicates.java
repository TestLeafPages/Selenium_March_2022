package week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "PayPal India";
		
		char[] charArray = s.toCharArray();
		
		Set<Character> set = new TreeSet<Character>();
		
		for (char ch : charArray) {
			set.add(ch);
		}
		
		System.out.println(set);
		
		for (char ch : set) {
			if(ch != ' ') {
				System.out.print(ch);
			}
		}
	}

}
