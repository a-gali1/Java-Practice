import java.util.*;

public class LockerExitTicket {

	public static void main(String[] args) 
	{    
		boolean[] locker = new boolean[100];

	    locker = lockers(locker); 
	}

    public static boolean[] lockers(boolean[] a) 
    {   
    	for (int i = 0; i < a.length; i++) 
    	{
            for (int j = i; j < a.length; j += (i + 1)) a[j] = !a[j];
        }

        for (int i = 0; i < a.length; i++) 
        {
            if (a[i]) System.out.print((i + 1) + " ");
        } 
        
        return a;
    }
}
