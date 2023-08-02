package Basic;

public class StringReverse 
{
	public static void main(String[] args) {
		String oristr = "Hello";
		String revesstr = "";
		for(int i = 0; i< oristr.length(); i++)
		{
			revesstr = oristr.charAt(i) + revesstr;
		}
		System.out.println("Reversed string: "+ revesstr);
	}
}
