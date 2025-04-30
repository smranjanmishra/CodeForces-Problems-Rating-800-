import java.util.*;

public class MakeItBeautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            Arrays.sort(a);
            long maxNumber = a[n - 1];
            long minNumber = a[0];
            if (maxNumber == minNumber) {
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
                System.out.print(maxNumber + " ");
                for (int i = 0; i < n - 1; i++)
                    System.out.print(a[i] + " ");
                System.out.println();
            }
        }
    }
}


// tc : O(nlogn)
// sc : O(n)