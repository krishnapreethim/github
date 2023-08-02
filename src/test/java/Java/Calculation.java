package Java;

public class Calculation 
{
	/*Polymorphism:
		Polymorphism is the ability of an object to take on many forms. It is achieved by Method overriding and Method
		overloading concepts.
		2.a.Method Overloading:
		If a class have multiple methods by same name but different parameters (or argumenents), it is known as Method
		Overloading. Also we can say as when the method arguments are either different by type or count.*/
	
	void sum(double d,double e) 
	{System.out.println(d+e);}
	void sum(int a,int b,int c) 
	{System.out.println(a+b+c);}
	void sum(float d, float e) 
	{System.out.println(d+e);}
	
	
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
	    obj.sum(20, 20);
	    obj.sum(10, 10, 10);
	    obj.sum(10.5, 5.5);
	}

}
