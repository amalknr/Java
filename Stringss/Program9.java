package Stringss;

public class Program9 {

	public static void main(String[] args) {
		// Palindrome or not
		
		String str1="Malayala";
		StringBuffer str2=new StringBuffer();
		
		for(int i=str1.length()-1;i>=0;i--) {
			str2.append(str1.charAt(i));
		}
		if(str1.equalsIgnoreCase(str2.toString())) {
			System.out.print("its paliandrome");
		}
		else {
			System.out.print("its not paliandrome");
		}

	}

}
