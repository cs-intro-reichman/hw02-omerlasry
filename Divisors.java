/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) 
	{
		int x = Integer.parseInt(args[0]);
		for(int j= 1 ; j<=x/2 ; j++)
		{
			if(x%j==0)
				System.out.println(j);
		}
		System.out.println(x);
			

	}
}
