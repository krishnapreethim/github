package Java;

public class Test 
{

	int a= 10; //global variable
	static int b= 20; // static variable
	
	public void addition()
	{
		int a= 10; // local varibles
		int b= 20; // local variable
		int c= a+b; // 30
		System.out.println("Addition of two numbers"+c);
	}// Mmory not allocated
	
	public static void subtraction()
	{
		int a=20;
		int b=30;
		int c= a-b;
		System.out.println("Subraction of two numbers"+c);
	}// Memory allocated 
	public static void main(String[] args) 
	{
		int c=30;
		System.out.println(b);
		Test referenc =new Test();
		referenc.addition();
		System.out.println(referenc.a);
		subtraction();
	}
}
