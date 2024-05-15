import java.util.*;

public class Lab05_01 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** Tringle ***");
		
		System.out.println("Enter the size: ");
		
		int size = scan.nextInt();
		
		System.out.println("\nSample A");
		
		for(int i = 0; i < size; i++) 
		{
			for(int j = 1; j < i + 2; j++) 
			{
				System.out.print(j + " ");	
			}
			System.out.println();
		}
		
		System.out.println("\nSample B");
		
		for(int i = size; i > 0; i--) 
		{
			for(int j = 1; j < i + 1; j++) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\nSample C");
		

		for (int i = 1; i <= size; i++) 
		{
            for (int j = 1; j <= size - i; j++) 
            {
                System.out.print("  ");
            }            
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
		
		System.out.println("\nSample D");
		
		for (int i = 1; i <= size; i++) 
		{
            for (int j = 1; j < i; j++) 
            {
                System.out.print("  ");
            }
            for (int j = i; j <= size; j++) 
            {
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
	}
	
}