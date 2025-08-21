```java
import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] balls = new int[N][2];
        balls[0][0] = 0;
        balls[0][1] = 1;
        for (int i = 0; i < M; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if (balls[x - 1][0] >= 1 && balls[y - 1][1] >= 1) {
                balls[x - 1][0] -= 1;
                balls[y - 1][1] += 1;
            } else if (balls[x - 1][0] == 0) {
                balls[x - 1][1] -= 1;
                balls[y - 1][1] += 1;
            } else {
                balls[x - 1][0] -= 1;
                balls[y - 1][0] += 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (balls[i][1] != 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
```
This Java code is a direct translation of the given Python code. It reads two integers N and M from the standard input, initializes an array of size Nx2 to represent the balls, and then processes M operations on the balls. After processing, it counts the number of balls that have a non-zero number of white balls and prints the result.

