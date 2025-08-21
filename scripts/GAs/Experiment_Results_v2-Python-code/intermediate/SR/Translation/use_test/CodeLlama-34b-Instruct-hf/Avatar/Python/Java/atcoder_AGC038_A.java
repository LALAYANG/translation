```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        solve(H, W, A, B);
    }

    public static void solve(int H, int W, int A, int B) {
        String[][] answer = new String[H][W];
        int checkFour = 389;
        int checkThree = 451;
        int checkOne = 914;
        int checkTwo = 237;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if ((checkOne & checkTwo) != 0) {
                    if ((checkFour & checkThree) != 0) {
                        if (i < B) {
                            if (j < A) {
                                answer[i][j] = "0";
                            } else {
                                answer[i][j] = "1";
                            }
                        } else if (j < A) {
                            answer[i][j] = "1";
                        } else {
                            answer[i][j] = "0";
                        }
                    }
                }
            }
        }
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                System.out.print(answer[i][j]);
            }
            System.out.println();
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to write this code in Java.
