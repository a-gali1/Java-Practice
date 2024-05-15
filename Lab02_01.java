import java.util.Scanner;

public class Lab02_01 
{
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds /1000;
		long totalMinutes = totalSeconds / 60;
		long currentSeconds = totalSeconds % 60;
		long totalHours = totalMinutes / 60;
		long currentMinutes = totalMinutes % 60;
		long currentHours = 0;
		
		System.out.println("Enter the time zone offset: ");
		
		int offset = scan.nextInt();
		
		if(offset == -5) 
		{
			currentHours = (totalHours - 4) % 24;
		}
		else if (offset == -6) 
		{
			currentHours = (totalHours - 5) % 24;
		}
		else if (offset == -7) 
		{
			currentHours = (totalHours - 6) % 24;	
		}
		else if (offset == -8) 
		{
			currentHours = (totalHours - 7) % 24;
		}
		
		System.out.println("Current time in GMT: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);


}
}