import java.util.Scanner;

public class GrossSalary
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary of Employee: ");
        double basicSalary = sc.nextDouble();

        double da = 0,hra = 0;

        if(basicSalary <= 10000 && basicSalary > 0)
        {
            da = basicSalary*80/100;
            hra = basicSalary*20/100;
        }
        else if(basicSalary <= 20000 && basicSalary > 10000)
        {
            da = basicSalary*90/100;
            hra = basicSalary*25/100;
        }
        else if(basicSalary > 20000)
        {
            da = basicSalary*95/100;
            hra = basicSalary*30/100;            
        }
        else
        {
            System.out.println("Negative value: invalid value Entered.");
            System.exit(0);
        }

        double grossSalary = basicSalary + da + hra;
        System.out.println("Gross Salary of the Employee: " + grossSalary);

        sc.close();
    }
}