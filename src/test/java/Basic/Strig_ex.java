package Basic;

public class Strig_ex 
{
	public static void main(String[] args) 
	{
	
		String str;
		str = "This is sample data";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.substring(1));
		System.out.println(str.substring(1,5));
		System.out.println(str.contains("java"));
		System.out.println(str.indexOf("is"));
		System.out.println(str.replace("is","are"));
		System.out.println();
	}

}
