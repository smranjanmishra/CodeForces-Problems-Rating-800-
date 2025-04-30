import java.util.*;

public class JaggedSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while (testCases-- > 0) {
            int n = sc.nextInt();
            long[] numbers = new long[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = sc.nextLong();
            }

            if (numbers[0] == 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}


// tc - O(n)
// sc - O(n)