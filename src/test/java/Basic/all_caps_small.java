package Basic;

public class all_caps_small 
{
	//count of all caps small digits special count with special method

	public static void main(String[] args) 
	{
		String mail="krishnapreethi.m@gmail.com";
		int s=0;
		int c=0;
		int num=0;
		int cha=0;
		String small="",caps="",digit="",spcl="";
		for(int i=0;i<mail.length();i++)
		{
			char a = mail.charAt(i);
			if(Character.isLowerCase(a))
			{
				small=small+a;
			}
			else if(Character.isUpperCase(a))
			{
				c++;
				caps=caps+a;
			}
			else
			{
				cha++;
				spcl=spcl+a;
			}

		}
		System.out.println("Small==>"+s+"==>"+small);
		System.out.println("Capital==>"+c+"==>"+caps);
		System.out.println("Digit==>"+num+"==>"+digit);
		System.out.println("Special Character==>"+cha+"==>"+spcl);

	}

}
