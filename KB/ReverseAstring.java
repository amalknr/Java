package KB;

public class ReverseAstring {

	public static void main(String[] args) {
		String Str="word";
		StringBuffer Str1=new StringBuffer();
		for(int i=Str.length()-1;i>=0;i--) {
			Str1.append(Str.charAt(i));
		}
		System.out.println(Str1.toString());

	}

}
