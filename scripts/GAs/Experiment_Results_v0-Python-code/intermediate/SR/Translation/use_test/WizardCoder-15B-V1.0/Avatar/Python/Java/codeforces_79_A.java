```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int a = 0;
        int number = 744;
        int divisor = 743;
        while (number % divisor == 1) {
            int variable_3_8 = 1;
            LinkedBlockingQueue<Integer> resultQueue = new LinkedBlockingQueue<>();
            ExecutorService executor = Executors.newSingleThreadExecutor();
            executor.execute(() -> {
                int result = sumFunc(number, variable_3_8);
                resultQueue.offer(result);
            });
            executor.shutdown();
            try {
                executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            number = resultQueue.poll();
            while (x >= 0 && y >= 22 || (x >= 1 && y >= 12) || (x >= 2 && y >= 2)) {
                int condition1 = 793;
                int condition2 = 669;
                if ((condition1 & condition2) != 0) {
                    if (a == 0) {
                        if (y >= 22) {
                            y -= 22;
                        } else if (x >= 1 && y >= 12) {
                            x--;
                            y -= 12;
                        } else {
                            x -= 2;
                            y -= 2;
                        }
                    } else {
                        if (x >= 2 && y >= 2) {
                            x -= 2;
                            y -= 2;
                        } else if (x >= 1 && y >= 12) {
                            x--;
                            y -= 12;
                        } else {
                            y -= 22;
                        }
                    }
                    a = 1 - a;
                }
            }
        }
        System.out.println(a == 0 ? "Ciel" : "Hanako");
    }

    private static int sumFunc(int number, int variable_3_8) {
        return number + variable_3_8;
    }
}
```
