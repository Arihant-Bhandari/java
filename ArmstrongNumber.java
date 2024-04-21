import java.util.Scanner;

public class ArmstrongNumber 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find Armstrong Number: ");
        
        int n = sc.nextInt();

        int copy = n,num = 0,sum = 0;
        while(copy>0)
        {
            num = copy%10;
            sum += Math.pow(num,3); 
            copy /= 10;
        }

        if(n == sum)
        System.out.println("The Armstrong Number is: " + sum);
        else
        System.out.println("Given number is not an Armstrong Number.");

        sc.close();
    }
}
