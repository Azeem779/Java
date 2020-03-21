import java.util.Scanner;
public class CompoundInterest {
	public static void main(String args[])
	{
		double pi,roi,year,fi,ci;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the principal amount: ");
		pi=sc.nextDouble();
		System.out.print("Enter the rate of Interest: ");
		roi=sc.nextDouble();
		System.out.print("Enter the year: ");
		year=sc.nextDouble();
		fi=pi*(Math.pow((1+roi/100), year));
		ci=fi-pi;
		System.out.println("Future interest of  principal amount is: "+fi);
		System.out.print("Compound interest of  principal amount is: "+ci);
	}
}
