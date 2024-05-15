import java.util.*;

public class TestArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter array size: ");
		
		int size = scan.nextInt();
		
		int[] List1 = new int[size];
		
		int[] List2 = createArray(size);
		
		printArray(List2);
		
		System.out.println();
		//printArray(createArray(5));
		
		int max = List2[0];
		for(int i = 1; i < List2.length; i++) 
		{
			if(List2[i] > max) max = List2[i];
		}
		
		System.out.println("Max of the list: " + max);
		
		int min = List2[0];
		for(int i = 1; i < List2.length; i++) 
		{
			if(List2[i] < min) min = List2[i];
		}
		
		System.out.println("Min of the list: " + min);
		
		/*int[] list1 = new int[size];
		System.out.println("Enter the value of each element: ");
		for (int i = 0; i < list1.length; i++) 
		{
			list1[i] = scan.nextInt();
		}
		printArray(list1);*/
	}

	public static int[] createArray(int size) 
	{
		int[] result = new int[size];
		for(int i = 0; i < result.length; i++) 
		{
			result[i] = (int)(Math.random()*10);
		}
		return result;
	}
	
	public static void printArray(int[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
	
}
