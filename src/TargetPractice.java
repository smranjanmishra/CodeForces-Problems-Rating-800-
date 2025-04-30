import java.util.*;

public class TargetPractice {
    static final int[][] score = {
            {1,1,1,1,1,1,1,1,1,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,5,5,4,3,2,1},
            {1,2,3,4,4,4,4,3,2,1},
            {1,2,3,3,3,3,3,3,2,1},
            {1,2,2,2,2,2,2,2,2,1},
            {1,1,1,1,1,1,1,1,1,1}
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            char[][] a = new char[10][10];
            for (int i = 0; i < 10; i++) {
                String s = sc.next();
                for (int j = 0; j < 10; j++) {
                    a[i][j] = s.charAt(j);
                }
            }
            int totalScore = 0;
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (a[i][j] == 'X') {
                        totalScore += score[i][j];
                    }
                }
            }
            System.out.println(totalScore);
        }
    }
}