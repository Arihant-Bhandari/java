import java.util.*;

public class LinearSearch 
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

        System.out.println("Enter the Key to be found: ");
        int key = sc.nextInt();
        System.out.println();
        
        LinearSearch linear = new LinearSearch();

        linear.search(arr,key);

        sc.close();
    }

    public void search(int arr[],int key)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(key == arr[i])
            System.out.println("Found Key at: " + i + " index or at the " + (i+1) + "th posiition.");
        }
    }
}
