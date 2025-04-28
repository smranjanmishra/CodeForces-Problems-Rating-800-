import java.util.*;

public class BlankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long count_of_zeroes = 0;
            long maximum_length = 0;
            for (int i = 0; i < n; i++)
            {
                if (a[i] == 0)
                    count_of_zeroes++; // counting
                else
                    count_of_zeroes = 0; // reset

                maximum_length = Math.max(maximum_length, count_of_zeroes);
            }
            System.out.println(maximum_length);
        }
    }
}

// tc - O(n) = O(100)
// sc - O(n)