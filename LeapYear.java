import java.util.*;

public class LeapYear {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Year: ");
		
		int year = scan.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		
		if (isLeapYear)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}

}
