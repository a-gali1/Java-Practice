import java.util.Scanner;

public class Lab03_03 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a, b, e for ax + by = e: ");
	
		int a = scan.nextInt();
		int b = scan.nextInt();
		int e = scan.nextInt();
		
		System.out.print("Enter c, d, f for cx + dy = f: ");
		
		int c = scan.nextInt();
		int d = scan.nextInt();
		int f = scan.nextInt();
		
		double determinant = (a*d) - (b*c);
		
		if (determinant == 0) 
		{
			System.out.print("No real solution");
		}
		else
		{
			double x = ((e*d) - (b*f))/determinant;
			double y = ((a*f) - (e*c))/determinant;
			System.out.print("x = " + x + ", y = " + y);
		}
	
	}

}
