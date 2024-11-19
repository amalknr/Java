package ControlStatements;

public class Program4 {

	public static void main(String[] args) {
		//break and continue control statements
		
		for(int i=0;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		for(int j=0;j<=10;j++) {
			if(j==5) {
				continue;
			}
			System.out.print(j+" ");
		}

	}

}
