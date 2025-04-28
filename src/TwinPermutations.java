import java.util.*;

public class TwinPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            for (int i = 0; i < n; i++)
            {
                System.out.print((n + 1 - a[i]) + " ");
            }
            System.out.println();
        }
    }
}

// tc = O(n) = O(100)
// sc = O(n) = O(100)