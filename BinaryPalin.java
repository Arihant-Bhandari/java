import java.util.Scanner;

public class BinaryPalin 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check if Binary palindrome: ");
        
        int n = sc.nextInt();

        BinaryPalin bp = new BinaryPalin();

        System.out.println(Integer.toBinaryString(n));

        if(bp.palindrome(Integer.toBinaryString(n)) == true)
            System.out.println("Binary Palindrome: " + n);
        else
            System.out.println("Not a Binary palindrome.");
        sc.close();
    }
    public boolean palindrome(String input)
    {
        for(int i = 0; i<input.length();i++)
        {
            if((int)input.charAt(i) != (int)input.charAt(input.length()-1-i))
            return false;
            else
            continue;
        }
        return true;
    }    
}
