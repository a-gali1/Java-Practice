import java.util.*;

public class Lab06_03 {

	public static void main(String[] args) 
	{
		CoinFlip();
	}

	public static void CoinFlip() {
		
		int count = 0;
		
		while(count != 3) {
			
			int c = (int)(Math.random()*2);
			
			if(c == 1) {
				System.out.print("H ");
				count++;
			}
			else {
				System.out.print("T ");
				count = 0;
			}
		}
		
		System.out.println("\nThree Heads in a row!");
	}
	
}
