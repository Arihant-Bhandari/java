import java.util.*;

public class BinarySearch 
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

        System.out.print("Enter the Key to be found: ");
        int key = sc.nextInt();
        
        System.out.println();
        
        BinarySearch binary = new BinarySearch();

        binary.search(arr,key);

        sc.close();
    }

    public void search(int arr[],int key)
    {
        int left = 0, right = arr.length-1 , mid;
        while(left <= right)
        {
            mid = (left + right)/2;

            if(arr[mid] == key)
            {
                System.out.println("Key at index: " + mid);
                return;
            }
            else if(arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println("Key is not in Array.");
    }
}
