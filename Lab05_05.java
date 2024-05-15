import java.util.*;

public class Lab05_05 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		String binary = "";
		
		System.out.println("Enter decimal: ");
		
		int decimal = scan.nextInt();
		
		if(decimal < 0 || decimal > 15) 
		{
			System.out.println("Invalid Input.");
			System.exit(decimal);
		}
		else 
		{
			binary = decimal % 2 + binary;
			decimal /= 2;
			binary = decimal % 2 + binary;
			decimal /= 2;
			binary = decimal % 2 + binary;
			decimal /= 2;
			binary = decimal % 2 + binary;
		}
		
		System.out.println("in Binary: " + binary);
		
	}
}
