```java
import java.util.Scanner;

public class Happiness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int maxChanges = scanner.nextInt();
        String S = scanner.next();

        int segCnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                segCnt++;
            }
        }

        int curHappy = N - 1 - segCnt;
        int ans;
        if (2 * maxChanges >= segCnt) {
            ans = N - 1;
        } else {
            ans = curHappy + 2 * maxChanges;
        }

        System.out.println(ans);
    }
}
```
The Java code is a direct translation of the Python code. It uses a `Scanner` to read the input from the user and then calculates the happiness based on the given formula.

The Python code uses a decorator to wrap the `Func_parser_0` function, which is not necessary in Java. The `gw` and `gi` functions are also not necessary in Java, as they are simply used to read input from the user and convert it to an integer.

The Java code is simpler and more straightforward than the Python code, as it does not use any advanced features like decorators or threading.
