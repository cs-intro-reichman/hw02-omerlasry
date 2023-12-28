
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		//// Put your code here
		boolean b = false, g =false;
		int sum = 0;
		while((b&&g)==false)
		{
			if(Math.random()>0.5)
			{
				b = true;
				System.out.print(" b ");
			}
			else
			{
				g = true;
				System.out.print(" g ");
			}
			sum = sum+1;
		}
		System.out.println();
		System.out.println("You made it... and you now have "+ sum+ " children");
	}
}
