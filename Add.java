import java.util.Scanner;
public class Add {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int num1,num2,sum;
	System.out.print("Enter First number: ");
	num1=sc.nextInt();
	System.out.print("Enter Second number: ");
	num2=sc.nextInt();
	sum=num1+num2;
	System.out.println("Sum of two number is: "+sum);
	}
}
