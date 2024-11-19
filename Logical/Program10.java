package Logical;

public class Program10 {

	public static void main(String[] args) {
		 String str="1234567";
		 int num=Integer.parseInt(str);
		 
		 int sum=0;
		 
		 while(num !=0) {
		 int r=num % 10;
		 
		 sum=(sum*10)+r;
		 num=num/10;
		 
		 }
		 System.out.println(sum);

	}

}
