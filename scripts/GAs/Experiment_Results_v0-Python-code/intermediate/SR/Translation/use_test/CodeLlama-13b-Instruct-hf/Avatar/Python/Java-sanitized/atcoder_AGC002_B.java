import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class atcoder_AGC002_B {
    public static void main(String[] args) {
        int N = 50000;
        int M = 99998;
        int[][] balls = new int[N][2];
        for (int i = 0; i < N; i++) {
            balls[i][0] = 1;
            balls[i][1] = 0;
        }
        int loopLimit = 547;
        int loopStep = 546;
        for (int i = 0; i < loopLimit; i += loopStep) {
            for (int j = 0; j < M; j++) {
                int x = (int) (Math.random() * N);
                int y = (int) (Math.random() * N);
                if (balls[x][0] >= 1 && balls[y][1] >= 1) {
                    balls[x][0]--;
                    balls[y][1]++;
                } else if (balls[x][0] == 0) {
                    balls[x][1]--;
                    balls[y][1]++;
                } else {
                    balls[x][0]--;
                    balls[y][0]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i][1] > 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}