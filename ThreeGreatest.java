import java.util.Scanner;
public class ThreeGreatest {
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter First Number: ");
		a=sc.nextInt();
		System.out.print("Enter Second Number: ");
		b=sc.nextInt();
		System.out.print("Enter Third Number: ");
		c=sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.print(a+" is greatest.");
			}
			else
				System.out.print(c+" is greatest.");
		}
		else
		{
			if(b>c)
			{
				System.out.print(b+" is greatest.");
			}
			else
			{
				System.out.print(c+" is greatest.");
			}
		}
	}
}
