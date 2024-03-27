import java.util.*;

public class LeaderArrList 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        LeaderArrList lead = new LeaderArrList();
        
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
        ArrayList<Integer> list = new ArrayList<>();

        boolean flag = false;

        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length-1;j++)
            {
                if(arr[i]<arr[j])
                {
                    flag = true;
                    break;
                }
            }

            if(flag == false)
            list.add(arr[i]);

            flag = false;
        }

        System.out.println(list);
    }
}
