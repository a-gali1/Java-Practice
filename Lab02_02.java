import java.util.*;

public class Lab02_02 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter minutes: ");
		
		int minutes = scan.nextInt();
		
		int hours = minutes/60;
		int days = hours/24;
		int years = days/365;
		
		int days_shown = days % 365;
		
		System.out.println(minutes + " minutes is " + years + " years and " + days_shown + " days.");
	}

}
