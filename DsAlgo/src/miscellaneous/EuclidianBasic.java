package miscellaneous;
import java.util.Scanner;

public class EuclidianBasic 
{

    public static void main(String[] args) 
    {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 numbers separated by space: ");
        x = scanner.nextInt();
        y = scanner.nextInt();

        System.out.println("GCD of the two numbers is: " + findGCD(x, y));
        scanner.close();

    }

    public static int findGCD(int x, int y) 
    {
        if (x == 0) 
            return y;

        else 
            return findGCD(y % x, x);

    }
}