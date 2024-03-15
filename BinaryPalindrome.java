import java.util.Scanner;

public class BinaryPalindrome
{
    public static void main(String arg[])
    {    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if Binary palindrome: ");
        
        int n = sc.nextInt();

        BinaryPalindrome bp = new BinaryPalindrome();

        System.out.println(Integer.toBinaryString(n));

        if(bp.binary(n) == true)
            System.out.println("Binary Palindrome: " + n);
        else
            System.out.println("Not a Binary palindrome.");
        sc.close();
    }
    public boolean binary(int n)
    {
        String s = "";
        
        while(n>0)
        {
            s = Integer.toString(n&1) + s;
            n >>= 1;
        }

        StringBuilder s1 = new StringBuilder(s);

        s1 = s1.reverse();
        return s.equals(s1.toString())?true:false;
    }
}