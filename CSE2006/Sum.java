import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Reg. no.: 22BCE11373");

        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;
        boolean validInput = false;
        while (!validInput) 
        {
            try 
            {
                System.out.print("Enter number: ");
                num1 = scanner.nextInt(); 
                System.out.print("Enter number: ");
                num2 = scanner.nextInt(); 
                validInput = true; 

            } catch (InputMismatchException e) 
            {
                System.out.println("Error: Invalid input. Please enter valid integers.");
                scanner.next(); 
            }
        }
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        scanner.close();
    }
}
