import java.util.*;

public class MaxElement 
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
        
        MaxElement max = new MaxElement();

        max.maximum(arr);

        sc.close();
    }

    public void maximum(int arr[])
    {
        int pos = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(pos < arr[i])
                pos = arr[i];
        }

        System.out.print("Maximum Element in Array: " + pos);
    }
}
