import java.util.*;

public class Lab05_02 {

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
				
		System.out.println("Enter the size: ");
		
		int size = scan.nextInt();
		
		for (int i = 1; i <= size; i++) 
		{
            for (int j = 1; j <= size - i; j++) 
            {
                System.out.print("  ");
            }            
            for (int j = i; j >= 1; j--) 
            {
                System.out.print(j + " ");
            }
            for (int k = 2; k < i + 1; k++) 
            {
            	System.out.print(k + " ");
            }
            
            System.out.println();
        }
		
	}

}
