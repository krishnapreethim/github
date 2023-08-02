package Java;

public class TestAbstraction 
{
	public static void main(String[] args) {
		Circle s1= new Circle();
		//In real secenario, object is provided through method e.g. getShape()method
		//Note: you can also use Circle(); insted of Shape S1 = new Criecle();
		Shape s2 = new Rectangle();
		s1.draw();
		s2.draw();
	}

}
