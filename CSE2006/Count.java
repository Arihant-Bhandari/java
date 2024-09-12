import java.util.Scanner;

public class Count 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        int pos = 0, neg = 0, zero = 0;

        Scanner sc = new Scanner(System.in);

        String num;
        while(true)
        {
            System.out.print("Enter number (Enter Quit/Exit to exit): ");
            num = sc.nextLine();
            
            if (num.equalsIgnoreCase("Quit") || num.equalsIgnoreCase("Exit")) 
            break;
            
            try
            {
                int number = Integer.parseInt(num);
                if(number == 0)
                    zero += 1;
                else if(number > 0)
                    pos += 1;
                else
                    neg += 1;
            }
            catch (NumberFormatException e) 
            {
                System.out.println("Invalid input. Please enter a valid number or type 'Quit' or 'Exit' to finish.");
            }  
        }

        System.out.println("No. of Zeroes entered: " + zero);
        System.out.println("No. of Positive numbers: " + pos);
        System.out.println("No. of Negative numbers: " + neg);
        
        sc.close();
    }
}