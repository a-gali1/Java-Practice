import java.util.*;

public class Lab03_06 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter month as an integer and a year: ");
		
		int month = scan.nextInt();
		
		int year = scan.nextInt();
		
		if (month == 1 || month == 3 ||month == 5 ||month == 7 ||month == 8 ||month == 10 ||month == 12)
		{
			System.out.println(month + "/" + year + " has 31 days");
		}
		if (month == 4 ||month == 6 ||month == 9 ||month == 11)
		{
			System.out.println(month + "/" + year + " has 30 days");
		}
		if(month == 2) 
		{
			System.out.println(month + "/" + year + " has 28 days");
			if(year % 100 == 0 && year % 4 == 0 || year % 400 == 0) 
			{
				System.out.println(month + "/" + year + " has 29 days");
			}
		}

	}

}
