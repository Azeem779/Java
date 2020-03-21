import java.util.Scanner;
public class SumOdd {
	public static  void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,i,sum=0;
		System.out.print("Enter the range: ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			if(i%2!=0){
			System.out.println(i);
			sum+=i;
			}
		}
		System.out.print("Sum of the odd numbers is: "+sum);
	}
}
