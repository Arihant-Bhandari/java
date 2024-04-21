import java.util.Scanner;

public class Factorial 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find Factorial: ");
        
        int n = sc.nextInt();

        int fact = 1;

        for(int i = n; i > 0 ; i--)
        {
            fact *= i;
        }

        System.out.println("The Factorial is: " + fact);
        sc.close();
    }
}
