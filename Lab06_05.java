import java.util.*;

public class Lab06_05 {

	public static void main(String[] args) 
	{
		int count = 0;
		for(int n = 2; n < 348; n++) 
		{
			if(isPrime(n)) count++;
		}
		System.out.println("There are " + count + " prime numbers between 2 and 10,000");
	}
	
	public static boolean isPrime(int n) 
	{
		for(int d = 2; d <= n / 2; d++) if(n % d == 0) return false;
		
		return true;
	}

}
