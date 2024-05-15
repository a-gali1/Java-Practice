import java.util.*;

public class Lab03_08 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter x and y for a point location: ");
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		if(Math.abs(x) <= 5 && Math.abs(y) <= 2.5) 
		{
			System.out.println("Point (" + x + ", " + y + ") is inside the rectangle");
		}
		else {
			System.out.println("Point (" + x + ", " + y + ") is outside the rectangle");
		}
	}

}
