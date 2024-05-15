import java.util.*;

public class Lab07_04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of students: ");
        int num = scan.nextInt();

        String[] names = new String[num];
        double[] scores = new double[num];

        for (int i = 0; i < num; i++) 
        {
            System.out.println("Enter name of student: ");
            names[i] = scan.next();

            System.out.println("Enter score of student: ");
            scores[i] = scan.nextDouble();
        }

        Sort(scores, names);

        System.out.println("------------------");
        System.out.println("Gradebook Records (Descending Order):");
        System.out.println("------------------");

        for (int i = 0; i < num; i++) System.out.println("Name: " + names[i] + "        Score: " + scores[i]);

    }

    public static void Sort(double[] a, String[] b) 
    {
        for (int i = 0; i < a.length - 1; i++) 
        {
            int maxIndex = i;
            
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[j] > a[maxIndex]) maxIndex = j;
            }
            if (maxIndex != i) 
            {
                double tempScore = a[i];
                a[i] = a[maxIndex];
                a[maxIndex] = tempScore;

                String tempName = b[i];
                b[i] = b[maxIndex];
                b[maxIndex] = tempName;
            }
        }
    }
}
