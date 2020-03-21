import java.util.Scanner;
public class ProfitLoss {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int cost,sell,profit,loss;
		System.out.print("Enter the cost price: ");
		cost=sc.nextInt();
		System.out.print("Enter the sell price: ");
		sell=sc.nextInt();
		if(sell>cost)
		{
			profit=sell-cost;
			System.out.print("Profit is "+profit);
		}
		else if(cost>sell)
		{
			loss=cost-sell;
			System.out.print("Loss is "+loss);
		}
		else
		{
			System.out.print("No profit No loss..");
		}
	}
}
