package Java;

public class Test4 
{
	public static void main(String[] args) {
		String gender= "Male";
		if(gender.equals("Male"))
		{
			System.out.println("Eligible for night shifts");
		}
		else if(gender.equals("Female"))
		{
			System.out.println("Not Eligible for night shifts");
		}
		else
		{
			System.out.println("Check your gender.........!");
		}
	}

}
