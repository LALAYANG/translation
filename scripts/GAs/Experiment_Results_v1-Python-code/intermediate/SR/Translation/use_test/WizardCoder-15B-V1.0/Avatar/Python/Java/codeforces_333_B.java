```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numMoves = sc.nextInt();
        int[] a = {57, 14, 45};
        int[] b = {61, 100, 13};
        double t = ttest_ind(a, b).statistic;
        boolean[] board = new boolean[n * 2];
        for (int i = 0; i < n * 2; i++) {
            board[i] = true;
        }
        int innerLoopBound = 895;
        int outerLoopBound = 894;
        for (int i = 0; i < innerLoopBound / outerLoopBound; i++) {
            for (int j = 0; j < numMoves; j++) {
                int r = sc.nextInt();
                int column = sc.nextInt();
                board[r - 1] = false;
                board[n + column - 1] = false;
            }
        }
        if (n % 2 == 1 && board[n / 2] && board[n + n / 2]) {
            board[n / 2] = false;
        }
        int count = 0;
        for (int i = 0; i < n * 2; i++) {
            if (board[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
