import java.util.Scanner;

public class UnitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long positive_count = 0;
            long negative_count = 0;
            for (int i = 0; i < n; i++)
            {
                if (a[i] == 1)
                    positive_count++;
                else
                    negative_count++;
            }

            long operations = 0;
            while (positive_count < negative_count || negative_count % 2 == 1)
            {
                operations++;
                positive_count++;
                negative_count--;
            }

            System.out.println(operations);
        }
    }
}

// tc - O(n)
// sc - O(n)