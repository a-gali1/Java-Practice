import java.util.*;

public class Lab03_02 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a, b, c for ax^2 + bx + c = 0: ");
	
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		double discriminant = (b*b) - (4*a*c);
		
		if (discriminant == 0) 
		{
			double ans1 = -b/(2*a);
			System.out.print("1 real solutions: " + ans1);
		}
		else if (discriminant > 0) 
		{
			double ans1 = (-b + Math.sqrt(discriminant))/(2 * a);
			double ans2 = (-b - Math.sqrt(discriminant))/(2 * a);
			System.out.print("2 real solutions: " + ans1 + ", " + ans2);
		}
		else
		{
			System.out.print("No real solutions");
		}
		
	}

}
