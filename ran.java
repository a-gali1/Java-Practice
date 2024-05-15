import java.util.*;

public class ran {

	public static void main(String[] args) 
	{
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int n1 = ran.nextInt(10);
		int n2 = ran.nextInt(10);
		
		System.out.println("What is " + n1 + " + " + n2 + " equal to?");

		int answer = scan.nextInt();
		
		System.out.println( n1 + " + " + n2 + " = " + answer + " is " + (answer == (n1+n2)));
	
	}
	
}
