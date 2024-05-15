import java.util.*;

public class Nested_Loops {

	public static void main(String[] args) 
	{
		for(int i = 1; 1 < 10; i++) 
		{
			System.out.println(i + " | ");
			for(int j = 1; j < 10; j++) 
			{
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
	}

}
