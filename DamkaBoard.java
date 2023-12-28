/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) 
	{
		//// Put your code here
		int x = Integer.parseInt(args[0]);
		for(int i =1 ; i<=x ; i++)
		{
			System.out.print("* ");
			System.out.println();
			for(int j =1 ; j<x ; j++)
				System.out.print(" *");
		}
		
	}
}
