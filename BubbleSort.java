import java.util.*;

public class BubbleSort 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        BubbleSort sort = new BubbleSort();

        sort.bubble(arr);

        sc.close();
    }
    public void bubble(int arr[])
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
        
        System.out.print("The Sorted Array: [ ");

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");
    }
}