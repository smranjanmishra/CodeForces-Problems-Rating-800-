import java.util.Scanner;

public class OneandTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long[] a = new long[(int) n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextLong();
            long total_number_of_twos = 0;
            long current_number_of_twos = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 2)
                    total_number_of_twos++;
            }
            long ans = -1;
            for (int i = 0; i < n; i++)  {
                if (a[i] == 2)
                    current_number_of_twos++;
                if (current_number_of_twos == (total_number_of_twos - current_number_of_twos)) {
                    ans = i + 1;
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}


// tc - O(n), sc - O(n)