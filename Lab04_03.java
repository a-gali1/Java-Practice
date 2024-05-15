import java.util.*;

public class Lab04_03 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		
		String ltr = scan.nextLine();
		
		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		int index = a.indexOf(ltr.toUpperCase());
		
		System.out.println("The corresponding number: ");
		
		switch(index)
		{
		case 0: System.out.print("2"); break;
		case 1: System.out.print("2"); break;
		case 2: System.out.print("2"); break;
		case 3: System.out.print("3"); break;
		case 4: System.out.print("3"); break;
		case 5: System.out.print("3"); break;
		case 6: System.out.print("4"); break;
		case 7: System.out.print("4"); break;
		case 8: System.out.print("4"); break;
		case 9: System.out.print("5"); break;
		case 10: System.out.print("5"); break;
		case 11: System.out.print("5"); break;
		case 12: System.out.print("6"); break;
		case 13: System.out.print("6"); break;
		case 14: System.out.print("6"); break;
		case 15: System.out.print("7"); break;
		case 16: System.out.print("7"); break;
		case 17: System.out.print("7"); break;
		case 18: System.out.print("7"); break;
		case 19: System.out.print("8"); break;
		case 20: System.out.print("8"); break;
		case 21: System.out.print("8"); break;
		case 22: System.out.print("9"); break;
		case 23: System.out.print("9"); break;
		case 24: System.out.print("9"); break;
		case 25: System.out.print("9"); break;
		default : System.out.print("Invalid Input"); break;
		}
		
	}

}
