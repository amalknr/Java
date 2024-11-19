package ControlStatements;

public class Program3 {

	public static void main(String[] args) {
		//for,while,do while loop control statements
		
		for(int i=0;i<=10;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		int j=0;
		while(j<=10) {
			if(j%2==1) {
				System.out.print(j+" ");
			}
			j++;
		}
		System.out.println();
		int k=0;
		do {
			if(k%2==0) {
				if(k%10==0) {
					k++;
					continue;
				}
				System.out.print(k+" ");
			}
			k++;
		}
		while(k<=30);

	}

}
