import java.util.*;

public class ListingBooleanOperators {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter an integer: ");
		
		int integer = scan.nextInt();
		
		if(integer % 2 == 0 || integer % 3 == 0)
			System.out.println(integer + " is divisible by 2 or 3.");
		if(integer % 2 == 0 && integer % 3 == 0)
			System.out.println(integer + " is divisible by 2 and 3.");
		if(integer % 2 == 0 ^ integer % 3 == 0)
			System.out.println(integer + " is divisible by 2 or 3 but NOT both.");
		
		
	}

}
