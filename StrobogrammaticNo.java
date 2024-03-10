import java.util.HashMap;
import java.util.Scanner;

public class StrobogrammaticNo 
{
    HashMap <Character,Character> hash = new HashMap<>();

    public static void main(String arg[]) 
    {
        StrobogrammaticNo strobo = new StrobogrammaticNo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check: ");
        String input = sc.nextLine();
        
        if(strobo.check(input) == true)
            System.out.println("Strobogrammatic: " + input);
        else
            System.out.println("Given input is not a Strobogrammatic number.");
        sc.close();
    }
    public boolean check(String input)
    {
        hash.put('0','0');
        hash.put('1','1');
        hash.put('6','9');
        hash.put('8','8');
        hash.put('9','6');

        char left,right,mapping;

        for(int i = 0;i<input.length(); i++)
        {
            left = input.charAt(i);
            right = input.charAt(input.length()-1-i);

            mapping = hash.getOrDefault(left, '-');

            if(mapping == '-')
                return false;
            else if(mapping != right)
                return false;
            else
                continue;
        }
        return true;
    }
}
