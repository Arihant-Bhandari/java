import java.util.Scanner;

public class ModInv
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");

        int a = sc.nextInt();

        System.out.print("Enter Second number: ");

        int b = sc.nextInt();

        ModInv obj = new ModInv();

        int res = obj.moduloInverse(a,b);

        if(res>0)
        System.out.println("The Modulo-Inverse is: " + res);
        else
        System.out.println("Modulo-Inverse does not exist.");
        
        sc.close();
    }
    public int moduloInverse(int a,int b)
    {
        int temp = 0, t = 0, t1 = 0, t2 = 1, q = 0;
        while(a%b != 0)
        {
            temp = a;
            if(a != 0)
            {
                if(a<b)
                {
                    q = (int) b/a;
                    t = t1-(t2*q);
                    t1=t2;
                    t2=t;
                }        
            }
            a = b%a;
            b = temp;                
        }
        
        return t1;
    }
}