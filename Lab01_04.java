import java.util.Random;
import java.util.Scanner;

public class Lab01_04 {

	public static void main(String[] args) 
	{
	
		int height = 10;
		int width = 10;
		int j = 0;
		String str = "";
		
		for(int i = 0; i < height; i++) 
		{
			while(j < width) 
			{
				str = str + ' ';
				str = str + "|";
				j++;
				System.out.println(str);
			}
		}
		
		
	}
}
