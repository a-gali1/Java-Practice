import java.util.*;

public class Lab05_03 {

	public static void main(String[] args) 
	{
	
		int year = 101;
		int count = 0;
		
		while(year < 2100) 
		{
			boolean isLeapYear = (year % 4 == 0 && year %	 100 != 0) || ((year % 400) == 0);
			
			if(isLeapYear) 
			{
			
				System.out.print(year + " ");
			
				count++;

				if(count % 10 == 0) 
				{
					System.out.println();
				}
			}
			year++;
		}

	}

}
