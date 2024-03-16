import java.util.Scanner;

public class SquareRoot 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to find Square Root: ");
        double n = sc.nextDouble();

        if(n>0)
        {
            double temp[] = new double[(int)n/2];

            temp[0] = n;
            for(int i = 1; i<temp.length;i++)
            {
                temp[i] = (temp[i-1]/2) + (n/(2*temp[i-1]));
            }

            System.out.println("Square Root of " + n + " is: " + temp[temp.length-1]);
        }
        else if(n==0)
            System.out.println("Square Root of " + n + " is: " + 0);
        else
            System.out.println("Square Root is not defined for negative numbers.");
        sc.close();
    }
}
