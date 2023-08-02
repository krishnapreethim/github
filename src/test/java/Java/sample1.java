package Java;

public class sample1 
{
	int empsalary = 50000; // global variable
	char studentgread = 'A';
	static int empbonus= 1200000; // static variable
	static boolean condition= true;
	
	public static void main(String[] args) {
		int empax = 1000; // local variable
		
		System.out.println(empbonus);
		System.out.println(empax);
		System.out.println(condition);
		
		sample1 es= new sample1();
		System.out.println(es.empsalary);
		System.out.println(es.studentgread);
	}

}
