import java.util.Scanner;

public class Fibonacci
{
    public static void main(String arg[])
    {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number for fibonacci series stopping point: ");

        int n = sc.nextInt();

        int fibo[] = new int[n];

        fibo[0] = 0;
        fibo[1] = 1;

        for(int i = 2; i<n;i++)
        {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        System.out.print("Fibonacci Series: ");

        for(int i = 0; i<n;i++)
        {
            System.out.print(" " + fibo[i] + " ");
        }
        sc.close();
    }
}