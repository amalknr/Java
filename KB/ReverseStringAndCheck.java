package KB;

public class ReverseStringAndCheck {

	public static void main(String[] args) {
		// Reverse a string and find a particular word from that string
		
		String str="Played";
		StringBuffer str1=new StringBuffer();
		
		String str3="yal";
		
		for(int i=str.length()-1;i>=0;i--) {
			str1.append(str.charAt(i));
		}
		
		
		String str2=str1.toString();
		
		System.out.println(str2);
		
		if(str2.contains(str3)) {
			System.out.println("the word is exist");
		}
		else {
			System.out.println("The word is not exist");
		}

	}

}
