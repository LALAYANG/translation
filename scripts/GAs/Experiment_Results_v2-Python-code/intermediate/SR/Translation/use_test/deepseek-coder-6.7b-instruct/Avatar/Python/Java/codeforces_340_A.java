```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int x;
    private static int y;
    private static int a;
    private static int b;

    private static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

    private static class LCMTask implements Runnable {
        private Future<Integer> future;

        @Override
        public void run() {
            future.complete(lcm(x, y));
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<Integer> future = executorService.submit(new LCMTask());
        int lcm = future.get();

        System.out.println(b / lcm - (a - 1) / lcm);

        executorService.shutdown();
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the least common multiple (LCM) of the first two, and then prints the difference between the quotient of `b` and the LCM and the quotient of `a - 1` and the LCM. The LCM calculation is done in a separate thread to avoid blocking the main thread.

