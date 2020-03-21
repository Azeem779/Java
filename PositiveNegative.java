import java.util.Scanner;
public class PositiveNegative {
	public static void main(String args[])
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.print("Positive number.");
		}
		else
		{
			System.out.print("Negative number.");
		}
	}
}
