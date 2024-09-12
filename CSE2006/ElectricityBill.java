import java.util.Scanner;

public class ElectricityBill 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();

        double bill = 0.0;

        if (units <= 50) 
        {
            bill = units * 0.50;
        } 
        else if (units <= 200) 
        {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } 
        else if (units <= 450) 
        {
            bill = (50 * 0.50) + (150 * 0.75) + ((units - 200) * 1.20);
        } 
        else 
        {
            bill = (50 * 0.50) + (150 * 0.75) + (250 * 1.20) + ((units - 450) * 1.50);
        }

        double surcharge = bill * 0.20;
        bill += surcharge;
        System.out.println("Total electricity bill: Rs. " + bill);

        sc.close();
    }
}