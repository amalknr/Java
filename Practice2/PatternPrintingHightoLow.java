package Practice2;

public class PatternPrintingHightoLow {

	public static void main(String[] args) {
		int row=5;
		for(int i=row;i>=1;i--) {
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<i;j++) {
				System.out.print(j);
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
