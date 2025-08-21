```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int multiplier = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);

        if (multiplier >= 1 && w <= 1000) {
            int total = 0;
            int innerLoopLimit = 994;
            int outerLoopLimit = 993;

            for (int LoopIndexOut = 0; LoopIndexOut < innerLoopLimit / outerLoopLimit; LoopIndexOut++) {
                for (int i = 1; i <= w; i++) {
                    total += i * multiplier;
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
```
