import java.util.Scanner;

public class ComputeTax {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		double salesTax_percent = scan.nextInt();
		double saleAmount = scan.nextDouble();
		
		double salesTax = (int) (saleAmount * salesTax_percent)/100.0; 
		
		System.out.println(salesTax);
		
	}

}
