public class ArmstrongNumber
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        ArmstrongNumber arm = new ArmstrongNumber();

        System.out.print("Armstrong numbers between 1 to 1000: ");

        for(int i = 1; i<=1000; i++)
        {
            if(arm.armstrong(i)==true)
            System.out.print(i + " ");
            else
            continue;
        }
    }
    public boolean armstrong(int m)
    {
        int n = m;
        int i = 0, sum = 0;
        while(n>0)
        {
            i = n%10;
            n = n/10;
            sum = sum + (int) Math.pow(i,Integer.toString(m).length());
        }

        return sum==m;
    }
}