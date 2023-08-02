package Basic;

public class sample 
{
	//2nd maximum number in array
	public static void main(String[] args) {
		int [] ar=new int[5];
		ar[0]=100;
		ar[1]=200;
		ar[2]=500;
		ar[3]=400;
		ar[4]=800;
		
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[1]>ar[j])
				{
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println(ar[1]);
		
	}

}
