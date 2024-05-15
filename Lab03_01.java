import java.util.*;

public class Lab03_01 {

	public static void main(String[] args) 
	{
		Random ran = new Random();
		
		int ranSAT = ran.nextInt(400, 1601);
		
		System.out.println("SAT score: " + ranSAT);
		
		if (ranSAT >= 1200)
			System.out.println("You are admitted");
		else
			System.out.println("You are not admitted");
	}

}
