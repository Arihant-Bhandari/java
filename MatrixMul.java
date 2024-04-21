import java.util.*;

public class MatrixMul
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Dimensions of Matrices: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        System.out.println();

        System.out.println("Matrix 1: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("Enter element: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println();

        System.out.println("Matrix 2: ");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("Enter element: ");
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        
        MatrixMul mul = new MatrixMul();

        mul.multiply(a,b);

        sc.close();
    }

    public void multiply(int a[][],int b[][])
    {
        int c[][] = new int[a.length][a.length];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {
                for(int k = 0; k < a.length; k++)
                {
                c[i][j] +=  a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix: ");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
