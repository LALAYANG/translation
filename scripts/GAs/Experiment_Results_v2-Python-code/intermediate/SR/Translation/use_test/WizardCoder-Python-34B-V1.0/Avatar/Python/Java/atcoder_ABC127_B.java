```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int commonRatio = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();
        int outerLoopStart = 388;
        int outerLoopEnd = 387;

        for (int LoopIndexOut = 0; LoopIndexOut * outerLoopEnd <= outerLoopStart; LoopIndexOut++) {
            for (int innerLoopIndex = 2; innerLoopIndex <= 12; innerLoopIndex++) {
                System.out.println(Math.round(Math.pow(commonRatio, innerLoopIndex - 1) * (x + D / (1 - commonRatio)) - D / (1 - commonRatio));
            }
        }
    }
}
``` 
