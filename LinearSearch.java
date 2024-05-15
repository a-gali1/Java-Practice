import java.util.*;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int key = 3;
		int[] list = {3,2,1,5,6,4};
		
		System.out.println("Linear Index: " + LinearSearch(key, list));
		System.out.println("Binary Index: " + BinarySearch(key, list));
		Sort(list);
		printArray(list);
	}

	public static int LinearSearch(int key, int[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			if (a[i] == key) return i;
		}
		return -1;	
	}
	
	public static int BinarySearch(int key, int[] a)
	{
		int low = 0;
		int high = a.length - 1;
		while(low <= high) 
		{
			int mid = (low + high) / 2;
			if(key > a[mid]) low = mid + 1;
			else if(key == a[mid]) return mid;
			else if(key < a[mid]) high = mid - 1;
		}
		return -1;
	}
	
	public static void Sort(int[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			int min = a[0];
			int indexMin = i;
			for(int j = i + 1; j < a.length; j++) 
			{
				if(a[j] < min) 
				{
					min = a[j];
					indexMin = j;
				}
			}
			if(a[i] != min) 
			{
				int temp = a[i];
				a[i] = min;
				a[indexMin] = temp;
			}
		}
	}
	
	public static void printArray(int[] a) 
	{
		for(int e: a)
			System.out.print(e + " ");
	}
}
