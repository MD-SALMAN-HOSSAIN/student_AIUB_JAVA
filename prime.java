import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		int y;
		System.out.println("which data type you want to input");
		System.out.println("1. int");
		System.out.println("2. char");
		System.out.println("3.other");
		Scanner pr = new Scanner(System.in);
		y=pr.nextInt();
		System.out.println("inter a String value");
		Scanner sc = new Scanner(System.in);
		String x;
		x=sc.nextLine();
		if(y==1)
		{
			prime(String x);
		}
		else if (y==2)
		{
			vowel(String x);
		}
		else
		{
			System.out.println("the value is "+x);
		}
	}
}