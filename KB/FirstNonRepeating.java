package KB;

import java.util.*;
public class FirstNonRepeating {

	public static void main(String[] args) {
		String str ="hello";
		for(int i=0;i<str.length();i++) {
			if(str.lastIndexOf(str.charAt(i))==str.indexOf(str.charAt(i))) {
				System.out.print(str.charAt(i)+" ");
				break;
			}
		}
		
	}
}
