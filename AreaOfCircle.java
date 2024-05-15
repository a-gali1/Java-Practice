import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) 
	{
		// Declare variables for radius; area
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter radius of circle:");
		double radius = scan.nextDouble();
		
		scan.close();
		
		double area;
				
		//Compute area
		area = radius * radius * 3.14;
		
		//Display results
		System.out.println("The area for the circle with the radius " + radius + " is " + area);
		
	}

}
