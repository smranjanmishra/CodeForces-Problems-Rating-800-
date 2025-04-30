import java.util.*;

public class EverybodyLikesGoodArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int)n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            int operationsCount = 0;
            for (int i = 0; i < n - 1; i++) {
                if ((a[i] % 2) == (a[i + 1] % 2))
                    operationsCount++;
            }

            System.out.println(operationsCount);
        }
    }
}

// tc - O(n) = O(100)
// sc - O(n) = O(100)