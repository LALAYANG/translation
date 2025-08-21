Thought process:
1. Understand the given code snippet and the problem requirements.
2. Translate the Python code to Java code while maintaining the functionality.
3. Ensure the correctness of the Java code by running it against the provided test input.

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        List<List<Integer>> balls = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            balls.add(Arrays.asList(1, 0));
        }
        balls.set(0, Arrays.asList(0, 1));

        int loopLimit = 547;
        int loopStep = 546;

        for (int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]) - 1;
            int y = Integer.parseInt(input[1]) - 1;

            int wX = balls.get(x).get(0);
            int rX = balls.get(x).get(1);
            int wY = balls.get(y).get(0);
            int rY = balls.get(y).get(1);

            if (wX >= 1 && rX >= 1) {
                balls.set(x, Arrays.asList(wX - 1, rY + 1));
                balls.set(y, Arrays.asList(wY, rY + 1));
            } else if (wX == 0) {
                balls.set(x, Arrays.asList(wX - 1, rY + 1));
                balls.set(y, Arrays.asList(wY, rY + 1));
            } else {
                balls.set(x, Arrays.asList(wX - 1, rX + 1));
                balls.set(y, Arrays.asList(wY + 1, rY));
            }
        }

        int ans = 0;
        int conditionA = 489;
        int conditionB = 420;

        for (int i = 0; i < N; i++) {
            if ((conditionA & conditionB) != 0 && balls.get(i).get(1) != 0) {
                ans++;
            }
        }

        System.out.println(ans);
    }
}
```

This Java code snippet translates the given Python code to Java while maintaining the functionality and correctness.
