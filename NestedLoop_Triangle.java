import java.util.*;

public class NestedLoop_Triangle {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** Tringle ***");
		
		System.out.println("Enter the size: ");
		
		int size = scan.nextInt();
		
		for(int i = 0; i < size; i++) 
		{
			for(int j = 0; j <= i; j++) 
			{
				System.out.print("*");	
			}
			System.out.println();
		}
	}

}
