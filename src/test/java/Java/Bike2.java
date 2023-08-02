package Java;

public class Bike2 extends Vehicle {
	/*
	 * 2.b. Method overriding:
If subclass (child class) has the same method as declared in the parent class,
 it is known as method overriding.
	 */
	void run()
	{
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args) {
		Bike2 obj = new Bike2();
		obj.run();
	}
	

}
