import java.util.*;

public class Lab05_04 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = scan.nextLine();
		
		String reverseString = "";
		
		for(int i = str.length() - 1; i >= 0; i--) 
		{
			reverseString += str.substring(i, i + 1);
		}

		System.out.println("Reverse String: " + reverseString);
		
	}

}
