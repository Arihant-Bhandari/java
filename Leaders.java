import java.util.Scanner;

public class Leaders 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        Leaders lead = new Leaders();
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }    

        lead.leader(arr);

        sc.close();
    }
    public void leader(int arr[])
    {
        System.out.print("\nThe Leaders are: ");

        for(int i = 0;i<arr.length;i++)
        {
            if (i==arr.length-1) 
            {
                System.out.print(arr[i]);
                System.exit(0);
            }
            if(arr[i] >= arr[i+1])
            System.out.print(arr[i] + " ");
        }
    }
}
