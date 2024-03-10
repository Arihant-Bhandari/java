import java.util.Scanner;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter to check: ");
        String input = sc.nextLine();

        boolean flag = false;
        for(int i = 0; i<input.length();i++)
        {
            if((int)input.charAt(i) == (int)input.charAt(input.length()-1-i))
            flag = true;
            else
            continue;
        }

        if(flag == true)
        System.out.println("The given input is a Palindrome: " + input);
        else
        System.out.println("The given input is not a Palindrome.");
        
        sc.close();
    }
}
