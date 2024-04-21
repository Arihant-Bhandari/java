import java.util.Scanner;

public class MajorityElementTrivial {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        MajorityElementTrivial trivial = new MajorityElementTrivial();

        trivial.majority(arr);

        sc.close();
    }

    public void majority(int arr[]) {
        int count[] = new int[(int)(arr.length/2+1)];
        int key;

        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            count[key]++;

            // Increment count for the current element
        }

        int major = -1, max = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                major = i;
            }
        }

        if (max > arr.length / 2)
            System.out.println("The Majority element is: " + major);
        else
            System.out.println("No Majority element");
    }
}
