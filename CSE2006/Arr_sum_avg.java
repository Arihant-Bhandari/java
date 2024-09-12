import java.util.Scanner;

public class Arr_sum_avg 
{
    public static void main(String arg[]) 
    {
        System.out.println("Name: Arihant Bhandari");
        System.out.println("Reg. no.: 22BCE11373");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        int sum = 0;
        for(int i = 0; i<n; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
            sum += arr[i]; 
        }

        double avg = (double) sum/n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);

        sc.close();
    }
}