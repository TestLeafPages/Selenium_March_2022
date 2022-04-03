package week3.day2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// dynamic array
		List<String> names = new ArrayList<String>();
		
		// To add values to list
		names.add("Haja");
		names.add("Hari");
		names.add("Babu");
		names.add("Aravind");
		names.add("Haja");
		
		System.out.println(names);
		
		// remove from list
		names.remove(1);
		names.add("Hari");
		System.out.println(names);
		
		System.out.println(names.size());
		
		// check if a name is present in list
		System.out.println(names.contains("Babu"));
		
		// Copy the list to another list
		List<String> names2 = new ArrayList<String>();
		names2.addAll(names);
		System.out.println(names2);
		
		// to retrive the value from list
		System.out.println(names.get(3));
		
		// to confirm if list is empty
		System.out.println(names.isEmpty());
		
	}

}
