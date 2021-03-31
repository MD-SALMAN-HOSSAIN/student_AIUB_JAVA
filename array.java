import java.util.Scanner;
public class array
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int array[]=new int[5];
		System.out.print("Input: ");
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.print("Output: ");
		for(int j=0;j<array.length;j++)
		{
			System.out.print(array[j] + " ");
		}
		
	}
}