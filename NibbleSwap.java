import java.util.Scanner;

public class NibbleSwap 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to encrypt: ");

        int n = sc.nextInt();

        int m = ((n&0x0F)<<4)|((n&0xF0)>>4);

        System.out.println("The Encrypted number is: " + m);
        sc.close();
    }
}
