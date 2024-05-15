import java.util.*;

public class forEach {

	public static void main(String[] args) 
	{

		int[] list = {1, 2, 3, 4, 5};
		
		for (int e: list) System.out.print(e + " ");
		
		System.out.println();
		System.out.println(list);
		System.out.println(Arrays.toString(list));
	}

}
