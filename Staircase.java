import java.util.Scanner;

public class Staircase
{
    public static void main(String arg[])
    {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number for the step you want possible combinations in terms of climbing 1 or 2 steps at a time for: ");

        int n = sc.nextInt();

        int fibo[] = new int[n+2];

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i<n+2;i++)
        {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.print("Fibonacci Series: ");

        System.out.print("No. of ways to climb to step " + n + " are: " + fibo[n+1]);
        
        sc.close();
    }
}