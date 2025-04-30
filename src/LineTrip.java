import java.util.*;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = sc.nextLong();

            List<Long> pointsArr = new ArrayList<>();
            pointsArr.add(0L);
            for (int i = 0; i < n; i++) {
                pointsArr.add(sc.nextLong());
            }
            pointsArr.add(x);
            n = pointsArr.size();

            long maxDistance = Long.MIN_VALUE;
            for (int i = 1; i < n; i++) {
                long diff = pointsArr.get(i) - pointsArr.get(i - 1);
                if (i == n - 1) {
                    maxDistance = Math.max(maxDistance, 2 * diff);
                } else {
                    maxDistance = Math.max(maxDistance, diff);
                }
            }
            System.out.println(maxDistance);
        }
    }
}

// tc - O(n)
// sc - O(n)