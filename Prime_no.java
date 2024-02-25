import java.util.Scanner;

public class Prime_no
{
    public static void main(String arg[])
    {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to find number of prime numbers inside range: ");

        int n = sc.nextInt();

        int prime[] = new int[n-1];

        for(int i = 0;i<n-1;i++)
        {
            prime[i] = i+2;
        }

        for(int i = 2;i<n-1;i++)
        {
            for(int j = 2;j<Math.sqrt(n);j++)
            {
                if(prime[i]%j==0)
                prime[i] = 0;
                else
                continue;
            }
        }
        for(int i = 0;i<n-1;i++)
        {
            if(prime[i]>0)
            System.out.print(prime[i] + " ");
            else
            continue;
        }
        sc.close();
    }
}