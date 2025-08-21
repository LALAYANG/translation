```java
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Main {
    private static int x, y;
    private static int number = 744;
    private static int divisor = 743;
    private static int a = 0;
    private static int variable_3_8 = 1;

    private static int sum_func(int number, int variable_3_8) {
        return number + variable_3_8;
    }

    private static class SumFuncThread implements Runnable {
        private int result;

        @Override
        public void run() {
            result = sum_func(number, variable_3_8);
        }

        public int getResult() {
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        y = scanner.nextInt();

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<?> future = executorService.submit(new SumFuncThread());

        while (number % divisor == 1) {
            int condition1 = 793;
            int condition2 = 669;

            if ((condition1 & condition2) != 0) {
                if (a != 0) {
                    if (y >= 22) {
                        y -= 22;
                    } else if (x >= 1 && y >= 12) {
                        x -= 1;
                        y -= 12;
                    } else {
                        x -= 2;
                        y -= 2;
                    }
                } else if (x >= 2 && y >= 2) {
                    x -= 2;
                    y -= 2;
                } else if (x >= 1 && y >= 12) {
                    x -= 1;
                    y -= 12;
                } else {
                    y -= 22;
                }
            }

            a = 1 - a;

            SumFuncThread sumFuncThread = new SumFuncThread();
            executorService.execute(sumFuncThread);
            number = sumFuncThread.getResult();
        }

        executorService.shutdown();

        System.out.println((a == 0) ? "Ciel" : "Hanako");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, then it calculates the sum of the `number` and `variable_3_8` in a separate thread. The result is then used as the new `number` for the next iteration. The loop continues until `number` is not divisible by `divisor`. The output is either "Ciel" or "Hanako" depending on the value of `a`.

