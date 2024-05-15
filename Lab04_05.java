import java.util.*;

public class Lab04_05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 4-digit binary: ");

        String bin = scan.nextLine().substring(0, 4); // Corrected to use substring(0, 4)

        int decimal = 0;

        if (bin.substring(0).equals("1")) {
            decimal += Math.pow(2, 0);
        }
        else decimal += 0;

        if (bin.substring(1).equals("1")) {
            decimal += Math.pow(2, 1);
        }
        else decimal += 0;

        if (bin.substring(2).equals("1")) {
            decimal += Math.pow(2, 2);
        }
        else decimal += 0;

        if (bin.substring(3).equals("1")) {
            decimal += Math.pow(2, 3);
        }
        else decimal += 0;

        System.out.println("Decimal: " + decimal);

    }

}
