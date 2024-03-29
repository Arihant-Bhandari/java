import java.util.Scanner;

public class MaxEquilibriumSumEff 
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

        MaxEquilibriumSumEff pivot = new MaxEquilibriumSumEff();

        System.out.println("Maximum Equilibrium Sum: " + pivot.equilibrium(arr,n));

        sc.close();
    }
    public int equilibrium(int arr[], int n)
    {
        int sum = 0,pivot = 0;

        int left[] = new int[n];
        int right[] = new int[n];

        left[0] = arr[0];
        right[n-1] = arr[n-1];

        for(int i = 1; i<n ; i++)
        {
            left[i] += left[i-1] + arr[i];
            right[n-1-i] += right[n-i] + arr[n-1-i];
        }

        for(int i = 0; i<n ; i++)
        {
            if(left[i] == right[i])
            {
                pivot = arr[i];
                sum = left[i];
            }
        }

        System.out.println("The Pivot or Equilibrium point of this Array is: " + pivot);
        return sum;
    }
}