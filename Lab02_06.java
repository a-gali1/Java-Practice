import java.util.*;

public class Lab02_06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter x1 and y1: ");
			
		float x1 = scan.nextFloat();
		float y1 = scan.nextFloat();
			
		System.out.print("Enter x2 and y2: ");
		
		float x2 = scan.nextFloat();
		float y2 = scan.nextFloat();
		
		double square = ((x1-x2)*(x1-x2)) + ((y1-y2)*(y1-y2));
		
		double distance = Math.sqrt(square);
		
		System.out.println("Distance between (" + x1 + ", " + y1 + ") and (" + x1 + ", " + y2 + "): " + distance);
	}

}
