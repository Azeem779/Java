import java.util.Scanner;
public class Square{
	public static void main(String args[])
	{
		int num,square;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		square=num*num;
		System.out.print("Square of the number is: "+square);
	}
}
