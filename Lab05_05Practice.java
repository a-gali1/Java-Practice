import java.util.Scanner;

public class Lab05_05Practice {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int esum = 0;
		
		for(int i = 0; i <= 1000; i++) 
		{
			//sum of even integers in [1, 1000]
			if(i % 2 == 0) esum += i;
			
			//sum of integers in [1, 1000]
			sum += i;
			
		}
		
		System.out.println("Sum of integers [1, 1000]: " + sum);
		System.out.println("Sum of even integers [1, 1000]: " + esum);
		
		System.out.println("Enter a String: ");
		
		String str = scan.nextLine();
		
		scan.close();
		
		String result = "";
		String digits = "0123456789";
		int vowels = 0;
		for(int i = 0; i < str.length(); i++) 
		{
			if(str.substring(i, i + 1).equals(" ")) 
			{
				int indexOfDigits = (int) (Math.random()*10);
				result += digits.substring(indexOfDigits, indexOfDigits + 1);
			}
			else result += str.substring(i, i + 1);
		
			if("AEIOU".contains(str.substring(i, i + 1).toUpperCase())) vowels++;
		}
		
		System.out.println("Result string: " + result);
		System.out.println("Number of vowels: " + vowels);
	}

}
