import java.util.Scanner;

public class LibraryFine 
{
    public static void main(String[] args) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days the book is returned late: ");
        int daysLate = sc.nextInt();
        
        double fine = 0.0;

        if (daysLate>0&&daysLate <= 5) 
        {
            fine = daysLate * 0.50;
            System.out.println("The fine is: Rs. " + fine);
        } 
        else if (daysLate <= 10) 
        {
            fine = (5 * 0.50) + ((daysLate - 5) * 1.00);
            System.out.println("The fine is: Rs. " + fine);
        } 
        else if (daysLate <= 30) 
        {
            fine = (5 * 0.50) + (5 * 1.00) + ((daysLate - 10) * 5.00);
            System.out.println("The fine is: Rs. " + fine);
        } 
        else 
        {
            System.out.println("Your membership has been cancelled.");
        }
        sc.close();
    }
}