import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);  
		boolean b = false, g =false;
		int sum = 0 , n2 =0 , n3 =0 ,n4 = 0 ;
		double avg =0;
		for(int i = 1 ; i<=T ; i ++)
		{
            b = false ;
            g = false;
		while((b&&g)==false)
		{
			if(generator.nextDouble()>0.5)
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
		avg = avg/T;
		System.out.println("Average: " + avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: "+ n2);
		System.out.println("Number of families with 3 children: " + n3);
		System.out.println("Number of families with 4 or more children: "+ n4);
		if(n2>=n3&&n2>=n4)
			System.out.println("The most common number of children is 2.");
		else if (n3>=n2&&n3>=n4)	
			System.out.println("The most common number of children is 3.");
		else
			System.out.println("The most common number of children is 4 or more.");
		//// In the previous version of this program, you used a statement like:
		//// double rnd = Math.random();
		//// Where "rnd" is the variable that stores the generated random value.
		//// In this version of the program, replace this statement with:
		//// double rnd = generator.nextDouble();
		//// This statement will generate a random value in the range [0,1),
		//// just like you had in the previous version, except that the 
		//// randomization will be based on the given seed.
		//// This is the only change that you have to do in the program.
		    
	}
}
