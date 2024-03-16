import java.util.Scanner;

public class SquareRootNR 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find Square Root: ");
        double n = sc.nextDouble();

        if (n < 0) {
            System.out.println("Square root of a negative number is not defined.");
            System.exit(0);
        }

        double x = n, temp = 0;
        double epsilon = 1e-15;
        while (Math.abs(x - temp) > epsilon) 
        {
            temp = x;
            x = (x + n / x) / 2.0;
        }

        System.out.println("Square Root of " + n + " is: " + x);
        sc.close();
    }
}
