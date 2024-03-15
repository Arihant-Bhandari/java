import java.util.Scanner;

public class LongestSequenceZeroes
{
    public static void main(String arg[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bits to check: ");
        
        String n = sc.next();

        int bin[] = new int[n.length()];

        for(int i = 0;i<n.length();i++)
        {
            bin[i] = Character.getNumericValue(n.charAt(i));
        }

        System.out.print("Enter the number of available flips: ");

        int k = sc.nextInt();

        LongestSequenceZeroes zeroes = new LongestSequenceZeroes();

        System.out.println("Longest Sequence of zeroes is of length:" + zeroes.longestSequence(bin,k));
        sc.close();
    }
    int longestSequence(int bin[],int k)
    {
        int max = 0, flip = 0, start = 0;

        for(int end = 0;end < bin.length;end++)
        {
            if(bin[end] == 1)
                flip++;
            while(flip>k)
            {
                if(bin[start] == 1)
                    flip--;
                start++;
            }
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
