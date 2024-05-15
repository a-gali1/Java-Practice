
public class SecondsToTime {

	public static void main(String[] args) 
	{
		for(long i = 0; i < 1000000000; i++) {
		long totalMilliSeconds = System.currentTimeMillis();
		long totalSeconds = totalMilliSeconds /1000;
		long totalMinutes = totalSeconds / 60;
		long currentSeconds = totalSeconds % 60;
		long totalHours = totalMinutes / 60;
		long currentMinutes = totalMinutes % 60;
		long currentHours = (totalHours - 7) % 24;
		
		System.out.println("Current time in GMT: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);
		
		}
	}

}
