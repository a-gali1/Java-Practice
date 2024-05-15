import java.util.*;

public class Lab08_03 {

	public static void main(String[] args) 
	{
		int[][] a = new int[4][4];
		
		int maxRow = 0;
		int count = 0;
		int rowIndex = 0;
		int maxColumn = 0;
		int columnIndex = 0;
		
		for(int i = 0; i < a.length; i++) 
		{
			count = 0;
			for(int k = 0; k < a[0].length; k++) 
			{
				a[i][k] = (int)(Math.random()+0.5);
				if(a[i][k] == 1) count++;
			}
			if(count > maxRow) 
			{
				maxRow = count;
				rowIndex = i;
			}
		}
		
		for(int i = 0; i < a.length; i++) 
		{
			count = 0;
			for(int k = 0; k < a.length; k++) 
			{
				if(a[k][i] == 1) count++;
			}
			if(count > maxColumn) 
			{
				maxColumn = count;
				columnIndex = i;
			}
		}
		
		print2dArray(a);
		
		System.out.println("First row with the most ones: " + rowIndex);
		System.out.println("First column with the most ones: " + columnIndex);
	}

	public static void print2dArray(int[][] a)
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
