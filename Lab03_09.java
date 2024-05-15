import java.util.*;

public class Lab03_09 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 4 numbers: ");
		
		double n1 = scan.nextDouble();
		double n2 = scan.nextDouble();
		double n3 = scan.nextDouble();
		double n4 = scan.nextDouble();
		double max = n1;
		
		if(n2 > max) max = n2;
		if(n3 > max) max = n3;
		if(n4 > max) max = n4;
		
		double min = n1;
		
		if(n2 < min) min = n2;
		if(n3 < min) min = n3;
		if(n4 < min) min = n4;
		
		double avg = (n1 + n2 + n3 + n4)/4;

		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Average: " + avg);
	}

}
