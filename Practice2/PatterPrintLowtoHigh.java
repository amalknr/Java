package Practice2;

public class PatterPrintLowtoHigh {

	public static void main(String[] args) {
		
		int row=5;
		for(int i=1;i<=row;i++) {
			for(int j=i;j<row;j++) {
				System.out.print(" ");
			}
			int num=i;
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num++;
			}
			num-=2;
			for(int j=1;j<i;j++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
		}

	}

}
