import java.util.Scanner;

public class ServalandMochasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            int flag = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++)
                {
                    if (gcd(a[i], a[j]) <= 2) {
                        flag = 1;
                    }
                }
            }
            if (flag == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// tc - O(n^2 * log2(min(a[i], a[j])))
// sc - O(n)