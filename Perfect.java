/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		//// Put your code here
		int x = Integer.parseInt(args[0]);
		int sum = 0;
		for(int j= 1 ; j<=x/2 ; j++)
		{
			if(x%j==0)
				sum+=j;
		}
		if(sum == x)
		{
			System.out.print(x + " is a perfect number since " + x + " = ");
			for(int j= 1 ; j<x/2 ; j++)
			{
				if(x%j==0)
					System.out.print(j + " + ");
			}
			System.out.print(x/2);
		}
	}
}
