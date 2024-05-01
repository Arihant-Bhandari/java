import java.util.Scanner;

public class QuickSort 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        QuickSort sort = new QuickSort();

        sort.quickSort(arr, 0, arr.length - 1);

        System.out.print("The Sorted Array: [ ");

        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");

        sc.close();
    }

    public void quickSort(int arr[], int left, int right) 
    {
        if (left < right) 
        {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    public static int partition(int arr[], int left, int right) 
    {
        int pivot = arr[right];
        int i = left - 1;

        int temp;
        for (int j = left; j < right; j++) 
        {
            if (arr[j] <= pivot) 
            {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}
