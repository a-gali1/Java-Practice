import java.util.Scanner;

public class Lab02_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		System.out.print("Enter x1 and y1: ");
			
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
			
		System.out.print("Enter x2 and y2: ");
		
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		System.out.print("Enter x3 and y3: ");
		
		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();
				
		double side1 = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
		double side2 = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
		double side3 = Math.sqrt((x3-x2)*(x3-x2) + (y3-y2)*(y3-y2));
		
		double s = (side1 + side2 + side3)/2;
		
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
		System.out.println("Area: " + area);
	}

}
