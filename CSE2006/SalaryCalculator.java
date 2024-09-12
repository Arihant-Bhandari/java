import java.util.Scanner;

public class SalaryCalculator 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Gender of the Candidate (Male/Female): ");
        String gender=sc.nextLine();

        System.out.print("Enter the Qualification level (Graduate/Post-Graduate): ");
        String qualification=sc.nextLine();

        System.out.print("Enter the Years of Service: ");
        int years=sc.nextInt();

        if (gender.equalsIgnoreCase("male") == true) 
        {
            if(years<10)
            {
                if(qualification.equalsIgnoreCase("graduate") == true)
                {
                    System.out.println("Salary is " + 7000);
                }
                else
                System.out.println("Salary is " + 10000);
            } 
            else
            {
                if(qualification.equalsIgnoreCase("graduate") == true)
                {
                    System.out.println("Salary is " + 10000);
                }
                else
                System.out.println("Salary is " + 15000);
            }
        }
        else
        {
            if(years<10)
            {
                if(qualification.equalsIgnoreCase("graduate") == true)
                {
                    System.out.println("Salary is " + 6000);
                }
                else
                System.out.println("Salary is " + 10000);
            } 
            else
            {
                if(qualification.equalsIgnoreCase("graduate") == true)
                {
                    System.out.println("Salary is " + 9000);
                }
                else
                System.out.println("Salary is " + 12000);
            }
        }

        sc.close();
    }
}