import java.util.*;

public class TestVoidMethod {

	public static void main(String[] args) 
	{
		double score = 100;
		printGrade(score);
	}
	
	public static void printGrade(double score) 
	{
		if(score >= 90) System.out.println("A");
	}

}
