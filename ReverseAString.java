package programsInForLoop;

public class ReverseAString {

	public static void main(String[] args) {
		String str="bhuvana";
		String s="";
		for (int i=str.length()-1;i>=0;i--) {
			s=s+str.charAt(i);
		}
		System.out.println(str+" Reverse is: "+s);
		

	}

}
