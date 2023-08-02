package Java;

public class Test1 
{
	public void addition(int a, int b)
	{
		int c= a+b;
		System.out.println("Adition of two numbers::"+c);
	}
	public static void sub(int a, int b)
	{
		int c= a-b;
		System.out.println("Sub of two  numbers::"+c);
	}
	public int division()
	{
		int a=10;
		int b=20;
		int c= a%b;
		return c;
	}
	public String studentname()
	{
		String name= "krishna";
		return name;
		
	}
	public static void main(String[] args) 
	{
		Test1 ref=new Test1();
		ref.addition(10,20);// method parameters
		sub(100,50);
		System.out.println(ref.division());
		System.out.println(ref.studentname());
	}

}
