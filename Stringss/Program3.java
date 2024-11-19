package Stringss;

public class Program3 {

	public static void main(String[] args) {
		// String Comparisons
		
		String str1="WELCOME";
		String str2="welcome";
		String str3="WELCOME";
		
		System.out.println(str1.equals(str2));// its false because 'equals' is case sensitive
		System.out.println(str1.equals(str3));// its true because 'equals' is case sensitive
		
		System.out.println(str1.equalsIgnoreCase(str2));// its true because 'equalsIgnoreCase is not sensitive
		System.out.println(str1.equalsIgnoreCase(str3));// its true because 'equalsIgnoreCase is not sensitive
		
		System.out.println(str1.compareTo(str2));// compareTo used for lexico graphic analysis
		System.out.println(str1.compareTo(str3));

	}

}
