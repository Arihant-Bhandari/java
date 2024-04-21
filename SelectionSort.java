import java.util.*;

public class SelectionSort 
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

        SelectionSort sort = new SelectionSort();

        sort.selection(arr);

        sc.close();
    }

    public void selection(int arr[])
    {
        int pos, temp;
        for(int i = 0; i < arr.length - 1; i++)
        {
            pos = i;
            for(int j = i + 1; j < arr.length; j++)
            {
                if(arr[j] < arr[pos])
                    pos = j;
            }

            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
        
        System.out.print("The Sorted Array: [ ");

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");
    }
}
