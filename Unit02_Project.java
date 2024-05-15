import java.util.*;

public class Unit02_Project 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter investment amount: ");
		
		double amount = scan.nextDouble();
		
		System.out.println("Enter annual interest rate: ");
		
		double annual_rate = scan.nextDouble();
		
		System.out.println("Enter number of years: ");
	
		double years = scan.nextDouble();
		
		double monthly_rate = annual_rate/12/100;
		
		double future_value = (amount) * Math.pow((1 + monthly_rate), (years*12));
		
		System.out.println("Accumulated value is: " + future_value);
		
	}
}
