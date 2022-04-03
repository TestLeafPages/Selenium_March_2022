package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
		
		// to add values to set
		boolean add2 = names.add("Haja");
		System.out.println(add2);
		names.add("Hari");
		names.add("Babu");
		names.add("Aravind");
		boolean add = names.add("Haja");
		System.out.println(add);
		
		System.out.println(names);
		System.out.println(names.size());
		names.remove("Babu");
		names.add("Babu");
		System.out.println(names);
		
		List<String> nameList = new ArrayList<String>();
		nameList.addAll(names);
		System.out.println(nameList.get(0));
		
		Collections.sort(nameList);
		Collections.reverse(nameList);
		System.out.println(nameList);
		
	}

}
