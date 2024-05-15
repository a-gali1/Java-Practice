import java.util.*;

public class reverseArray {

	public static void main(String[] args) 
	{
		int[] list = {1, 2, 3, 4, 5};
		System.out.println("Original List: ");
		printArray(list);
		System.out.println("\nInvoking reverse: ");
		printArray(reverse(list));
		System.out.println("\nAfter Invoking reverse: ");
		printArray(list);
	}

	public static int[] reverse(int[] a) 
	{
		
		int[] result = new int[a.length];
		int j = 0;
		for(int i = a.length - 1; i >= 0; i--) 
		{
			result[j] = a[i];
			j++;
		}
		return result;
	}
	
	public static void printArray(int[] a) 
	{
		for(int e: a)
			System.out.print(e + " ");
	}
	
}
