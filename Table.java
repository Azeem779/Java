import java.util.Scanner;
public class Table {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num,i,j;
		System.out.print("Enter the number: ");
		num=sc.nextInt();
		for(i=num;i<num+1;i++)
		{
			for(j=1;j<=10;j++)
			{
				System.out.println(num +"*"+ i +"="+ i*j);
			}
		}
	}
}
