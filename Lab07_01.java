import java.util.*;

public class Lab07_01 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How many students? ");
		
		int students = scan.nextInt();
		
		int[] list = new int[students];
		
		System.out.print("Enter scores: ");
		
		for(int i = 0; i < students; i++) list[i] = scan.nextInt();
		
		int max = max(list);
		
		for(int i = 0; i < students; i++) 
		{
			System.out.print("Student" + i + ": score " + list[i] + " grade: ");
			if(list[i] >= max - 10) System.out.print("A");
			else if(list[i] >= max - 20) System.out.print("B");
			else if(list[i] >= max - 30) System.out.print("C");
			else if(list[i] >= max - 40) System.out.print("D");
			else System.out.print("F");
			System.out.println();
		}
	}

	public static int max(int[] a) 
	{
		int max = a[0];
		for(int i = 1; i < a.length; i++) 
		{
			if(a[i] > max) max = a[i];
		}
		return max;
	}
	
}
