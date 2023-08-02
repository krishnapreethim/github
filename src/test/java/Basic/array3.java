package Basic;

public class array3 
{
	public static void main(String[] args) 
	{
		int [] ar=new int[5];
		ar[0]=1000;
		ar[1]=2000;
		ar[2]=5000;
		ar[3]=8000;
		ar[4]=9000;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1; j<ar.length; j++)
			{
				if(ar[i]<ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(ar[2]);
		
	}

}
