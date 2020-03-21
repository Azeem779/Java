import java.util.Scanner;
public class EvenOdd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.print("Enter the number: ");
		number=sc.nextInt();
		if(number%2==0)
		{
			System.out.print(number +" is even.");
		}
		else
			System.out.print(number +" is odd.");
	}
}
