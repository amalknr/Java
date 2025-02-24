package KB;

public class EliminateWhiteSpace {

	public static void main(String[] args) {
		
		//Eliminate White Spaces From the String
		
		String str="my name is amal";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}
			System.out.print(str.charAt(i));
		}

	}

}
