import java.util.Scanner;

public class BMI_if_statements {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
		boolean bool = true;
		
		final double POUND_TO_KG = 0.45359237;
		
		final double INCH_TO_METER = 0.0254;
		
		System.out.println("Enter Weight in lbs: ");

		float pounds = scan.nextFloat();
		
		System.out.println("Enter height in Inches: ");

		float inch = scan.nextFloat();
		
		if (bool)
			System.out.print("budfb");
		
		double kilograms = pounds * POUND_TO_KG;
		double meters = inch * INCH_TO_METER;
		
		double BMI = kilograms/(meters*meters);
	
		System.out.println("BMI: " + BMI);

		if(BMI < 18.5)
			System.out.println("Underweight");
		else if(BMI >= 18.5 && BMI <25.0)
			System.out.println("Normal");
		else if(BMI >= 25.0 && BMI < 30)
			System.out.println("Overweight");
		else if(BMI >= 30)
			System.out.println("Obese");
	}

}
