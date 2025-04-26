import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long[] copyA = Arrays.copyOf(a, (int) n);
            Arrays.sort(copyA);

            if (Arrays.equals(a, copyA) || k > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

// tc - O(nlog2n) - O(100log2(100)) = 100*7 = 700
// sc - O(n)