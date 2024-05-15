import java.util.Scanner;

public class Lab02_08 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter width and heigth of a rectangle: ");
		
		float width = scan.nextFloat();
		float height = scan.nextFloat();
			
		double perimeter = 2*width + 2*height;
		
		double area = width*height;
		
		double diagonal = Math.sqrt(width*width + height*height);
		
		System.out.println("Permiter: " + perimeter);		
		
		System.out.println("Area: " + area);	
		
		System.out.println("Diagonal: " + diagonal);	
	}

}
