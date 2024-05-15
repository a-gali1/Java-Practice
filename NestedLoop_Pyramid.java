import java.util.*;

public class NestedLoop_Pyramid {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("*** Pyramid ***");
		
		System.out.println("Enter the size: ");
		
		int size = scan.nextInt();
		
		for(int i = 0; i < size; i++) 
		{
			for(int k = size; k > i; k--) 
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
