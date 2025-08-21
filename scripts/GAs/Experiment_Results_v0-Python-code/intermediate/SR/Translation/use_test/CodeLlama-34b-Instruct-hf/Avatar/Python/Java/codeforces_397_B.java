
Here is the Java code that implements the same logic as the Python code:
```
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CodeforcesTask397BSolution {

    private int t;
    private int[][] queries;
    private String result;

    public CodeforcesTask397BSolution() {
        t = 0;
        queries = new int[0][0];
        result = "";
    }

    public void readInput() {
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();

        queries = new int[t][3];
        for (int i = 0; i < t; i++) {
            queries[i][0] = scanner.nextInt();
            queries[i][1] = scanner.nextInt();
            queries[i][2] = scanner.nextInt();
        }
    }

    public void processTask() {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < t; i++) {
            int dividend = queries[i][0];
            int divisor = queries[i][1];
            int k = queries[i][2];

            Runnable task = new Runnable() {
                @Override
                public void run() {
                    int result = dividend / divisor;
                    if (result * k >= dividend) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No");
                    }
                }
            };

            executor.execute(task);
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {
        CodeforcesTask397BSolution solution = new CodeforcesTask397BSolution();
        solution.readInput();
        solution.processTask();
        System.out.println(solution.getResult());
    }
}
```
Note that the Java code uses an `ExecutorService` to execute the tasks in parallel, while the Python code uses the `threading` module to create and manage threads. The `ExecutorService` is a more modern and efficient way to execute tasks in parallel in Java, and it is recommended to use it instead of the `threading` module.
