import java.util.Scanner;

public class Lab02_10 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a 4 digit number: ");
		
		int num = scan.nextInt();
		
		String Stringnum = String.valueOf(num);
		
        char ch[] = Stringnum.toCharArray();
        
        System.out.println("Digits in reverse order: " + ch[3] + "" + ch[2] + "" + ch[1] + "" + ch[0]);

	}

}
