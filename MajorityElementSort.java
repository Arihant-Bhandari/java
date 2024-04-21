import java.util.Scanner;

public class MajorityElementSort 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        MajorityElementSort sort = new MajorityElementSort();

        sort.majority(arr);

        sc.close();
    }
    public void majority(int arr[])
    {
        int temp;
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("The Majority Element: " + arr[arr.length/2]);
    }
}
