import java.util.Scanner;

public class GCD 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");

        int a = sc.nextInt();

        System.out.print("Enter Second number: ");

        int b = sc.nextInt();

        GCD obj = new GCD();

        System.out.println("The GCD is: " + obj.gcd(a,b));

        sc.close();
    }
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
