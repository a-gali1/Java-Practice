import java.util.*;

public class Lab08_01 {

	public static void main(String[] args) {
		
		double[][] arr = new double[4][5];
		
		print2dArray(create2dArray(arr));
		
		System.out.println("Sum: " + sumMajorDiagonal(arr));

	}

	public static double sumMajorDiagonal(double[][] a) 
	{
		int sum = 0;
		for(int i = 0; i < a.length; i++) 
		{
			for(int l = 0; l < a[0].length; l++) 
			{
				if(i==l) sum += a[i][l];
			}
		}
		return sum;
	}
	
	
	public static double[][] create2dArray(double[][] a)
	{
		for(int i = 0; i < a.length; i++) 
		{
			for(int l = 0; l < a[0].length; l++) 
			{
				a[i][l] = (double)((int)(Math.random()*100));
			}
		}
		return a;
	}
	
	public static void print2dArray(double[][] a)
	{
		for(int i = 0; i < a.length; i++) 
		{
			for(int l = 0; l < a[0].length; l++) 
			{
				System.out.print(a[i][l] + " ");
			}
			System.out.println();
		}
	}
}
