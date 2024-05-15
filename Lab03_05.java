import java.util.Scanner;

public class Lab03_05 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter three integer: ");
		
		int num = scan.nextInt();
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		if(num > num1) 
		{
			if(num > num2) 
			{
				if(num1 > num2)
					System.out.println(num2 + " " + num1 + " " + num);
				else if (num2 > num1)
					System.out.println(num1 + " " + num2 + " " + num);
			}
		}
		
		if(num1 > num) 
		{
			if(num1 > num2) 
			{
				if(num > num2)
					System.out.println(num2 + " " + num + " " + num1);
				else if (num2 > num)
					System.out.println(num + " " + num2 + " " + num1);
			}
		}
		
		if(num2 > num) 
		{
			if(num2 > num1) 
			{
				if(num > num1)
					System.out.println(num1 + " " + num + " " + num2);
				else if (num1 > num)
					System.out.println(num + " " + num1 + " " + num2);
			}
		}
	}

}
