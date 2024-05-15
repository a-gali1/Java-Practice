import java.util.*;

public class Lab03_07 {

	public static void main(String[] args) 
	{
		Random ran = new Random();
		
		int suit = ran.nextInt(1, 5);
		int rank = ran.nextInt(1, 14);
		
		System.out.print("The card you picked: ");
		
		switch(rank) {
		  case 1: System.out.print(rank); break;
		  case 2: System.out.print(rank); break;
		  case 3: System.out.print(rank); break;
		  case 4: System.out.print(rank); break;
		  case 5: System.out.print(rank); break;
		  case 6: System.out.print(rank); break;
		  case 7: System.out.print(rank); break;
		  case 8: System.out.print(rank); break;
		  case 9: System.out.print(rank); break;
		  case 10: System.out.print("Jack"); break;
		  case 11: System.out.print("Queen"); break;
		  case 12: System.out.print("King"); break;
		  case 13: System.out.print("Ace"); break;
		}
		
		switch(suit) {
		  case 1: System.out.print(" of Heart"); break;
		  case 2: System.out.print(" of Spade"); break;
		  case 3: System.out.print(" of Club"); break;
		  case 4: System.out.print(" of Diamond"); break;
		}
		
		
		
	}

}
