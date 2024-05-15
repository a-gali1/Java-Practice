import java.util.*;

public class Lab02_09 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter an integer between 0 and 1000: ");
		
		int num = scan.nextInt();
		
		String Stringnum = String.valueOf(num);
		
        char ch[] = Stringnum.toCharArray();
		
		int sum = Character.getNumericValue(ch[0]) + Character.getNumericValue(ch[1]) + Character.getNumericValue(ch[2]);
		
		System.out.println("Sum of the digits: " + sum);
		
	}

}
