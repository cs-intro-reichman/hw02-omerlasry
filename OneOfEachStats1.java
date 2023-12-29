/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) 
	{
	    boolean b = false, g =false;
		int sum = 0 , n2 =0 , n3 =0 ,n4 = 0 ;
		double avg =0;
		int x = Integer.parseInt(args[0]);
		for(int i = 1 ; i<=x ; i ++)
		{
            b = false ;
            g = false;
		while((b&&g)==false)
		{
			if(Math.random()>0.5)
			{
				b = true;
				
			}
			else
			{
				g = true;
				
			}
			avg++;
			sum++;
		}
		if(sum ==2 )
			n2++;
	    if ( sum ==3)
			n3++;
		if(sum >= 4)
			n4++;
		sum = 0;
	
		}
		avg = avg/x;
		System.out.println("Average: " + avg + " children to get at least one of each gender. ");
		System.out.println("Number of families with 2 children: "+ n2);
		System.out.println("Number of families with 3 children: " + n3);
		System.out.println("Number of families with 4 children: "+ n4);
		if(n2>=n3&&n2>=n4)
			System.out.println("The most common number of children is 2 ");
		else if (n3>=n2&&n3>=n4)	
			System.out.println("The most common number of children is 3 ");
		else
			System.out.println("The most common number of children is 4 or more ");
	}
}
