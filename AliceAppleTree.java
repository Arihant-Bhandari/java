import java.util.Scanner;

public class AliceAppleTree
{
    public static void main(String arg[])
    {    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of apples to be plucked: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of apples on a tree: ");
        int k = sc.nextInt();
        System.out.print("Enter the number of trees in North: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of trees in East: ");
        int e = sc.nextInt();
        System.out.print("Enter the number of trees in West: ");
        int w = sc.nextInt();
        System.out.print("Enter the number of trees in South: ");
        int s = sc.nextInt();

        AliceAppleTree alice  =new AliceAppleTree();

        int flag = alice.tree(m,k,n,e,w,s);

        if(flag == m)
            System.out.println("Picking minimum number of Apples from Trees is Guaranteed.");
        else
            System.out.println("Cannot pick required minimum number of Apples.");
        sc.close();
    }
    public int tree(int m , int k , int n , int e , int w , int s)
    {
        if(m<=(s*k))
            return m;
        else if(m<=(s*k+e+w))
            return m;
        else
            return -1;
    }
}