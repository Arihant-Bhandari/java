import java.util.Scanner;

public class JaggedArr 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Reg. no.: 22BCE11373");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        int arr[][] = new int[n][];

        for(int i = 0; i<n; i++)
        {
            arr[i] = new int[i+1];
        }

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            arr[i][j] = i+j+1;
        }

        for(int i = 0; i<n; i++)
        {
            for(int j = 0; j<arr[i].length; j++)
            System.out.print(arr[i][j]);

            System.out.println();
        }

        sc.close();
    }
}