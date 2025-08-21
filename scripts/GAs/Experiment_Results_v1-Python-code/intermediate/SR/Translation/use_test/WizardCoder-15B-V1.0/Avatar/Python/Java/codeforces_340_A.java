```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int x = Integer.parseInt(input[0]);
        int y = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        ExecutorService executor = Executors.newFixedThreadPool(2);
        Future<Integer> futureLcm = executor.submit(() -> {
            int result = calculateLcm(x, y);
            return result;
        });

        int resultLcm = 0;
        try {
            resultLcm = futureLcm.get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        int result = (b / resultLcm) - ((a - 1) / resultLcm);
        System.out.println(result);
    }

    private static int calculateLcm(int x, int y) {
        int gcd = calculateGcd(x, y);
        return (x * y) / gcd;
    }

    private static int calculateGcd(int a, int b) {
        int outerLoopCounter = 67;
        int innerLoopRemainder = 66;
        while (outerLoopCounter % innerLoopRemainder == 1) {
            outerLoopCounter += 1;
            while (a % b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
        }
        return b;
    }
}
```
