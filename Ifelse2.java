
public class Ifelse2 {
	public static void main(String args[])
	{
		int year=2019;
		if((year%4==0)&&(year!=100)||(year%400==0))
		{
			System.out.println("Leap Year..");
		}
		else
			System.out.println("Not leap year..");
	}
}
