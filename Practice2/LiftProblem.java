package Practice2;
import java.util.Scanner;

public class LiftProblem {
	
	public void Lift(int fl,int sl,int pl) {
		
		int DistanceFirstLift=Math.abs(fl-pl);
		int DistanceSecondLift=Math.abs(sl-pl);
		if(DistanceFirstLift > DistanceSecondLift) {
			System.out.println("second lift is come first");
		}
		else if(DistanceFirstLift == DistanceSecondLift){
			System.out.println("both lift is come same time");
		}
		else {
			System.out.println("first lift is come first");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the first lift floor");
		int fl=sc.nextInt();
		System.out.println("enter the second lift floor");
		int sl=sc.nextInt();
		System.out.println("enter the person floor");
		int pl=sc.nextInt();
		
		
		LiftProblem obj=new LiftProblem();
		obj.Lift(fl, sl, pl);
		

	}

}
