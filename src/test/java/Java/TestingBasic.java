package Java;

public class TestingBasic 
{
	int empsalary = 130000; // global varible
	 
	static String empst="Attended";
	public static void main(String[] args) {
		System.out.println(empst);
		
		TestingBasic tb=new TestingBasic();
		System.out.println(tb.empsalary);
	}

}
