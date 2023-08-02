package Basic;

public class reverse2 {
	

	public static void main(String[] args) {
		String org = "pen";
		String rev = "";
		for(int i =0; i < org.length(); i++ )
		{
			rev = org.charAt(i)+rev;
		}
		System.out.println("Revrsed string: "+rev);
	}
}
