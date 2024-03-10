import java.util.Scanner;

public class ChineseRemainder 
{
    int n;
    int rem[];
    int div[];
    public static void main(String[] args) 
    {
        ChineseRemainder remain = new ChineseRemainder();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of remainder-divisor pairs: ");
        remain.n = sc.nextInt();
        
        remain.rem = new int[remain.n];
        remain.div = new int[remain.n];

        System.out.println("\nEnter Remainders: ");
        for(int i = 0; i<remain.n; i++)
        {
            remain.rem[i] = sc.nextInt();
        }
        System.out.println("Enter Divisors: ");
        for(int i = 0; i<remain.n; i++)
        {
            remain.div[i] = sc.nextInt();
        }
        
        int solution = remain.remainder();
        if (solution != -1) 
        System.out.println("The number is: " + solution);
        
        else 
        System.out.println("No solution exists.");

        sc.close();
    }
    public int remainder()
    {
        int x = 1,i = 0;

        while(true)
        {
            for(i = 0; i<n;i++)
            {
                if(x % div[i] != rem[i])
                    break;
            }
            if(i == n)
            {
                return x;
            }
            x++;
        }
    }
}
