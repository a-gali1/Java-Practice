import java.util.*;

public class Lab06_02 {

	public static void main(String[] args) {
		System.out.println(MonthApart(6,14,9,21));
		System.out.println(MonthApart(4,5,5,15));
		System.out.println(MonthApart(4,15,5,15));
		System.out.println(MonthApart(4,16,5,15));
		System.out.println(MonthApart(6,14,6,8));
		System.out.println(MonthApart(7,7,6,8));
		System.out.println(MonthApart(7,8,6,8));
		System.out.println(MonthApart(10,14,7,15));
		System.out.println(MonthApart(10,14,9,20));
		System.out.println(MonthApart(8,14,7,15));
	}

	public static boolean MonthApart(int m1, int d1, int m2, int d2) {
		
		return (Math.abs(m1-m2) >= 2) || (m1 == m2 - 1 && d1 <= d2) || (m1 == m2 + 1 && d1 >= d2);
		
	}
	
}
