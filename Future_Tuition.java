import java.util.*;

public class Future_Tuition {

	public static void main(String[] args) 
	{
		double currentTuition = 10000;
		double Tuition = currentTuition;
		
		int years = 0;
		
		while(Tuition < currentTuition *2) 
		{
			Tuition *= 1 + 0.07;
			years++;
		}
		
		System.out.println("Current Tuition " + currentTuition + " will be doubled as " + Tuition + " in " + years + " years.");
		
	}

}
