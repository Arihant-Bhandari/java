import java.util.Scanner;

public class MaxEquilibriumSum 
{
    public static void main(String arg[] ) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();
        
        MaxEquilibriumSum pivot = new MaxEquilibriumSum();

        System.out.println("Maximum Equilibrium Sum: " + pivot.equilibrium(arr,n));

        sc.close();
    }
    public int equilibrium(int arr[], int n)
    {
        int sum = 0,right = 0,left = 0,pivot = 0;

        for(int i = 0; i<n ; i++)
        {
            right = arr[i];

            for(int j = 0; j<n ; j++)
            {
                if(j<=i) 
                    left += arr[j];
                else
                    right += arr[j];
            }

            if (left == right) 
            {
                pivot = arr[i];
                sum = Math.max(0,left);
            }

            right = 0;
            left = 0;
        }

        System.out.println("The Pivot or Equilibrium point of this Array is: " + pivot);
        return sum;
    }
}