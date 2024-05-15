import java.util.*;

public class Lab02_03 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		final double POUND_TO_KG = 0.45359237;
		
		final double INCH_TO_METER = 0.0254;
		
		System.out.println("Enter Weight in lbs: ");

		float pounds = scan.nextFloat();
		
		System.out.println("Enter height in Inches: ");

		float inch = scan.nextFloat();
		
		double kilograms = pounds * POUND_TO_KG;
		double meters = inch * INCH_TO_METER;
		
		double BMI = kilograms/(meters*meters);
		
		System.out.println("BMI: " + BMI);
		
	}

}
