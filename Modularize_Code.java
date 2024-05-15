import java.util.*;

public class Modularize_Code {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter 2 Integers: ");
		
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		
		System.out.println("GCD: " + GCD(n1, n2));
		
		
	}


public static int GCD(int n1, int n2) 
{
	int gcd = 0;
	
	for(int i = 0; i <= n1 && i <= n2; i++){
		
		if(n1 % i == 0 && n2 % i == 0) gcd = i; 
	}
	
	return gcd;
}
}