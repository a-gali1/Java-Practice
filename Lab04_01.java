import java.util.*;

public class Lab04_01 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter city 1: ");
		
		String city1 = scan.nextLine();
		
		System.out.println("Enter city 2: ");
		
		String city2 = scan.nextLine();
		
		System.out.println("Enter city 3: ");
		
		String city3 = scan.nextLine();
		
		city1 = city1.toUpperCase();
		city2 = city2.toUpperCase();
		city3 = city3.toUpperCase();
		
		System.out.print("3 cities in alphabetical order: ");
		
		int compare1 = city1.compareTo(city3);
		int compare2 = city1.compareTo(city2);
		
		if (compare1 > 0 && compare2 < 0) 
		{
			System.out.print(city3 + " " + city1 + " " + city2);
		}
		else if (compare1 < 0 && compare2 > 0) 
		{
			System.out.print(city2 + " " + city1 + " " + city3);
		}
		else if(compare1 > 0 && compare2 > 0) 
		{
			if(compare1 > compare2) System.out.print(city3 + " " + city2 + " " + city1);
			else System.out.print(city2 + " " + city3 + " " + city1);
		}
		else if(compare1 < 0 && compare2 < 0) 
		{
			if(compare1 > compare2) System.out.print(city1 + " " + city3 + " " + city2);
			else System.out.print(city1 + " " + city2 + " " + city3);
		}
	}

}
