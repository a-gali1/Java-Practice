import java.util.*;

public class Lab02_04 {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter distance in miles: ");
		
		float miles = scan.nextFloat();
		
		System.out.println("Enter fuel efficiency(MPG): ");
		
		float MPG = scan.nextFloat();
		
		System.out.println("Enter gas price (in dollars) per gallon: $: ");
		
		float dollars = scan.nextFloat();
		
		float G = MPG/miles;
		
		double reciprocal = Math.pow(G , -1);
		
		double price = reciprocal * dollars;
		
		System.out.println("Gas price: " + price);
	}

}
