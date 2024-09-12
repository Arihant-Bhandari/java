import java.util.Scanner;

public class Day_2
{
    public static void main(String arg[]) 
    {
        Scanner sc  =new Scanner(System.in);

        System.out.println("");
        float a = sc.nextFloat();

        System.out.println("");
        float b = sc.nextFloat();

        System.out.println("Addition: " + (a+b));
        System.out.println("Subtraction: " + (a-b));
        System.out.println("Multiplication: " + (a*b));
        System.out.println("Division: " + (a/b));
        System.out.println("Remainder: " + (a%b));

        sc.close();
    }
}