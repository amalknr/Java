package PatternPrograms;

public class Program2 {

	public static void main(String[] args) {
		
		for(int i=1;i<5;i++) {
			for(int j=1;j<5-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
