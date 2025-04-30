import java.util.*;

public class ExtremelyRound {
    static boolean check(long x) {
        long digitCount = 0;
        long zeroCount = 0;
        while (x > 0) {
            if (x % 10 == 0)
                zeroCount++;
            digitCount++;
            x /= 10;
        }
        return zeroCount == digitCount - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Long> roundNumbers = new ArrayList<>();
        for (long i = 1; i <= 999999; i++) {
            if (check(i))
                roundNumbers.add(i);
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long answer = 0;
            for (int i = 0; i < roundNumbers.size(); i++) {
                if (roundNumbers.get(i) <= n)
                    answer++;
                else
                    break;
            }
            System.out.println(answer);
        }
    }
}