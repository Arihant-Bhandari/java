import java.util.Scanner;

public class SimpleSieve
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

