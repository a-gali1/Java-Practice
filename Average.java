import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to average generator");

		System.out.println("Enter 1st number: ");
		
		int first = scan.nextInt();

		System.out.println("Enter 2nd number: ");

		int second = scan.nextInt();
		
		System.out.println("Enter 3rd number: ");

		int third = scan.nextInt();
		
		int sum = first + second + third;
		double   average = sum/3;
		
		System.out.println("Here is your average: " + average);
		
	}

}
