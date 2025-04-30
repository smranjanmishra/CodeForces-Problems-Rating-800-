import java.util.Scanner;

public class WalkingMaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int source_x = sc.nextInt();
            int source_y = sc.nextInt();
            int destination_x = sc.nextInt();
            int destination_y = sc.nextInt();

            if (destination_y < source_y) {
                System.out.println(-1);
                continue;
            }

            int moves = destination_y - source_y;
            source_x += moves;

            if (source_x < destination_x) {
                System.out.println(-1);
                continue;
            }
            moves += (source_x - destination_x);
            System.out.println(moves);
        }
    }
}

// tc - O(1)
// sc - O(1)