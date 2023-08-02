package Java;

public class Test5
{
	public void eligibleForJob()
	{
		String graduation="btach";
		if(graduation.equals("btech"))
		{
			System.out.println("Eligible for associate roessor");
		}
		else if(graduation.equals("mtech"))
		{
			System.out.println("Eligible for professor");
		}
		else if(graduation.equals("phd"))
		{
			System.out.println("Eliible for HOD");
		}
		else
		{
			System.out.println("No eligible for any job requerment");
		}
	}
	public static void main(String[] args) {
		Test5 ref=new Test5();
		ref.eligibleForJob();
	}
}
