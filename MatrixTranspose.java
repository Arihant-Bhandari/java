import java.util.*;

public class MatrixTranspose
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Dimensions of Matrices: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        System.out.println();

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print("Enter element: ");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        
        MatrixTranspose trans = new MatrixTranspose();

        trans.transpose(arr);

        sc.close();
    }

    public void transpose(int arr[][])
    {
        int temp;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp; 
            }
        }

        System.out.println("Transpose Matrix: ");
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}