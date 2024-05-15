import java.util.*;
public class Lab07_03 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int[] n = new int[10];
		
		System.out.print("Enter 10 numbers: ");
		
		for (int i = 0; i < 10; i++)
		{
			n[i] = scanner.nextInt();
		}
		
		int[] distincts = new int[10];
		
		int count = 0;
		
		for (int i = 0; i < distincts.length; i++) 
		{
			if(!exists(n[i],distincts))
			{
				distincts[count] = n[i];
				count++;
			}
		}
		
		System.out.println("The number of distinct numbers: " + count);
		System.out.print("The distinct numbers: ");
		
		for(int i = 0; i < count; i++)
		{
			System.out.print(distincts[i] + " ");
		}
		
	}
	
	public static boolean exists(int num, int[] arr) 
	{
		for(int i = 0; i < arr.length; i++)
		{
			if (num == arr[i]) return true;
		}
		return false;
	}

}