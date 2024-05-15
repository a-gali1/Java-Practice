import java.util.*;

public class ComputeChange {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter money: ");
		
		double money = scan.nextDouble();
		
		double dollars = (int) money;
		
		double cents = money - dollars;
		
		double quarters = (int) (cents/25);
		
		double cents1 = cents - (quarters * 25);
		
	}

}
