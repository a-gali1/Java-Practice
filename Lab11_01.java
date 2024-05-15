import java.util.*;

public class Lab11_01 {

	public static void main(String[] args) {
	
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < 100; i++) { list.add((int)(Math.random()*100)); }
		
		removeEvens(list);
		
		for(int i = 0; i < list.size(); i++) { System.out.print(list.get(i) + ", ");}
		
	}
	
	public static ArrayList<Integer> removeEvens(ArrayList<Integer> a) {
		for(int i = 0; i < a.size(); i++) { 
			if(a.get(i) % 2 == 0) {
				a.remove(i);
				i--;
			}
		}
		return a;
	}
}