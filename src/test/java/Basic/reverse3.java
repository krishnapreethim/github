package Basic;

public class reverse3 {
	public static void main(String[] args) {
		String org = "Selenium";
		String rev = "";
		for( int i = 0; i<org.length(); i++)
		{
			rev = org.charAt(i) + rev;
		}
		System.out.println(rev);
	}

}
