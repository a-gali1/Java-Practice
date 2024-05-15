import java.util.*;

public class Practice2 {

	public static void main(String[] args) 
	{

		int[] list1 = {1, 2, 3, 4, 5};
		int[] list2 = list1;
		list1[0] = 0;
		System.out.println("list1: " + Arrays.toString(list1));
		System.out.println("list2: " + Arrays.toString(list2));
		
		doubleArray(list1);
		doubleArray(list2);
		System.out.println("list1: " + Arrays.toString(list1));
		System.out.println("list2: " + Arrays.toString(list2));
		
		doubleArrayNew(list1);
		doubleArrayNew(list2);
		System.out.println("list1: " + Arrays.toString(list1));
		System.out.println("list2: " + Arrays.toString(list2));
	}

	public static void doubleArray(int[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			a[i] *= 2;
		}
	}
	
	public static int[] doubleArrayNew(int[] a) 
	{
		int[] result = new int[a.length];
		for(int i = 0; i < a.length; i++) 
		{
			result[i] = a[i] * 2;
		}
		return result;
	}
	
}
