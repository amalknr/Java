package Logical;

public class Program9 {

	public static void main(String[] args) {
		String str="abc";
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i != j) {
					System.out.print(str.charAt(i)+""+str.charAt(j)+" ");
				}
			}
		}

	}

}
