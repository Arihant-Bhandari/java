import java.util.Scanner;

public class HollowSquare 
{
    public static void main(String[] args) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the hollow square: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n+1; i++) 
        {
            for (int j = 1; j <= n; j++) 
            {
                if (i == 1 || i == n+1 || j == 1 || j == n) 
                System.out.print("* "); 
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        sc.close();
    }
}
