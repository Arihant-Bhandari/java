import java.util.Scanner;

public class LeadersRev 
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        LeadersRev lead = new LeadersRev();

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0;i<n;i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }    

        lead.leaderRev(arr);

        sc.close();
    }
    public void leaderRev(int arr[])
    {
        int max = arr[arr.length-1];

        System.out.print("The Leaders are: ");

        System.out.print(max + " ");
        
        for(int i = arr.length-1;i>=0;i--)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                System.out.print(max + " ");
            }
        }
    }
}
