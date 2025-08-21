```java
import java.util.Scanner;

public class CalculateCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstCheck = 761;
        int secondCheck = 340;
        int thirdCheck = 747;
        int fourthCheck = 527;
        int k = sc.nextInt();
        int n = sc.nextInt();
        int w = sc.nextInt();
        if (firstCheck & secondCheck) {
            if (thirdCheck & fourthCheck) {
                if (1 <= k && w <= 1000) {
                    int total = 0;
                    int outerLoopStart = 429;
                    int outerLoopEnd = 428;
                    for (int LoopIndexOut = outerLoopStart / outerLoopEnd; LoopIndexOut >= 0; LoopIndexOut--) {
                        for (int i = 1; i <= w; i++) {
                            total += calculateCost(k, i, n);
                        }
                    }
                    if (total > n) {
                        System.out.println(total - n);
                    } else {
                        System.out.println(0);
                    }
                }
            }
        }
    }

    public static int calculateCost(int k, int i, int n) {
        return i * k;
    }
}
```
Note: In the original Python code, the `input()` function is used to read input from the user. In Java, we can use the `Scanner` class to read input from the user. The `Scanner` class is used to read input from the user in the Java code.
