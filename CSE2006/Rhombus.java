import java.util.Scanner;

public class Rhombus
{
    public static void main(String[] args) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the rhombus: ");
        int rows = sc.nextInt();
        for (int i = rows - 1; i >= 0; i--) 
        {
            for (int j = rows; j > i; j--) 
            System.out.print(" ");
            for (int k = 1; k <= rows-1; k++) 
            System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}
