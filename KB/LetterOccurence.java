package KB;

import java.util.Scanner;

public class LetterOccurence {

	public static void main(String[] args) {
		// Find the occurence of letter in a word
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=sc.nextLine();
		
		System.out.println("Enter the letter");
		
		char letter=sc.next().charAt(0);
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==letter) {
				count++;
			}
		}
		System.out.println(count);
	}

}
