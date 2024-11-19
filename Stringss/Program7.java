package Stringss;

public class Program7 {

	public static void main(String[] args) {
		// Logical Program
		
				String str1="kochibatchstudents";
				System.out.println(str1);
				System.out.println();
				
				for(int i=0;i<=str1.length();i++) {
					char ch=str1.charAt(i);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						System.out.print("*");
					}
					else {
						System.out.print(ch);
					}
				}
				
	}

}
