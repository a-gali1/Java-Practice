import java.util.Scanner;

public class ConvertingTemperatures {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the temperature in Farenheit: ");
		
		double temp = scan.nextInt();
		
		double tempC = (5.0/9.0) *(temp - 32.0);
		
		System.out.println("Celcius: " + tempC);
		
	}

}
