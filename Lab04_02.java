import java.util.*;

public class Lab04_02 {

	public static void main (String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter number of sides of regular polygon: ");
		
		int sides = scan.nextInt();
		
		System.out.println("Enter length of a side: ");
		
		double length = scan.nextDouble();
				
		double area = (sides * length * length) / (4 * Math.tan(Math.PI/sides));
		
		System.out.println("Area of a " + sides + "-side polygon: " + area);
		
		System.out.println("Area of a " + sides + "-side polygon: " + (int)(area + 0.5));
	}
}
