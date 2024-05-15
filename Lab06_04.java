import java.util.*;

public class Lab06_04 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		
		String str = scan.nextLine();
		
		if (isPalindrome(str)) System.out.println(str + " is a Palindrome");
		else System.out.println(str + " is not a Palindrome");
	}

	public static String reverse(String s) 
	{
	
		String result = "";
		
		for(int i = s.length() - 1; i >= 0; i--) 
		{
			result += s.charAt(i);
		}
		
		return result;
		
	}
	
	public static boolean isPalindrome(String s) 
	{
		return s.toLowerCase().equals(reverse(s.toLowerCase()));
	}
	
}
