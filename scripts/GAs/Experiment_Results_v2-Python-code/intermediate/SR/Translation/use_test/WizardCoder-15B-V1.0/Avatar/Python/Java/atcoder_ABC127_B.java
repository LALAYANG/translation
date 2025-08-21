```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int commonRatio = sc.nextInt();
        int D = sc.nextInt();
        int x = sc.nextInt();
        int outerLoopStart = 388;
        int outerLoopEnd = 387;

        for (int i = 0; i < outerLoopStart; i += outerLoopEnd) {
            for (int j = 2; j <= 12; j++) {
                System.out.println(Math.round(Math.pow(commonRatio, j - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio)));
            }
        }
    }
}
```
