import java.util.Scanner;

public class DisplayingTime {

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter seconds: ");
		
		int sec = scan.nextInt();
		
		int minutes = sec/60;
		
		int sec1 = sec % 60;
		
		System.out.println(sec + " seconds is " + minutes + " minutes and " + sec1 + " seconds");
		
	}

}
 