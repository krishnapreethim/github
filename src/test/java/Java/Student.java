package Java;

public class Student
{
	/*
	 * Parameterized Constructor:
        A constructor that have parameters is known as parameterized constructor. Parameterized constructor is
         used to provide different values to the distinct objects.
	 */
	int id;
	String name;
	Student(int i,String krishna)
	{
		id = i;
		name = krishna;
	}
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {/*
		Student s1 = new Student(01,"krishna");
		Student s2 = new Student(02,"preethi");
		s1.display();
		s2.display();*/
	}

}
