import java.util.*;

public class Lab07_05 {

	public static void main(String[] args) 
	{
		boolean swapped = true;
		
		double[] arr = {1.0,100.0,30.0,20.0,70.0,60.0,50.0};
		
		while(swapped) 
		{
			swapped = false;
			
			for(int i = 0; i < arr.length; i++) 
			{
				if(arr[i] > arr[i+1]) 
				{
					double temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					swapped = true;
				}
			}
		}
		
		Print(arr);
	}

	public static boolean Sorted(double[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			if(a[i] > a[i+1]) 
			{
				return false;
			}
		}
		return true;
	}
	
	public static void Print(double[] a) 
	{
		for(int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + " ");
		}
	}
	
}
