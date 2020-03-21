import java.util.Scanner;
public class TwoGreatest {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.print("Enter First number: ");
		a=sc.nextInt();
		System.out.print("Enter Second number: ");
		b=sc.nextInt();
		if(a>b)
		{
			System.out.print(a+ " is greatest.");
		}
		else if(a==b)
		{
			System.out.println("Both are equal.");
		}
		else
		{
			System.out.print(b+ " is greatest.");
		}
	}
}
