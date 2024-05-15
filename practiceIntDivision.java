import java.util.Scanner;

public class practiceIntDivision {

	public static void main(String[] args) 
	{

		/*int var1 = 1;
		int var2 = 2;
		int var3 = 3;
		
		double avg = (var1 + var2 + var3)/3;
		
		System.out.println("Average of 3 numbers, " + var1 + ", " + var2 + ", " + var3 + ": " + avg);*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 3 integers: ");
		
		int var1 = scan.nextInt();
		int var2 = scan.nextInt();
		int var3 = scan.nextInt();
		
		//double avg = (var1 + var2 + var3)/3;
		
		System.out.println("Sum of 3 numbers, " + var1 + ", " + var2 + ", " + var3 + ": " + (var1 + var2 + var3	));
		
	}

}
