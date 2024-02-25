import java.util.Scanner;

public class SegmentedSieve {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start point: ");
        int start = sc.nextInt();

        System.out.print("Enter End point: ");
        int end = sc.nextInt();

        if (end < start) {
            System.out.println("Invalid input. End point should be greater than or equal to start point.");
            sc.close();
            return;
        }

        int range = end - start + 1;

        int[] primesInRange = new int[range];
        for (int i = 0; i < range; i++) {
            primesInRange[i] = i + start;
        }

        int sqrtEnd = (int) Math.sqrt(end);
        int[] smallPrimes = new int[sqrtEnd - 1];
        for (int i = 0; i < sqrtEnd - 1; i++) {
            smallPrimes[i] = i + 2;
        }

        for (int i = 0; i < smallPrimes.length; i++) {
            if (smallPrimes[i] != 0) {
                for (int j = smallPrimes[i] * smallPrimes[i]; j <= sqrtEnd; j += smallPrimes[i]) {
                    smallPrimes[j - 2] = 0;
                }
            }
        }

        System.out.print("\nPrimes: ");

        for (int i = 0; i < smallPrimes.length; i++) {
            if (smallPrimes[i] != 0) {
                int firstMultiple = Math.max(smallPrimes[i] * smallPrimes[i], start);
                for (int j = firstMultiple; j <= end; j += smallPrimes[i]) {
                    primesInRange[j - start] = 0;
                }
            }
        }

        for (int prime : primesInRange) {
            if (prime > 0) {
                System.out.print(prime + " ");
            }
        }

        sc.close();
    }
}