package week3.day2;

public class LearnString {

	public static void main(String[] args) {
		// String literal declaration (immutable)
		String name = " Welcome to TestLeaf ";
		String name2 = "Haja";
		
		System.out.println(name == name2);
		// Object
		String name3 = new String("haja");
		String name4 = new String("Haja");
		System.out.println(name2==name3);
		
		boolean equals = name.equals(name3);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = name.equalsIgnoreCase(name3);
		System.out.println(equalsIgnoreCase);
		
		// geting the number of characters in String
		System.out.println(name.length());
		
		// retrive a character on a particular index
		System.out.println(name.charAt(3));
		
		// to convert the string to an array of characters
		char[] charArray = name.toCharArray();
		name.toString();
//		for (char c : charArray) {
//			System.out.print(c);
//		}
		
		// to retrive a part of the string
		String substring = name.substring(5);
		System.out.println(substring);
		
		String substring2 = name.substring(5, 8);
		System.out.println(substring2);
		
		// split the string
		String[] split = name.split(" ");
		for (String n : split) {
			System.out.println(n);
		}
		
		System.out.println(split[1]);
		
		// to remove leading and trailing spaces
		System.out.println(name.trim());
		
		// to convert to uppercase
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		// check if a string contains some chars
		System.out.println(name.contains("TestLeaf"));
		
		// to replace some chars
		System.out.println(name.replace("TestLeaf", "Qeagle").toLowerCase());
		
		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));
		}
	}

}
