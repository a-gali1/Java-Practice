import java.util.*;

public class IfDemo {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer: ");
		
		int num = scan.nextInt();
		
		if(num % 5 == 0)
			System.out.println("HiFive");
		if(num % 2 == 0)
			System.out.println("HiEven");
	}

}
