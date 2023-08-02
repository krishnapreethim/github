package Java;

public class Bike 
{
	/*
	 * Constructor is like a method
	 * name of the constructor should be the name of the class
	 * no return type 
	 * constructor will be called whenever you creat an instance of the class
	 * Type: a.Default constructor 
	 *       b. Parameterized constructor 
	 */
	Bike(){
		System.out.println("Bike is created");
	}
	public static void main(String[] args) {
		Bike B = new Bike();
	}

}
