import java.util.Scanner;
public class Divisible_5_and_11 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.print("Enter the number: ");
		number=sc.nextInt();
		if((number%11==0)&&(number%5==0))
		{
			System.out.print("Number is divisible.");
		}
		else
		{
			System.out.print("Number is not divisible.");
		}
	}
}
