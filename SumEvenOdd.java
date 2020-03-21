import java.util.Scanner;
public class SumEvenOdd {
	public static void main(String args[])
	{
		int num,evensum=0,oddsum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the range of number: ");
		num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				evensum+=i;
			}
			else
			{
				oddsum+=i;
			}
		}
		System.out.println("Sum of even number is: "+evensum);
		System.out.print("Sum of odd number is: "+oddsum);
	}
}
