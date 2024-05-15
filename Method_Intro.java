import java.util.*;

public class Method_Intro {

	public static void main(String[] args) 
	{
		int maxNum= max1(5, 2);
		System.out.println("Max: " + maxNum);
	}
	
	public static int max1(int n1, int n2) 
	{
		int result = 0;
		if(n1 > n2) result = n1;
		else result = n2;
		return result;
	}
	
	public static int max2(int n1, int n2) 
	{
		return n1 > n2 ?n1:n2;
	}

}
