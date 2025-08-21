```java
import java.util.*;
import java.lang.*;

class Main {
    static int N, M;
    static int[][] balls;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        M = scanner.nextInt();
        balls = new int[N][2];
        for (int i = 0; i < N; i++) {
            balls[i][0] = 0;
            balls[i][1] = 0;
        }
        balls[0][1] = 1;
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;
            if (balls[x][0] == 1 && balls[x][1] == 1) {
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
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i][1] == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

