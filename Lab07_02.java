import java.util.*;

public class Lab07_02 {

	public static void main(String[] args) 
	{	
		double[] nums = generateOneHundred();
		double mean = meanCalc(nums);
		double deviation = deviation(nums, mean);
		double max = getMax(nums);
		double min = getMin(nums);
		
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
		System.out.println("Mean: " + mean);
		System.out.println("Standard Deviation: " + deviation);
	}
		
	public static double[] generateOneHundred()
	{
		double[] nums = new double[100];
		
		for (int i = 0; i < nums.length; i++)
		{
			double num = Math.random() * 100;
			nums[i] = num;
		}
		return nums;
	}
		
	public static double meanCalc(double[] nums)
	{
		int sum = 0;
		
		for(double e : nums)
		{
			sum += e;
		}
		
		return sum/nums.length;
	}
	
	public static double deviation(double[] nums, double mean)
	{
		double devSum = 0;
		
		for (double e : nums) devSum += (e - mean) * (e - mean);
		
		return Math.sqrt((devSum)/(nums.length - 1));
	}
		
	public static double getMax(double[] a)
	{
		double max = 0;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] > max)
				max = a[i];
		}
		
		return max;
	}
	
	public static double getMin(double[] a)
	{
		double min = 100;
		
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] < min)
				min = a[i];
		}
		
		return min;
	}
}