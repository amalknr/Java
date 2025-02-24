package Practice2;

public class SwapCharString {

	public static void main(String[] args) {
		String str="amal";
		
		char [] chara=str.toCharArray();
		
		int n=chara.length-1;
		
		char temp=chara[0];
		chara[0]=chara[n];
		chara[n]=temp;
		
		String result=new String(chara);
		
		System.out.println(result);

	}

}
