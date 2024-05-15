import java.util.*;

public class CharacterInput {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		
		String str = scan.nextLine().substring(0, 1).toLowerCase();
		
		str.toCharArray();
		
	}

}
