import java.util.Scanner;

public class Multiplication 
{
    public static void main(String[] args) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Positive Integer: ");
        int num = sc.nextInt();

        if(num>0)
        {
            System.out.println("Multiplication Table: " + num);
            for (int i = 1; i <= 10; i++) 
            {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        }
        else
        System.out.println("Invalid input.");
        
        sc.close();
    }
}
