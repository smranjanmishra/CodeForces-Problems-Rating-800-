import java.util.Scanner;

public class WeNeedtheZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();

            long total_xor = 0;
            for (int i = 0; i < n; i++)
                total_xor ^= a[i];
            if (n % 2 == 1) {
                System.out.println(total_xor);
            }
            else {
                if (total_xor == 0)
                    System.out.println(total_xor);
                else
                    System.out.println(-1);
            }
        }
    }
}


// tc - O(n)
// sc - O(n)