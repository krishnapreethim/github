package Basic;

public class reverse 
{
	public static void main(String[] args) 
	{
		String name="Krishna preethi";
		String name2="";
		
		String[] name3 = name.split(" ");
		for(String name4:name3)
		{
			String name5="";
			for(int i=name4.length()-1;i>=0;i--)
			{
				char ch = name4.charAt(i);
						name5=name5+ch;
			}
			name2=name2+name5+" ";
		}
		System.out.println(name2);
		
	}

}
