import java.util.*;
public class n1_n2_temp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1 = (int) (Math.random() * 10) + 1;
		int n2 = (int) (Math.random() * 10) + 1;
		
		if (n2 > n1)
		{
		int temp = n1;
		n1 = n2;
		n2 = temp;
		}
		
		System.out.print("What is " + n1 + " - " + n2 + " = : ");
		
		int answer = input.nextInt();
		
		input.close();
		
		if(answer == (n1 - n2))
		{
		System.out.println("Correct");
		}
		else 
		{
		System.out.print("Incorrect");
		System.out.println( n1 + " - " + n2 + " = " + (n1-n2));
		}
	}

}