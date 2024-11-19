package Stringss;

public class Program8 {

	public static void main(String[] args) {
		// Logical Program
		
				String str1="KochIbatchstUdents";
				System.out.println(str1);
				System.out.println();
				
				for(int i=0;i<=str1.length();i++) {
					char ch=Character.toLowerCase(str1.charAt(i));
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
						System.out.println("*");
					}
					else {
						System.out.print(ch);
					}
				}
				

	}

}
