package Stringss;

public class Program4 {

	public static void main(String[] args) {
		// String Methods
		
		StringBuffer str1=new StringBuffer("WELCOME");
		
		System.out.println(str1.length());
		
		System.out.println(str1.charAt(6));
		
		System.out.println(str1.indexOf("COME"));
		
		//System.out.println(str1.reverse());
		
		//System.out.println(str1.append(" to java"));
		
		System.out.println(str1.insert(0, "HII "));
		
		System.out.println(str1.delete(0, 4));
		
		System.out.println(str1.substring(3));
		
		System.out.println(str1.subSequence(3, str1.length()));
		
		

	}

}
