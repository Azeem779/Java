import java.util.Scanner;
public class Power {
	public static void main(String args[])
	{
		int num,exp,pow=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		System.out.print("Enter the Exponent: ");
		exp=sc.nextInt();
		for(int i=1;i<=exp;i++)
		{
			pow=pow*num;
		}
		System.out.print("Value of the number is :"+pow);
	}
}
