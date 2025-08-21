```java
import java.util.*;
import java.math.*;
import java.util.stream.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.Base64;
import java.time.*;
import java.io.*;
import java.nio.charset.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.security.*;
import java.net.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] balls = new int[N][2];
        for (int i = 0; i < N; i++) {
            balls[i][0] = 0;
            balls[i][1] = 1;
        }
        balls[0][0] = 1;
        for (int i = 0; i < M; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int w_x = balls[x - 1][0];
            int r_x = balls[x - 1][1];
            int w_y = balls[y - 1][0];
            int r_y = balls[y - 1][1];
            if (w_x >= 1 && r_x >= 1) {
                balls[x - 1][0]--;
                balls[y - 1][1]++;
            } else if (w_x == 0) {
                balls[x - 1][1]--;
                balls[y - 1][1]++;
            } else {
                balls[x - 1][0]--;
                balls[y - 1][0]++;
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
```

This Java code is equivalent to the given Python code. It reads the input, initializes the `balls` array, and processes the input according to the given conditions. The `calculate_value` function is not used in the main code, so it is not included in the Java version. 
