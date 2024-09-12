import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no. of Fibonacci Series numbers: ");
        int n = sc.nextInt();

        int in_1 = 0, in_2 = 1,in_3;

        System.out.print("Fibonacci Series: " + in_1 + " " + in_2);
        for(int i =2; i<n; i++)
        {
            in_3 = in_1 + in_2;
            System.out.print(" " + in_3);
            in_1 = in_2;
            in_2 = in_3;
        }

        sc.close();
    }
}