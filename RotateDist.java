import java.util.Scanner;

public class RotateDist 
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

        RotateDist dist = new RotateDist();

        System.out.println("Rotation Distance for given array: " +  dist.rotateDist(arr));

        sc.close();
    }
    public int rotateDist(int arr[])
    {
        int dist = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]>arr[i+1])
            {
                dist = i+1;
                break;
            }
        }
        return dist;
    }
}
