import java.util.*;

public class Lab03_04 {

	public static void main(String[] args) 
	{
		Random ran = new Random();
		
		int month = ran.nextInt(1, 13);
		
		switch(month) 
		{
		case 1: System.out.println("Random month: " + month + " January"); break;
		case 2: System.out.println("Random month: " + month + " February"); break;
		case 3: System.out.println("Random month: " + month + " March"); break;
		case 4: System.out.println("Random month: " + month + " April"); break;
		case 5: System.out.println("Random month: " + month + " May"); break;
		case 6: System.out.println("Random month: " + month + " June"); break;
		case 7: System.out.println("Random month: " + month + " July"); break;
		case 8: System.out.println("Random month: " + month + " August"); break;
		case 9: System.out.println("Random month: " + month + " September"); break;
		case 10: System.out.println("Random month: " + month + " October"); break;
		case 11: System.out.println("Random month: " + month + " November"); break;
		case 12: System.out.println("Random month: " + month + " December"); break;
		}
	}

}
