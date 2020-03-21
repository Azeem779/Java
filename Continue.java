
public class Continue {
	public static void main(String args[])
	{
		int i=1;
		for(i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println();
		int j=1;
		while(j<=10)
		{
			if(j==5)
			{
				continue;
			}
			System.out.println(j);
			j++;
		}
		System.out.println();
		int k=1;
		do{
			if(k==5)
			{
				continue;
			}
			System.out.println(k);
			k++;
		}while(k<=10);
	}
}
