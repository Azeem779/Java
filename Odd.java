import java.util.Scanner;
public class Odd {
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int i,range;
		System.out.print("Enter the range of number: ");
		range=sc.nextInt();
		for(i=1;i<=range;i++)
		{
			if(i%2!=0)
			{
			System.out.println(i);
			}
		}
	}
}
