import java.util.HashMap;
import java.util.Scanner;

public class MajorityElementHash 
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

        MajorityElementHash major = new MajorityElementHash();

        major.majority(arr);

        sc.close();
    }
    public void majority(int arr[])
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i : arr)
        {
            hash.put(i,hash.getOrDefault(i,0) + 1);
        }

        for(int key : hash.keySet())
        {
            if(hash.get(key) > (int) arr.length/2)
            System.out.println("The Majority Element is: " + key);
        }
    }
}
