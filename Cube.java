import java.util.Scanner;
public class Cube {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number,cube;
		System.out.print("Enter the number: ");
		number=sc.nextInt();
		cube=number*number*number;
		System.out.print("Cube of the number is: "+cube);
	}
}
