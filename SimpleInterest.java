import java.util.Scanner;
public class SimpleInterest {
	public static void main(String args[])
	{
		double pi,roi,year,si;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		pi=sc.nextDouble();
		System.out.print("Enter the rate of interest: ");
		roi=sc.nextDouble();
		System.out.print("Enter the year: ");
		year=sc.nextDouble();
		si=(pi*roi*year)/100;
		System.out.println("Simple interest of the amount is:  "+si);
	}
}
