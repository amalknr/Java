package Practice2;


public class AddSymbolsString {

	public static void main(String[] args) {
		
		String str="amal";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a') {
				System.out.print(" "+"$"+" ");
			}
			else {
				System.out.print(str.charAt(i));
			}
		}
	}

}
