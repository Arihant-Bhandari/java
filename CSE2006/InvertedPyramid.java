import java.util.Scanner;

class InvertedPyramid   
{
    public static void main(String[] args) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Registration number: 22BCE11373");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for inverted pyramid: ");
        int rows = sc.nextInt();
        for (int i = rows; i >= 1; i--) 
        {
            for (int j = i; j < rows; j++) 
            System.out.print(" ");
            for (int k = 1; k <= i; k++) 
            System.out.print("* ");
            System.out.println();
        }
        sc.close();
    }
}