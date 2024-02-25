import java.util.Scanner;

public class CountCoPrime 
{
    public static void main(String arg[])
    {    
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number to find number of Co-Prime numbers in range: ");

        int n = sc.nextInt();

        int prime[] = new int[n-1];

        for(int i = 0;i<n-1;i++) 
        {
            prime[i] = i+2;
        }

        int temp = 0;

        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j <n/2;j++)
            {
                if(prime[i]!=0)
                {
                    temp = prime[i]*prime[i] + j * prime[i];
                    if(temp<=n)
                    prime[temp-2] = 0;
                    else
                    continue;
                }
                else
                    continue;
            }
        }

        for(int i = 0; i<n-1; i++)
        {
            if(prime[i] == 0)
                continue;
            else if(n % prime[i] == 0)
                continue;
            else
                prime[i] = 0;
        }
        double count = n;
        for(int i = 0; i<n-1; i++)
        {
            if(prime[i] != 0)
            {   
                count = count * (1 - ( 1 / (double) prime[i] ));
            }
            else
                continue;
        }

        System.out.println("The number of Co-Primes: " + (int) count);

        sc.close();
    }
}