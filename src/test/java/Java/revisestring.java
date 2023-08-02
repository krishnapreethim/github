package Java;

public class revisestring 
{
	public static void main(String[] args) {
		String str = "krishnapreethi";
		String rev = "";
		 for(int i = str.length() -1; i>=0; --i)
		 {
			 rev += str.charAt(i);
		 }
		 System.out.println(rev);
	}

}
