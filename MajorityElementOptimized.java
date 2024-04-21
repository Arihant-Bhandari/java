import java.util.Scanner;

public class MajorityElementOptimized
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

        MajorityElementOptimized optimum = new MajorityElementOptimized();

        optimum.majority(arr);

        sc.close();
    }
    public void majority(int arr[])
    {
        int key = 0,count = 0;

        for(int i = 0; i<arr.length;i++)
        {
            if(count == 0)
            key = arr[i];
            else if(key == arr[i])
            count += 1;
            else
            count -=1;
        }

        System.out.println("The Majority Element is: " + key);
    }
}
