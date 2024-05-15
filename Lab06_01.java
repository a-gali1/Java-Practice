import java.util.*;

public class Lab06_01 {

	public static void main(String[] args) {

		printMultiple(3, 5);
		printMultiple(7, 3);
		printMultiple(5, 3);
		printMultiple(3, 7);
		printMultiple(6, 4);
	}

	public static void printMultiple(int i, int j) {
		
		System.out.print("The first " + j + " multiples of " + i + " are ");
		
		for(int l = 1; l <= j; l++) {
			
			System.out.print(l * i);
			if (j == 1 || i == j) System.out.print(" ");
			else if(l != j) System.out.print(", ");
			
		}
		System.out.println("");		
	}	
}
