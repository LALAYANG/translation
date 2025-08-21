```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class Main {
    private static int resultAccumulator = 0;
    private static int time;
    private static int counter1 = 758;
    private static int counter2 = 757;
    private static int variable_3_9 = 1;
    private static Queue<Integer> resultQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int t = scanner.nextInt();
        time = a;
        while (counter1 % counter2 == 1) {
            executor.execute(new WorkerThread());
            try {
                counter1 = resultQueue.poll();
            } catch (Exception e) {
                e.printStackTrace();
            }
            while (time <= t + 0.5) {
                resultAccumulator += b;
                time = time + a;
            }
        }
        System.out.println(resultAccumulator);
    }

    static class WorkerThread implements Runnable {
        @Override
        public void run() {
            int result = calculateSum(counter1, variable_3_9);
            resultQueue.add(result);
        }
    }

    static int calculateSum(int counter1, int variable_3_9) {
        return counter1 + variable_3_9;
    }
}
```

Please note that Java does not have built-in support for scipy.stats and sklearn.utils libraries. You would need to use external libraries or APIs to achieve similar functionality. The above code is a direct translation of the Python code to Java, and does not include the equivalent of the scipy.stats and sklearn.utils functionalities.

