import java.util.*;

public class MonthlyPaymentCalculator {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your annual interest rate in %: ");
		
		double interest_rate = scan.nextDouble();
		double monthly_interest_rate = interest_rate/100/12;
		
		System.out.print("Enter number of years to make payment: ");
		
		double number_Years = scan.nextDouble();
		
		System.out.print("Enter loan amount: ");
		
		double loan_amount = scan.nextDouble();
		
		double monthly_payment = (loan_amount*monthly_interest_rate)/(1-1/(Math.pow(1 + monthly_interest_rate, number_Years*12.0)));
		double total_payment = (12* number_Years * monthly_payment);
		
		System.out.print("Monthly Payment: $" + monthly_payment);
		System.out.print("Total Payment: $" + total_payment);	
	}

}
