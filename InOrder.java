/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args)
	{
		//// Write your code here
		double n = Math.random()*10+1 ;
		System.out.println((int)n);
		double y = Math.random()*10+1 ;
		while(y>=n)
		{
			System.out.println((int)y);
			n = y;
			y = Math.random()*10+1 ;
		}	
			
	}
}
